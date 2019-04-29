import java.math.*;
/*
 * This is the class where a calculator can be created to perform a variety of 
 * mathematical operations.
 */

/**
 *
 * @author Syed Yousuf
 */
public class Calculator 
{
    private double currentDisplay;
    
    
    /*Defualt Constructor*/
    public Calculator()
    {
        currentDisplay = 0;
    }
    
    /*
    * Return the currentDisplay value
    *@return currentDisplay
    */
    public double getCurrentDisplay()
    {
        return currentDisplay;
    }
    
    
    /*
    * Adds two numbers and then sets the result to the display.
    *
    *@param num1 The first number
    *@param num2 The second number
    */
    public void add(int num1, int num2)
    {
        currentDisplay = (double)num1 + num2;
    }
    
    /*
    * Subtracts two numbers and then sets the result to display
    *@param num1 The first number
    *@param num2 The second number
    */
    public void subtract(int num1, int num2)
    {
        currentDisplay = (double)num1 - num2;
    }
    
    /*
    * Multiplies the two numbers and then sets the result to display
    *@param num1 The first number
    *@param num2 The second number
    */
    public void multiply(int num1, int num2)
    {
        currentDisplay = (double)num1 * num2;
    }
    
    /*
    * Divides the two numbers and then sets the result to display
    *@param num1 The first number
    *@param num2 The second number
    */
    public void divide(int num1, int num2)
    {
        /*Set currentdisplay value*/
        currentDisplay = (double)num1/num2;
    }
    
    /*
    * The string representation of this class
    */
    @Override
    public String toString()
    {
        
        return "" + currentDisplay; 
    }
    
    
    public static void main(String []args)
    {
        
        Calculator c1 = new Calculator();
        
        c1.add(1,2);
        System.out.println(c1.getCurrentDisplay());
        
        c1.subtract(4,2);
        System.out.println(c1.getCurrentDisplay());
        
        c1.multiply(3,4);
        System.out.println(c1.getCurrentDisplay());
        
        c1.divide(1,3);
        System.out.println(c1.getCurrentDisplay());
    }
}
