/**
 * How to Train Your Dragon
 * Project: Lab 2 Monster
 * Purpose Details: Dragon Abstract SuperClass
 * Course: IST 242
 * Author: Xue Thao
 * Date Developed: February 06, 2025
 * Last Date Changed: February 09, 2025
 * Rev: 9
 */
//Superclass: Dragon abstract parent class protected and inherit to subclass
public abstract class Dragon {
    protected String name;
    protected String color;
    protected int age;
    protected int health;
    protected int attackPower;
    protected int defense;
    protected int agility;
    protected SpecialPower specialPower;

    //Constructor methods
    public Dragon(String name, String color, int age, int health, int attackPower, int defense, int agility) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.agility = agility;
    }
    //getter for name
    public String getName() {
        return name;
    }
    //setter for name
    public void setName(String name) {
        this.name = name;
    }
    //getter for color
    public String getColor() {
        return color;
    }
    //setter for color
    public void setColor(String color) {
        this.color = color;
    }
    //getter for color
    public int getAge() {
        return age;
    }
    //setter for age
    public void setAge(int age) {
        this.age = age;
    }
    //getter for health
    public int getHealth() {
        return health;
    }
    //setter for health
    public void setHealth(int health) {
        this.health = health;
    }
    //getter for attack power
    public int getAttackPower() {
        return attackPower;
    }
    //setter for attack power
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    //getter for defense
    public int getDefense() {
        return defense;
    }
    //setter for defense
    public void setDefense(int defense) {
        this.defense = defense;
    }
    //getter for agility
    public int getAgility() {
        return agility;
    }
    //setter for agility
    public void setAgility(int agility) {
        this.agility = agility;
    }

    //public void specialPower() {
    //    System.out.println(name + " special ability. ");
    //}

     public SpecialPower getSpecialPower() {
        return specialPower;
     }

    public void setSpecialPower(SpecialPower specialPower) {
            this.specialPower = specialPower;
    }

    public abstract void specialPower();
}