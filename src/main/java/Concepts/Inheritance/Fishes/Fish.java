package Concepts.Inheritance.Fishes;

import Concepts.Inheritance.Animal;

public class Fish extends Animal {
    protected boolean waterBone;
    protected boolean gills;

    public Fish() {
        super();
        animalType = "fish";
        this.waterBone = true;
        this.gills = true;
    }

    public String showInfo() {
        return "Fish [height : " + height + " weight : " + weight + " animalType : " + animalType + " bloodType : " + bloodType +
                " waterBone : " + waterBone + " gills : " + gills + "]";
    }
}
