package grapheditor;

public class Circle extends Shape implements Square{
    private double radius;
    public Circle(String name) {
        super(name);
//        this.radius=radius;
    }
    public Circle(String name, double radius) {
        this(name);
        this.radius=radius;
    }
    public Circle(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI*radius*radius;
    }

    @Override
    public void printFigureName() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return getName() +
                " radius=" + radius;
    }

}
