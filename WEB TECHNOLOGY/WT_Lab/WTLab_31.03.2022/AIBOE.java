
public class AIBOE {
    String[] s = {"Hello", "Hi", "Hue"};

    void printLength(){
        int i = 0;
        try{
            for(i = 0; ;i++){
                String sh = s[i];
            }
        } catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Length of array = " + i);
        }
    }

    public static void main(String[] args){
        AIBOE aiboe = new AIBOE();
        aiboe.printLength();
    }
}
