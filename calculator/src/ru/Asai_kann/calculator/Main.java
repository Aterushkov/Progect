package ru.Asai_kann.calculator;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Вас приветствует калькулятор!\n1. Сложение \n2. Вычитание. \n3. Умножение. \n4. Деление. \n5. Остаток от числа.\nЛюбое число больше пяти запустит процедуру самоуничтожения.\nВведите операцию: ");
        Scanner ops = new Scanner(System.in);
        int operation = ops.nextInt();
        while (true) {
            if (operation == 1) slojenie(operation);
            else if (operation == 2) vithitanie (operation);
            else if (operation == 3) ymnojenie (operation);
            else if (operation == 4) delenie (operation);
            else if (operation == 5) lastnumder (operation);
            else if (operation > 5) error(operation);
            break;
        }
    }
    private static void slojenie(int result) {
        System.out.println("Начинается процедура сложения.");
        Scanner opss = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = opss.nextInt();
        System.out.println("Введите второе число:");
        int b = opss.nextInt();
        result = a + b;
        System.out.println("Результат = " + result);
    }
    private static void vithitanie(int result) {
        System.out.println("Начинается процедура вычитания.");
        Scanner opss = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = opss.nextInt();
        System.out.println("Введите второе число:");
        int b = opss.nextInt();
        result = a - b;
        System.out.println("Результат = " + result);
    }
    private static void ymnojenie(int result) {
        System.out.println("Начинается процедура умножения.");
        Scanner opss = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = opss.nextInt();
        System.out.println("Введите второе число:");
        int b = opss.nextInt();
        result = a * b;
        System.out.println("Результат = " + result);
    }
    private static void delenie(float result) {
        System.out.println("Начинается процедура деления.");
        Scanner opss = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float a = opss.nextInt();
        System.out.println("Введите второе число:");
        float b = opss.nextInt();
        result = a / b;
        System.out.println("Результат = " + result);
    }
    private static void lastnumder(int result) {
        System.out.println("Получаем осаток от деления.");
        Scanner opss = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = opss.nextInt();
        System.out.println("Введите второе число:");
        int b = opss.nextInt();
        result = a % b;
        System.out.println("Результат = " + result);
    }
    private static void error (int operation) {
        if (operation > 5);
        for (int i=10; i>=0; i--){
            if (i == 10)
                System.out.println("Запускаю программу самоуничтожения.");
            if (i == 10)
                System.out.println("Осталось "+i+" секунд до взрыва.");
            if (i == 9)
                System.out.println("Осталось "+i+" секунд до взрыва.");
            if (i == 8)
                System.out.println("Осталось "+i+" секунд до взрыва.");
            if (i == 8)
                System.out.println("Пожалуйста покиньте помещение.");
            if (i == 7)
                System.out.println("Осталось "+i+" секунд до взрыва.");
            if (i == 6)
                System.out.println("Осталось "+i+" секунд до взрыва.");
            if (i == 5)
                System.out.println("Осталось "+i+" секунд до взрыва.");
            if (i == 4)
                System.out.println("Осталось "+i+" секунд до взрыва.");
            if (i == 3)
                System.out.println("Осталось "+i+" секунды до взрыва.");
            if (i == 2)
                System.out.println("Осталось "+i+" секунды до взрыва.");
            if (i == 1)
                System.out.println("Осталось "+i+" секунда до взрыва.");
            if (i == 1)
                System.out.println("Кто припарковал белую девятку...");
            if (i == 1)
                System.out.println("А к черту.");
            if (i == 0)
                System.out.println("Бум!");
        }
    }

}
