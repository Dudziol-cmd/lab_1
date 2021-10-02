import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
        boolean zeroOrOne = false;
        boolean iamtheone = true;
        byte iameightbits = 127;
        short iamsmall = 12000;
        int iamlonger = 12000000;
        int iamlongertoo = 1800000;
        long iamlongest = 1200000000;
        float whereIsMyMantissa = 2.5f;
        double floatIsSingle = 22.5f;
        double iAmTheDouble = 23.35;
        char simpleCharacter = 'h';
        String iammanychars = "hahahaha";
        String butIcanBeAsingleCharacterToo = "a";

        System.out.println(zeroOrOne);
        System.out.println(iamtheone);
        System.out.println(iameightbits);
        System.out.println(iamsmall);
        System.out.println(iamlonger);
        System.out.println(iamlongertoo);
        System.out.println(iamlongest);
        System.out.println(whereIsMyMantissa);
        System.out.println(floatIsSingle);
        System.out.println(iAmTheDouble);
        System.out.println(simpleCharacter);
        System.out.println(iammanychars);
        System.out.println(butIcanBeAsingleCharacterToo);


        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */

        int sum = iamlonger + iamlongertoo;
        int diff = iamlongertoo - iamlonger;
        int mult = iamlongertoo * iamlonger;
        int div = iamlongertoo / iamlonger;
        int mod = iamlongertoo % iamlonger;

        System.out.println("These are int type operations");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Modulo: " + mod);

        double sumD = floatIsSingle + iAmTheDouble;
        double diffD = floatIsSingle - iAmTheDouble;
        double multD = floatIsSingle * iAmTheDouble;
        double divD = floatIsSingle / iAmTheDouble;
        double modD = floatIsSingle % iAmTheDouble;

        System.out.println("These are double type operations");
        System.out.println("Sum: " + sumD);
        System.out.println("Difference: " + diffD);
        System.out.println("Multiplication: " + multD);
        System.out.println("Division: " + divD);
        System.out.println("Modulo: " + modD);
    }
}
