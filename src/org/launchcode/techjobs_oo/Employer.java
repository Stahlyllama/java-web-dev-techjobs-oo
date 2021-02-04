package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Employer {
    private int id;
    private static int nextId = 1;  //declares var nextId & static means it's changing values not stored within Employer
    private String value;

    public Employer() { //constructor accepts no arguments
        id = nextId; //and assigns the value of nextId to the id field.
        nextId++; //incrementing for each new Employer object created. assigning unique id number
    }

    public Employer(String value) { //constructor taking in a string value
        this(); //calling the first constructor
        this.value = value; //makes initializing id a default behavior
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
