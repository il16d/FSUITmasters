import java.util.Scanner;

public class Circle

{
    
    private static final double PI = 3.14159;
    
    private double radius;
    
    public Circle(){radius = 1.0;}
    
    public Circle (double r) {radius = r;}
    
    public double getRadius(){return radius;}
    
    public void setRadius(double radius){this.radius = radius;}
    
    public double diameter(){return 2*radius;}
    
    public double area(){return PI*Math.pow(radius,2);}
    
    public double circumference(){return 2*PI*radius;}
    
    
}
