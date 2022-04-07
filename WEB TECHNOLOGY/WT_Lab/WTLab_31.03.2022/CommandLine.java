
class CheckArguementException extends Exception {
    public CheckArguementException(String str) {
        super(str);
    }
}

public class CommandLine {
    public static void main(String[] args) {
        try {
            int sum = 0;
            if (args.length < 4)
                throw new CheckArguementException("Less than 4");
            else {
                for (int i = 0; i < args.length; i++) {
                    int n = Integer.parseInt(args[i]);
                    sum += (n * n);
                }
                System.out.println(sum);
            }
        } catch (CheckArguementException cae) {
            System.out.println(cae);
        }
    }
}
