
package com.nastib.magiworld;

import com.nastib.magiworld.bean.Person;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TheEnd {
    
    /**
     * Formate et retourne le message de la fin de la partie.
     * Il prend en paramettre une liste d'objets des personnages du jeu.
     * @param persons
     * @return 
     */
    public String end(List<Person> persons){
        
        if (persons.get(0).getLife() <= 0){
            return "Bravo "+ persons.get(1).getFullname() +" vous avez gagné la partie !" ;
        }    
        return "Bravo "+ persons.get(0).getFullname()+" vous avez gagné la partie !";

    }
}
