package lessons.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ExceptionsClass {
    public static void main(String[] args)  {
        System.out.println("-----------------------");
        String password = null;
        try {
            System.out.println(password.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------");
        try {
            Files.copy(new File("D:/rg.jpg").toPath(), new File("D:/rg3423423.jpg").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Хочу, чтобы программа отработала и тут");
    }
}
