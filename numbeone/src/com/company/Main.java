package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать сколько котиков сидит в коробке");
        for(int i = 10; i<= 50; i += 10) playlevel(i);
        System.out.println("Мяу");
        scanner.close();
    }
    private static  void playlevel(int cat){
        int number = (int) (Math.random() * cat);
        while (true){
            System.out.println("В коробке сидит от 0 до "+cat+" котиков. Сколько котиков сидит в коробке?");
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Вы угадали!");
                break;
            } else if (input_number > number){
                System.out.println("Котиков в коробке меньше");
            } else {
                System.out.println("Котиков в коробке больше");
            }
        }


        }
    }
