import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;
public class TimeTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char con = ' ';
        int count = 0;
        
        double miles = 0.0; //initial
        double mph = 0.0; //interest rate
        int years = 0;
        
        
        double finalamount = 0.0;
        
        
        
        double hours = 0.0;
        double minutes = 0.0;

        do {
            count = 0;            
            
            System.out.println("Interest Calc");

            while( count != 1 ) {
                System.out.print("\nCurrent Principal: $");

                while(!sc.hasNextInt()) {
                    System.out.println("Invalid number!");
                    System.out.print("\nPlease try again. Enter principal: $");
                    
                    sc.next();
                }

                    miles = sc.nextInt();

               
                    count++;
                
            }

            while( count != 2 ) {
                System.out.print("\nInterest Rate (per year): ");

                while(!sc.hasNextDouble()) {
                    System.out.println("Invalid number.");
                    System.out.print("\nPlease try again. Enter interest rate: ");
                    
                    sc.next();
                }

                mph = sc.nextDouble();

                
                    count++;
                
            }
            while( count != 3 ) {
                System.out.print("\nTotal time (in years): ");
                
                while(!sc.hasNextInt()) {
                    System.out.println("Invalid number.");
                    System.out.print("\nPlease try again. Enter years: ");
                    
                    sc.next();
                }
                
                years = sc.nextInt();
                
                
                count++;
                
            }
            
            // final = initial (1 + rate*time)
            double R = mph/100;
            finalamount = miles * (1+ R*years);
            
           /* minutes = ((miles / mph) * 60) % 60;
            hours = (((miles / mph) * 60) - minutes) / 60;*/
            
            Locale currentLocale = Locale.US;
            
            //Get currency instance from locale; This will have all currency related information
            Currency currentCurrency = Currency.getInstance(currentLocale);
            
            //Currency Formatter specific to locale
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
            
           // currencyFormatter.format(currencyAmount);
            
           // defaultFormat.format(finalamount)
            
            
          // NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
           // System.out.println("US: " + defaultFormat.format(num));*/
            
            System.out.print("\nYou will have saved " + currencyFormatter.format(finalamount) + " in " + years + " years, "+ "at an interest rate of " + mph + "%");
            System.out.print("\n\n");
            
           /* System.out.printf("%,.0f", hours);
            System.out.print(" hr(s) ");
            System.out.printf("%,.0f", minutes);
            System.out.print(" minutes\n\n");*/
            
            System.out.print("Continue? (y/n): ");

            con = sc.next().charAt(0);
        } while( con == 'y' || con == 'Y' );
    }
}
