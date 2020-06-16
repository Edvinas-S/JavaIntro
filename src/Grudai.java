public class Grudai {
    public static void main(String[] args) {

        long grudaiLangelyje = 1;
        long visoGrudu = 1;

        for (int i = 1; i < 63; i++) {
            grudaiLangelyje = grudaiLangelyje * 2;
            visoGrudu += grudaiLangelyje;
        }
        long paskutinis = grudaiLangelyje * 2;
        System.out.println(visoGrudu+"-"+paskutinis+" = ? (o dabar issitraukiam popieriu ir sena gera sudetis stulpeliu :D)");

        // atsakymas liktais 18,446,744,073,709,551,615 turetu buti.
    }
}
