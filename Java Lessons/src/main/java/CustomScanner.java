import java.util.Scanner;

public class CustomScanner {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Jak masz na imię: ");
//        String name = scanner.nextLine();
//        System.out.println("Cześć " + name + " !");
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Proszę, podaj pierwszą liczbę ");
        int firstNumber = scanner.nextInt();
        int result = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to: " + result);
    }
}
