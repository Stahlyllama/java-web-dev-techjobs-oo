package org.launchcode.techjobs_oo;
import java.util.Objects;

public abstract class JobField{

private int id;
private static int nextId=1;  //declares var nextId & static means it's changing values not stored within Employer
private String value;


public JobField(){ //constructor accepts no arguments
        id=nextId; //and assigns the value of nextId to the id field.
        nextId++; //incrementing for each new Employer object created. assigning unique id number
        }
public JobField(String value) { //constructor taking in a string value
        //calling the first constructor
        this.value = value; //makes initializing id a default behavior
    }

    @Override
public String toString() {
            if (value == null || value.equals("")) {
                    return "no data";
            } else {
                    return value;
            }
    }

@Override
public boolean equals(Object o){  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that=(JobField)o;
        return id == that.id;
}

@Override
public int hashCode(){
        return Objects.hash(getId());
        }
public int getId(){
        return id;
        }

public String getValue(){
        return value;
        }

public void setValue(String aValue){
        this.value=aValue;
        }
        }
