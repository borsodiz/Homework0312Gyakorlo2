package hu.progmatic;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Két medve csatázik egymással.
        // Mindkét medvenak eltérő életpontja és ereje van.
        // A csata folyamán mindkét medve minden körben sebzi a másikat - mindaddig,
        // amíg az egyikük életereje el nem fogy.
        //Írj programkódot a medvek csatájáról! A program hirdesse ki a győztes medvet.
        //(Az eredmény lehet döntetlen!)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg az első medve életpontját: ");
        int life1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg az első medve erejét: ");
        int strength1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a második medve életpontját: ");
        int life2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a második medve erejét: ");
        int strength2 = scanner.nextInt();
        scanner.nextLine();

        int round = 1;

      do {
          life1 = life1 - strength2;
          life2 = life2 - strength1;
          System.out.println("Az " + round + ". körben az első medve életpontja: " + life1);
          System.out.println("A második medve életpontja " + life2);
          round++;
      }

        while (life1 >0 && life2 >0) ;

        if (life1 > life2) {
            System.out.println("Az első medve a győztes.");
        } else if (life2 > life1) {
            System.out.println("A második medve a győztes.");

        } else  {
            System.out.println("Döntetlen!");
        }



    }
        }



