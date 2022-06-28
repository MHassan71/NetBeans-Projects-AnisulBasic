// Project: AnisBasic

package basicjava;

public class ReferencePrimitiveTypes {
    
    public static void main(String[] args) {
        
        int x = 13;
        int y=x;
        System.out.println(x+ " "+y+ " Before");
        
        x = 10;
        System.out.println(x+ " "+y+ " After");
        
        Test a = new Test();
        Test b=a;
        System.out.println(a.messege+" "+b.messege+" Before");
        a.change();
        System.out.println(a.messege+" "+b.messege+" After");
    }
}

class Test{
    
    String messege = "Hi";
    
    public void change(){
        messege = "Bye";
    }
}
