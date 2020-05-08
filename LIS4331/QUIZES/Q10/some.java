
import java.util.Scanner;

class some{
    
     private static boolean done = false;
    
    static void ConvertSectoDay(int seconds)
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
        
        
        
        /* int SEC_IN_MINS,MINS_IN_HR,HR_IN_DAY,DAYS_IN_WEEK,DAYS_IN_YR; //365 DAYS
         double minutes=0.0166667; //1 second = 0.0166667 minutes
         double hours=3600; // 1 hour = 3600 seconds
         double month*/
        
        //double SEC_IN_MINS=seconds / 60;
        double minutes = seconds / 60;
        
        //double MINS_IN_HR = minutes / 60;
        double hour = minutes / 60;
        
        //double HR_IN_DAY = hour / 24;
        double day = hour / 24;
        
        //double DAY_IN_WEEk = day / 7;
        double week = day / 7;
        
        //double months = week / 52;
        // double year = months / 12;
        
        //double DAYS_IN_YR = day/365;
        double year = day/365;
        
        
        System.out.printf("%.2f", minutes); //  System.out.printf("%.2f", SEC_IN_MINS);
        System.out.print(" minute(s)");
        System.out.print("\n");
        System.out.printf("%.3f",hour); // System.out.printf("%.3f", MINS_IN_HR);
        System.out.print(" hour(s)");
        System.out.print("\n");
        System.out.printf("%.4f",day); // System.out.printf("%.4f", HR_IN_DAY);
        System.out.print(" day(s)");
        System.out.print("\n");
        System.out.printf("%.5f",week); // System.out.printf("%.5f", DAY_IN_WEEK);
        System.out.print(" week(s)");
        System.out.print("\n");
        System.out.printf("%.6f",year); // System.out.printf("%.6f", DAYS_IN_YR);
        System.out.print(" year(s)");
        System.out.print("\n");
        
        
        
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
        while (!done)
        {
           
            System.out.print("Please enter number of seconds: ");
            while(true){
                if( !sc.hasNextInt() ){
                    sc.next();
                    System.out.print("Not valid integer! ");
                    System.out.print("\n");
                    System.out.print("Please enter number of seconds: ");
                }
                else {
                    Opositiveint1 = sc.nextInt();
                    positiveint1 = Opositiveint1;
                    if (positiveint1>0)
                        break;
                    else {
                        System.out.print("Please enter number of seconds: ");
                    }
                }
            } // end of while loop start calculations;
            
            System.out.print(positiveint1 + " second(s) equals");
            System.out.println("\n");
            ConvertSectoDay(positiveint1);
            System.out.print("\n");
            
            System.out.printf("Continue? (y/n): ");
            String choice = sc.nextLine();
            // choice = in.nextLine();
            switch(choice) {
                case "y":
                    break;
                case "n":
                    done = true;
                    break;
            
           
            }
       
        
                    // System.out.print("\n");
        
        }//done loop
        
    } //closws main
} //closes class






