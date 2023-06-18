public class Berechnung {
    public static void main(String[] args) {
        Werte werte = new Werte(9, 10);
        int ergebnis = werte.zahl1 + werte.zahl2;

        System.out.println("Die Summe von " + werte.zahl1 + " und " + werte.zahl2 + " ist: " + ergebnis);
    }
}