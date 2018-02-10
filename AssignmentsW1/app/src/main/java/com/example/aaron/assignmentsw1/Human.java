package com.example.aaron.assignmentsw1;

import java.util.Scanner;

public class Human {

   Scanner scanner = null;
   private String name;
   public final static int FIRE_BOW = 0x01;
   public final static int ICE_BOW = 0x02;

   public Human(){

   }

   public void Jobs(){
      System.out.println("There is some jobs that you can choose.");
      System.out.println("(1)Mage(2)Hunter(3)Warrior");
      System.out.print("Type the number to choose your jobs:  ");
      int Job = scanner.nextInt();
      switch (Job) {
         case 1:
         {
            break;
         }
         case 2:
         {
            break;
         }
         case 3:
         {
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
