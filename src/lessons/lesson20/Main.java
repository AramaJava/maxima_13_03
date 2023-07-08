package lessons.lesson20;

import lessons.lesson19.MethodInfo;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // Reflection API

        // Имя пакета       // packageName          // String packageName
        // Имя              // name                 // String name
        // Набор полей      // List of attributes   // List<Attribute> attributes
        // Конструктор      // Constructor          // constructor
        // Набор методов    // List of methods      // List<Method> methods

        // 1
        Class<Person> personClass = Person.class;
        // 2
        Person viktor = new Person();
        Class<? extends Person> aClass = viktor.getClass();
        // 3
        Class c = Class.forName("lessons.lesson20.Person");

        Method[] methods = personClass.getMethods();

        for (Method m: methods) {
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            System.out.println(Arrays.toString(m.getParameters()));
        }

        Arrays.stream(personClass.getDeclaredFields())
                .forEach(field -> System.out.println(field.getName() + " " + field.getType()));

        System.out.println(personClass instanceof Object);

        Arrays.stream(personClass.getAnnotations())
                .forEach(annotation -> {
                    if (annotation instanceof MethodInfo) {
                        System.out.println("Yes, this object extends from MethodInfo");
                    }
                });

        System.out.println(Signature.getSignature());

        Signature.getSignature().showTextOfSignature();

    }
}
