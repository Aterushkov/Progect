package ru.Asai_kann.calculator.Animals;

import ru.Asai_kann.calculator.Сlothing.Vest;

// подкласс (воробей)
public class Vorobei extends Animals {
    String knife = "нож";



    // конструктор
    public Vorobei(String nm, String snd,double wt, int lv) { super (nm, snd, wt,lv);



    }
    // описание метода,` наследованного из суперкласса
    @Override
    public void doAnimal() {
        System.out.println ("Животное "+name+" весит примерно "+ weight+" г, издает звук "+sound);
        System.out.println ("Очков жизни: "+live);
        System.out.println ("Это животное выполняет действие: ");
        System.out.println ("Треплет нервы.");
        System.out.println ("Носит при себе "+ knife);

    }

}
