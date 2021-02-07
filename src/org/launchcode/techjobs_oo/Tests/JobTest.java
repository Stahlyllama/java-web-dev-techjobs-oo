package org.launchcode.techjobs_oo.Tests;



import org.junit.Assert;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.assertEquals;



public class JobTest {
    Job test_job1 = new Job();
    Job test_job2 = new Job();
    Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Before
    public void beforeTests() {
    }

    @Test
    public void testSettingJobId() {
        assertEquals(test_job1.getId() + 1, (test_job2.getId()));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assert.assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }


    @Test
    public void testJobsForEquality() {
        boolean results = test_job3.equals(test_job3);
        assertEquals(true, results);
        System.out.println("Thus we can skip the test for this condition.");
    }
}

//    @Test
//    public void testToString(Object id){
///      Job job = new Job(id);
//        System.out.println(("________ID: _____________"));
//  Job test_job2 = new Job ("Full Stack Engineer", new Employer("Splitwise"), new Location
//    assertFalse(test_job.equals(test_job2));
//    }
//
//
//    @Test
//public void testForToString(){
//    assertEquals("ID: " + test_job3.getId() + "\n" +
//            "Name: " + test_job3.getName() + "\n" +
//            "Employer: " + test_job3.getEmployer() + "\n" +
//            "Location: " + test_job3.getLocation() + "\n" +
//            "Position Type: " + test_job3.getPositionType() + "\n" +
//            "Core Competency: " + test_job3.getCoreCompetency()), test_job3.toString());
//
//    }


