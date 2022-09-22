package Concepts.Inheritance.Fishes;

public class Eel extends Fish {
    private String special;

    public Eel() {
        super();
        this.special = "releases shock";
    }

    public String showInfo() {
        return "Fish [special : " + special + ",height : " + height + " weight : " + weight + " animalType : " + animalType + " bloodType : " + bloodType +
                " waterBone : " + waterBone + " gills : " + gills + "]";
    }
}
