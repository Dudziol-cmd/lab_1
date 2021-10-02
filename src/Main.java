import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */

        double[] arrayOfDoubles = new double[5];

        for (int i = 0; i < arrayOfDoubles.length; i++)
        {
            arrayOfDoubles[i] = (i + 2) * 3;
        }

        for (double dob: arrayOfDoubles)
        {
            System.out.println(dob);
        }
    }
}
