package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое целое число x: ");
        int x = in.nextInt();
        System.out.print("Введите второе целое число y: ");
        int y = in.nextInt();
        System.out.print("Введите операцию (1,2,3,4):\n1. Деление\n2. Умножение\n3. Сложение\n4. Вычитание\n: ");
        int operation = in.nextInt();

        switch (operation) {
            case (1):
                System.out.printf("%d / %d = %d ", x, y, x / y);
                break;
            case (2):
                System.out.printf("%d * %d = %d ", x, y, x * y);
                break;
            case (3):
                System.out.printf("%d + %d = %d ", x, y, x + y);
                break;
            case (4):
                System.out.printf("%d - %d = %d ", x, y, x - y);
                break;
            default:
                break;
        }

        in.close();
    }
}