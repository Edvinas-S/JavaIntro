package lt.bit.java.p08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DidziausiasMaziausias {

    public static void main(String[] args) {
        int[] masyvas = new int[] {};

        System.out.println("Sukursime nauja masyva is 5 objektu");
        System.out.println("Iveskite sveika skaiciu (1-aji nari): ");
        Scanner scanner = new Scanner(System.in);
        int pirmas = scanner.nextInt();
        masyvas = push(masyvas, pirmas);
        System.out.println("Iveskite sveika skaiciu (2-aji nari): ");
        Scanner scanner1 = new Scanner(System.in);
        int antras = scanner1.nextInt();
        masyvas = push(masyvas, antras);
        System.out.println("Iveskite sveika skaiciu (3-aji nari): ");
        Scanner scanner2 = new Scanner(System.in);
        int trecias = scanner2.nextInt();
        masyvas = push(masyvas, trecias);
        System.out.println("Iveskite sveika skaiciu (4-aji nari): ");
        Scanner scanner3 = new Scanner(System.in);
        int ketvirtas = scanner3.nextInt();
        masyvas = push(masyvas, ketvirtas);
        System.out.println("Iveskite sveika skaiciu (5-aji nari): ");
        Scanner scanner4 = new Scanner(System.in);
        int penktas = scanner4.nextInt();
        masyvas = push(masyvas, penktas);

        int maziausias = masyvas[0];
        int didziausias = masyvas[0];
        int minPoz = 0;
        int maxPoz = 0;

        System.out.println("Masyvas = "+ Arrays.toString(masyvas));

        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < maziausias) {
                maziausias = masyvas[i];
                minPoz = i;
            } else if (masyvas[i] > didziausias) {
                didziausias = masyvas[i];
                maxPoz = i;
            }
        }
        System.out.println("Maziausias: "+maziausias+" jo pozicija sarase: "+minPoz);
        System.out.println("Didziausias: "+didziausias+" jo pozicija sarase: "+maxPoz);

        int laikinas = masyvas[minPoz];
        masyvas[minPoz] = masyvas[maxPoz];
        masyvas[maxPoz] = laikinas;

        System.out.println("Sukeitus MAX ir MIN reiksmes gauname nauja masyva: "+Arrays.toString(masyvas));
    }
    static int[] push(int[] m, int naujaReiskme) {
        System.out.println("Sukuriame nauja masyva kurio ilgis " + (m.length + 1));
        int[] naujasMasyvas = new int[m.length + 1];
        for (int i = 0; i < m.length; i++) {
            naujasMasyvas[i] = m[i];
        }
        naujasMasyvas[naujasMasyvas.length - 1] = naujaReiskme;
        return naujasMasyvas;
    }
}