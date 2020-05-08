import javax.swing.JOptionPane;

import java.text.NumberFormat;
import java.util.Locale;

public class q6
{
                          // private String name;
    private int height;  //height health
    private int length; //lenght battles
    private int width; // width; age
    private int price;//price per gallon gold
                     // private Stars star;
    
    private int calcul; //claculation ints
    
    public q6()
    {
       // name = "Mister";
        
        height = 100;
        length = 0;
        width = 9;
        price=5;
        
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
    public int Getwidth()
    {
        return width;
    }
   public int Getprice()
    {
        return price;
    }
    
  /*  public Stars GetStars()
    {
        return star;
    }*/
    
    
    public void getUserInput(){
        
        
      //  SetName(JOptionPane.showInputDialog(
     //     "Enter your Knight's name", "Sir Jav-a-lot"));
        
        SetPrice(Integer.parseInt(JOptionPane.showInputDialog(
                                                             "Paint price per gallon: ", "1234")));
        
        SetLength(Integer.parseInt(JOptionPane.showInputDialog(
                                                                "Length: ", "6")));
        SetWidth(Integer.parseInt(JOptionPane.showInputDialog(
                                                            "Width: " , "9")));
        
        SetHeight(Integer.parseInt(JOptionPane.showInputDialog(
                                                               "Height: ", "94")));
        
    
        
       
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
    
    public void SetWidth(int Age)
    {
        width = Age;
    }
    
    public void SetPrice(int Price)
    {
        price = Price;
    }
    
   /* public void SetStars()
    {
        star = new Stars();
    }*/
    
    
    // **END OF SET AND GET METHODS**
    
    
    public void PopupOutput(){
        
        calcul = price*(length*height*2+width*height*2);
        
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String currency = format.format(calcul);
        
       /* String output;
        output= "Knight Name: " + GetName() + "\n"
        + "Knight Health: " + GetHealth() + "\n"
        + "Knight Battles: " + GetBattles() + "\n"
        + "Knight Age: " + GetAge() + "\n"
        + "Knight Gold: " + GetGold() + "\n"
        + star.printStars();*/
        
        
        
           //DecimalFormat df = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null, "Your payment is " + currency); //df.format(calcul));
        
         //String.format("Your monthly payment is $%.2f",  totalCost)
        //'System.out.println(String.format("%,.2f", calcul));
       // JOptionPane.showMessageDialog(null, output);
    }
    
   /* public void exit()
    {
        JOptionPane.showMessageDialog(null, "Kamelot awaits! ",
                                      GetName(), 1);
    }*/
    
    
    public static void main(String[] args)
    {
        
          //System.out.println("Welcome to Camelot!\n");
        
        q6 knight = new q6();
        
        knight.getUserInput();
        knight.PopupOutput();
         //knight.exit();
        //System.out.println("Already I am going to clean the table!\n");
        
    } // end main
    
    
    
    
    
}

