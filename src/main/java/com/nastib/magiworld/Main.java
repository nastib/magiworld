
package com.nastib.magiworld;

import com.nastib.magiworld.bean.Person;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        greeting();
        List<Person> pers = new PlayersSetUp().setUp();
        System.out.println(new PlayGame(pers).play());

    }
    
    private static void greeting(){
        System.out.println("Welcome to MagiWorld !\n");
    }
    
}
