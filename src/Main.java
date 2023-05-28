import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę Wojownika: ");
        String nazwaWojownika = scanner.nextLine();

        System.out.println("Podaj poziom Wojownika: ");
        int poziomWojownika = scanner.nextInt();

        System.out.println("Podaj zdrowie Wojownika: ");
        double zdrowieWojownika = scanner.nextDouble();
        scanner.nextLine();

        Wojownik wojownik = new Wojownik(nazwaWojownika, poziomWojownika, zdrowieWojownika);

        System.out.println("Podaj nazwę Maga: ");
        String nazwaMaga = scanner.nextLine();

        System.out.println("Podaj poziom Maga: ");
        int poziomMaga = scanner.nextInt();

        System.out.println("Podaj zdrowie Maga: ");
        double zdrowieMaga = scanner.nextDouble();

        Mag mag = new Mag(nazwaMaga, poziomMaga, zdrowieMaga);

        System.out.println("Walka trwa...");

        while (wojownik.getZdrowie() > 0 && mag.getZdrowie() > 0) {
            wojownik.setZdrowie(wojownik.getZdrowie() - mag.atak());
            mag.setZdrowie(mag.getZdrowie() - wojownik.atak());
        }

        if (wojownik.getZdrowie() > 0) {
            System.out.println("Wojownik " + wojownik.getNazwa() + " wygrywa walkę!");
        } else {
            System.out.println("Mag " + mag.getNazwa() + " wygrywa walkę!");
        }
    }
}