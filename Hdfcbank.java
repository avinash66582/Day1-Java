class RBI{
    void Loan(){
        System.out.println("RBI RULES");
    }
}
class SBI extends RBI{
      SBI(){
      System.out.println("SBI bank");
    }  
}
class HDFC extends SBI{
     HDFC(){
      System.out.println("HDFC bank");
    }
}
class Hdfcbank{
    public static void main(String[] args){
        HDFC obj= new HDFC();
        obj.Loan();
    }
}