class TwoD{
    double length;
    double breadth;
    int price = 40;

    TwoD(double l, double b){
        length = l;
        breadth = b;
    }

    double returnArea(){
        return length*breadth;
    }

    double return2Dprice(){
        return returnArea()*price;
    }
}

public class ThreeD extends TwoD{
    double height;
    int price = 60;

    ThreeD(double l, double b, double h){
        super(l, b);
        height = h;
    }

    double returnVolume(){
        return super.length*super.breadth*height;
    }

    double return3Dprice(){
        return returnVolume()*price;
    }

    public static void main(String[] args){
        TwoD twoD = new TwoD(5, 4);
        System.out.println("Dimensions 2d = " + twoD.returnArea());
        System.out.println("Price 2d = " + twoD.return2Dprice());

        ThreeD threeD = new ThreeD(5, 4, 6);
        System.out.println("Dimensions 3d = " + threeD.returnVolume());
        System.out.println("Price 3d = " + threeD.return3Dprice());


    }

}
