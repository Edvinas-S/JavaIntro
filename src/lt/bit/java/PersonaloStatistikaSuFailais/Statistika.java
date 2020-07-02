package lt.bit.java.PersonaloStatistikaSuFailais;

import java.io.*;
import java.util.ArrayList;

// Užduotis:
// 1. Pasiimkime viską ką padarėme užduotyje PersonaloStatistika (arba susikurti nauja 2.)
// 2. susikurkime didelį failą (tarkim ~20 įrašų).
// 3. Pritaikykime tai ką parašėme PersonaloStatistika užduotyje skaitymui iš failo
// ... t.y dabar informaciją gauname iš šailo, ne įhardcodintą.
// 4. Aspakaičiuokime tuos pačius dalykus kaip ir prieš tai buvusioje užduotyje
public class Statistika {

    static float amziausSuma = 0;
    static float atlygioSuma = 0;
    static float atlygioSuma50 = 0;

    public static void main(String[] args) {

        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        File relativeFile = new File("src\\lt\\bit\\java\\PersonaloStatistikaSuFailais\\failas.csv");

        ArrayList<Darbuotojas> people = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(relativeFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) {
                String[] splitString = fileLine.split(",");
                people.add(new Darbuotojas(
                        splitString[0],
                        Integer.parseInt(splitString[1]),
                        Integer.parseInt(splitString[2])));
                fileLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e){
            System.out.println("File was not found, check if it's there!");
        } catch (IOException e){
            System.out.println("Some general IO error!");
        }

        for (int i = 0; i < people.size(); i++) {
            Darbuotojas zmogus = people.get(i);
            System.out.println("Vardas: "+zmogus.getVardas()+", "+
                                "amžius: "+zmogus.getAmžius()+"m, "+
                                "atlyginimas: "+zmogus.getAtlygis()+"eur");
        }

        for (int i = 0; i < people.size(); i++) {
            amziausSuma += people.get(i).getAmžius();
            atlygioSuma += people.get(i).getAtlygis();
            if (people.get(i).getAmžius() > 50) {
                atlygioSuma50 += people.get(i).getAtlygis();
            }
        }
        System.out.println("");
        System.out.println("Siu darbuotoju amziaus vidurkis yra: "+ amziausSuma / people.size()+"m");
        System.out.println("");
        System.out.println("Visu darbuotoju atlyginimo vidurkis yra: "+ atlygioSuma / people.size()+"eur");
        System.out.println("");
        System.out.println("Kam virs 50 metu atlyginimo vidurkis yra: "+ atlygioSuma50 / people.size());
    }

}
