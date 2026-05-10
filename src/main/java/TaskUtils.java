package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskUtils {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void numsOperations() throws IOException {
        int num1 = readInt("Введите 1-е число: ");
        int num2 = readInt("Введите 2-е число: ");

        compareNums(num1, num2);
        arithmeticNums(num1, num2);
    }

    private static int readInt(String message) throws IOException {
        while (true) {
            System.out.println(message);
            try {
                return Integer.parseInt(enterString());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите целое число.");
            }
        }
    }

    public static void compareNums(int num1, int num2) {
        System.out.print("Результат сравнения: ");
        if (num1 == num2) {
            System.out.println(num1 + " = " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else {
            System.out.println(num1 + " < " + num2);
        }
        System.out.println("_____________\n");
    }

    public static void arithmeticNums(int num1, int num2) {
        System.out.println("Арифметические операции:");
        System.out.println("Сложение    | " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Вычитание   | " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Умножение   | " + num1 + " * " + num2 + " = " + (num1 * num2));
        if (num2 != 0) {
            double res = (double) num1 / num2;
            System.out.println("Деление     | " + num1 + " / " + num2 + " = " + res);
        } else System.out.println("Деление на 0 невозможно");
        System.out.println("_____________\n");
    }

    public static void compareStrings() throws IOException {
        System.out.println("Введите 1-ю строку:");
        String str1 = enterString();
        System.out.println("Введите 2-ю строку:");
        String str2 = enterString();
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        System.out.println("_____________\n");
    }

    public static void evenNumbers(int[] nums) {
        boolean found = false;
        System.out.print("Четные числа из массива: ");
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("В массиве нет четных чисел");
        }
    }

    private static String enterString() throws IOException {
        return reader.readLine();
    }
}
