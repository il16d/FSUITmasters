import javax.swing.JOptionPane;

import java.text.NumberFormat;
import java.util.Locale;
import java.lang.Math;

public class q8
{
                          // private String name;
    private int height;  //height health
    private int length; //lenght battles
  //  private int width; // width; age
   //private int price;//price per gallon gold
                     // private Stars star;
    
    
    private double calcul; //claculation ints
    private double calcul2;
    private double result;
    
    public q8()
    {
       // name = "Mister";
        
        height = 30;
        length = 50;
       // width = 9;
      //  price=5;
        
       // gold = 0;
       // star = new Stars(); //
    }
    
   /* public String GetName()
    {
        return name;
    }*/
    
    public int GetHeight()
    {
        return height;
    }
    public int Getlenght()
    {
        return length;
    }
    
   /* public int Getwidth()
    {
        return width;
    }
   public int Getprice()
    {
        return price;
    }*/
    
  /*  public Stars GetStars()
    {
        return star;
    }*/
    
    
    public void getUserInput(){
        
        
      //  SetName(JOptionPane.showInputDialog(
     //     "Enter your Knight's name", "Sir Jav-a-lot"));
        
      
        
        SetLength(Integer.parseInt(JOptionPane.showInputDialog(
                                                                "Leg A: ", "30")));
        SetHeight(Integer.parseInt(JOptionPane.showInputDialog(
                                                            "Leg B: " , "40")));
       // SetPrice(Integer.parseInt(JOptionPane.showInputDialog(
                  //                                            "Leg C: ", "1234")));
        
      //  SetHeight(Integer.parseInt(JOptionPane.showInputDialog(
                //                                               "Height: ", "94")));
        
    
        
       
    }
    
   /* public void SetName(String Name)
    {
        
        name = Name;
    }*/
    
    
   /* private int height; //height health
    private int lenght;  //lenght battles
    private int width;  // width; age
    private int price; //price per gallon gold*/
    
    
    public void SetHeight( int Height)
    {
        height = Height;
    }
    
    public void SetLength(int Length)
    {
        length = Length;
    }
    
   /* public void SetWidth(int Age)
    {
        width = Age;
    }
    
    public void SetPrice(int Price)
    {
        price = Price;
    }
    */
   /* public void SetStars()
    {
        star = new Stars();
    }*/
    
    
    // **END OF SET AND GET METHODS**
    
    
    public void PopupOutput(){
        
        calcul = length*length;
        calcul2 = height*height;
        result= Math.sqrt(calcul+calcul2);
        //price*(length*height*2+width*height*2);
        
        //NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        //String currency = format.format(calcul);
        
       String output;
        output= "Leg A: " + Getlenght() + "\n"
        + "Leg B: " + GetHeight() + "\n"
        + "Leg C: " + result + "\n";
        //+ "Knight Age: " + GetAge() + "\n"
       // + "Knight Gold: " + GetGold() + "\n"
       // + star.printStars();*/
        
        
        
           //DecimalFormat df = new DecimalFormat("#.##");
      //  JOptionPane.showMessageDialog(null, "Your payment is " + currency); //df.format(calcul));
        
         //String.format("Your monthly payment is $%.2f",  totalCost)
        //'System.out.println(String.format("%,.2f", calcul));
       JOptionPane.showMessageDialog(null, output);
    }
    
   /* public void exit()
    {
        JOptionPane.showMessageDialog(null, "Kamelot awaits! ",
                                      GetName(), 1);
    }*/
    
    
    public static void main(String[] args)
    {
        
          //System.out.println("Welcome to Camelot!\n");
        
        q8 knight = new q8();
        
        knight.getUserInput();
        knight.PopupOutput();
         //knight.exit();
        //System.out.println("Already I am going to clean the table!\n");
        
    } // end main
    
    
    
    
    
}


