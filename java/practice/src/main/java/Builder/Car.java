package Builder;

public class Car {

    private String make;
    private String model;
    private int year;

    private Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static class Builder {

        public Builder() {
        }

        private String make;
        private String model;
        private int year = 0;

        public Builder withMake(String make) {
            this.make = make;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withYear(int year) {
            this.year = year;
            return this;
        }

        public Car build() {
            if (make == null || model == null || year == 0) { // Usually do more specific checks
                throw new IllegalArgumentException("Not all arguments specified");
            }
            return new Car(this.make, this.model, this.year);
        }
    }
}
