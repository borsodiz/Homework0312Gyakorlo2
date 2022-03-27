package hu.progmatic;

public class Task5 {
    public static void main(String[] args) {
        // Adott egy egész számokat tartalmazó tömb.
        //Írj programkódot, amely felcseréli a tömb első és második elemét, ha…
        //a tömbben van legalább két elem, és
        //ha az első elem nagyobb a másodiknál
        //Amennyiben a tömb mérete kisebb 2-nél, vagy az első elem kisebb a másodiknál, ne történjen változás.

        int[] numbers = {2, 1, -4, 3};

        if (numbers.length >= 2 && numbers[0] > numbers[1]) {

            int index = 0;
            int first = numbers[0];
            int last = numbers[1];

            numbers[0] = last;
            numbers[1] = first;


            while (index < numbers.length) {
                System.out.println(numbers[index]);
                index++;
            }
        } else if (numbers.length < 2 || numbers[0] < numbers[1]) {

            int index = 0;
            while (index < numbers.length) {
                System.out.println(numbers[index]);
                index++;
            }

        }
    }
}


