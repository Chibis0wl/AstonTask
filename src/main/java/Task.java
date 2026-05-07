package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {

    private static int num1;
    private static int num2;

    private static void getNums () throws IOException {
        System.out.println("Введите 1-е число: ");
        while (true) {
            try {
                num1 = Integer.parseInt(enterString());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка!\nВведите 1-е число: ");
            }
        }
        System.out.println("Введите 2-е число:");
        while (true) {
            try {
                num2 = Integer.parseInt(enterString());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка!\nВведите 2-е число: ");
            }
        }
    }

    public static void compareNums() throws IOException {
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

    public static void arithmeticNums(){
        System.out.println("Арифметически операции:");
        System.out.println("Сложение    | " + num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println("Вычитание   | " + num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println("Умножение   | " + num1 + " * " + num2 + " = " + (num1*num2));
        if (num2 != 0) {
            System.out.println("Деление     | " + num1 + " / " + num2 + " = " + (num1/num2));
        } else System.out.println("Деление на 0 невозможно");
        System.out.println("_____________\n");
    }

    public static void numsOperations () throws IOException {
        getNums();
        compareNums();
        arithmeticNums();
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
        System.out.print("Четные числа из массива: ");
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static String enterString () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
