
class Base{
    int num;

    Base(int n){
        num = n;
    }

    void showSquare(){
        System.out.println("Square of " + num + " = " + num*num);
    }
}

public class Derived extends Base{
    Derived(){
        super(4);
    }

    public static void main(String[] args){
        Derived d = new Derived();
        d.showSquare();
    }
}
