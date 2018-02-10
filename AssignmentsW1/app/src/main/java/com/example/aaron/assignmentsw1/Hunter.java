package com.example.aaron.assignmentsw1;

/**
 * Created by Aaron on 9/2/2018.
 */

class Hunter extends Human {

    @Override
    public void attack() {
        System.out.printf("(1)Weapon: Default Bow / Skill: Arrow \n(2)Weapon: Fire Bow / Skill: Fire Arrow \n(3)Weapon: Ice Bow / Skill: Ice Arrow%n");
        weaponNO();
        choosetheweapon();
    }

    public int weaponNO(){
        System.out.printf("Type the number 1-3 to choose your weapon");
        int weapon = scanner.nextInt();
        return weapon;
    }

    private void choosetheweapon() {
        switch (weaponNO()) {
            case 1:
                System.out.printf("%s use Default Bow weapon and Arrow skill to attack %n", getName());
            case 2:
                System.out.printf("%s use Fire Bow weapon and Fire Arrow skill to attack %n", getName());
            case 3:
                System.out.printf("%s use Ice Bow weapon and Ice Arrow skill to attack %n", getName());
            default:
                System.out.printf("%s, excuse me, enter the right number, please! %n", getName());
        }
    }
}


// Default Bow  | Arrow
// Fire Bow       | Fire Arrow
// Ice Bow         | Ice Arrow