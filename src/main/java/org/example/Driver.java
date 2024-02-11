package org.example;

public class Driver {
    private String Name;
    private String NIC;
    private int Age;

    public Driver(String name, String NIC, int age) {
        Name = name;
        this.NIC = NIC;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getNIC() {
        return NIC;
    }

    public int getAge() {
        return Age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", NIC: " + NIC + ", Age: " + Age;
    }
}
