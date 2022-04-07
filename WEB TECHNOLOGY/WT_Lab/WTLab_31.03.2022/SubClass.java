import java.io.*;

class SuperClass {

    void method() throws RuntimeException {
        System.out.println("SuperClass Exception");
    }
}

class SubClass extends SuperClass {

    void method() throws ArithmeticException {

        System.out.println("SubClass Exception");
    }

    public static void main(String args[]) {
        SuperClass s = new SubClass();
        s.method();
    }
}