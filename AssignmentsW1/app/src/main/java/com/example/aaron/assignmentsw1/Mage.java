package com.example.aaron.assignmentsw1;

import java.util.Scanner;

/**
 * Created by Aaron on 9/2/2018.
 */

class Mage extends Human {

    public final static int Fire_Staff = 0x01;
    public final static int Ice_Staff = 0x02;
    static Scanner scanner = null;
    public Mage() {

    }

    @Override
    public void attack() {
        System.out.printf("(1)Weapon: Default Staff / Skill: Arcane Missiles \n(2)Weapon: Fire Staff / Skill: Fireball \n(3)Weapon: Ice Staff / Skill: Frostbolt%n");
        weaponNO();
        choosetheweapon(weapon);
    }

    public int weaponNO(){
        scanner = new Scanner(System.in);
        System.out.printf("Type the number 1-3 to choose your weapon");
        weapon = scanner.nextInt();
        return weapon;
    }

    private void choosetheweapon(int w) {
        w = weapon;
        switch (w) {
            case 1:
                System.out.printf("%s use Default Staff weapon and Arcane Missiles skill to attack %n", name);
                break;
            case 2:
                System.out.printf("%s use Fire Staff weapon and Fireball skill to attack %n", name);
                break;
            case 3:
                System.out.printf("%s use Ice Staff weapon and Frostbolt to attack %n", name);
                break;
            default:
                System.out.printf("%s, excuse me, enter the right number, please! %n", name);
                break;
        }
    }
}
