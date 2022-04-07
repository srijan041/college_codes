public class Subtract {
    
    double subtract(int a, int b){
        return a-b;
    }

    double subtract(int a, int b, int c){
        return a-b-c;
    }

    public static void main(String[] args){
        Subtract ob = new Subtract();
        System.out.println("Difference of 6 & 2 = " + ob.subtract(6, 2));
        System.out.println("Difference of 6, 3 & 2 = " + ob.subtract(6, 3, 2));
    }
}
