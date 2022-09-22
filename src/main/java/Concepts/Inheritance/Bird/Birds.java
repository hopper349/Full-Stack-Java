package Concepts.Inheritance.Bird;

import Concepts.Inheritance.Animal;

public class Birds extends Animal {
    protected boolean fly;
    protected boolean wings;

    public Birds() {
        this.fly = true;
        this.wings = true;
    }

    public String showInfo() {
        return "Fish [height : " + height + " weight : " + weight + " animalType : " + animalType + " bloodType : " + bloodType +
                " fly : " + fly + " wings : " + wings + "]";
    }
}
