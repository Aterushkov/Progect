package ru.Asai_kann.calculator;


// абстрактный суперкласс

import ru.Asai_kann.calculator.Animals.Cat;
import ru.Asai_kann.calculator.Animals.Dog;
import ru.Asai_kann.calculator.Animals.Vorobei;
import ru.Asai_kann.calculator.Сlothing.Vest;

public class Main {
    public static void main (String [] args) {
// объект кошка Маруся подкласса Cat
        Cat objCat=new Cat ("Маруся", "Мур-мур-мур", 3,5 );
// объект пес Тузик подкласса Dog
        Dog objDog1=new Dog ("Тузик", "Гав-гав-гав", 9,7);
// объект пес Барбос подкласса Dog
        Dog objDog2=new Dog ("Барбос", "Р-р-р-р-р", 15,7);
        // объект пес Барбос подкласса Dog
        Vorobei objVorobei=new Vorobei("Чирик", "Чик-чирик мазафака",0.3001d, 3);
        Vest obVest=new Vest("жилет",0.1001d,1);

// метод объекта подкласса Cat
        objCat.doAnimal ();
// метод первого объекта подкласса Dog
        objDog1.doAnimal ();
// метод второго объекта подкласса Dog
        objDog2.doAnimal ();
        // метод второго объекта подкласса Vorobei
        objVorobei.doAnimal ();
        obVest.doСlothing();

    }

}