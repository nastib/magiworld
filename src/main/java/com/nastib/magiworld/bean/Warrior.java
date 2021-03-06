
package com.nastib.magiworld.bean;

/**
 * Classe des Guerriers qui étend la classe abstraite Person (Personnage)
 * et implémente l'interface Attack
 * @author ADMIN
 */
public class Warrior extends Person {

    public Warrior(){}
    public Warrior(int level, int power, int agility, int brains, String fullname) {
        super(level, power, agility, brains, fullname);
        this.fullname = "Guerrier";
    }
    
    //Methodes 
    @Override
    public String basicAttack(Person person) {
        return attack.basicAttack(this,person);
    }

    @Override
    public String specialAttack(Person person) {
       return attack.specialAttack(this, person);
    }    
}
