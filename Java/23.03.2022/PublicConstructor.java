public class PublicConstructor {

    PublicConstructor(){}

    void msg(){
        System.out.println("Hello");
    }


    public static void main(String[] args){
        PublicConstructor pc = new PublicConstructor();
        pc.msg();
    } 
}
