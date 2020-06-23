package lt.bit.java.p09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Klase {

    static int mokiniuSkaicius = 5000;
    static Mokinys[] mokiniai = new Mokinys[mokiniuSkaicius];
    static Random random = new Random();
    static int prasisukoSuIfElse;
    static int prasisukoSuSort;

    public static void main(String[] args) {

//        pradiniaiDuomenys();
        sugeneruotiMokinius();
        // susikuriame kopija sugeneruoto masyvo
        Mokinys[] kopija = new Mokinys[mokiniai.length];
            for (int i = 0; i < mokiniai.length; i++) {
                kopija[i] = mokiniai[i];
            }
//        mokiniuSarasas("Pradiniai duomenys:");
//        System.out.println(" ");
        surusiuotaSuIfElse();
//        mokiniuSarasas("Surusiuota:");
//        System.out.println(" ");
        // atstatome masyva i pradine reiksme - atrusiuotas vel
        for (int i = 0; i < mokiniai.length; i++) {
            mokiniai[i] = kopija[i];
        }
        surusiuotaSuSort();
//        mokiniuSarasas("Surusiuota:");
        System.out.println("Tiek kartu rusiavo su If else salygom: " + prasisukoSuIfElse);
        System.out.println("Tiek kartu rusiavo su Sort metodu: " + prasisukoSuSort);
    }

    static void pradiniaiDuomenys() {
        // paprastai sukonstruojame nauja mokini
        Mokinys mokinys1 = new Mokinys();
        mokinys1.setVardas("Jonas");
        mokinys1.setPavarde("Jonaitis");
        mokinys1.setKlase(1);
        mokiniai[0] = mokinys1;

        Mokinys mokinys2 = new Mokinys();
        mokinys2.setVardas("Ona");
        mokinys2.setPavarde("Onaite");
        mokinys2.setKlase(2);
        mokiniai[1] = mokinys2;

        // naudojame konstruktoriu (aprasyta klaseje "Mokinys") konstruoti mokiniui
        mokiniai[2] = new Mokinys("Petras", "Jonaitis", 1);

        mokiniai[3] = new Mokinys("Jurga", "Jurgaite", 1);

        mokiniai[4] = new Mokinys ("Antanas", "Antanaitis", 2);
    }

    static void sugeneruotiMokinius() {
        for (int i = 0; i < mokiniai.length; i++) {
            mokiniai[i] = sugeneruotasMokinys();
        }
    }

    static Mokinys sugeneruotasMokinys() {
        Mokinys mokinys = new Mokinys();
        mokinys.setKlase(random.nextInt(12) + 1);
        mokinys.setPavarde(generuotiTeksta());
        mokinys.setVardas(generuotiTeksta());
        return mokinys;
    }

    static String generuotiTeksta() {
        int ilgis = 5;
        char pirmaRaide = (char) ('A' + random.nextInt(26));
        String tekstas = pirmaRaide + "";
        for (int i = 0; i < ilgis; i++) {
            tekstas += (char) ('a' + random.nextInt(26));
        }
        return tekstas;
    }

    static void mokiniuSarasas(String title) {
        System.out.println(title);
        for (int i = 0; i < mokiniai.length; i++) {
            System.out.println(mokiniai[i]);
        }
    }

    static void keiciamMokinius(int a, int b) {
        Mokinys laikinas = mokiniai[a];
        mokiniai[a] = mokiniai[b];
        mokiniai[b] = laikinas;
    }

    static void surusiuotaSuIfElse() {
        for (int i = 0; i < mokiniai.length; i++) {
            for (int j = i+1; j < mokiniai.length; j++) {

                prasisukoSuIfElse++;

                if (mokiniai[i].getKlase() > mokiniai[j].getKlase()) {
                    keiciamMokinius( i, j);
                } else if (mokiniai[i].getKlase() == mokiniai[j].getKlase()) {
                    if (mokiniai[i].getPavarde().compareTo(mokiniai[j].getPavarde()) > 0) {
                        keiciamMokinius( i, j);
                    } else if (mokiniai[i].getPavarde().compareTo(mokiniai[j].getPavarde()) == 0) {
                        if (mokiniai[i].getVardas().compareTo(mokiniai[j].getVardas()) > 0) {
                            keiciamMokinius( i, j);
                        }
                    }
                }
            }
        }
    }


    static void surusiuotaSuSort() {
        Arrays.sort(mokiniai, (m1, m2) -> {

            prasisukoSuSort++;

            int pagalKlase = Integer.compare(m1.getKlase(), m2.getKlase());
            if (pagalKlase != 0) return pagalKlase;

            int pagalPavarde = m1.getPavarde().compareTo(m2.getPavarde());
            if (pagalPavarde != 0) return pagalPavarde;

            return m1.getVardas().compareTo(m2.getVardas());
        });
    }

}
