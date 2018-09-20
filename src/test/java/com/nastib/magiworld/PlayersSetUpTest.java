
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
public class PlayersSetUpTest {
    
    private static final  ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public PlayersSetUpTest() {
    }

    @Before
    public void setUp() throws Exception {
        //System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(System.out);
    }

    /**
     * Test of setUp method, of class PlayersSetUp.
     */
    @Test
    public void testSetUp() {
        System.out.println("test de la methode testSetUp()!");
        List<Person> expResult = new ArrayList<>();
        System.setIn(new ByteArrayInputStream("1\n1\n1\n0\n0\n3\n1\n0\n0\n1\n".getBytes()));
        List<Person> result = new PlayersSetUp().setUp();
        expResult.add(new Warrior(1, 1, 0, 0, "Warrior"));
        expResult.add(new Magus(1, 0, 0, 1, "Magus"));             
        assertEquals("testSetUp fail", expResult.toString(), result.toString());

    }
    
}
