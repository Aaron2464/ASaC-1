package com.example.aaron.assignmentsw1;

import java.util.Scanner;

public class Human {
   public final static int FIRE_BOW = 0x01;
   public final static int ICE_BOW = 0x02;
   public int weapon;
   public static Scanner scanner = null;
   public static String name;
   public static void main(String[] args) {
      String name = getName();
      Human human = new Human(name);
   }
   public Human(String name) {
      int Job = 0;
      scanner = new Scanner(System.in);
      System.out.printf("%s ! There is some jobs that you can choose.%n", name);
      System.out.printf("(1)Mage(2)Hunter(3)Warrior%n");
      System.out.print("Type the number to choose your jobs:  ");
      Job = scanner.nextInt();
      Jobs(Job);
   }

   public Human() {
   }

   public static String getName(){
      scanner = new Scanner(System.in);
      System.out.print("Please, enter your name:");
      name = scanner.nextLine();
      return name;
   }

   public void Jobs(int Job){
      switch (Job) {
         case 1:
         {
            Mage mage = new Mage();
            mage.attack();
            break;
         }
         case 2:
         {
            Hunter hunter = new Hunter();
            hunter.attack();
            break;
         }
         case 3:
         {
            Warrior warrior = new Warrior();
            warrior.attack();
            break;
         }
         default:
         {
            System.out.printf("");
            break;
         }
      };
   }


   public void attack(){
       System.out.println("Fist Attack");
   }
}


//輸入姓名>選擇角色>選擇武器,攻擊模式。
