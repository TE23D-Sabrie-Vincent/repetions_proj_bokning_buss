import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[20];

        boolean loop = true;

        int val = 0;

        while (loop){

            System.out.println("Array: " + Arrays.toString(array));

            try {
                val = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" du måste skriva nummer");
                scanner.nextLine(); 
                continue;
            }
        }



    }
}
