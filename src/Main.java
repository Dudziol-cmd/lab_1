import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;
        int age;
        int id;

        System.out.println("Tell me your name, please.");
        name = scanner.next();
        System.out.println("Tell me your surname, please.");
        surname = scanner.next();
        System.out.println("Tell me something about your age.");
        age = scanner.nextInt();
        System.out.println("What is your ID?");
        id = scanner.nextInt();

        System.out.println("I've hacked some data about you!");
        System.out.printf(name + " " + surname + " " + age + " " + id);

        System.out.println();

        int myIntA = 13;
        int myIntB = 17;
        System.out.println("I have done some primes calculations!");
        System.out.printf("Sum: " + (myIntA + myIntB));
        System.out.printf(" Difference: " + (myIntA - myIntB));
        System.out.printf(" Multiplication: " + (myIntA * myIntB));
        System.out.printf(" Division: " + (myIntA / myIntB));
        System.out.printf(" Modulo: " + (myIntA % myIntB));
        System.out.println("Good luck doing some encryption!");
    }
}
