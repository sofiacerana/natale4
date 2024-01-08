import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Inizializzo l'array con 10 numeri tra graffe
        int[] a = {1, 4, -3, 21, 7, -1, 0, 11, 8, 5};

        // Stampa l'array
        System.out.println("Array iniziale:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Raddoppio della grandezza
        int[] a1 = arrayDoppio(a);

        // Chiedo di inserire i nuovi numeri
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i nuovi numeri:");

        for (int i = a.length; i < a1.length; i++) {
            System.out.print("Inserisci il numero alla posizione " + (i + 1) + ": ");
            a1[i] = scanner.nextInt();
        }

        // Stampa il nuovo array
        System.out.println("Array doppio:");
        for (int num : a1) {
            System.out.print(num + " ");
        }
    }

    // Raddoppiare la grandezza dell'array
    public static int[] arrayDoppio(int[] a) {
        int dimensione2 = a.length * 2;
        int[] a1 = new int[dimensione2];

        System.arraycopy(a, 0, a1, 0, a.length);

        return a1;
    }
}
