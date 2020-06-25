package lt.bit.java.p10;

public class Mokinys {

    private String vardas;
    private String pavarde;
    private int klase;
    private int[] trimestras;

    public Mokinys() {

    }

    public Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.trimestras = trimestras;
    }

    public int[] getTrimestras() {
        return trimestras;
    }

    public void setTrimestras(int[] trimestras) {
        this.trimestras = trimestras;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

    public  String toString() {
        return this.klase + " " + this.pavarde + " " + this.vardas;
    }

    public double vidurkis() {
        double vid = 0.0;
        int suma = 0;
        for (int i = 0; i < trimestras.length; i++) {
            suma += trimestras[i];
            vid = suma / trimestras.length+1;
        }
        return vid;
    }
}
