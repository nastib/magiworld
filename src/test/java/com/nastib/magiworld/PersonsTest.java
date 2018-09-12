/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nastib.magiworld;

import com.nastib.magiworld.bean.Magus;
import com.nastib.magiworld.bean.Person;
import com.nastib.magiworld.bean.Warrior;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

/**
 *
 * @author ADMIN
 */
public class PersonsTest {
    
    private static final  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public PersonsTest() {
    }

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }

    /**
     * Test of setUp method, of class Persons.
     */
    @Test
    public void testSetUp() {
        System.out.println("test de la methide testSetUp()!");
        List<Person> expResult = new ArrayList<>();
        System.setIn(new ByteArrayInputStream("1\n6\n2\n2\n2\n3\n5\n1\n2\n2\n".getBytes()));
        List<Person> result = new Persons().setUp();
        expResult.add(new Warrior(6, 2, 2, 2, "Warrior"));
        expResult.add(new Magus(5, 1, 2, 2, "Magus"));             
        assertEquals("testSetUp fail", expResult.toString(), result.toString());

    }
    
}
