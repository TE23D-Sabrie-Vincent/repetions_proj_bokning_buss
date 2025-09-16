import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int bokningar[] = new int[20];
        boolean loop = true;
        int val = 0;

        while (loop) {
            System.out.println("\nMeny:");
            System.out.println("1. Boka en plats");
            System.out.println("2. Hur många lediga platser finns det?");
            System.out.println("3. Hur mycket cash fick jag av dina biljetter :p");
            System.out.println("4. Avsluta programmet");
            System.out.println("Välj: ");
            System.out.println("Array: " + Arrays.toString(bokningar));

            if (val == 4) {
                System.out.println("Stänger av programmet.");
                loop = false;
            }

            try {
                val = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" Du måste skriva ett nummer");
                scanner.nextLine();
                continue;
            }

            if (val == 1) {
                System.out.println("Vilken plats vill du boka? (1-20)");
                int plats = scanner.nextInt() - 1; // -1 så att det går från 1-20 istället för 0-19
                if (plats < 0 || plats >= bokningar.length) {
                    System.out.println("Ogiltigt platsnummer!");
                }

                else if (bokningar[plats] != 0) {
                    System.out.println("Platsen är redan bokad!");
                }

                else {
                    System.out.print("Ange födelsedatum: ");
                    int datum = scanner.nextInt();
                    bokningar[plats] = datum;
                    System.out.println("Plats " + plats + " bokad!");
                }
            }

            else if (val == 2) {
                int lediga = 0;
                for (int i = 0; i < bokningar.length; i++) {
                    if (bokningar[i] == 0) {
                        lediga++;
                    }
                }
                System.out.println("Antal lediga platser: " + lediga);
            }

            else if (val == 3) {
                int sålda = 0;
                for (int i = 0; i < bokningar.length; i++) {
                    if (bokningar[i] != 0) {
                        sålda++;

                    }

                }
                double vinst = sålda * 299.90;
                System.out.println("Sålda biljetter: " + sålda);
                System.out.println("All min cash >:D : " + vinst + " kr");
                if (vinst == 0) {
                    System.out.println("Amen wtf, ge mig pengar!!!!");
                }
            }
            else if (val == 4) {
                
                
            }
        }
        scanner.close();
    }
}
