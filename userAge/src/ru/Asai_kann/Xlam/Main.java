package ru.Asai_kann.Xlam;

import javax.swing.JOptionPane;
public class Main {
    public static void main (String [] args) {
// Объявление числовых переменных
        int yearNow, yearBorn, userAge;
// Объявление строковой переменной
        String userData;
// Выводим окно запроса текущей даты
        userData = JOptionPane.showInputDialog ("Какой сейчас год?");
// Преобразуем строку в число в явном виде
        yearNow = Integer.parseInt (userData);
// Выводим окно запроса года рождения
        userData = JOptionPane.showInputDialog ("В каком году вы родились?");
// Преобразуем строку в число в явном виде
        yearBorn = Integer.parseInt (userData);
// Вычисляем возраст
        userAge =  yearNow - yearBorn;
// Выводим окно сообщения с результатом
        JOptionPane.showMessageDialog (null, "Ваш возраст: " + userAge);
    }}