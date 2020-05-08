import java.util.Scanner; //imports all libraries
import java.util.Random; //import pseudo random generator library

public class Methods
{
    
    
    public static void main(String args[])
    {
        int[]numbers = {12,15,34,67,4,9,10,7,13,50};
        int limit = 12;
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayHigherThan(numbers);
    }
   
    public static void display(int[] numbers)
    {
        System.out.print("Numbers in Array: ");
        for(int i=0; i< numbers.length; i++)
            System.out.print(numbers[i]+ " ");
    }
    
    
    public static void displayReverse(int[] numbers)
    {
        System.out.print("\nNumbers in reverse order: ");
        for(int i= numbers.length -1; i>=0; --i)
            System.out.print(numbers[i]+ " ");
    }
    
    
    public static void displaySum(int[] numbers)
    {
        int total=0;
        
        for(int i=0; i< numbers.length; i++)
        {
            total+=numbers[i];
        }
        System.out.print("\nSum of all numbers is " + total);
    }
    
    public static void displayHigherThan(int[] numbers)
    {
        int sum=0;
        double avg;
        
        for(int i=0; i<numbers.length; ++i)
            sum+=numbers[i];
        avg=sum*1.0/numbers.length;
        
        System.out.print("\nAverage is: " + avg + "\n");
        for(int i=0; i< numbers.length; i++)
            if(numbers[i]>avg)
            System.out.print(numbers[i]+ " ");
        System.out.print("are greater than the average \n");
    }
}//class bracket

