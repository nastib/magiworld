
package com.nastib.magiworld.bean;

/**
 * Classe des Mages qui étend la classe abstraite Person (Personnage)
 * et implémente l'interface Attack
 * @author ADMIN
 */
public class Magus extends Person {

    //Constructor
    public Magus(){}
    public Magus(int level, int power, int agility, int brains, String fullname) {
        super(level, power, agility, brains, fullname);
        this.fullname = "Mage";
    }
    
    //Methodes 
    @Override
    public String basicAttack(Person person) {
        String result = getAttack().basicAttack(this,person);
        return result;
    }

    @Override
    public String specialAttack(Person person) {
       String result =  getAttack().specialAttack(this, person);
       return result;
    }  
}
