package grapheditor;

public class Quad extends Shape implements Square{
    double sideSize;
    public Quad(String name) {
        super(name);
//        this.sideSize=sideSize;
    }
    public Quad(String name, double sideSize) {
        this(name);
        this.sideSize=sideSize;
    }
    public Quad(double sideSize) {
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
        return sideSize*sideSize;
    }

    @Override
    public void printFigureName() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return getName()+
                " sideSize=" + sideSize;
    }
}
