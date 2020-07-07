package lt.bit.java.PersonaloStatistikaSuRikiavimu;

// Personalo statisikos uždaviniu remdamiesi susikurkime ArrayList<Darbuotojas> (nuskaitome iš failo)
// Išrikiuokime tą listą pagal darbuotojo atlygį
// Ir išrikiuotus duomenis įrašykime į failą

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class suRikiavimu {

    public static void main(String[] args) {

        File manoFailas = new File("src\\lt\\bit\\java\\PersonaloStatistikaSuFailais\\failas.csv");

        ArrayList<Darbuotojas> darbuotojai = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(manoFailas);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String fileLine = bufferedReader.readLine();
            while (fileLine != null) {
                String[] splitString = fileLine.split(",");
                darbuotojai.add(new Darbuotojas(
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

        System.out.println("PRES: "+ darbuotojai);

        Collections.sort(darbuotojai);

        System.out.println("PO rusiavimo: "+ darbuotojai);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("src\\lt\\bit\\java\\PersonaloStatistikaSuRikiavimu\\failas_2.csv"), true));
            for (int i = 0; i < darbuotojai.size(); i++) {
                bufferedWriter.write(darbuotojai.get(i).getVardas()+", "+darbuotojai.get(i).getAmžius()+", "+darbuotojai.get(i).getAtlygis()+"\n");
            }
            bufferedWriter.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
