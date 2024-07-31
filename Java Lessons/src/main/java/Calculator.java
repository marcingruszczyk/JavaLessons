import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Proszę, podaj pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        System.out.print("Proszę, podaj drugą liczbę ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int mod = secondNumber % firstNumber;

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Dzielenie: " + division);
        System.out.println("Modulo: " + mod);

        firstNumber += secondNumber;
        System.out.println("Po dodaniu: " + firstNumber);
        firstNumber -= secondNumber;
        System.out.println("Po odejmowaniu: " + firstNumber);
        firstNumber *= secondNumber;
        System.out.println("Po mnożeniu: " + firstNumber);
        firstNumber /= secondNumber;
        System.out.println("Po dzieleniu: " + firstNumber);
        firstNumber %= secondNumber;
        System.out.println("Po modulo: " + firstNumber);
    }
}
