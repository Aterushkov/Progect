package ru.Asai_kann.calculator;


import java.util.Scanner;


public class Calculator {


    public static void calculator(String[] args) {




        System.out.println("Вас приветствует калькулятор!\nВам доступны следующие операции.\n1. Сложение \n2. Вычитание. \n3. Умножение. \n4. Деление. \n5. Остаток от числа.\nЛюбое число больше пяти запустит процедуру самоуничтожения.\nВведите операцию: ");
        Scanner ops = new Scanner(System.in);
        while (true) {
            try {
                int operation = ops.nextInt();
                if (operation == 1) slojenie(operation);
                else if (operation == 2) vithitanie(operation);
                else if (operation == 3) ymnojenie(operation);
                else if (operation == 4) delenie(operation);
                else if (operation == 5) lastnumder(operation);
                else if (operation > 5) error(operation);
                break;
            } catch (Exception e){
                System.out.println ("Неверное значение.");
                System. exit (0);
            }
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
        return;
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
        return;
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
        return;
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
        return;
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
        return;
    }
    private static void error (int operation) throws InterruptedException {
        if (operation > 5);
        System.out.println("Команда не верна!");
        for (int i=10; i>=0; i--){
            Thread.sleep (2500);
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
        return;
    }

}