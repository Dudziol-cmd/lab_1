public class Main {

    public static void main(String[] args) {
//        ćw.1 napisać po kilka przykładów wypisywania tekstu w konsoli,
//        Użyć każdej z opcji

        boolean mrBool = true;
        short shorty = 32000;
        int integer = 2100000;
        long longest = 99999999;

        System.out.println(mrBool);
        System.out.println(shorty);
        System.out.println(integer);
        System.out.println(longest);

        System.out.println("Long variable is: " + longest + " haha");
        long longerLongest = longest + integer + shorty;
        System.out.println("But I found longer longest! It's: " + longerLongest);
    }
}
