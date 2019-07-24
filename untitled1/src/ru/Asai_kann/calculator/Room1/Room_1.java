package ru.Asai_kann.calculator.Room1;

import java.util.Scanner;

public class Room_1 {

    public Room_1() {
        System.out.println("Вы вошли в стремную обшарпанную комнату. В одном из ее углов сидит девочка и что-то шепчет. Услышав ваши шаги она обернулась и прищурившись посмотрела.\nКто ты? Что тебе нужно? - Сказа девочка.");
        System.out.println("Но Вы и сами не знаете ответы на эти вопросы.\n Что вы будете делать? Введите число: \n1. Уйдете.\n2. Будете молча смотреть на нее. \n3. Скажите что сами ничего не понимаете.\n4. Порыться в комнате \n5. Напасть на девочку");
        Scanner ops = new Scanner(System.in);
        int operation = ops.nextInt();
        while (true) {
            if (operation == 1) new Goout_1();
            if (operation == 2) new Look_1();
            if (operation == 3) idonttknow_1(operation);
            if (operation == 4) new Look_2();
            if (operation == 5) error(operation);
            break;
        }
    }

    private static void idonttknow_1
            (int result) {
        System.out.println("Вы говорите девочке что не знаете как сюда попали и кто вы. На лице девочки появляется улыбка и она прерывает вас.\n Давай сыграем в игру? Если выйграешь я подарю тебе кое что");
        System.out.println("1.Играем!\n2.Я в детские игры не играю \nНу что?");
        Scanner ops = new Scanner(System.in);
        int operation_p = ops.nextInt();
        while (true) {
            if (operation_p == 1) new Play_1();
            if (operation_p == 2) new Dontplay_2();
            break;
        }
    }
    private static void error(int operation) {
        if (operation > 5) ;
        System.out.println("Команда не верна!");
        for (int i = 10; i >= 0; i--) {
            if (i == 10)
                System.out.println("Запускаю программу самоуничтожения.");
            if (i == 10)
                System.out.println("Осталось " + i + " секунд до взрыва.");
            if (i == 9)
                System.out.println("Осталось " + i + " секунд до взрыва.");
            if (i == 8)
                System.out.println("Осталось " + i + " секунд до взрыва.");
            if (i == 8)
                System.out.println("Пожалуйста покиньте помещение.");
            if (i == 7)
                System.out.println("Осталось " + i + " секунд до взрыва.");
            if (i == 6)
                System.out.println("Осталось " + i + " секунд до взрыва.");
            if (i == 5)
                System.out.println("Осталось " + i + " секунд до взрыва.");
            if (i == 4)
                System.out.println("Осталось " + i + " секунд до взрыва.");
            if (i == 3)
                System.out.println("Осталось " + i + " секунды до взрыва.");
            if (i == 2)
                System.out.println("Осталось " + i + " секунды до взрыва.");
            if (i == 1)
                System.out.println("Осталось " + i + " секунда до взрыва.");
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