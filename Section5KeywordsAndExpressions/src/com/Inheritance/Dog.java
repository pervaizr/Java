package com.Inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;


    public Dog(){
        super("Matt", "Big", 5);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }


    public Dog(String type, double weight, String earShape, String tailShape) {

        super(type,
                weight < 15 ? " Small " : (weight < 35) ? " Medium " : "Large"
                , weight);

        this.earShape = earShape;
        this.tailShape = tailShape;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if (type == "Wolf"){
            System.out.println("Ow Wolf !!!");
        }
        bark();
        System.out.println(    );

    }

    @Override
    public void move(String speed) {
        if (speed == "Slow"){
            walk();
            wagTail();
        } else {
            bark();
            run();
        }
    }

    private void bark(){
        System.out.println("Barking ");
    }


    private void run(){
        System.out.println("Dog is running");

    }

    private void walk(){
        System.out.println("Dog is walking  ");

    }

    private void wagTail(){
        System.out.println("Dog is wagging the tail  ");

    }


}
