package lt.bit.java.p09;

public class EnumIntro {

    public static void main(String[] args) {
    System.out.println("Enum intro");
    System.out.println("");

        Color spalva = Color.GREEN;
            System.out.println("spalva = "+ spalva);
            System.out.println("spalva.name = "+spalva.name());
            System.out.println("spalva.ordinal = "+spalva.ordinal());

        spalva = Color.RED;
            System.out.println("spalva = "+ spalva);
            System.out.println("spalva.name = "+spalva.name());
            System.out.println("spalva.ordinal = "+spalva.ordinal());
    }

}
