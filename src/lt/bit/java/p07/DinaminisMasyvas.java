package lt.bit.java.p07;

public class DinaminisMasyvas {

    public static void main(String[] args) {

        long[] masyvas = new long[] { 123 };

        for (int i = 0; i < 10; i++) {
            masyvas = push(masyvas, Math.round(Math.random() * 1000));
        }

        System.out.println("Rezultato masyvo ilgis: " + masyvas.length);
        for (long elem : masyvas) {
            System.out.println(elem);
        }

    }

    static long[] push(long[] m, long naujaReiskme) {
        System.out.println("Sukuriame nauja masyva kurio ilgis " + (m.length + 1));
        long[] naujasMasyvas = new long[m.length + 1];

        // kopijuojame seno masyvo reiksmes i nauja masyva
        for (int i = 0; i < m.length; i++) {
            naujasMasyvas[i] = m[i];
        }

        // irasome paskutini naujo masyvo lementa
        naujasMasyvas[naujasMasyvas.length - 1] = naujaReiskme;

        // graziname nauja masyva
        return naujasMasyvas;
    }
}
