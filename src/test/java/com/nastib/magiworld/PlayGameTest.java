/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nastib.magiworld;

import com.nastib.magiworld.attack.MagusAttack;
import com.nastib.magiworld.attack.WarriorAttack;
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
public class PlayGameTest {
    
    private static final  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private List<Person> personList = new ArrayList<>();
    
    public PlayGameTest() {
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
     * Test of play method, of class PlayGame.
     */
    @Test
    public void testPlay() {
        System.out.println("test de la methode play()!");

        personList.add(new Warrior(1, 1, 0, 0, "Guerrier"));
        personList.add(new Magus(1, 0, 0, 1, "Mage")); 
        personList.get(0).setAttack(new WarriorAttack());
        personList.get(1).setAttack(new MagusAttack());
        System.setIn(new ByteArrayInputStream("1\n1\n1\n1\n1\n1\n1\n1\n1\n".getBytes()));
        String result = new PlayGame(personList).play();
        String expResult = "Bravo Guerrier vous avez gagné la partie !";

        assertEquals(result, expResult);

    }
    
}
