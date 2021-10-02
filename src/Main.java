import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */

        int myFirstPrime = 3;
        int mySecondPrime = 17;
        int myThirdprime = 19;

        float funWithPrimes = (((myFirstPrime * mySecondPrime) / myThirdprime) % (mySecondPrime | myFirstPrime)) * myThirdprime - myFirstPrime;

        System.out.println(funWithPrimes);
    }
}
