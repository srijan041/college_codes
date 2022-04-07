
class Shape{
    double area;

    Shape(double area){
        this.area = area;
    }

    void showArea(){
        System.out.println("Area = " + area);
    }

}

class Circle extends Shape{ 

    Circle(double area){
        super(area);
    }

}

class Rectangle extends Shape{

    Rectangle(){
        super(64);
    }

}

public class AllShapes  {
    public static void main(String[] args){
        Circle c = new Circle(56.7);
    Rectangle r = new Rectangle();

    c.showArea();
    r.showArea();
    }
}
