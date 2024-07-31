import java.util.Scanner;

public class OperatoryPorownawcze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Proszę, podaj pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        System.out.printf("Proszę, podaj drugą liczbę ");
        int secondNumber = scanner.nextInt();

        boolean result = firstNumber > secondNumber;

        System.out.println(result);
        System.out.println("a == b: " + (firstNumber == secondNumber));
        System.out.println("a != b: " + (firstNumber != secondNumber));
        System.out.println("a > b: " + (firstNumber > secondNumber));
        System.out.println("a < b: " + (firstNumber < secondNumber));
        System.out.println("a >= b: " + (firstNumber >= secondNumber));
        System.out.println("a <= b: " + (firstNumber <= secondNumber));
    }
}
