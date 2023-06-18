import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den ersten Wert ein: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Geben Sie den zweiten Wert ein: ");
        int zahl2 = scanner.nextInt();

        int ergebnis = zahl1 + zahl2;

        System.out.println("Die Summe von " + zahl1 + " und " + zahl2 + " ist: " + ergebnis);

        scanner.close();
    }
}