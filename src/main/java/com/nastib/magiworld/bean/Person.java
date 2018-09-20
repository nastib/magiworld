
package com.nastib.magiworld.bean;

import com.nastib.magiworld.attack.Attack;

/**
 * Classe abstraite des personnages qui implémente l'interface Attack 
 * @author ADMIN
 */
public abstract class Person {

    protected int level;

    protected int life;

    protected int initialLife;

    protected int power;

    protected int agility;

    protected int brains;

    protected String fullname;

    protected Attack attack;

    //Constructor
    public Person() {
    }

    public Person(int level, int power, int agility, int brains, String fullname) {

        if ((power + agility + brains == level) && (level >=0 && level <= 100)) {
            this.level = level;
            this.power = power;
            this.agility = agility;            
            this.brains = brains;
            this.fullname = fullname;
            this.life = (this.level * 5);
            this.initialLife = life;            
        } else if (((power + agility + brains < level) || (power + agility + brains > level)) && ((power + agility + brains <= 100)) ){
            this.level = power + agility +brains ;
            this.power = power;
            this.agility = agility;            
            this.brains = brains;    
            this.fullname = fullname;
            this.life = (this.level * 5);
            this.initialLife = life;            
        } else {
            System.out.println("Impossible d'estancier le personnage avec ces parametres !");
        }

    }

    //Methodes 
    public abstract String basicAttack(Person person);

    public abstract String specialAttack(Person person);

    //Getters & Setters
    public int getLevel() {
        return level;
    }

    /**
     *
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     *
     * @return
     */
    public int getLife() {
        return life;
    }

    /**
     *
     * @param life
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     *
     * @return
     */
    public int getInitialLife() {
        return initialLife;
    }

    /**
     *
     * @return
     */
    public int getPower() {
        return power;
    }

    /**
     *
     * @param power
     */
    public void setPower(int power) {
         this.power = power;
    }

    /**
     *
     * @return
     */
    public int getAgility() {
        return agility;
    }

    /**
     *
     * @param agility
     */
    public final void setAgility(int agility) {
         this.agility = agility;
    }

    /**
     *
     * @return
     */
    public int getBrains() {
        return brains;
    }

    /**
     *
     * @param brains
     */
    public final void setBrains(int brains) {
         this.brains = brains;
    }

    /**
     *
     * @return
     */
    public String getFullname() {
        return fullname;
    }

    /**
     *
     * @param fullname
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     *
     * @return
     */
    public Attack getAttack() {
        return attack;
    }

    /**
     *
     * @param attack
     */
    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Waoh ! Je suis un "+fullname+ " - Level: " + level + " - Life: " + life + " - InitialLife: " + initialLife + " - Power: " + power + " - Agility: " + agility + " -  Brains: " + brains;
    }

}
