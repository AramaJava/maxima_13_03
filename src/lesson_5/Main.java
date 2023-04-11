package lesson_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Задача:1
        1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
        */
        /* РЕШЕНИЕ ЗАДАЧИ 1 */

        String[] str5 = new String[10];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < str5.length-2; i++) {
            System.out.println("Введите строку");
            str5[i] = scan.nextLine();
        }


        for (int i = str5.length-1; i>=0; i--) {
            System.out.println(str5[i]);
        }



        /* ЗАДАЧА 2

        2.1. Создай массив на 10 чисел
        2.2. Считай с консоли 10 чисел и заполни ими массив
        2.3. Найти максимальное число из элементов массива
        */

        // РЕШЕНИЕ

        int[] nums5 = new int[10];

        Scanner scan1 = new Scanner(System.in);
        for (int i = 0; i < nums5.length; i++) {
            System.out.println("Введите число");
            nums5[i] = scan1.nextInt();
        }


        int max = nums5[0];

        for (int i = 1; i < nums5.length; i++) {
            if (nums5[i] > max) {
                max = nums5[i];
            }

        }
        System.out.println(max);

        /*
        ЗАДАЧА 3

        СО ЗВЕЗДОЧКОЙ

        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк,
           индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
        */
       // РЕШЕНИЕ ЗАДАЧИ 3

        String[] str4 = new String[10];
        int[] nums4 = new int[10];

        Scanner scan2 = new Scanner(System.in);
        for (int i = 0; i < str4.length; i++) {
            System.out.println("Введите строку");
            str4[i] = scan2.nextLine();
            nums4[i] = str4[i].length();
        }

        for (int nums:nums4
             ) {
            System.out.println(nums);
        }


      /*
       ЗАДАЧА 4

        1. Создать массив на 10 чисел.
        2. Ввести с клавиатуры 10 чисел и записать их в массив.
        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
        */
        // РЕШЕНИЕ ЗАДАЧИ 4

        int[] nums3 = new int[10];

        Scanner scan3 = new Scanner(System.in);
        for (int i = 0; i < nums3.length; i++) {
            System.out.println("Введите строку");
            nums3[i] = scan3.nextInt();
        }

        for (int i = nums3.length-1; i >= 0 ; i--) {
            System.out.println(nums3[i]);
        }

        /* ЗАДАЧА 5

        1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
        */

        // РЕШЕНИЕ ЗАДАЧИ 5

        int[] nums2 = new int[20];

        Scanner scan4 = new Scanner(System.in);
        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Введите число");
            nums2[i] = scan4.nextInt();
        }

  //      int[] nums2 = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36, 33, 56, 22, 88, 34, 19, 69};

        int[] nums21 = new int[10];
        int[] nums22 = new int[10];

        for (int i = 0; i < nums2.length; i++) {
            if (i<10) {
                nums21[i] = nums2[i];
            } else {
                nums22[i-10] = nums2[i];

            }
        }
        for (int nums: nums22
             ) {
            System.out.println(nums);

        }

        /* ЗАДАЧА 6

        Создать массив на 20 чисел.
        Заполнить его числами с клавиатуры.
        Найти максимальное и минимальное числа в массиве.
        Вывести на экран максимальное и минимальное числа через пробел.
        */
        // РЕШЕНИЕ ЗАДАЧИ 6

       int[] nums1 = new int[20];

        Scanner scan6 = new Scanner(System.in);
        for (int i = 0; i < nums1.length ; i++) {
            System.out.println("Введите число");
            nums1[i]= scan6.nextInt();
        }

        //    int[] nums1 = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36, 33, 56, 22, 88, 34, 19, 69};
        int max1 = nums1[0], min = nums1[0];
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] > max1) {
                max1 = nums1[i];
            }
            if (nums1[i] < min) {
                min = nums1[i];
            }

        }
        System.out.printf("%d %d ", max1, min);


        /* ЗАДАЧА 7

        Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
        */
       // РЕШЕНИЕ ЗАДАЧИ 7

         //   int[] nums = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        int[] nums = new int[20];

        Scanner scan7 = new Scanner(System.in);
        for (int i = 0; i < nums.length ; i++) {
            System.out.println("Введите число");
            nums[i]= scan7.nextInt();
        }

        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    flag = false;
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            }
        }
        for (int num : nums
        ) {
            System.out.println(num);

        }

    }
}
