package org.launchcode.techjobs_oo.Tests;



import org.junit.Assert;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class JobTest {
    Job test_job1 = new Job();
    Job test_job2 = new Job();
    Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Before
    public void beforeTests() {
    }

    @Test
    public void testSettingJobId (){
     assertEquals (test_job1.getId() +1, (test_job2.getId()));
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
    public void testJobsForEquality(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(job1, job2);
        System.out.println("Thus we can skip the test for this condition.");
    }

//    @Test
//    public void testToString(Object id){
///      Job job = new Job(id);
//        System.out.println(("________ID: _____________"));
//    }
    }
