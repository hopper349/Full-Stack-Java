package Concepts.Inheritance.Bird;

public class Eagle extends Birds {

    public Eagle() {
        super();
    }

    public String showInfo() {
        return "Fish [height : " + height + " weight : " + weight + " animalType : " + animalType + " bloodType : " + bloodType +
                " fly : " + fly + " wings : " + wings + "]";
    }
}
