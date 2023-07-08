package lessons.lesson20;

public class Signature {
    private static Signature signature;
    private static String textOfSignature = "Abramyan A. S. dgsdfsdf234234wdfd3323";

    public static Signature getSignature() {
        if (signature == null) {
            signature = new Signature();
        }
        return signature;
    }

    public void showTextOfSignature() {
        System.out.println(textOfSignature);
    }
}
