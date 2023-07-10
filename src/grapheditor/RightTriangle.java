package grapheditor;

public class RightTriangle extends Shape implements Square{
    double cathetus1;
    double cathetus2;

    public RightTriangle(String name) {
        super(name);
//        this.cathetus1=cathetus1;
//        this.cathetus2=cathetus2;
    }
    public RightTriangle(String name,double cathetus1,double cathetus2) {
        this(name);
        this.cathetus1=cathetus1;
        this.cathetus2=cathetus2;
    }
    public RightTriangle(double cathetus1,double cathetus2) {
        this.cathetus1=cathetus1;
        this.cathetus2=cathetus2;
    }

    public double getCathetus1() {
        return cathetus1;
    }

    public void setCathetus1(double cathetus1) {
        this.cathetus1 = cathetus1;
    }

    public double getCathetus2() {
        return cathetus2;
    }

    public void setCathetus2(double cathetus2) {
        this.cathetus2 = cathetus2;
    }

    @Override
    public double calcSquare() {
        return cathetus1*cathetus2/2;
    }

    @Override
    public void printFigureName() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return getName() +
                " cathetus1=" + cathetus1 +
                ", cathetus2=" + cathetus2;
    }
}
