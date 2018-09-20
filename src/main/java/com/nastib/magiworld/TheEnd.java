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
    
    public String end(List<Person> persons){
        
        if (persons.get(0).getLife() <= 0){
            return "Bravo "+ persons.get(1).getFullname() +" vous avez gagné la partie !" ;
        }    
        return "Bravo "+ persons.get(0).getFullname()+" vous avez gagné la partie !";

    }
}
