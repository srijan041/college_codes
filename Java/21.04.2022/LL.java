import java.util.*;

public class LL {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Srijan"); // q1
        ll.add("Hello");
        ll.add("Hue");
        ll.add("KIIT");
        ll.add("Univ");
        ll.add("CSE");
        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) { // q2
            System.out.println(ll.get(i) + " ");
        }

        for (int i = 2; i < ll.size(); i++) { // q3
            System.out.println(ll.get(i) + " ");
        }

        for (int i = ll.size() - 1; i > 0; i--) { // q4
            System.out.println(ll.get(i) + " ");

        }

        ll.add(2, "John"); // q5

        ll.add(0, "First"); // q6
        ll.add(ll.size(), "Last"); // q6

        ll.addFirst("AddFirst"); // q7
        ll.addLast("AddLast"); // q8

        ll.add(4, "Specified"); // q9

        System.out.println(ll.indexOf("KIIT")); // q10
        System.out.println(ll.lastIndexOf("KIIT")); // q10

        System.out.println(ll);

        for (int i = 0; i < ll.size(); i++) { // q11
            System.out.println(ll.get(i) + " " + i);
        }

        ll.remove("CSE"); // q12

        ll.removeFirst(); // q13
        ll.removeFirst(); // q13

        // ll.removeAll(ll); //q14

        Collections.swap(ll, 2, 5); // q15

        Collections.shuffle(ll); // q16

        LinkedList<String> ll2 = new LinkedList<String>();

        ll2.add("New");

        ll.addAll(ll2); // q17

        LinkedList<String> llclone = new LinkedList<String>();
        llclone = (LinkedList) ll.clone(); // q18

        System.out.println(ll.removeFirst()); // q19

        System.out.println(ll.peekFirst()); // q20
        System.out.println(ll.peekLast()); // q21

        System.out.println(ll.contains("Unknown")); // q22 will return -1 if not found

        ArrayList<String> al = new ArrayList<String>(ll); // q23

        boolean flag = true;

        for (String s : ll) { // q24
            if (llclone.contains(s) == false) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.println("Same");

        System.out.println(llclone);

        System.out.println(ll.isEmpty()); // q25

        ll.set(5, "WTTHEORY"); // q26

        System.out.println("\n\nPRIORITY QUEUE:\n\n");

        PriorityQueue<String> pq = new PriorityQueue<String>(); // q27
        pq.add("Red");
        pq.add("Blue");
        pq.add("Green");

        System.out.println(pq);

        for (int i = 0; i < ll.size(); i++) { // q28
            System.out.println(ll.get(i) + " ");
        }

        PriorityQueue<String> pq2 = new PriorityQueue<String>(); // q27

        pq2.add("Violet");
        pq2.add("Purple");

        pq.addAll(pq2); // q29

        pq2.add("Yellow"); // q30

        // pq2.removeAll(); //q31

        System.out.println(pq2.size()); // q32

        boolean flag2 = true;

        for (String s : pq) { // q33
            if (llclone.contains(s) == false) {
                flag2 = false;
                break;
            }
        }

        if (flag2)
            System.out.println("Same");
        else
            System.out.println("Not same");

        System.out.println(pq.peek()); // q34

        pq.poll(); // q35

        Object[] arr = pq.toArray(); // q36

        for (Object s : arr) {
            System.out.println(s);
        }

        System.out.println(pq.toString()); // q37

        PriorityQueue<String> pqmax = new PriorityQueue<String>(20, Collections.reverseOrder()); // q38
        pqmax.add("Red");
        pqmax.add("Blue");
        pqmax.add("Green");

    }

}
