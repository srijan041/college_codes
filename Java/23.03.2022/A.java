class A{
    private int data = 10;
    private void msg(){
        System.out.println("Hello");
    }

    public static void main(String[] args){
        A obj = new A();

        //obj.data;
        obj.msg();
        System.out.println(obj.data);
    }
}
