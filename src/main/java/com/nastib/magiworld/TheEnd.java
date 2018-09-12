/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nastib.magiworld;

import com.nastib.magiworld.bean.Person;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TheEnd {
    
    public static void end(List<Person> persons){
        //The TheEnd
        System.out.println("\nThe End. ");
        if (persons.get(0).getLife() <= 0){
            System.out.println("Bravo "+ persons.get(1).getFullname() +" vous avez gagné la partie !");
        } else if(persons.get(1).getLife() <= 0){    
           System.out.println("Bravo "+ persons.get(0).getFullname()+" Vous avez gagné la partie !");
        } 
    }
}
