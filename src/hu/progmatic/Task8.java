package hu.progmatic;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Írj programkódot, amely kiszámítja két szám legnagyobb közös osztóját!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg két számot: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        int number2 = scanner.nextInt();
        scanner.nextLine();

        int kozososzto = 0;

        if (number1 < number2) {
            for (int divider = 1; divider < number1 + 1; divider++) {
                if (number1 % divider == 0 && number2 % divider == 0) {
                    kozososzto = divider;
                }
            }
            System.out.println("A két szám legnagyobb közös osztója: " + kozososzto);

        } else if (number2 < number1) {
            for (int divider = 1; divider < number2 + 1; divider++) {
                if (number1 % divider == 0 && number2 % divider == 0) {
                    kozososzto = divider;
                }
            }
            System.out.println("A két szám legnagyobb közös osztója: " + kozososzto);

        } else {
            System.out.println("A két szám legnagyobb közös osztója: " + number1);

        }


    }

}
