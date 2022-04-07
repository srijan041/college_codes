public class CheckOddEven {
    public static void main(String[] args){
        int odd = 0, even = 0;

        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i]) % 2 == 0)
                even++;
            else 
                odd++;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
