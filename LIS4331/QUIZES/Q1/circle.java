import java.util.Scanner;

public class circle {
    
    public static void main(String[] args) {
        
      
        
        // Declare constant for PI
        final double PI = 3.141592653;
        
        Scanner in = new Scanner(System.in);
        double r= 0.0;
        
        /* Input radius of circle from user. */
        System.out.println("Please enter radius of the circle: ");
        //int r = in.nextInt();
        
        while(!in.hasNextDouble()){
            System.out.println("Not valid ");
            in.next();
            System.out.println("Enter radius again: ");
        }
        
        r = in.nextDouble();
        //int r = in.nextInt();
        
        /*if(r!=(int)r) {
            System.out.println("Please enter radius of the circle : ");
            r = in.nextInt();
            
        }*/
        
        
       
        
       /* while (Character.isDigit(r)==false){
            System.out.println("Please enter radius of the circle : ");
            r = in.nextInt();
            
        }*/
        

        /* Calculate diameter, circumference and area. */
        double d = 2 * r;
        double circumference = 2 * PI * r;
        double area = PI * r * r;
        
        
        /* Print diameter, circumference and area of circle. */
        System.out.printf("\nDiameter of circle is: %.2f " , d);
         System.out.printf("\nCircumference of circle is : %.2f" , circumference);
         System.out.printf("\nArea of circle is : %.2f " , area);
        
       
    }
}
