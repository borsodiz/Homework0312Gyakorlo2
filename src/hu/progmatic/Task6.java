package hu.progmatic;

public class Task6 {
    public static void main(String[] args) {
        // Adott egy egész számokat tartalmazó tömb, valamint egy egész szám, amelyet szeretnénk hozzáadni a tömbhöz.
        //Írj programkódot, amely módosítja az eredeti tömböt!
        //Hozz létre egy új tömböt, amely eggyel nagyobb az eredetinél,
        // majd másold át az eredeti tömb minden elemét az új tömbbe. Végül add hozzá az új elemet is.
        //Elvárás, hogy az új tömb tartalmazza az eredeti tömb minden elemét,
        // méghozzá az eredeti sorrendben, valamint tartalmazza az új elemet is.
        //A tömb másolására létezik a Java-ban egyszerű megoldás. De most ne használd!
        // Írd meg magad a tömb másolásának műveletét!

        int numbers1[] = {-33, 66, 42, -13, 54, 89};
        int singleNumber = 0;
        int numbers2[] = new int[numbers1.length + 1];


        for (int i = 0; i < numbers1.length; i++) {
            numbers2[i] = numbers1[i];


        }
        numbers2[numbers2.length - 1] = singleNumber;

        for (int i = 0; i < numbers2.length; i++) {

            System.out.println(numbers2[i]);
        }

    }
}






