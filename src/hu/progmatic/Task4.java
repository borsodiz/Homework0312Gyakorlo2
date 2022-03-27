package hu.progmatic;

public class Task4 {
    public static void main(String[] args) {
        // Adott egy karaktereket tartalmazó tömb.
        //Írj programkódot, amely felcseréli a tömb legelső és legutolsó elemét!
        //Ügyelj arra, hogy a tömb akár üres is lehet! (Üres tömb elemeit nem tudod felcserélni.)

        char [] chars = {'+', '-', '*', '/', '%'};
        int zero = chars.length;


        if (chars.length == 0) {
            System.out.println(chars);
        }
        else {

            int index = 0;
        char first = chars [0];
        char last = chars[chars.length-1];

        chars [0] = last;
        chars [chars.length-1] = first;



       while (index < chars.length) {
           System.out.println(chars[index]);
           index++;
       }
       }

    }
}
