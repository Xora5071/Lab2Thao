/**
 * Hydra
 * Project: Lab 2 Monster
 * Purpose Details: Hydra sealed class
 * Course: IST 242
 * Author: Xue Thao
 * Date Developed: February 06, 2025
 * Last Date Changed: February 09, 2025
 * Rev: 6
 */
//Subclass: Hydra inherit from Dragon
public final class Hydra extends Dragon {
    private double heads; //Additional attributes specific to Hydra

    //Constructor Overloaded
    public Hydra(String name, String color, int age, int health, int attackPower, int defense, int agility, double heads) {
        super(name, color, age, health, attackPower, defense, agility);
        this.heads = heads;
    }
    //getter for heads
    public double getHeads() {
        return heads;
    }
    //setter for heads
    public void setHeads(double heads) {
        this.heads = heads;
    }

    //Polymorphism of special power
    @Override
    public void specialPower() {
        System.out.println(name + " special ability is a level 5 barrage " + specialPower + ".");
    }
}