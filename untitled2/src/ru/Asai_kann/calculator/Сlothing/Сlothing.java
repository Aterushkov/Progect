package ru.Asai_kann.calculator.Сlothing;

//Firs unit
public abstract class Сlothing {
    String name;
    double weight;
    int live;
    // конструктор класса
    Сlothing (String nm, double wt, int lv) {
        name=nm;
        weight=wt;
        live=lv;

    }
    // абстрактный метод
    public abstract void doСlothing();
}
