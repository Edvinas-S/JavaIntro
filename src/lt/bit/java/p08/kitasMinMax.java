package lt.bit.java.p08;

public class kitasMinMax {

    public static void main(String[] args) {
        int[] m = {-1, 2, 0, 2, -1, 1};

        atspausdintiMasyva(m);

        // skaiciuojame
        sprendimas(m); // masyvas = m

        atspausdintiMasyva(m);


    }

    static void atspausdintiMasyva(int[] a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    /**
     * Surandame pirma masyvo didziausia ir paskutine maziausia reiksmes
     * ir sukeiciame jas vietomis.
     * T.y. jei turime masyva {-1,  2, 0, 2, -1, 1}
     * tai gauname            {-1, -1, 0, 2,  2, 1}
     * @param masyvas - pradiniu duomenu masyvas
     */
    static void sprendimas(int[] masyvas) {
        // masyvas[0] <=> masyvas[1];
        // sukeistiElementus(masyvas, 0, 1);

        int pirmaDidziausia = rastiPirmosDidziausiosIndeksa(masyvas);
        int paskutineMaziausia = rastiPaskutinesMaziausiosIndeksa(masyvas);

        sukeistiElementus(masyvas, pirmaDidziausia, paskutineMaziausia);
    }

    /**
     * Randame pirmos didziausios masyvo reiksmes indeksa.
     * T.y. jei masyvas yra {-1, 2, 0, 2} tai grazinti turime 1.
     * @param masyvas skaiciu masyvas
     * @return pirmos didziausios masyvo reiksmes indeksa
     */
    static int rastiPirmosDidziausiosIndeksa(int[] masyvas) {
        int rastasIndeksas = 0;
        int rastaReiksme = masyvas[0];

        for (int i = 1; i < masyvas.length; i++) {
            if (masyvas[i] > rastaReiksme) {
                rastasIndeksas = i;
                rastaReiksme = masyvas[i];
            }
        }

        return rastasIndeksas;
    }


    /**
     * Randame paskutines maziausios reiksmes indeksa
     * T.y. jei masyvas yra {-1, 2, 0, -1, 2} tai grazinti turime 3.
     * @param masyvas skaiciu masyvas
     * @return paskutines maziausios reiksmes indeksas
     */
    static int rastiPaskutinesMaziausiosIndeksa(int[] masyvas) {
        int rastasIndeksas = 0;
        int rastaReiksme = masyvas[0];

        for (int j = 1; j < masyvas.length; j++) {
            if (masyvas[j] <= rastaReiksme) {
                rastasIndeksas = j;
                rastaReiksme = masyvas[j];
            }
        }
        return rastasIndeksas;
    }

    static void sukeistiElementus(int[] masyvas, int i, int j) {
        int x = masyvas[i];
        masyvas[i] = masyvas[j];
        masyvas[j] = x;
    }

}
