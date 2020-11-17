package ru.geekbrains.CatEat;

public class Cat {
    private String name;
    private int appetite;
    public boolean isSatiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate Plate) {
        if (Plate.isDecreaseFood(appetite)){
            isSatiety = true;
            System.out.println("Коту " + name + " требуется " + appetite + " еды. Он поел и наелся");
        } else {
            System.out.println("Коту " + name + " требуется " + appetite + "еды. Ему не хватает");
        }

    }

}
