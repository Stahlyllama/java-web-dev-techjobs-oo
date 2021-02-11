package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency {
    private int id;
    private static int nextId = 1;//declares variable & static = changing value isn't stored in object
    private String value;

    public CoreCompetency (String value){
        super(value);
    }

    //
//    public CoreCompetency() {  //first constructor no args
//        this.id = nextId; //assigns value of nextId to the id field
//        nextId++; //increments nextId thus every new CoreComp will get diff ID
//    }
//
//    public CoreCompetency(String value) { //2nd constructor assigns
//        this(); //initializes id for the object; default behavior
//        this.value = value; //assigns aValue to the value field
//    }

    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof CoreCompetency)) return false;
//        CoreCompetency that = (CoreCompetency) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
//
//    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
//    //  ONLY a getter for the 'id' field.
//
//    public  int getId() { return id; }
//
//    public String getValue() { return value; }
    public void setValue(String aValue) { this.value = aValue; }
}