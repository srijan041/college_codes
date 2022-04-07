
interface Motor{
    int capacity = 1000;
    void run();
    void consume();

}

public class WashingMachine implements Motor{


    public void consume(){
        System.out.println("I consume 1L for 20Kmpl due to " + capacity + " sized engine");
    }

    public void run(){
        System.out.println("I run at 100kmph");
    }


    public static void main(String[] args){
        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();


    }




}
