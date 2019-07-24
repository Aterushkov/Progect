package ru.Asai_kann.calculator.Room1;

import java.util.Scanner;

public class Look_4 {
        public Look_4() {

            System.out.println("Осмотревшись вы пониматее что оказались в грязной комнате с ободранными обоями. Словно в этой комнате живеты тысяча кошек. Из вещей в команте вы видите только коробку рядом с которой видите чумазая девочка лет тринадцати одетая в белое грязное платье. Прислушавшись вы понимате что в коробке котята.");
            System.out.println("Что вы будете делать?\n1. Уйдете.\n2. Будете молча смотреть на нее. \n3. Напасть на девочку \nВаши действия?: ");
            Scanner ops = new Scanner(System.in);
            int operation = ops.nextInt();
            while (true) {
                if (operation == 1) new Goout_1();
                if (operation == 2) new Look_5();
                if (operation == 3) error(operation);
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



