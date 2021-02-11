package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job extends JobField{
//    public long getPositionType;
//    private int id;
//    private static int nextId = 1;
//    private String value;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
//    public Job() {
//        super();
//        id = nextId;
//        nextId++;
//    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        super();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String toString(){
        return "ID: " + getId() + "\n"
                + "Name: " + name + "\n"
                + "Employer: " + employer + "\n"
                + "Location: " + location + "\n"
                + "Position Type: " + positionType + "\n"
                + "Core Competency: "+ coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
            if (!(o instanceof Job)) return false;
             Job job = (Job) o;
                 if (job.getName().equals(this.name) && (job.getLocation().equals(this.location)) && (job.getEmployer().equals(this.employer) && (job.getPositionType().equals(this.positionType)) &&(job.coreCompetency.equals(this.coreCompetency))))
        {
            return true;
        } else {
            return false;

        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());}


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

//    public String getValue() {
//        return value;
//    }
//    public void setValue(String aValue) {
//       this.value = aValue;
//    }
    //using lower case a in front of setter replaces having to use this.value=value

    public String getName() {
        return name;
    }
    public void setName(String aName) {this.name = aName; }

    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer aEmployer) {
      this.employer = aEmployer;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location aLocation) {
        this.location = aLocation;
    }

    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType aPositionType) { this.positionType = aPositionType;
    }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }
    public void setCoreCompetency(CoreCompetency aCoreCompetency) {
        this.coreCompetency = aCoreCompetency;
    }

//    public int getId() {
//        return id;
//    }

  }


