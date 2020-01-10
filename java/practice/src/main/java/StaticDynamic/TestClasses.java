package StaticDynamic;

public class TestClasses {

    public static void main(String[] args) {
        System.out.println(Animal.isAnAnimal()); //Static mMthod - Shows True
        System.out.println(new Animal("Penguin").getAnimalType()); //Dynamic Method - Shows Penguin
    }
}
