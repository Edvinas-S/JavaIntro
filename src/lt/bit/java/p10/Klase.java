package lt.bit.java.p10;

import java.util.Arrays;

public class Klase {

    static int mokiniuSkaicius = 5;
    static Mokinys[] mokiniai = new Mokinys[mokiniuSkaicius];


    public static void main(String[] args) {

        pradiniaiDuomenys();
        mokiniuSarasas("Pradiniai duomenys:");
        System.out.println(" ");
        surusiuojamPagalTrimestra();
        mokiniuSarasas("Surusiuota:");
        System.out.println(" ");

    }

    static void pradiniaiDuomenys() {
        // paprastai sukonstruojame nauja mokini
        Mokinys mokinys1 = new Mokinys();
        mokinys1.setVardas("Jonas");
        mokinys1.setPavarde("Jonaitis");
        mokinys1.setKlase(1);
        mokinys1.setTrimestras(new int[] {9, 10, 8, 6, 10});
        mokiniai[0] = mokinys1;

        Mokinys mokinys2 = new Mokinys();
        mokinys2.setVardas("Ona");
        mokinys2.setPavarde("Onaite");
        mokinys2.setKlase(2);
        mokinys2.setTrimestras(new int[] {10, 9, 10, 9, 10});
        mokiniai[1] = mokinys2;

        // naudojame konstruktoriu (aprasyta klaseje "Mokinys") konstruoti mokiniui
        mokiniai[2] = new Mokinys("Petras", "Jonaitis", 1, new int[]{4, 5, 7, 6, 7});

        mokiniai[3] = new Mokinys("Jurga", "Jurgaite", 1, new int[]{8, 9, 8, 10, 10});

        mokiniai[4] = new Mokinys ("Antanas", "Antanaitis", 2, new int[]{2, 4, 5, 2, 4});
    }

    static void mokiniuSarasas(String title) {
        System.out.println(title);
        for (int i = 0; i < mokiniai.length; i++) {
            System.out.println(mokiniai[i].getKlase() +" "+mokiniai[i].getPavarde() +" "+mokiniai[i].getVardas());
        }
    }

    static void keiciamMokinius(int a, int b) {
        Mokinys laikinas = mokiniai[a];
        mokiniai[a] = mokiniai[b];
        mokiniai[b] = laikinas;
    }

    static void surusiuojamPagalTrimestra() {
        for (int i = 0; i < mokiniai.length; i++) {
            for (int j = i+1; j < mokiniai.length; j++) {
                if (mokiniai[i].vidurkis() < mokiniai[j].vidurkis()) {
                    keiciamMokinius(i, j);
                }
            }
        }
    }

}
