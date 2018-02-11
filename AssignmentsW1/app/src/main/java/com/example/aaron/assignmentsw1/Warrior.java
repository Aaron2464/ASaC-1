package com.example.aaron.assignmentsw1;

import java.util.Scanner;

/**
 * Created by Aaron on 9/2/2018.
 */

class Warrior extends Human {

    public final static int Fire_Blade = 0x01;
    public final static int Ice_Blade = 0x02;
    static Scanner scanner = null;

    public Warrior() {

    }

    @Override
    public void attack() {
        System.out.printf("(1)Weapon: Default Blade / Skill: Slash %n(2)Weapon: Fire Blade / Skill: Fire Slash %n(3)Weapon: Ice Blade / Skill: ISlash%n");
        weaponNO();
        choosetheweapon();
    }

    public int weaponNO(){
        scanner = new Scanner(System.in);
        System.out.printf("%s ");
        System.out.printf("Type the number 1-3 to choose your weapon");
        weapon = scanner.nextInt();
        return weapon;
    }

    private void choosetheweapon() {
        switch (weapon) {
            case 1:
                System.out.printf("%s use Default Blade weapon and Slash skill to attack %n", name);
            case 2:
                System.out.printf("%s use Fire Blade weapon and Fire Slash skill to attack %n", name);
            case 3:
                System.out.printf("%s use Ice Blade weapon and Ice Slash skill to attack %n", name);
            default:
                System.out.printf("%s, excuse me, enter the right number, please! %n", name);
        }
    }
}
