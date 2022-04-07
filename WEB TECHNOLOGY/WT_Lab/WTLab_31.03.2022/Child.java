import java.io.IOException;

class Parent {
    void msg() throws Exception {
        throw new IOException("Parent");
    }
}

public class Child extends Parent {
    void msg() throws Exception {
        try {
            throw new IOException("Child");
        } catch (Exception e) {
            System.out.println(e);
        }
        super.msg();
    }

    public static void main(String[] args) throws Exception {
        Child c = new Child();
        try {
            c.msg();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
