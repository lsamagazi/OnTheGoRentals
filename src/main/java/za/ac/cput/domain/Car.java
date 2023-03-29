package za.ac.cput.domain;
/**
 * Car.java
 * Entity for the Car
 * Author: Peter Buckingham (220165289)
 *  Date: 29 March 2021
 */

public class Car implements IVehicle{
    private final String id;
    private final String make;
    private final String model;
    private final int year;
    private final String category;
    private final String licensePlate;

    private Car(Builder builder) {
        this.id = builder.id;
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.category = builder.category;
        this.licensePlate = builder.licensePlate;
    }

    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String make;
        private String model;
        private int year;
        private String category;
        private String licensePlate;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder licensePlate(String licensePlate) {
            this.licensePlate = licensePlate;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}

