class Parent{
    void name(){
        System.out.println("This is parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("This is child");
    }
}
class Inheritance{
    public static void main(String[] args){
    Child ch =new Child();
    ch.name();
    }
}