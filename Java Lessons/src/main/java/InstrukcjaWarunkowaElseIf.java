public class InstrukcjaWarunkowaElseIf {
    public static void main(String[] args) {
        int number = -11;

        if (number > 0) {
            System.out.println("Liczba większa od zera");
        } else if (number < -10) {
            System.out.println("Liczba mniejsza od -10");
        } else if (number == 0) {
            System.out.println("Liczba równa 0");
        } else {
            System.out.println("Liczba mieści się w przedziale 0 do -10");
        }
    }
}
