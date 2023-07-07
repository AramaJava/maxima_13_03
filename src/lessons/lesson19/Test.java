package lessons.lesson19;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImpl());

        runner.run(new Executable() {
            @Override
            public void execute(int a) {
                System.out.println("call of this method is from Executable Interface " + a);
            }
        });

        runner.run(a -> System.out.println("call of this method is from Executable lambda " + a));
    }
}
