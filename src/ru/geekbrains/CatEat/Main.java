package ru.geekbrains.CatEat;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Cat catTom = new Cat("Том", 10);
        Cat catFelix = new Cat("Феликс", 5);
        Cat catGav = new Cat("Гав", 1);
        Plate Plate = new Plate(10);
        Cat[] catArray = {catFelix,catTom,catGav};

        Plate.info();

        for (int i = 0; i < catArray.length; i++)
        {
            catArray[i].eat(Plate);
            Plate.info();
        }
        Plate.addEat(6);
        for (int i = 0; i < catArray.length; i++)
        {
            catArray[i].eat(Plate);
            Plate.info();
        }

    }
}
