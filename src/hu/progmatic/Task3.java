package hu.progmatic;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        // Írj programkódot, amely megszámolja, hogy egy természetes számnak hány darab osztója van!
        // (Azaz csak a nem negatív egész számokra működjön a programkód, negatív számokra nem kell.)


        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        int counter = 0;
        int divider = 1;

        if (number < 0) {
            System.out.println("Pozitív számot adj meg!");

        } else {

            while (number >= divider) {
                if (number % divider == 0) {
                    System.out.println(divider);
                    divider++;
                    counter++;
                }
                if (number % divider != 0) {
                    divider++;

                }

            }
            System.out.println("A számnak " + counter + " db osztója van");
        }


    }
}
