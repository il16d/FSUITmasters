import java.util.Scanner;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

class multiplernumber{
    
    
    
    static void ConvertSectoDay(int inches)//seconds)
    {
        
        
       
        
        /*float day = n / (24 * 3600);
        
        n = n % (24 * 3600);
        float hour = n / 3600;
        
        n %= 3600;
        float minutes = n / 60 ;
        
        n %= 60;
        float seconds = n;
        
        float year=(day/365);
        float week=(day%365)/7;*/
        
        DecimalFormat df = new DecimalFormat("###,###.000000");//"###,###.###");//"#.00000000");
        
        /* int SEC_IN_MINS,MINS_IN_HR,HR_IN_DAY,DAYS_IN_WEEK,DAYS_IN_YR; //365 DAYS
         double minutes=0.0166667; //1 second = 0.0166667 minutes
         double hours=3600; // 1 hour = 3600 seconds
         double month*/
        
        //double SEC_IN_MINS=seconds / 60;
        //double minutes = seconds / 60;
        double centimerets = inches * 2.54;
        
        //double MINS_IN_HR = minutes / 60;
        //double hour = minutes / 60;
        
        double meters = inches * 0.0254;
        
        //double HR_IN_DAY = hour / 24;
        //double day = hour / 24;
        double feet = inches * 0.0833333 ;
        //Math.round(feet );
        
        //feet = inches / 12;
        
        //double DAY_IN_WEEk = day / 7;
       // double week = day / 7;
        double yard = inches* 0.0277778;
       
        //yards = inches / 36;
        
        //double months = week / 52;
       // double year = months / 12;
        
        //double DAYS_IN_YR = day/365;
       // double year = day/365;
        
       // double mile = inches * ;
        
        double miles =  feet / 5280; //inches / (12*5280);
        //Math.round(miles);
        Math.ceil(miles);
        
        
      if (inches == 63360)
        {
            System.out.printf("%,.6f",centimerets); //  System.out.printf("%.2f", SEC_IN_MINS);
            System.out.print(" centimeter(s)");
            System.out.print("\n");
            System.out.printf("%,.6f",meters); // System.out.printf("%.3f", MINS_IN_HR);
            System.out.print(" meter(s)");
            System.out.print("\n");
            System.out.print(df.format(Math.round(feet)));
            System.out.print(" feet(s)");
            System.out.print("\n");
             System.out.print(df.format(Math.round(yard)));
            System.out.print(" yard(s)");
            System.out.print("\n");
            System.out.print(df.format(Math.round(miles)));
            //System.out.printf("%,.8f",miles); // System.out.printf("%.6f", DAYS_IN_YR);
            System.out.print(" mile(s)");
            System.out.print("\n");
            
        }
        else{
        
       
        
        System.out.printf("%,.6f",centimerets); //  System.out.printf("%.2f", SEC_IN_MINS);
        System.out.print(" centimeter(s)");
        System.out.print("\n");
        System.out.printf("%,.6f",meters); // System.out.printf("%.3f", MINS_IN_HR);
        System.out.print(" meter(s)");
        System.out.print("\n");
        
        System.out.printf("%,.6f", feet); // System.out.printf("%.4f", HR_IN_DAY);
        //System.out.print("\n");
        
        //System.out.print(df.format(Math.round(feet)));
        System.out.print(" feet(s)");
        System.out.print("\n");
        System.out.printf("%,.6f",yard); // System.out.printf("%.5f", DAY_IN_WEEK);
       //System.out.print("\n");
       // System.out.print(df.format(Math.round(yard)));
        System.out.print(" yard(s)");
        System.out.print("\n");
        //System.out.print("\n");
       // System.out.print(df.format(Math.round(miles)));
       System.out.printf("%,.8f",miles); // System.out.printf("%.6f", DAYS_IN_YR);
        System.out.print(" mile(s)");
            System.out.print("\n");
            
        }
    
       
        
        /* FORMAT
         minute(s)
         hour(s)
         day(s)
         week(s)
         
         
         */
    }
    
  
    
    
    
    public static void main( String[] args ){
       
        
        Scanner sc = new Scanner(System.in);
        int Opositiveint1, Opositiveint2, positiveint1, positiveint2;
        //double Opositiveint1, Opositiveint2, positiveint1, positiveint2;
      
      //  int result=Opositiveint2/2;
        //int seconds,badseconds;
        //System.out.print("Enter a positive integer: ");
        System.out.print("Please enter number of inches: ");
        while(true){
            if( !sc.hasNextInt() ){
                sc.next();
                System.out.print("Not valid integer! ");
                System.out.print("\n");
                System.out.print("Please enter number of inches: ");
            }
            else {
                Opositiveint1 = sc.nextInt();
                positiveint1 = Opositiveint1;
                if (positiveint1>0)
                    break;
                else {
                    System.out.print("Please enter number of inches: ");
                }
            }
        } // end of while loop start calculations;
        
        
        
        
        System.out.print(positiveint1 + " inch(es) equals");
        System.out.println("\n");
        ConvertSectoDay(positiveint1);
        System.out.print("\n");
       // System.out.print("\n");
       
    } //closws main
} //closes class



