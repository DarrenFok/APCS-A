package Lab21b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JPanel implements ActionListener {
    //Fields
    JLabel operand1;
    JLabel operand2;
    JLabel result;

    JTextField operand1Field; //First number
    JTextField operand2Field; //Second number
    JTextField resultField; //The answer

    int state = 0;

    public Display(){
        setLayout(null); //Layout
        setBackground(Color.lightGray); //Background color

        //Create fields
        operand1Field = new JTextField(10);
        operand2Field = new JTextField(10);
        resultField = new JTextField(10);

        //Create labels
        operand1 = new JLabel("First number:");
        operand2 = new JLabel("Second number:");
        result = new JLabel("Result:");

        //Solve button
        JButton btn1 = new JButton("Add");
        JButton btn2 = new JButton("Subtract");
        JButton btn3 = new JButton("Multiply");
        JButton btn4 = new JButton("Divide");

        //Add items
        //Enter numbers
        operand1.setBounds(100,25,75,25);
        add(operand1);
        operand1Field.setBounds(225,25,125,25);
        add(operand1Field);
        operand2.setBounds(400,25,100,25);
        add(operand2);
        operand2Field.setBounds(525,25,125,25);
        add(operand2Field);

        //Operator buttons
        btn1.setBounds(100,100,100,50);
        add(btn1);
        btn2.setBounds(250,100,100,50);
        add(btn2);
        btn3.setBounds(400,100,100,50);
        add(btn3);
        btn4.setBounds(550,100,100,50);
        add(btn4);

        //Results
        result.setBounds(250,200,40,25);
        add(result);
        resultField.setBounds(330,200,170,25);
        add(resultField);

        //Add action listeners
        operand1Field.addActionListener(this);
        operand2Field.addActionListener(this);
        resultField.addActionListener(this);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Double d1 = Double.parseDouble(operand1Field.getText());
        Double d2 = Double.parseDouble(operand2Field.getText());

        if(e.getActionCommand().equals("Add")){
            Double d3 = d1 + d2;
            resultField.setText("Your result is: " + d3);
            setBackground(new Color(255,51,51));
            this.state = 1;
        }
        else if(e.getActionCommand().equals("Subtract")){
            Double d3 = d1 - d2;
            resultField.setText("Your result is: " + d3);
            setBackground(new Color(51,153,255));
            this.state = 2;
        }
        else if(e.getActionCommand().equals("Multiply")){
            Double d3 = d1 * d2;
            resultField.setText("Your result is: " + d3);
            setBackground(Color.yellow);
            this.state = 3;
        }
        else if(e.getActionCommand().equals("Divide")){
            Double d3 = d1 / d2;
            resultField.setText("Your result is: " + d3);
            setBackground(Color.green);
            this.state = 4;
        }
    }
}
