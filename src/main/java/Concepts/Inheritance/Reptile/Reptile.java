package Concepts.Inheritance.Reptile;

import Concepts.Inheritance.Animal;

public class Reptile extends Animal {

    public String skin;
    public boolean backbone;
    public String egg;

    public Reptile() {
        height = 10;
        weight = 30;
        animalType = "Reptile";
        bloodType = "Cold";
        skin = "Dry Skin";
        backbone = true;
        egg = "soft shelled";
    }

    public String showInfo() {
        return "Reptile [height : " + height + " weight : " + weight + " animalType : " + animalType + " bloodType : " + bloodType +
                " skin : " + skin + " backbone : " + backbone + " egg : " + egg + "]";
    }

    @Override
    public String getAnimalType(){
        return "REPTILE";
    }

}
