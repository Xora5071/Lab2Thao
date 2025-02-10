/**
 * Leviathan
 * Project: Lab 2 Monster
 * Purpose Details: Leviathan sealed class
 * Course: IST 242
 * Author: Xue Thao
 * Date Developed: February 06, 2025
 * Last Date Changed: February 09, 2025
 * Rev: 6
 */
//Subclass: Leviathan inherit from Dragon
public final class Leviathan extends Dragon {
    private boolean hasWings; // Additional attributes specific to Leviathan

    //Constructor Overloaded
    public Leviathan(String name, String color, int age, int health, int attackPower, int defense, int agility, boolean hasWings) {
       super(name, color, age, health, attackPower, defense, agility);
       this.hasWings = hasWings;
    }
    //getter for wings
    public boolean isHasWings() {
        return hasWings;
    }
    //setter for wings
    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    //Polymorphism of special power
    @Override
    public void specialPower() {
        System.out.println(name + " special ability is Level 3 stream " + specialPower + ".");
    }
}