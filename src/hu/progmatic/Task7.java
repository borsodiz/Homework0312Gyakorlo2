package hu.progmatic;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Írj programkódot, amely megállapítja egy egész számról, hogy az prímszám-e vagy sem.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mondj egy számot: ");
        long number = scanner.nextInt();
        scanner.nextLine();


        int counter = 0;

        if (number >= 0) {
           for (long divider = 1; divider < number+1; divider++) {
             if (number % divider == 0) {
                 counter ++;
             }
           }
           if (counter == 2) {
               System.out.println("Ez egy prímszám.");
           } else {
               System.out.println("Ez nem prímszám.");
           }
        } else {
            System.out.println("Nem természetes számot adtál meg.");
        }

    }
}
