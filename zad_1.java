
import java.util.Scanner;
public class zad_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj oceny z Polskiego, Matematyki i Angielskiego:");

        System.out.print("Polski: ");
        double ocena_polski = scanner.nextDouble();

        System.out.print("Matematyka: ");
        double ocena_matematyka = scanner.nextDouble();

        System.out.print("Angielski: ");
        double ocena_angielski = scanner.nextDouble();

        double srednia_ocen = (ocena_polski + ocena_matematyka + ocena_angielski) / 3;

        System.out.print("Średnia ocen: " + srednia_ocen);

        scanner.close();
    }

}