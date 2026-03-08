package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TXT {

    public static void main(String[] args) throws IOException {
        compareNumbers();
        compareStrings();
        evenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    public static void compareNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 1-е число:");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите 2-е число:");
        int num2 = Integer.parseInt(reader.readLine());
        System.out.print("Результат: ");
        if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            System.out.println(num1 + " < " + num2);
        }
        System.out.println("_____________\n");
    }

    public static void compareStrings() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 1-ю строку:");
        String str1 = reader.readLine();
        System.out.println("Введите 2-ю строку:");
        String str2 = reader.readLine();
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        System.out.println("_____________\n");
    }

    public static void evenNumbers(int[] nums) {
        System.out.print("Четные числа из массива: ");
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
