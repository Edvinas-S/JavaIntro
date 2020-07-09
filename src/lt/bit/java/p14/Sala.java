package lt.bit.java.p14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sala {

    static int zmogeliukuSkaicius = 10;
    static Zmogeliukas[] zmogeliukai = new Zmogeliukas[zmogeliukuSkaicius];
    static Random random = new Random();
    static int metai = 0;
    static int mire = 0;
    static int gime = 0;
    static int pasikeiteMire = mire;
    static int pasikeiteGime = gime;

    public static void main(String[] args) {

        sugeneruojameZmogeliukus();

        List<Zmogeliukas> Mirtininkas = new ArrayList<Zmogeliukas>();
        List<Zmogeliukas> Naujagimiai = new ArrayList<Zmogeliukas>();

        // is statinio zmogeliukai masyvo pasidarome dinamini sarasa
        ArrayList<Zmogeliukas> sarasasZmogeliuku = new ArrayList<Zmogeliukas>(Arrays.asList(zmogeliukai));
        System.out.println(" ");
        int pakitesSarasas = sarasasZmogeliuku.size();

        //TODO
        //kazkaip padaryti didejancia mirties tikimybe po 50metu;
        //kai pagimdo reikia ta zmogeliuka "suspenduoti" porai metu nuo gimdymo :)

        while (sarasasZmogeliuku.size() > 0) {
            metai++;

            // MIRTIES / GIVYBES LOTERIJA
            for (int i = 0; i < sarasasZmogeliuku.size(); i++) {
                Zmogeliukas einamasisZmogeliukas = sarasasZmogeliuku.get(i);

                if (sarasasZmogeliuku == null || i < 0 || i > sarasasZmogeliuku.size()) {
                    System.out.println("Nieko numarinti nebegalime!!");
                } else if ((einamasisZmogeliukas.getAge() <= 10) && (random.nextInt(20) == 0)) {
                    Mirtininkas.add(einamasisZmogeliukas);
                    mire++;
                } else if ((einamasisZmogeliukas.getAge() > 10) && (einamasisZmogeliukas.getAge() <= 20) && (random.nextInt(50) == 0)) {
                    Mirtininkas.add(einamasisZmogeliukas);
                    mire++;
                } else if ((einamasisZmogeliukas.getAge() > 20) && (einamasisZmogeliukas.getAge() <= 50) && (random.nextInt(20) == 0)) {
                    Mirtininkas.add(einamasisZmogeliukas);
                    mire++;
                } else if ((einamasisZmogeliukas.getAge() > 50) && (random.nextInt(10) == 0)) {
                    Mirtininkas.add(einamasisZmogeliukas);
                    mire++;
                } else if (einamasisZmogeliukas.getAge() >= 15 && einamasisZmogeliukas.getAge() <= 30 && (random.nextInt(10) == 0)) {
                    Naujagimiai.add(einamasisZmogeliukas);
                    gime++;
                } else if (einamasisZmogeliukas.getAge() >= 31 && einamasisZmogeliukas.getAge() <= 50 && (random.nextInt(20) == 0)) {
                    Naujagimiai.add(einamasisZmogeliukas);
                    gime++;
                }

            }

            sarasasZmogeliuku.removeAll(Mirtininkas);
            sarasasZmogeliuku.addAll(Naujagimiai);
            Mirtininkas.clear();
            Naujagimiai.clear();

            // jei MIRE spausdiname
            if (mire != pasikeiteMire) {
                System.out.println("Siais " + metai + " metais mire: " + mire +"-sis");
                pasikeiteMire = mire;
            }

            // jei GIME spausdiname
            if (gime != pasikeiteGime) {
                System.out.println("Siais " + metai + " metais gime: " + gime +"-as");
                pasikeiteGime = gime;
            }

            // spausdiname kiek saloje gyvena zmogeliuku
            if(sarasasZmogeliuku.size() != pakitesSarasas) {
                System.out.println("Siuo metu saloje gyvena: " + sarasasZmogeliuku.size());
                pakitesSarasas = sarasasZmogeliuku.size();
            }

            // pasendinam visus zmogeliukus vieneriais metais
            for (int i = 0; i < sarasasZmogeliuku.size(); i++) {
                sarasasZmogeliuku.get(i).setAge(sarasasZmogeliuku.get(i).getAge() + 1);
            }
        }
    }

    // sugeneruojame fiksuota zmogeliuku sarasa
    static void sugeneruojameZmogeliukus () {
        for (int i = 0; i < zmogeliukuSkaicius; i++) {
            zmogeliukai[i] = sugeneruotasZmogeliukas();
            System.out.println(i + 1 + "- Zmogeliuko amzius yra: " + zmogeliukai[i].getAge());
        }
    }

    // sugenerujame zmogeliuko amziu nuo 0 iki 99 metu
    static Zmogeliukas sugeneruotasZmogeliukas () {
        Zmogeliukas zmogeliukas = new Zmogeliukas();
        zmogeliukas.setAge(random.nextInt(100));
        return zmogeliukas;
    }

}
