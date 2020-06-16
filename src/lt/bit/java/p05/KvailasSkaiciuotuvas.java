package lt.bit.java.p05;

import java.util.Objects;
import java.util.Scanner;

public class KvailasSkaiciuotuvas {

    public static void main(String[] args) {

        System.out.println("Kvailas skaiciuotuvas :)");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite pirma skaitmeni: ");
        int Pirmas = scanner.nextInt();

        System.out.print("Iveskite antra skaitmeni: ");
        int Antras = scanner.nextInt();

        System.out.print("Iveskite operacija (+ - * %): ");
        String Operacija = scanner.next();

        int Rezultatas = 0;

        if (Objects.equals(Operacija, "+")) {
            Rezultatas = Pirmas + Antras;
        } else if (Objects.equals(Operacija, "-")) {
            Rezultatas = Pirmas - Antras;
        } else if (Objects.equals(Operacija, "*")) {
            Rezultatas = Pirmas * Antras;
        } else if (Objects.equals(Operacija, "%")) {
            Rezultatas = Pirmas / Antras;
        } else
            System.out.println("Kazkas negerai :)");


        System.out.println(Pirmas +" "+ Operacija +" "+ Antras+" = "+ Rezultatas);

    }

}
