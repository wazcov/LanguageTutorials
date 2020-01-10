package Builder;

public class BuildACar {

    public static void main(String[] args) {
        Car aston = new Car.Builder().withMake("Aston Martin").withModel("DBS").withYear(2020).build();
    }
}
