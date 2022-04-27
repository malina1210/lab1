package com.company;

import java.util.Scanner;

//** Класс возведения вводимого числа в степень по формуле
        //** <p>
 // Разработчик : Struhovshchykova A AT-212 24/03/22
//
public final class Main {
    //* Констурктор
     //
    public static void task61 (String[] args) {
        System.out.print("task61");
        Scanner in;
        in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = in.next();//nextInt(); //получаем число от пользователя
        if (isInteger(num)) {
            int result = square(Integer.parseInt(num));
            System.out.printf("Your number: %d \n", result);
        }
        in.close();
    }

    public static boolean isInteger(String s) {
        System.out.println(String.format("Parsing string value: \"%s\"", s));

        if (s == null || s.equals("")) {
            System.out.println("Cannot parse the string since it either null or empty");
            return false;
        }

        try {
            int iVal = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Cannot parse the string to integer");
        }
        return false;
    }

    /**
     * Функция возведения в степень по формуле
     *
     * @param num - вводимое число
     * @return готовый результат
     */
    static int square(int num) {
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += i * 2 + 1;
        }
        return result;
    }

    public static double findSum (int a) {
        double result = 0;

        for (int i = 2; i < a; i++) {
            result -= 1 - (1 / Math.pow(i, 2));
        }
        System.out.println("The answer:" + result);
        return result;
    }
}