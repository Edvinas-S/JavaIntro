package lt.bit.java.p09;

public class Klase {

    static int mokiniuSkaicius = 5;
    static Mokinys[] mokiniai = new Mokinys[mokiniuSkaicius];

    public static void main(String[] args) {

        pradiniaiDuomenys();
        mokiniuSarasas("Pradiniai duomenys:");
        surusiuota();
        System.out.println();
        mokiniuSarasas("Surusiuota:");

    }

    static void pradiniaiDuomenys() {

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

        Mokinys mokinys3 = new Mokinys();
        mokinys3.setVardas("Petras");
        mokinys3.setPavarde("Jonaitis");
        mokinys3.setKlase(1);
        mokiniai[2] = mokinys3;

        Mokinys mokinys4 = new Mokinys();
        mokinys4.setVardas("Jurga");
        mokinys4.setPavarde("Jurgaite");
        mokinys4.setKlase(1);
        mokiniai[3] = mokinys4;

        Mokinys mokinys5 = new Mokinys();
        mokinys5.setVardas("Antanas");
        mokinys5.setPavarde("Antanaitis");
        mokinys5.setKlase(2);
        mokiniai[4] = mokinys5;
    }

    static void mokiniuSarasas(String title) {
        System.out.println(title);
        for (int i = 0; i < mokiniai.length; i++) {
            System.out.println(mokiniai[i].getKlase()+" "+mokiniai[i].getPavarde()+" "+mokiniai[i].getVardas());
        }
    }

    static void surusiuota() {
        for (int i = 0; i < mokiniai.length; i++) {
            for (int j = i+1; j < mokiniai.length; j++) {
                if (mokiniai[i].getKlase() > mokiniai[j].getKlase()) {
                    Mokinys laikinas = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = laikinas;
                } else if (mokiniai[i].getKlase() == mokiniai[j].getKlase()) {
                    if (mokiniai[i].getPavarde().compareTo(mokiniai[j].getPavarde()) > 0) {
                        Mokinys laikinas = mokiniai[i];
                        mokiniai[i] = mokiniai[j];
                        mokiniai[j] = laikinas;
                    } else if (mokiniai[i].getPavarde().compareTo(mokiniai[j].getPavarde()) == 0) {
                        if (mokiniai[i].getVardas().compareTo(mokiniai[j].getVardas()) > 0) {
                            Mokinys laikinas = mokiniai[i];
                            mokiniai[i] = mokiniai[j];
                            mokiniai[j] = laikinas;
                        }
                    }
                }
            }
        }
    }
}
