package ru.Asai_kann.calculator;


import ru.Asai_kann.calculator.Room1.Room_1;

import java.util.Scanner;


public class Main {


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

    public static void main(String[] args) {

        System.out.println("Сбегая от обезумевшей толпы вы забижали в здание и заперев дверь поняли что в безопастности вы себя почувствовать не можете.");
        System.out.println("Осмотревшись вы виете перед собой грязный, старый корридор в который ведет в четыре комнаты. Что вы будете делать?\n1. Войти в первую комнату \n2. Войти во вторую комнату. \n3. Войти в третью комнату. \n4. Войти в четвертую комнату. \n5. Порыться в корридоре.\n6. Выйти на улицу и попыться убежать.\nВаши действия?: ");
        Scanner ops = new Scanner(System.in);
        int operation = ops.nextInt();
        while (true) {
            if (operation == 1) new Room_1();
//            else if (operation == 2) vithitanie(operation);
//            else if (operation == 3) ymnojenie(operation);
//            else if (operation == 4) delenie(operation);
//            else if (operation == 5) lastnumder(operation);
            else if (operation > 5) error(operation);
            break;
        }

    }
}

