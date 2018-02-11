package com.example.aaron.assignmentsw1;

import java.util.Scanner;

/**
 * Created by Aaron on 9/2/2018.
 */

class Hunter extends Human {

    public final static int Fire_Bow = 0x01;
    public final static int Ice_Bow = 0x02;
    static Scanner scanner = null;

    public Hunter() {

    }

    @Override
    public void attack() {
        System.out.printf("(1)Weapon: Default Bow / Skill: Arrow \n(2)Weapon: Fire Bow / Skill: Fire Arrow \n(3)Weapon: Ice Bow / Skill: Ice Arrow%n");
        weaponNO();
        choosetheweapon();
    }

    public int weaponNO(){
        scanner = new Scanner(System.in);
        System.out.printf("Type the number 1-3 to choose your weapon");
        weapon = scanner.nextInt();
        return weapon;
    }

    private void choosetheweapon() {
        switch (weapon) {
            case 1:
                System.out.printf("%s use Default Bow weapon and Arrow skill to attack %n", name);
            case 2:
                System.out.printf("%s use Fire Bow weapon and Fire Arrow skill to attack %n", name);
            case 3:
                System.out.printf("%s use Ice Bow weapon and Ice Arrow skill to attack %n", name);
            default:
                System.out.printf("%s, excuse me, enter the right number, please! %n", name);
        }
    }
}
