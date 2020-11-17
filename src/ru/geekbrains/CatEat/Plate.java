package ru.geekbrains.CatEat;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("в тарелке " + food + " еды");
    }

    public boolean isDecreaseFood(int count) {
        if (food - count >= 0) {
            food -= count;
            return true;
        } else {
            return false;
        }
    }

    public void addEat(int count){
        food += count;
        System.out.println("Добавлено " + count + " еды");
    }


}
