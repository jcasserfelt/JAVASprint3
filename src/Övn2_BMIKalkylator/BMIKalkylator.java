package Övn2_BMIKalkylator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BMIKalkylator  extends JFrame implements ActionListener{
    
    JLabel nameLabel = new JLabel("Namn:");
    JLabel weightLabel = new JLabel("Vikt i kilo:");
    JLabel lengthLabel = new JLabel("Längd i cm:");
    JTextField name = new JTextField(30);
    JTextField weight = new JTextField(30);
    JTextField length = new JTextField(30);
    JLabel finalVerdict = new JLabel(" ");
    
    JPanel questions = new JPanel();
    JPanel answers = new JPanel();
    JPanel finalVerdictPanel = new JPanel();
    
    public BMIKalkylator () {
        
        //lägger ut delpanelerna
        setLayout(new BorderLayout());
        add("West", questions);      
        add("East", answers);   
        add("South", finalVerdictPanel); 
        
        //placerar ut komponenter
        questions.setLayout(new GridLayout(3,1));
        questions.add(nameLabel);
        questions.add(weightLabel);
        questions.add(lengthLabel);
        answers.setLayout(new GridLayout(3,1));
        answers.add(name);
        answers.add(weight);
        answers.add(length);
        finalVerdictPanel.add(finalVerdict);
        
        //add actionlisteners
        name.addActionListener(this);
        weight.addActionListener(this);
        length.addActionListener(this);

        //finishing touches
        pack(); 
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static double getBMI(double weight, double length){
        double lengthInMeter = length/100;
        return weight/(lengthInMeter*lengthInMeter);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //När text har skrivits i någon av textrutorna
        if (ae.getSource() == name || ae.getSource() == weight 
                || ae.getSource() == length) {
            
            //Using scanner for easy Double parsing
            Scanner scLength = new Scanner(length.getText());
            Scanner scWeight = new Scanner(weight.getText());
            if (scLength.hasNextDouble() && scWeight.hasNextDouble()){
                double enteredLength = scLength.nextDouble();
                double enteredWeight = scWeight.nextDouble();
                finalVerdict.setText(String.format("Hej %s. "
                        + "Ditt BMI är %.2f.", name.getText(), 
                        getBMI(enteredWeight, enteredLength)));
            }
        }
    }


    public static void main(String args[]){
        BMIKalkylator bmi = new BMIKalkylator();
    }
    
}
