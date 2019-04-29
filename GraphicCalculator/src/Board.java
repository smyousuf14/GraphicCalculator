/*
 * This class provides the graphical user interface for the calculator
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

/**
 *
 * @author Syed Yousuf
 */
public class Board 
{
    /*Instance Variables*/
    private Calculator newCal;
    private String operationName;
    private int[] num;
    private int tempNum; /*The value of the num that it is currently on*/
    
    /*Constant*/
    private static String SPACE = "                                                                                                                                                        ";
    
    /*
    * The default constructor that initializes the instance variables.
    */
    public Board()
    {
        newCal = new Calculator();
        operationName = "";
        num = new int[2];
        tempNum = 0;
       
        
        /*Now create the buttons for the board*/
        JLabel textField = new JLabel(SPACE + "0");
        textField.setOpaque(true);
        textField.setForeground(Color.blue);
        textField.setBackground(Color.lightGray);
        textField.setBounds(0,0,500,50);
        
        /*Create the frame*/
        JFrame f = new JFrame("Graphic Calculator");
        
        /*Create the textfield*/
        
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
        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        
        zero.setBounds(50,350,150,50);
        one.setBounds(50,300,50,50);
        two.setBounds(100,300,50,50);
        three.setBounds(150,300,50,50);
        four.setBounds(50,250,50,50);
        five.setBounds(100,250,50,50);
        six.setBounds(150,250,50,50);
        seven.setBounds(50,200,50,50);
        eight.setBounds(100,200,50,50);
        nine.setBounds(150,200,50,50);
        
        zero.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add zero to the first temporary num*/
                num[tempNum] = 0;
                
                
                
                ;
                textField.setText(SPACE + "0");
            }
        });
        
        one.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add zero to the first temporary num*/
                num[tempNum] = 1;
                
                
                
                textField.setText(SPACE + "1");
                
                System.out.println(num[0] + num[1]);
               
                
            }
        });
        
        
        
        
        
        
       
        /*Set the frame properties*/
        f.add(zero);
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
        f.add(textField);
        
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
