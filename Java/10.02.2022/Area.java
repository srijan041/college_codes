public class Area {
    
    double area(double r){
        return Math.PI*r*r;
    }

    double area(int b, int h){
        return 0.5*b*h;
    }

    double area(int s){
        return s*s;
    }

    public static void main(String[] args){
        Area ob = new Area();

        System.out.println("Square of side 4 = " + ob.area(4));
        System.out.println("Circle of radius 4 = " + ob.area(4.0));
        System.out.println("Triangle of l = 4 and b = 3 = " + ob.area(3, 4));

    }
}
