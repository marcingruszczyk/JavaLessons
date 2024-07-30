public class TypyObiektowe {


    public static void main(String[] args) {
        // Liczby stałoprzecinkowe
        Byte firstNumber = 127; // 1 bajt to -128 do 127
        Short secondNumber = 32689; // 2 bajty -32768 do 32767
        Integer thirdNumber = 32768999; // 4 bajty - 2 147 783 648 do 2 147 783 647
        Long fourthNumber = 2148000L; // 8 bajtów -2^63 do (2^63)-1

        // Liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99934F; // 4 bajty - max ok 6-7 liczb po przecinku
        Double sixtNumber = 3.99999999999999D; // 8 bajtów - max ok 15 cyfr po przecinku

        // Wartości logiczne
        Boolean prawda = true;
        Boolean falsz = false;

        // Pojedyńczy znak
        Character letter = 'A';

        String hello = "Hello there";

        System.out.println( hello.charAt(0));

    }
}
