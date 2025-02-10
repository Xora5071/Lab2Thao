/**
 * BabyDragon
 * Project: Lab 2 Monster
 * Purpose Details: BabyDragon sealed class
 * Course: IST 242
 * Author: Xue Thao
 * Date Developed: February 06, 2025
 * Last Date Changed: February 09, 2025
 * Rev: 6
 */
//Subclass: BabyDragon inherit from Dragon
public final class BabyDragon extends Dragon {
    private String egg; // Additional attributes specific to BabyDragon

    //Constructor overloaded
    public BabyDragon(String name, String color, int age, int health, int attackPower, int defense, int agility, String egg) {
        super(name, color, age, health, attackPower, defense, agility);
        this.egg = egg;
    }
    //getter
    public String getEgg() {
        return egg;
    }
    //setter
    public void setEgg(String egg) {
        this.egg = egg;
    }

    //Polymorphism of special power
    @Override
    public void specialPower() {
        System.out.println(name + " special ability is a Level 1 weak " + specialPower + ".");
    }
}