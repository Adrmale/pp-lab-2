import java.util.Arrays;
import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe ocen do wprowadzenia:");
        int liczbaOcen = scanner.nextInt();

        double[] oceny = new double[liczbaOcen];

        for (int i = 0; i < liczbaOcen; i++) {
            double ocena;
            do {
                System.out.print("Podaj ocenę " + (i + 1) + ": ");
                ocena = scanner.nextDouble();
                if (ocena <= 0 || ocena > 6) {
                    System.out.println("Błędna ocena! Podaj dodatnią ocenę mniejszą od 6.");
                }
            } while (ocena <= 0 || ocena > 6);

            oceny[i] = ocena;
        }

        System.out.println("Wprowadzone oceny:");
        for (double ocena : oceny) {
            System.out.println(ocena);
        }

        double sumaOcen = 0;
        for (double ocena : oceny) {
            sumaOcen += ocena;
        }

        System.out.println("Suma ocen: " + sumaOcen);
        
        double sredniaOcen = sumaOcen / liczbaOcen;
        System.out.println("Średnia ocen: " + sredniaOcen);

        Arrays.sort(oceny);
        double mediana = obliczMediane(oceny);
        System.out.println("Mediana ocen: " + mediana);

        scanner.close();
    }

    public static double obliczMediane(double[] tablica) {
        int dlugosc = tablica.length;
        if (dlugosc % 2 == 0) {
            return (tablica[dlugosc / 2 - 1] + tablica[dlugosc / 2]) / 2.0;
        } else {
            return tablica[dlugosc / 2];
        }
    }
}
