
package basicjava;

public class ReverseNumber {
    
    public static void main(String[] args) {
        
    int n = 1331;
    int r;
    int reverse = 0;
    
    while(n!=0){
        r = n%10;
        reverse = reverse *10 + r;
        n=n/10;
    }
    
        System.out.println("Reverse number: "+ reverse);
    }
 
    
    
}
