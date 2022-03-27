package hu.progmatic;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        // Írj programkódot, amely megállapítja egy évről, hogy az szökőév-e vagy sem.
        //
        //Szökőév:
        //1582-ben vezették be (tehát azelőtti év biztosan nem szökőév)
        //azon évek szökőévek, amelyek oszthatóak 4-gyel
        //de a 100-zal osztható évek közül csak azok szökőévek, amelyek 400-zal is oszthatóak
        //például szökőévek: 1584, 1600, 2004
        //például nem szökőévek: 1200, 1800, 1999


        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy évszámot: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        if (year >= 1582 && year % 4 ==0 && year % 100 !=0) {

            System.out.println(year + " szökőév.");

        if (year >= 1582 && year % 100 ==0 && year % 400 ==0)  {
            System.out.println(year + " szökőév.");
        }

        } else {
            System.out.println(year + " nem szökőév.");
        }

    }

}
