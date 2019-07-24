package ru.Asai_kann.calculator.Room1;

import java.util.Scanner;

public class Room_W {

        public Room_W() {

            System.out.println("Вы вернулись в команту. На полу сидит девочка и играет со стаей котят");
            System.out.println("Что вы будете делать?\n1. Уйдете.\n2. Будете молча смотреть на нее. \n3. Попробуете заговорить с девочкой.\n4. Порыться в комнате \n5. Напасть на девочку \nВаши действия?: ");
            Scanner ops = new Scanner(System.in);
            int operation = ops.nextInt();
            while (true) {
                if (operation == 1) new Goout_P();
                if (operation == 2) new Look_4();
                if (operation == 3) tryspeack(operation);
                if (operation == 4) new Look_2();
                if (operation == 5) error(operation);
                break;
            }
        }
        private static void tryspeack
                (int result) {
            System.out.println("Вы пытаетесь заговорить с девочкой но она не реагирует");
            System.out.println("Что вы будете делать?\n1. Уйдете.\n2. Будете молча смотреть на нее. \n3. Попробуете заговорить с девочкой.\n4. Порыться в комнате \n5. Напасть на девочку \nВаши действия?: ");
            Scanner ops = new Scanner(System.in);
            int operation_p = ops.nextInt();
            while (true) {
                if (operation_p == 1) new Goout_P();
                if (operation_p == 2) new Look_4();
                if (operation_p== 3) tryspeack(operation_p);
                if (operation_p == 4) new Look_2();
                if (operation_p == 5) error(operation_p);
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





