/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nastib.magiworld;

import com.nastib.magiworld.bean.Magus;
import com.nastib.magiworld.bean.Person;
import com.nastib.magiworld.bean.Warrior;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMIN
 */
public class TheEndTest {
    
    public TheEndTest() {
    }

    /**
     * Test of end method, of class TheEnd.
     */
    @Test
    public void testEnd() {
        System.out.println("test de la methode end()");
        List<Person> persons = new ArrayList<>();
        persons.add(new Warrior(6, 2, 2, 2, "Gerrier"));
        persons.add(new Magus(5, 1, 2, 2, "Mage")); 
        persons.get(0).setLife(0);
        persons.get(1).setLife(1);
        String result = new TheEnd().end(persons);
        String expResult = "Bravo Mage vous avez gagné la partie !";
        //System.out.println(result);
        assertEquals(expResult, result);

    }
    
}

