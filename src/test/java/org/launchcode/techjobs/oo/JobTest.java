package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;




public class JobTest {
//    @Before
  //  public void createJobObjects() {
   //     Job emptyJob1 = new Job();
     //   Job emptyJob2 = new Job();



        @Test
        public void testSettingJobId() {
            Job job1 = new Job();
            Job job2 = new Job();
            new Job();
            new Job();
            assertNotEquals(job1.getId(), job2.getId());
        }
            @Test
            public void testJobConstructorSetsAllFields() {
                Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
                assertTrue(testJob instanceof Job);
                assertEquals("Product tester", testJob.getName());
                assertTrue(testJob.getEmployer() instanceof Employer);
                assertEquals("ACME", testJob.getEmployer().getValue());
                assertTrue(testJob.getLocation() instanceof Location);
                assertEquals("Desert", testJob.getLocation().getValue());
                assertTrue(testJob.getPositionType() instanceof PositionType);
                assertEquals("Quality control", testJob.getPositionType().getValue());
                assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
                assertEquals("Persistence", testJob.getCoreCompetency().getValue());
            }

            @Test
            public void testJobsForEquality () {
                Job jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
                Job jobB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
                assertFalse(jobA.equals(jobB));
            }

            @Test
            public void testToStringStartsAndEndsWithNewLine () {
                Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
                char lett[] = testJob.toString().toCharArray();
                assertEquals('\n', lett[lett.length - 1]);
                assertEquals('\n', lett[0]);
            }

            @Test
            public void testToStringContainsCorrectLabelsAndData () {
                Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
                String answer = "\nID: " + job.getId() + "\n" +
                        "Name: " + job.getName() + "\n" +
                        "Employer: " + job.getEmployer() + "\n" +
                        "Location: " + job.getLocation() + "\n" +
                        "Position Type: " + job.getPositionType() + "\n" +
                        "Core Competency: " + job.getCoreCompetency() + "\n";
                assertEquals(job.toString(), answer);
            }

            @Test
            public void testToStringHandlesEmptyField () {
                Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
                String answer = "\nID: " + job.getId() + "\n" +
                        "Name: " + job.getName() + "\n" +
                        "Employer: " + "Data not available" + "\n" +
                        "Location: " + "Data not available" + "\n" +
                        "Position Type: " + "Data not available" + "\n" +
                        "Core Competency: " + "Data not available" + "\n";
                assertEquals(job.toString(), answer);
            }
}











