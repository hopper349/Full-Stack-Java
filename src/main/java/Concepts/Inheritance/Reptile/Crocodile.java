package Concepts.Inheritance.Reptile;

public class Crocodile extends Reptile {

    public Crocodile() {
        super();
        egg = "Hard shelled";
    }

    public String showInfo() {
        return "Reptile [height : " + height + " weight : " + weight + " animalType : " + animalType + " bloodType : " + bloodType +
                " skin : " + skin + " backbone : " + backbone + " egg : " + egg + "]";
    }
}
