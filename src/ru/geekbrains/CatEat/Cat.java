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
        if (Plate.isEnough(appetite) && !isSatiety){
            isSatiety = true;
            System.out.println("Коту " + name + " требуется " + appetite + " еды. Он поел и наелся");
            Plate.isDecreaseFood(appetite);
        }else if (isSatiety)
        {
            System.out.println("Кот " + name + " уже наелся");
        }
        else {
            System.out.println("Коту " + name + " требуется " + appetite + " еды. Ему не хватает");
        }

    }

}
