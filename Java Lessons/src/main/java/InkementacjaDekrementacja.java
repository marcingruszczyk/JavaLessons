public class InkementacjaDekrementacja {
    public static void main(String[] args) {
        // Inkrementacja
        int a = 0;
        System.out.println("Wartość: A:" + a);
        int b = a++;
        System.out.println("Wartość: B:" + b);
        System.out.println("Wartość: A:" + a);
        int c = ++a;
        System.out.println("Wartość: C:" + c);
        System.out.println("Wartość: A:" + a);
        // Dekrementacja
        int d = 0;
        System.out.println("Wartość: D:" + d);
        int e = d--;
        System.out.println("Wartość: E:" + e);
        System.out.println("Wartość: D:" + d);
        int f = --d;
        System.out.println("Wartość: F:" + f);
        System.out.println("Wartość: D:" + d);
    }
}
