package lesson_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        byte a = 5;
        byte [] array= new byte[7];
               String  [] array2 = {"Пн.","Вт", "Ср.", "Чтв.", "Пт.", "Сб.", "Вск."};
        for (String day:array2
             ) {
            System.out.println(day);
        }
        Scanner scan = new Scanner(System.in);
        int [] lenina = new int[8];

        int even = 0, odd = 0;
        
        for (int i = 0; i < lenina.length; i++) {
            lenina[i] = scan.nextInt();
            if (i % 2 == 0) {even+= lenina[i];} else {odd+=lenina[i];}
            
        }

        if (even>odd) {
            System.out.println(even);
        } else System.out.println(odd);
        if (even==odd) System.out.println("одинаково жителей");
 */
        /*
        Задача:
        1

        1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

        String[] str5 = new String[10];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < str5.length-2; i++) {
            str5[i] = scan.nextLine();
        }

        int j = str5.length-1;
        for (int i = 0; i < str5.length; i++) {
            System.out.println(str5[j]);
            j--;
        }


        /*
        2

        1.1. Создай массив на 10 чисел
        1.2. Считай с консоли 10 чисел и заполни ими массив
        2. Найти максимальное число из элементов массива
*/
/*
        int[] nums5 = new int[10];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums5.length; i++) {
            nums5[i] = scan.nextInt();
        }


        int max = nums5[0];

        for (int i = 1; i < nums5.length; i++) {
            if (nums5[i] > max) {
                max = nums5[i];
            }

        }
        System.out.println(max);
*/





        /*
        3

        СО ЗВЕЗДОЧКОЙ

        1. Создать массив на 10 строк.
        2. Создать массив на 10 чисел.
        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        4. В каждую ячейку массива чисел записать длину строки из массива строк,
           индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
*/
   /*
        String[] str4 = new String[10];
        int[] nums4 = new int[10];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < str4.length; i++) {
            str4[i] = scan.nextLine();
            nums4[i] = str4[i].length();
        }

        for (int nums:nums4
             ) {
            System.out.println(nums);
        }
*/
  /*
        4

        1. Создать массив на 10 чисел.
        2. Ввести с клавиатуры 10 чисел и записать их в массив.
        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
*/
        /*
        int[] nums3 = new int[10];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums3.length; i++) {
            nums3[i] = scan.nextInt();
        }

        for (int i = nums3.length-1; i >= 0 ; i--) {
            System.out.println(nums3[i]);
        }
*/
        /*
        5

        1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

        /*


        int[] nums2 = new int[20];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = scan.nextInt();
        }

                 // int[] nums2 = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36, 33, 56, 22, 88, 34, 19, 69};

        int[] nums21 = new int[10];
        int[] nums22 = new int[10];
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (i<10) {
                nums21[i] = nums2[i];
            } else {
                nums22[index] = nums2[i];
                index++;
            }
        }
        for (int nums: nums22
             ) {
            System.out.println(nums);

        }
        /*
        6

        Создать массив на 20 чисел.
                Заполнить его числами с клавиатуры.
        Найти максимальное и минимальное числа в массиве.
                Вывести на экран максимальное и минимальное числа через пробел.
*/
/*
       int[] nums1 = new int[20];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums1.length ; i++) {
            nums1[i]= scan.nextInt();
        }

 //       int[] nums1 = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36, 33, 56, 22, 88, 34, 19, 69};
        int max = nums1[0], min = nums1[0];
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] > max) {
                max = nums1[i];
            }
            if (nums1[i] < min) {
                min = nums1[i];
            }

        }
        System.out.println(max);
        System.out.println(min);

 */
        /*
        7

        Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/
   /*
     //   int[] nums = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        int[] nums = new int[20];

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums.length ; i++) {
            nums[i]= scan.nextInt();
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
        //System.out.println(nums[i]);
        */

    }
}
