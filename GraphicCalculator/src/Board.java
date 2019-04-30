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
    private String register;
    private int[] num;
    private boolean onceOnly;
    private int tempNum; /*The value of the num that it is currently on*/
    
    /*Space*/
    
    
    /*
    * The default constructor that initializes the instance variables.
    */
    public Board()
    {
        newCal = new Calculator();
        operationName = "";
        register = "";
        num = new int[100];
        tempNum = 0;
        onceOnly = false;
       
        
        /*Now create the buttons for the board*/
        JLabel textField = new JLabel("0");
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
        
        add.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Set the textfield*/
                if(onceOnly == false)
                {
                textField.setText( "+");
                
                num[1] = Integer.parseInt(register);
                
                operationName = "add";
                
                register = "";
                }
                
                
            }
        
        });
        
        subtract.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Set the textfield*/
                if(onceOnly == false)
                {
                textField.setText( "-");
                
                num[1] = Integer.parseInt(register);
                
                operationName = "subtract";
                
                register = "";
                }
                
            }
        
        });
        
        
        multiply.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Set the textfield*/
                if(onceOnly == false)
                {
                textField.setText( "*");
                
                num[1] = Integer.parseInt(register);
                
                operationName = "multiply";
                
                register = "";
                }
                
            }
        
        });
        
        divide.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Set the textfield*/
                if(onceOnly == false)
                {
                    textField.setText( "/");
                
                    num[1] = Integer.parseInt(register);
                
                    operationName = "divide";
                
                    register = "";
                }
                
                
            }
        
        });
        
        equal.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                /*Perform operation all the numbers*/
                if(onceOnly == false)
                {
                num[2] = Integer.parseInt(register);
                
                
                if(operationName == "add")
                {
                    newCal.add(num[1], num[2]);
                }
                else
                if(operationName == "subtract")
                {
                    newCal.subtract(num[1], num[2]);
                }
                else
                if(operationName == "multiply")
                {
                    newCal.multiply(num[1], num[2]);
                }
                else
                if(operationName == "divide")
                {
                    newCal.divide(num[1], num[2]);
                }
                
                register = "";
                
                textField.setText("" + newCal.getCurrentDisplay());
                
                onceOnly = true;
               
                }
                
                
            }
        });
        
        
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
                /*Add zero to the register*/
                if(register.length() <= 5)
                {
                    register += "0";
                }
                onceOnly = false;
                textField.setText(register);
            }
        });
        
        one.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                if(register.length() <= 5)
                {
                    register += "1";     
                }
                onceOnly = false;
                textField.setText(register);
       
            }
        });
        
        two.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add two to the register*/
                if(register.length() <= 5)
                {
                    register += "2";     
                }
                onceOnly = false;
                textField.setText(register);
       
            }
        });
        
        three.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                if(register.length() <= 5)
                {   
                    register += "3";
                }     
                onceOnly = false;
                textField.setText(register);
       
            }
        });
        
        four.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                if(register.length() <= 5)
                {   
                    register += "4";
                }     
                onceOnly = false;
                textField.setText(register);
       
            }
        });
        
        five.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                if(register.length() <= 5)
                {   
                    register += "5";
                }     
                onceOnly = false;
                textField.setText(register);
       
            }
        });
        
        six.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                if(register.length() <= 5)
                {  
                    register += "6";
                }     
                onceOnly = false;
                textField.setText(register);
       
            }
        });
        
        
        seven.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                if(register.length() <= 5)
                {   
                    register += "7";
                }     
                onceOnly = false;
                textField.setText(register);
       
            }
        });
        
        eight.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                if(register.length() <= 5)
                {   
                    register += "8";
                }     
                onceOnly = false;
                textField.setText(register);
       
            }
        });
        
        nine.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                /*Add one to the register*/
                if(register.length() <= 5)
                {   
                    register += "9";
                }     
                onceOnly = false;
                textField.setText(register);
       
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
