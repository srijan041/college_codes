abstract class Student{
    int rollNo;
    String regNo;

    abstract void course();
}


class Kiitian extends Student{
    @Override
    void course() {
        System.out.println("Im from CSE course");
    }

    public static void main(String[] args){
        Student obj = new Kiitian();

        obj.course();
    }
}



