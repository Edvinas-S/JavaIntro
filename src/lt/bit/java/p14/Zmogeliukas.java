package lt.bit.java.p14;

public class Zmogeliukas {
    private int age;

    public Zmogeliukas() {

    }

    public Zmogeliukas(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Zmogeliukas{" +
                "age=" + age +
                '}';
    }

}
