import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */


        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        int myAge = 20;
        int value = myAge % 3;

        if(value == 0)
            System.out.println("I can divide my age by 3!");
        else
            System.out.println("I cannot divide my age by 3");


        int id = 895;

        //Pierwsza metoda
        int howManyTwos = id % 2;
        if(howManyTwos == id / 2)
        {
            System.out.println("ID is even!");
        }
        else
        {
            System.out.println("ID is not even!");
        }

        //Druga moim zdaniem lepsza metoda

        if((id & 1) != 1)
        {
            System.out.println("ID is even!");
        }
        else
        {
            System.out.println("ID is not even!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Show me some floats B)");
        float myFloat = scanner.nextFloat();

        if(myFloat < 0)
        {
            System.out.println("You are under 0!");
        }
        else if(myFloat == 0.5)
        {
            System.out.println("You are at 50%!");
        }
        else if(myFloat > 0.5)
        {
            System.out.println("You are GREATER than 50%!");
        }
    }
}
