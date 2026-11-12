class Stuid{
    private int id;

    void getter(){
        System.out.println(id);
    }
    void setter(int num){
        id =num;
    }
}
class Stu{
    public static void main(String[] args){
        User us = new User();
        us.setter(202350);
        us.getter();
    }
}