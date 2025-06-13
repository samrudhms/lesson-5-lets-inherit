class friend{
    int age,id;
    String name;
    void show(String name){
        System.out.println("your name is"+name);
    }
}
class me extends friend{
    void display(int age){
        System.out.println("your age is"+age);
    }
}
class inherit{
    public static void main(String[] args) {
        me apple=new me();
        apple.show ("samrudh");
        apple.display (13);
    }
}
