package ru.Asai_kann.calculator.Room1;
import java.util.Scanner;

public class Play_1 {
    private static Scanner scanner = new Scanner(System.in);

    public Play_1 () {

        System.out.println("Ваша задача угадать сколько котиков сидит в коробке");
        int cat = 25;
        int trie = 0;
        int number = (int) (Math.random() * cat);
        playlevel(cat, number, trie);


        scanner.close();
    }

    private static void playlevel(int cat, int number, int trie) {
        while (true) {
            System.out.println("В коробке сидит от 0 до " + cat + " котиков. Сколько котиков сидит в коробке?");
            int input_number = scanner.nextInt();
            if (input_number > number) {
                System.out.println("Котиков в коробке меньше");}
                if (input_number < number) {
                    System.out.println("Котиков в коробке больше");
                }
                    if (input_number == number) new Winplay();



        }
    }
}