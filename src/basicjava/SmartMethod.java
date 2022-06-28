// Project: AnisBasic
package basicjava;

public class SmartMethod {
    
    public static void main(String[] args) {
       
    int x= add(6,7);
        System.out.println("Sum: " + x);
    
    int y = sub(10,3);
        System.out.println("Sub: " + y);
        
    int m = mul(5,4);
        System.out.println("Multiplication: " + m);
    
    int z = div(20,4);
        System.out.println("Division: " + z);
    }   
    
    
                public static int add(int a, int b){
                     int sum = a+b;
                     return sum;
                 }

                 public static int sub(int a, int b){
                     int sub = a-b;
                     return sub;
                 }

                 public static int mul(int a, int b){
                     int mul = a*b;
                     return mul;
                 }

                 public static int div(int a, int b){
                     int div = a/b;
                     return div;
                 }
        
       /*public static void add(int a, int b){
           
           System.out.println("Sum: " + (a+b));
       }
       
       public static void sub(int a, int b){
           System.out.println("Sub: " + (a-b));
       }
       
       public static void mul(int a, int b){
           System.out.println("Mul: " + (a*b));
       }
       
       public static void div(int a, int b){
           System.out.println("Div: " + (a/b));
       }*/
               
}
