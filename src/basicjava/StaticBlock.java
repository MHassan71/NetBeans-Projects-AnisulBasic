// Project: AnisBasic

package basicjava;

public class StaticBlock {
    
    public static void main(String[] args) {
       
        System.out.println("I am Main Method");
        
        StaticBlock.staticMethod1();
        StaticBlock.staticMethod2();
    }
    
    static{
        System.out.println("I am 1st Static Block");
    }
    
    static{
        System.out.println("I am 2nd Static Block");
    }
    
    static void staticMethod1(){
    
        System.out.println("I am Static method one");
}
    static void staticMethod2(){
        System.out.println("I am Static method two");
    }
    
}
