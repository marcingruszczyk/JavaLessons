public class MathOperators {
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = thirdNumber / secondNumber;
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
