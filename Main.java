/**
 * Main: How To Train Your Dragon
 * Project: Lab 2 Monster
 * Purpose Details: Main class instantiate 5 dragon objects
 * Course: IST 242
 * Author: Xue Thao
 * Date Developed: February 07, 2025
 * Last Date Changed: February 09, 2025
 * Rev: 13
 */
//Main class to instantiate 5 monster objects from selecting from dragon type defined
public class Main {
    public static void main(String[] args) {

        //Create 5 Dragon Objects calling constructor method, pass in arguments to set dragon characteristics
        Dragon babyDragon1 = new BabyDragon("Fire Dragonling", "Red", 1, 50, 5, 4, 2, "cracked");
        Dragon hydra1 = new Hydra("Ghidora", "Gold", 500, 1545, 200, 150, 130, 3.0);
        Dragon leviathan1 = new Leviathan("Shiva", "Blue", 1000, 9999, 255, 180, 150, false);
        Dragon babyDragon2 = new BabyDragon("Zephyr", "Green", 2, 110, 11, 8, 15, "stripes");
        Dragon hydra2 = new Hydra("Manatite", "Cyan", 758, 8960, 260, 400, 320, 9.5);

        //Setter method for all 5 Dragon attributes and special power
        babyDragon1.setSpecialPower(SpecialPower.Flame_Breath);
        hydra1.setSpecialPower(SpecialPower.Lightning_Breath);
        leviathan1.setSpecialPower(SpecialPower.Water_Breath);
        babyDragon2.setSpecialPower(SpecialPower.Aero_Breath);
        hydra2.setSpecialPower(SpecialPower.Ice_Breath);

        babyDragon1.setName("Kyle");
        babyDragon1.setColor("Yellow");
        babyDragon1.setAge(3);
        babyDragon1.setHealth(25);
        babyDragon1.setAttackPower(15);
        babyDragon1.setDefense(10);
        babyDragon1.setAgility(13);

        babyDragon2.setName("Zen");
        babyDragon2.setColor("Orange");
        babyDragon2.setAge(4);
        babyDragon2.setHealth(100);
        babyDragon2.setAttackPower(20);
        babyDragon2.setDefense(21);
        babyDragon2.setAgility(22);

        hydra1.setName("Ghili");
        hydra1.setColor("Light");
        hydra1.setAge(20);
        hydra1.setHealth(1300);
        hydra1.setAttackPower(100);
        hydra1.setDefense(70);
        hydra1.setAgility(90);

        hydra2.setName("ManaMore");
        hydra2.setColor("Black");
        hydra2.setAge(50);
        hydra2.setHealth(1000);
        hydra2.setAttackPower(80);
        hydra2.setDefense(50);
        hydra2.setAgility(120);

        leviathan1.setName("ManaMore");
        leviathan1.setColor("Black");
        leviathan1.setAge(50);
        leviathan1.setHealth(1000);
        leviathan1.setAttackPower(80);
        leviathan1.setDefense(50);
        leviathan1.setAgility(120);

        //Print out all 5 Dragon setting status
        System.out.println("\nDragon Status");
        printDragonStatus(babyDragon1);
        printDragonStatus(hydra1);
        printDragonStatus(leviathan1);
        printDragonStatus(babyDragon2);
        printDragonStatus(hydra2);

        //Use getter method and print out all 5 dragon and different special power
        System.out.println("\nDragon Ability:");
        babyDragon1.specialPower();
        hydra1.specialPower();
        leviathan1.specialPower();
        babyDragon2.specialPower();
        hydra2.specialPower();
    }
    //print dragon status getter
    public static void printDragonStatus(Dragon dragon) {
        System.out.println(dragon.getName() + "-- Color: " + dragon.getColor() + ", Age: " + dragon.getAge() +
                ", Health: " + dragon.getHealth() + ", Attack Power: " + dragon.getAttackPower()
                + ", Defense: " + dragon.getDefense() + ", Agility: " + dragon.getAgility());

        //Print dragon private specific attribute getter
        switch (dragon) {
            case BabyDragon babyDragon -> System.out.println("Egg: " + babyDragon.getEgg());
            case Leviathan leviathan -> System.out.println("Wings: " + leviathan.isHasWings());
            case Hydra hydra -> System.out.println("Heads: " + hydra.getHeads());
            default -> {
            }
        }
    }
    //print special power not from the setter method
    //public static void printSpecialPower(Dragon dragon) {
    //    System.out.println(dragon.getName() + " special ability is " + dragon.getSpecialPower());
    //}
}