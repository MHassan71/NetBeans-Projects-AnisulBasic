
package basicjava;

public class SumOfDigits {
    
    public static void main(String[] args) {
        
        int r, num, temp, sum, mul;
        
        sum = 0;   // for sum of the digits the intial value of sum is 0
        mul=1;     // for multiplication of the digits the intial value of mul is 1
        num= 121;
        temp = num;
        
        while(temp!=0){
            r = temp % 10;
            temp = temp /10;
            //sum = sum+r;
            mul = mul*r;
        }
        
        //System.out.println("Sum of Digits: "+ sum);
        System.out.println("Mul of Digits: "+ mul);
    }
    
}
