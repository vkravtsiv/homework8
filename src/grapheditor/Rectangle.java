package grapheditor;

public class Rectangle extends Shape implements Square{
    double width;
    double height;
    public Rectangle(String name) {
        super(name);
//        this.width=width;
//        this.height=height;
    }
    public Rectangle(String name,double width,double height) {
        this(name);
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width,double height) {
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcSquare() {
        return width*height;
    }

    @Override
    public  void printFigureName() {
        System.out.println(getName());
    }

    @Override
    public String toString() {
        return getName()+
                " width=" + width +
                ", height=" + height;
    }
}
