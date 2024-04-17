import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj rozmiar kwadratu");
        int size = new Scanner(System.in).nextInt();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój znak: ");
        String name = scanner.next();

        for (int row = 1; row <= size; row++) {
            if (row == 1 || row == size) {
                for (int col = 1; col <= size; col++) {
                    System.out.print(name + " ");
                }
            } else {
                for (int col = 1; col <= size; col++) {
                    if (col == 1 || col == size) {
                        System.out.print(name + " ");
                    } else {
                        System.out.print("  "); 
                    }
                }
            }
            System.out.println();
        }
    }
}
