package com.example.aaron.assignmentsw1;

/**
 * Created by Aaron on 9/2/2018.
 */

class Warrior extends Human {

    public final static int Fire_Blade = 0x01;
    public final static int Ice_Blade = 0x02;

    public Warrior() {

    }

    @Override
    public void attack() {
        System.out.printf("(1)Weapon: Default Blade / Skill: Slash \n(2)Weapon: Fire Blade / Skill: Fire Slash \n(3)Weapon: Ice Blade / Skill: ISlash%n");
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
                System.out.printf("%s use Default Blade weapon and Slash skill to attack %n", getName());
            case 2:
                System.out.printf("%s use Fire Blade weapon and Fire Slash skill to attack %n", getName());
            case 3:
                System.out.printf("%s use Ice Blade weapon and Ice Slash skill to attack %n", getName());
            default:
                System.out.printf("%s, excuse me, enter the right number, please! %n", getName());
        }
    }
}

//Default Blade | Slash
//Fire Blade       | Fire Slash
//Ice Blade        | Ice Slash