package org.javagenesis.oops.inheritance;

public class Inheritance3 {
    public static void main(String[] args) {
        BMW bmw = new BMW("AX123", "Black", 2100000);
        System.out.println(bmw.toString());
    }
}

class Car{
    private String color;
    private int cost;
    public Car(int cost, String color){
        this.cost = cost;
        this.color = color;
    }

    public void drive(){
        System.out.println("Car is driving! ");
    }
}

class BMW extends Car{

    private String model;

    public BMW(String model, String color, int cost){
        super(cost, color);
        this.model = model;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "model='" + model + '\'' +
                '}';
    }
}
