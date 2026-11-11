abstract class Parent{
    abstract void loan();
    void printing(){
    System.out.println("welcome to RBI");
    }
}
class Child extends Parent{
    void loan(){
        System.out.println("loan accepted");
    }
}
class Abstraction{
    public static void main(String[] args){
        Child ch= new Child();
        ch.loan();
        ch.printing();
    }
}