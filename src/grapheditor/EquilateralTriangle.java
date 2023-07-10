package grapheditor;

public class EquilateralTriangle extends Shape implements Square{
    double sideSize;

    public EquilateralTriangle(String name) {
        super(name);
//        this.sideSize=sideSize;
    }
    public EquilateralTriangle(String name,double sideSize) {
        this(name);
        this.sideSize=sideSize;
    }
    public EquilateralTriangle(double sideSize) {
        this.sideSize=sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double calcSquare() {
        return sideSize*sideSize*Math.sqrt(3)/4;
    }

    @Override
    public void printFigureName() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return getName() +
                " sideSize=" + sideSize;
    }
}
