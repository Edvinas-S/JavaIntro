package lt.bit.java.PersonaloStatistikaSuRikiavimu;

class Darbuotojas implements Comparable <Darbuotojas>{
    private String vardas;
    private int amžius;
    private int atlygis;

    public Darbuotojas(){

    }

    public Darbuotojas(int atlygis) {
        this.atlygis = atlygis;
    }

    public Darbuotojas(String vardas, int amžius, int atlygis) {
        this.vardas = vardas;
        this.amžius = amžius;
        this.atlygis = atlygis;
    }

    public int getAtlygis() {
        return atlygis;
    }

    public String getVardas() {
        return vardas;
    }

    public int getAmžius() {
        return amžius;
    }

    @Override
    public String toString() {
        return ('{' + "Vardas=" + vardas +", "+
                "amžius=" + amžius +", "+
                "atlygis=" + atlygis +
                '}');
    }

    @Override
    public int compareTo(Darbuotojas o) {
        if (this.atlygis > o.atlygis) {
            return 1;
        } else if (this.atlygis < o.atlygis) {
            return -1;
        } else {
            return 0;
        }
    }
};


