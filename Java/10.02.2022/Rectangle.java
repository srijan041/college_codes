import java.util.*;
public class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    int calculateArea(){
        return length*breadth;
    }

    int calculatePerimeter(){
        return length*2 + breadth*2;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        Rectangle rec = new Rectangle(l, b);

        System.out.println("Area = " + rec.calculateArea());
        System.out.println("Perimeter = " + rec.calculatePerimeter());
    }
}
