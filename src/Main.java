import grapheditor.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[]{
                new Rectangle("RectangleOne",6,8),
                new Circle("CircleTwo",8),
                new Quad("RectangleThree",7),
                new RightTriangle("RightTriangleFour",8,9),
                new EquilateralTriangle("equilateralTriangleFive",8)
        };

        int i=0;
        for (Shape shape: shapes){
            shape.printFigureName();
            ShapePrinter.printShape(shapes[i]);
            i++;
        }

        Square[] squares=new Square[5];
        Square circle1=new Circle("CircleOne",8);
        Square quadrat2=new Quad("QuadratTwo",6);
        Square rectangle3=new Rectangle("RectangleThree",4,5);
        Square rightTriangle4=new RightTriangle ("RightTriangleFour",8,9);
        Square equilateralTriangle5=new EquilateralTriangle("EquilateralTriangleFive",8);
        squares[0]=circle1;
        squares[1]=quadrat2;
        squares[2]=rectangle3;
        squares[3]=rightTriangle4;
        squares[4]=equilateralTriangle5;
//        int i=0;

        for (Square s:squares) {
            System.out.println(s);
            System.out.println("Square="+String.format("%.3f",s.calcSquare()));

        }


    }
}