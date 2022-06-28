
package basicjava;

public class ValueSwap {
    public static void main(String[] args) {
        
        String projectpath = System.getProperty("user.dir");
        
        System.out.println("Projectpath is: "+projectpath);
        
        int a = 5;
        int b = 2;
        
        //a=a+b; // 7
        a= a-b; // 3
        //b = a-b;// 5
        b=b+a;//5
        //a=a-b; // 2
        a=b-a; // 2
        
        
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);   
        
        
    }
}
