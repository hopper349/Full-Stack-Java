package Concepts.Inheritance;

import Concepts.Inheritance.Bird.Birds;
import Concepts.Inheritance.Bird.Eagle;
import Concepts.Inheritance.Fishes.Eel;
import Concepts.Inheritance.Fishes.Fish;
import Concepts.Inheritance.Reptile.Crocodile;
import Concepts.Inheritance.Reptile.Reptile;
import Concepts.Interface.AnimalProperties;

public class Animal implements AnimalProperties {
    public double height;
    public double weight;
    public String animalType;
    public String bloodType;

    public Animal() {
        height = 0;
        weight = 0;
        animalType = "unknown";
        bloodType = "unknown";
    }

    public Animal(double height, double weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }


    public String showInfo() {
        return "Animal [height : " + height + " weight : " + weight + " animalType : " + animalType + " bloodType : " + bloodType + "]";
    }


    public static void main(String[] args) {
        System.out.println(new Reptile().getAnimalType());
        System.out.println(new Reptile().showInfo());
        System.out.println(new Crocodile().showInfo());
        System.out.println(new Fish().showInfo());
        System.out.println(new Eel().showInfo());
        System.out.println(new Birds().showInfo());
        System.out.println(new Eagle().showInfo());
    }

    @Override
    public String getAnimalType() {
        return "ANIMALLL";
    }
}
