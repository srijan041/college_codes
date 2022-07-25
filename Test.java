class A {
    private final void f1() {
        System.out.println('a');
    }
}

public class Test extends A {
    private final void f1() {
        System.out.print('b');
    }

    public static void main(String x[]) {
        new Test().f1();
    }
}