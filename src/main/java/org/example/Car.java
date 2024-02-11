package org.example;

public class Car {
    private int unique_number;
    private String brand;
    private String sponsor;
    private Driver driver_details;

    public Car() {
    }

    public int getUnique_number() {
        return unique_number;
    }

    public String getBrand() {
        return brand;
    }

    public String getSponsor() {
        return sponsor;
    }

    public Driver getDriver_details() {
        return driver_details;
    }

    public void setUnique_number(int unique_number) {
        this.unique_number = unique_number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public void setDriver_details(Driver driver_details) {
        this.driver_details = driver_details;
    }


    @Override
    public String toString() {
        return "Unique Number: " + unique_number + ", Brand: " + brand + ", Sponsor: " + sponsor + ", Driver: " + driver_details;
    }
}

