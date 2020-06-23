package lt.bit.java.p09;

public class Mokinys {

    private String vardas;
    private String pavarde;
    private int klase;

    public Mokinys() {

    }

    public Mokinys(String vardas, String pavarde, int klase) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
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
}
