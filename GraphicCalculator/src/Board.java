/*
 * This class provides the graphical user interface for the calculator
 */
import javax.swing.*;

/**
 *
 * @author Syed Yousuf
 */
public class Board 
{
    /*Instance Variables*/
    private Calculator newCal;
    
    /*
    * The default constructor that initializes the instance variables.
    */
    public Board()
    {
        newCal = new Calculator();
        
        /*Now create the buttons for the board*/
        
        /*Create the frame*/
        JFrame f= new JFrame("Graphic Calculator");
        
        /*Create the operation buttons*/
        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JButton equal = new JButton("=");
        
        add.setBounds(300,300,50,50);
        subtract.setBounds(300,350,50,50);
        multiply.setBounds(300,250,50,50);
        divide.setBounds(300,200,50,50);
        equal.setBounds(350,300,200,100);
        
        /*Create the numbers buttons*/
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        
        one.setBounds(50,300,50,50);
        two.setBounds(100,300,50,50);
        three.setBounds(150,300,50,50);
        
       
        /*Set the frame properties*/
        f.add(add);
        f.add(subtract);
        f.add(multiply);
        f.add(divide);
        f.add(equal);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.add(six);
        f.add(seven);
        f.add(eight);
        f.add(nine);
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        
        
    }
    
    /*
    * Test method
    */
    public static void main(String[]args)
    {
        Board b1 = new Board();
    }
    
    
    
}
