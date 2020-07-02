package lt.bit.java.PersonaloStatistika;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// TODO Užduotis:
// 1. Turime klasę Darbuotojas - implementuokime enkapsuliaciją
// 2. Sukurkite duobuotojų kolekciją (daugiau nei 10 narių)
// 3. Askaičiuokite amžiaus vidurkį visų darbuotojų
// 4. Atskirai apskaičiuokite atlyginimo vidurkį žmonių,
// ... kurie vyresni nei 50 (reiktų daugiau nei 5 žmonių, kurie vyresni nei 50)
public class Main {

    static Random random = new Random();
    static float amziausSuma = 0;
    static float atlygioSuma = 0;
    static float atlygioSuma50 = 0;

    public static void main(String[] args) {

        ArrayList<Darbuotojas> darbuotojai = new ArrayList<>();
        System.out.print("Iveskite darbuotoju kieki: ");
        Scanner scanner = new Scanner(System.in);
        int kiekis = scanner.nextInt();

        for (int i = 0; i < kiekis; i++) {
            darbuotojai.add(new Darbuotojas("Jonelis", (random.nextInt(82) + 18), (random.nextInt(1500))));
            System.out.println("Darbuotojo vardas - " + darbuotojai.get(i).getVardas() +
                    " amzius - " + darbuotojai.get(i).getAmžius() +
                    " atlygis - " + darbuotojai.get(i).getAtlygis());
        }

        for (int i = 0; i < darbuotojai.size(); i++) {
            amziausSuma += darbuotojai.get(i).getAmžius();
            atlygioSuma += darbuotojai.get(i).getAtlygis();
            if (darbuotojai.get(i).getAmžius() > 50) {
                atlygioSuma50 += darbuotojai.get(i).getAtlygis();
            }
        }
        System.out.println("");
        System.out.println("Siu darbuotoju amziaus vidurkis yra: "+ amziausSuma / darbuotojai.size()+"m");
        System.out.println("");
        System.out.println("Visu darbuotoju atlyginimo vidurkis yra: "+ atlygioSuma / darbuotojai.size()+"eur");
        System.out.println("");
        System.out.println("Kam virs 50 metu atlyginimo vidurkis yra: "+ atlygioSuma50 / darbuotojai.size()+"eur");
    }
}

