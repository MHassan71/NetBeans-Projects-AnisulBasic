
package basicjava;

public class Palindrome {
    public static void main(String[] args) {
        
        int num = 12421;
        int r;
        int palindrome = 0;
        int temp;
        temp = num;
        
        while(temp!=0){
            
            r = temp%10;
            palindrome = palindrome *10 + r;
            temp = temp/10;
        }
               
        if (num==palindrome){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
           
    }
}
