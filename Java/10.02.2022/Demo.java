import java.util.*;

class Box{
    int length;
    int height;
    int breadth;

    Box(int l, int h, int b){
        length = l;
        height = h;
        breadth = b;
    }

    int volume(){
        return length*height*breadth;
    }
}

public class Demo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides: ");
        int l = sc.nextInt();
        int h = sc.nextInt();
        int b = sc.nextInt();
        Box obj = new Box(l, b, h);

        System.out.println("Volume = " + obj.volume());
    }

}
