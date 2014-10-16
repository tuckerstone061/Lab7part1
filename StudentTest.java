/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sstoneman1
 */
public class StudentTest {
    private Student stud;
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("SETUP CLASS RUNNING -- Nothing to do");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("TEARDOWN CLASS RUNNING -- Nothing to do");
    }
    
    @Before
    public void setUp() {
        stud = new Student("Chris", "012345");
    }
    
    @After
    public void tearDown() {
        System.out.println("TEARDOWN RUNNING -- Nothing to do");
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        String expResult = "012345";
        String result = stud.getStudentID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Chris";
        stud.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        assertSame("Chris", name);
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Chris";
        String result = stud.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Student: Chris\nStudent ID: 012345\n";
        String result = stud.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
