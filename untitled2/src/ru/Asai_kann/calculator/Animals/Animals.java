package ru.Asai_kann.calculator.Animals;
//Firs unit
   public abstract class Animals {
    String name;
    String sound;
    double weight;
    int live;
    // конструктор класса
    Animals (String nm, String snd, double wt, int lv) {
        name=nm;
        sound=snd;
        weight=wt;
        live=lv;

    }
    // абстрактный метод
    public abstract void doAnimal();
}

