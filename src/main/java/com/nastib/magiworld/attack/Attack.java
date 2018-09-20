
package com.nastib.magiworld.attack;

import com.nastib.magiworld.bean.Person;
/**
 * Interface qui défini les type d'attack des personnages 
 * @author ADMIN
 */
public interface Attack {

    /**
     * 
     * @param person 
     */
    public String basicAttack(Person player1, Person player2);
    
    /**
     * 
     * @param person 
     */
    public String specialAttack(Person player1, Person player2);
}
