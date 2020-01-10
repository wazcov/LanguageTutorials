package StaticDynamic;

public class Animal {

    public String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalType() {
        return animalType;
    }

    public static boolean isAnAnimal() {
        return true;
    }
}
