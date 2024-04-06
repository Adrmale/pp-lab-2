import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe ocen do wprowadzenia:");
        int liczbaOcen = scanner.nextInt();

        double[] oceny = new double[liczbaOcen];

        for (int i = 0; i < liczbaOcen; i++) {
            System.out.print("Podaj ocenę " + (i + 1) + ": ");
            oceny[i] = scanner.nextDouble();
        }

        System.out.println("Wprowadzone oceny:");
        double sumaOcen = 0;
        for (double ocena : oceny) {
            System.out.println(ocena);
            sumaOcen += ocena;
        }

        System.out.println("Suma ocen: " + sumaOcen);
        
        double sredniaOcen = sumaOcen / liczbaOcen;
        System.out.println("Średnia ocen: " + sredniaOcen);

        scanner.close();
    }
}
4