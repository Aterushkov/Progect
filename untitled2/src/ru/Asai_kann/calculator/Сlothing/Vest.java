package ru.Asai_kann.calculator.Сlothing;

public class Vest extends Сlothing {
    // конструктор
    public Vest(String nm, double wt, int lv) { super (nm, wt, lv);
    }

    @Override
    public void doСlothing() {
        System.out.println ("Одежда "+name+" весит примерно "+ weight+" г, дает "+live+" очков жизни");
    }
}


