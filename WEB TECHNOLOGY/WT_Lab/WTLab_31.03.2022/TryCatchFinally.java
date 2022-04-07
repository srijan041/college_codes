
public class TryCatchFinally {

    void demo() {
        try {
            int x = 5 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Division by 0 not allowed");
        } finally {
            int x = 5 / 2;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        TryCatchFinally tcf = new TryCatchFinally();

        tcf.demo();
    }

}
