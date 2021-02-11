package org.launchcode.techjobs_oo.Tests;




import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;



import static org.junit.Assert.*;



public class JobTest {
    Job test_job1, test_job2, test_job3;

    @Before
    public void beforeTests() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId() {
        assertEquals(test_job1.getId() + 1, (test_job2.getId()));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
        assertTrue(test_job3.getEmployer() instanceof Employer);

    }


    @Test
    public void testJobsForEquality() {
        boolean results = test_job3.equals(test_job3);
        assertEquals(true, results);
    }


    @Test
    public void testForToString() {
        if (test_job3.equals(test_job3)) {
            assertEquals("ID: " + test_job3.getId() + "\n"
                    + "Name: " + test_job3.getName() + "\n"
                    + "Employer: " + test_job3.getEmployer() + "\n"
                    + "Location: " + test_job3.getLocation() + "\n"
                    + "Position Type: " + test_job3.getPositionType() + "\n"
                    + "Core Competency: " + test_job3.getCoreCompetency(), test_job3.toString());
        } else if (test_job3.equals("")) {
            System.out.println("Data not available!");
        }

    }
}
