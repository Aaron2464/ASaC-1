package com.example.aaron.assignmentsw1;

/**
 * Created by Aaron on 9/2/2018.
 */

class Mage extends Human {

    public final static int Fire_Staff = 0x01;
    public final static int Ice_Staff = 0x02;

    public Mage() {

    }

    @Override
    public void attack() {
        System.out.printf("(1)Weapon: Default Staff / Skill: Arcane Missiles \n(2)Weapon: Fire Staff / Skill: Fireball \n(3)Weapon: Ice Staff / Skill: Frostbolt%n");
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
                System.out.printf("%s use Default Staff weapon and Arcane Missiles skill to attack %n", getName());
            case 2:
                System.out.printf("%s use Fire Staff weapon and Fireball skill to attack %n", getName());
            case 3:
                System.out.printf("%s use Ice Staff weapon and Frostbolt to attack %n", getName());
            default:
                System.out.printf("%s, excuse me, enter the right number, please! %n", getName());
        }
    }
}


// Default Staff |
//   Fire Staff    | Fireball
//    Ice Staff     | Frostbolt