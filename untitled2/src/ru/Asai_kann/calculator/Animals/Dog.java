package ru.Asai_kann.calculator.Animals;

// подкласс (собака)
public class Dog extends Animals {
    // конструктор
    public Dog(String nm, String snd, double wt, int lv) { super (nm, snd, (int)wt, lv);
    }
    // описание метода, наследованного из суперкласса
    @Override
    public void doAnimal() {
        System.out.println ("Животное "+name+" весит примерно "+ (int)weight+" кг, издает звук "+sound);
        System.out.println ("Очков жизни: "+live);
        System.out.println ("Это животное выполняет действие:");
        System.out.println ("Охраняет дом и хозяина.");
    }
}
