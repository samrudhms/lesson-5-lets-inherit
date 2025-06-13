class animal{
    void eat(){
        System.out.println("eat function");
    }
}
class lion extends animal{
void roar(){
    System.out.println("roar functon");
}
}
class babylion extends lion{
    void weap(){
        System.out.println("weap function");
    }
}
class multilevel{
    public static void main(String[] args) {
        babylion meat=new babylion();
        meat.eat();
        meat.roar();
        meat.weap();
    }
}
