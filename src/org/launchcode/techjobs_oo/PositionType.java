package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField{
    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType(String value){
     super(value);
}

    //
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//    @Override
//    public String toString() { return value; }
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    @Override
//    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
//        if (this == o) return true;   //reference check on the object o
//        if (!(o instanceof PositionType)) return false;//null check and class check on o.
//        PositionType positionType = (PositionType) o; //casts o as a Course object
//        return getId() == positionType.getId(); //compares the getId with PositionType getID
//    }
//
//    @Override
//    public int hashCode() { return Objects.hash(getId()); }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String aValue){ this.value = aValue;
//    }
}
