package lessons.lesson19;

public class ExecutableImpl implements Executable {
    @Override
    public void execute(int a) {
        System.out.println("call of this method is from ExecutableImpl " + a);
    }
}
