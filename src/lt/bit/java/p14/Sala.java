package lt.bit.java.p14;

import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Sala {

    static Random random = new Random();
    static int zmogeliukuSkaicius = 5;
    static Zmogeliukas[] zmogeliukai = new Zmogeliukas[zmogeliukuSkaicius];

    public  static void main(String[] args) {

        sukuriameZmogeliukus();

        //TODO
//        mirtiesLoterija();
//        System.out.println("Siais metais mire: "+ mire);
//        givybesLoterija();
//        System.out.println("Siais metais gime: "+ gime);

        System.out.println("Zmogeliuku saloje: "+ zmogeliukai.length);
    }

    public static void sukuriameZmogeliukus() {
        for (int i = 0; i < zmogeliukai.length; i++) {
            zmogeliukai[i] = sugeneruotasZmogeliukas();
            System.out.println("Zmogeliuko amzius yra: "+ zmogeliukai[i].getAge());
        }
    }
// sugenerujame zmogeliuko amziu nuo 0 iki 99 metu
    public static Zmogeliukas sugeneruotasZmogeliukas() {
        Zmogeliukas zmogeliukas = new Zmogeliukas();
        zmogeliukas.setAge(random.nextInt(100));
        return zmogeliukas;
    }
/* da fuck niekas neveikia ...
    public static Zmogeliukas[] mirtiesLoterija() {
        for (int i = 0; i < zmogeliukai.length; i++) {
            if (zmogeliukai == null || i < 0 || i > zmogeliukai.length) {
                System.out.println("Nieko numarinti nebegalime!!");
                return zmogeliukai;
            } else
            if ((zmogeliukai[i].getAge() <= 10) && (random.nextInt(20) == 0)) {
                zmogeliukai[i] = mazinameArray(i);
            } else
            if ((zmogeliukai[i].getAge() > 10) && (zmogeliukai[i].getAge() <= 20) && (random.nextInt(50) == 0)) {
                zmogeliukai[i] = mazinameArray(i);
            } else
            if ((zmogeliukai[i].getAge() > 20) && (zmogeliukai[i].getAge() <= 50) && (random.nextInt(20) == 0)) {
                zmogeliukai[i] = mazinameArray(i);
            } else
            if ((zmogeliukai[i].getAge() > 50) && (random.nextInt(10) == 0)) {
                zmogeliukai[i] = mazinameArray(i);
        }
    }

    public static int[] mazinameArray(int index) {
            return IntStream.range(0, zmogeliukai.length).filter(i -> i != index)
                    .map(i -> zmogeliukai[i]).toArray();
    }
*/
}
