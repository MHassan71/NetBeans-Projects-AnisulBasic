// Project: AnisBasic
            
package basicjava;

public class CalculateCircleArea {
    
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.areaCircle(3.5);
        
        Circle c1 = new Circle();
        c1.areaCircle(5.5);
        
    }
    
} 
    
class Circle{
        
        double radius;
        double area;
        
        public void areaCircle(double r){
            
            radius = r;
            area = 3.14*radius*radius;
            System.out.println("Area of Circle: " + area);
        }
    }

