
import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> ar1 = new ArrayList<String>();
        System.out.println("Initial Size: " + ar1.size());
        ar1.add("Apple");
        ar1.add("Mango");
        ar1.add("Grapes");
        ar1.add("Guava");
        ar1.add("Vanilla");
        ar1.add("Orange");
        System.out.println("Size after addition: " + ar1.size());
        System.out.println("Content of ar1: " + ar1);
        ar1.remove("Vanilla");
        ar1.remove(2);
        System.out.println("Size after Deletion: " + ar1.size());
        System.out.println("Content of ar1: " + ar1);
    }
}
