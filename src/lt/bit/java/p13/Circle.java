package lt.bit.java.p13;

public class Circle extends Figure {

    private double radius;

    public Circle(String name, double radius) {
        setName(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        double A = Math.PI * radius * radius;
        return A;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
