import java.util.Scanner;

class multiplernumber{
    
    public static void main( String[] args ){
        
        Scanner sc = new Scanner(System.in);
        int Opositiveint1, Opositiveint2, positiveint1, positiveint2, Opositiveint3, positiveint3;
        int count=0;
        
        //Opositiveint1 EXAM SCORE 1
        //Opositiveint2 EXAM SCORE 2
      //  int result=Opositiveint2/2;
        
        //System.out.print("Enter a positive integer: ");
        System.out.print("Enter exam score: ");
        while(true){
            if( !sc.hasNextInt() ){
                sc.next();
                System.out.print("Not valid number! ");
                System.out.print("\n");
                System.out.print("Please try again. Enter exam score: ");
                //count++;
            }
            else {
                Opositiveint1 = sc.nextInt();
                positiveint1 = Opositiveint1;
                if (positiveint1>0)
                    break;
                else {
                    System.out.print("Please enter a positive integer: ");
                }
            } count++;
        }
        
        System.out.print("Enter exam score: ");
        while(true){
            if( !sc.hasNextInt() ){
                sc.next();
                //System.out.print("Please enter a positive integer: ");
                System.out.print("Not valid number! ");
                System.out.print("\n");
                System.out.print("Please try again. Enter exam score: ");
                //count++;
            }
            else {
                Opositiveint2 = sc.nextInt();
                positiveint2 = Opositiveint2;
                if (positiveint2>0)
                    break;
                else {
                    System.out.print("Please enter a positive integer: ");
                }
            } count++;
        }
        
        System.out.print("Enter exam score: ");
        while(true){
            if( !sc.hasNextInt() ){
                sc.next();
                System.out.print("Not valid number! ");
                System.out.print("\n");
                System.out.print("Please try again. Enter exam score: ");
                //count++;
            }
            else {
                Opositiveint3 = sc.nextInt();
                positiveint3 = Opositiveint3;
                if (positiveint3>0)
                    break;
                else {
                    System.out.print("Please enter a positive integer: ");
                }
            } count++;
        }
        
        System.out.print("Enter exam score: ");
        sc.next();
        
        int total= positiveint1+positiveint2+positiveint3;
        int average= total/count;
        
        System.out.print("\n");
        System.out.println("Count: " + count);
        System.out.println("Total: " + total + ".0");
        System.out.println("Average: " + average+ ".0");
    }
   // System.out.println("Count" + count);
}
        
//int temp;
     //   int resulto = positiveint1/2;
     //   int result = Opositiveint2/2;


