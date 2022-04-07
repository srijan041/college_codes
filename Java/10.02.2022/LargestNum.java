public class LargestNum {

    public static void main(String[] args){
        
        int res = (Integer.parseInt(args[0])) > Integer.parseInt(args[1]) ?
            ( Integer.parseInt(args[0]) > Integer.parseInt(args[2]) ?
                Integer.parseInt(args[0]) : Integer.parseInt(args[2]) ) :
                ( Integer.parseInt(args[1]) > Integer.parseInt(args[2]) ? Integer.parseInt(args[1]) : 
                Integer.parseInt(args[2]) );

        System.out.println(res);
    }
    
}
