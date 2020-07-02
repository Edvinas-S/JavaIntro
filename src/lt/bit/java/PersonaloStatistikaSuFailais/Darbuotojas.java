package lt.bit.java.PersonaloStatistikaSuFailais;

class Darbuotojas {
    private String vardas;
    private int amžius;
    private int atlygis;

    public Darbuotojas(){

    }

    public Darbuotojas(String vardas, int amžius, int atlygis) {
        this.vardas = vardas;
        this.amžius = amžius;
        this.atlygis = atlygis;
    }


    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public int getAmžius() {
        return amžius;
    }

    public void setAmžius(int amžius) {
        this.amžius = amžius;
    }

    public int getAtlygis() {
        return atlygis;
    }

    public void setAtlygis(int atlygis) {
        this.atlygis = atlygis;
    }

    @Override
    public String toString() {
        return ('{' + "Vardas=" + vardas +", "+
                "amžius=" + amžius +", "+
                "atlygis=" + atlygis +
                '}');
    }
};


