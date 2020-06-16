package lt.bit.java.p07;

import java.util.Scanner;

public class TobuliSkaiciai {

    public static void main(String[] args) {
        System.out.println("Prasome zemiau ivesti skaiciu nuo 1 iki 1.000.000");
        Scanner scanner = new Scanner(System.in);
        int skaicius = scanner.nextInt();
        int tobuliSkaiciai = 0;
        int dalikliuSuma = 0;

        for (int i = 1; i <= skaicius; i++) {
            dalikliuSuma = 0;
            for (int k = 1; k <= (i / 2); k++) {
                if (i % k == 0) {
                    dalikliuSuma += k;
                }
            }
            if (dalikliuSuma == i) {
                System.out.println("Tobulasis: " + i);
                tobuliSkaiciai++;
            }
        }
        System.out.print("Jus ivedete skaiciu: " + skaicius + " jame tobulu skaiciu yra: ");
        System.out.println(tobuliSkaiciai);
    }
}