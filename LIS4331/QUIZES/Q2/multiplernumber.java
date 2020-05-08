

import java.util.Scanner;

class multiplernumber{
    
    public static void main( String[] args ){
        
        Scanner sc = new Scanner(System.in);
        int Opositiveint1, Opositiveint2, positiveint1, positiveint2;
      //  int result=Opositiveint2/2;
        
        //System.out.print("Enter a positive integer: ");
        System.out.print("Num1: ");
        while(true){
            if( !sc.hasNextInt() ){
                sc.next();
                System.out.print("Not valid int! ");
                System.out.print("\n");
                System.out.print("Please try again. Enter num1: ");
            }
            else {
                Opositiveint1 = sc.nextInt();
                positiveint1 = Opositiveint1;
                if (positiveint1>0)
                    break;
                else {
                    System.out.print("Please enter a positive integer: ");
                }
            }
        }
        
        System.out.print("Enter num2 ");
        while(true){
            if( !sc.hasNextInt() ){
                sc.next();
                //System.out.print("Please enter a positive integer: ");
                System.out.print("Not valid int! ");
                System.out.print("Please try again. Enter num2: ");
            }
            else {
                Opositiveint2 = sc.nextInt();
                positiveint2 = Opositiveint2;
                if (positiveint2>0)
                    break;
                else {
                    System.out.print("Please enter a positive integer: ");
                }
            }
        }
        
        int temp;
        int resulto = positiveint1/2;
        int result = Opositiveint2/2;
        
        if (positiveint1>positiveint2) {
            temp = positiveint1%positiveint2;
            if (temp==0) {
                //System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint2 + ".");
                System.out.println( Opositiveint1 + " is a multiple of "  + positiveint2 + ".");
                System.out.println("The Product of " + resulto + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
            }
            while (temp!=0) {
                temp = positiveint1%positiveint2;
                if (temp==0){
                   // System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint2 + ".");
                    System.out.println( Opositiveint1 + " is a multiple of "  + positiveint2 + ".");
                    System.out.println("The Product of " + resulto + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
                    break;
                }
                if (temp==1){
                   // System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint2 + ".");
                    System.out.println( Opositiveint1 + " is a multiple of "  + positiveint2 + ".");
                    System.out.println("The Product of " + resulto + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
                    break;
                }
                positiveint1 = positiveint2;
                positiveint2 = temp;
               // int resulto = positiveint1/2;
                 System.out.println("The Product of " + resulto + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
                System.out.println("The Product of " + resulto + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
            }
        }
        else if (positiveint2>positiveint1) {
            temp = positiveint2%positiveint1;
            if (temp==0) {
               // System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint1 + ".");
                System.out.println( Opositiveint1 + " is a multiple of "  + positiveint1 + ".");
                System.out.println("The Product of " + result + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
            }
            while (temp!=0) {
                temp = positiveint2%positiveint1;
                if (temp==0){
                    //System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint1 + ".");
                    System.out.println( Opositiveint1 + " is a multiple of "  + positiveint1 + ".");
                    System.out.println("The Product of " + result + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
                    break;
                }
                if (temp==1){
                    //System.out.println("The GCD of " + Opositiveint1 + " and " + Opositiveint2 + " is " + positiveint1 + ".");
                    System.out.println( Opositiveint1 + " is a multiple of "  + positiveint1 + ".");
                    System.out.println("The Product of " + result + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
                    break;
                }
                positiveint2 = positiveint1;
                positiveint1 = temp;
            }
        }
        else {
            //int result = Opositiveint2/2;
            System.out.println( Opositiveint1 + " is a multiple of "  + positiveint1 + ".");
           System.out.println("The Product of " + result + " and " + Opositiveint2 + " is " + Opositiveint1 + ".");
            
        }
    }
}
