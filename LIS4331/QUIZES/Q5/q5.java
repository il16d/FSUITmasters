

import javax.swing.JOptionPane;
public class q5
{
    
    int health;
    boolean isEven=false;
    String output;
    
    public q5(){health=1;}
    
    public void getUserInput(){
        
        
        
        
        SetHealth(Integer.parseInt(JOptionPane.showInputDialog(
                                                               "Enter integer " , "94")));
        
        
    }
    
    
    
    
    public void SetHealth( int Health)
    {
        health = Health;
    }
    
    
    
  public void PopupOutput(){
        
        if(health%2==0){
            
            isEven=true;
            
       // String output;
        output= health + " Is even";}
        else{
                output= health + " Is not Even";
        
        //JOptionPane.showMessageDialog(null, output);
        
            } JOptionPane.showMessageDialog(null, output);
        
    }
        
    
    
    
    public static void main(String[] args)
    {
        q5 k = new q5();
        
        k.getUserInput();
        k.PopupOutput();

    }//close main
}//close class
