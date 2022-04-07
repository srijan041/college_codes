public class test {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s5 = new String("hello");
        String s3 = s1.concat(s2);
        String s6 = new String(s2);

        String s4 = s2.concat(s1);

        System.out.println("Address of s1 = " + s1.hashCode());
        System.out.println("Address of s2 = " + s2.hashCode());
        System.out.println("Address of s3 = " + s3.hashCode());
        System.out.println("Address of s4 = " + s4.hashCode());
        System.out.println("Address of s6 = " + s6.hashCode());

        System.out.println(s1 == s5);

        String a1 = "Mello";
        String a2 = "Ham";

        System.out.println("a1.compareTo(a2) = " + a1.compareTo(a2));

        String b = "a";
        String vowel = "AEIOUaeiou";
        System.out.println("AEIOUaeiou".indexOf(b));

        System.out.println(30 + 40 + "Sachin" + 50 + 20);

    }

}