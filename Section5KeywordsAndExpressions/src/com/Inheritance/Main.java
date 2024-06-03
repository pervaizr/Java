package com.Inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, " Slow ");

        Dog dog = new Dog();
        doAnimalStuff(dog, " Fast ");

        Dog yorkie = new Dog("Yorkie" , 15);
        doAnimalStuff(yorkie, "Fast");

        Dog retriever = new Dog("Labrador retriever" , 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "Slow");

        Dog wolf = new Dog( "Wolf", 40);
        doAnimalStuff(wolf, "Slow");

        Fish goldie = new Fish("Goldfish", 0.25, 4,5);
        doAnimalStuff(goldie, "fast");


    }

    public static void doAnimalStuff(Animal animal, String speed){

        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);
        System.out.println(" _____ ____ ___");


    }

}



