package ru.geekbrains.CatEat;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("в тарелке " + food + " еды");
    }

    public boolean isEnough( int appetite){
        if (food - appetite >= 0){
            return true;
        }
        return false;
    }

    public void isDecreaseFood(int count) {
            food -= count;
    }

    public void addEat(int count){
        food += count;
        System.out.println("Добавлено " + count + " еды. Теперь в тарелке " + food + " еды");
    }


}
