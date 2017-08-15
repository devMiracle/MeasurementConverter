package conversion.view;

import conversion.model.Conversion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class viewTry extends JFrame{
    JPanel panel1, panel2;
    JLabel input1,answer;
    JTextField fieldInput1,fieldAnswer;
    JButton btnFeetToInch, btnFeetToYard;
    GridLayout g1;
    Container contentPane;
    
    public viewTry(){}
    public viewTry(String title){
        super(title);
        g1 = new GridLayout(0,2);
        panel1 = new JPanel(g1);
        panel2 = new JPanel();
        
        contentPane = getContentPane();
        
        input1 = new JLabel("Input 1");
        answer = new JLabel("Answer");
        
        fieldInput1 = new JTextField();
        fieldAnswer = new JTextField();
        
        fieldAnswer.setBackground(Color.YELLOW);
        fieldAnswer.setEditable(false);
        
        btnFeetToInch = new JButton("Feet To Inch");
        btnFeetToYard = new JButton("Feet To Yard");
        /**
         * USING THE INNER CLASS
         */
        //btnAdd.addActionListener(new Handler());
        
        /**
         * USING THE ANNONYMPOUS CLASS WAY
         * In the annonymous you have to implement the method class in the addActionListener Method
         */
        btnFeetToInch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if(fieldInput1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "No Value To Convert: Empty Field");
                }else if(!fieldInput1.getText().matches("\\d+")){
                    JOptionPane.showMessageDialog(null, "Field must be digit");
                }else{
                    double input1 = Double.parseDouble(fieldInput1.getText());
                    
                    Conversion cal = new Conversion();
                   double convert1 = cal.feetToInch(input1);
                   fieldAnswer.setText(String.valueOf(convert1));
                   
                   }
                }
             }
           );
         btnFeetToYard.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               if(fieldInput1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "No Value To Convert: Empty Field");
                }else if(!fieldInput1.getText().matches("\\d+")){
                    JOptionPane.showMessageDialog(null, "Field must be digit");
                }else{
                    double input1 = Double.parseDouble(fieldInput1.getText());
                    
                    Conversion cal = new Conversion();
                   double convert1 = cal.feetToYard(input1);
                   fieldAnswer.setText(String.valueOf(convert1));
                   
                   }
                }
             }
           );
        
        panel1.add(input1);
        panel1.add(fieldInput1);
        panel1.add(answer);
        panel1.add(fieldAnswer);
        
        panel2.add(btnFeetToInch);
        panel2.add(btnFeetToYard);
        
        contentPane.add(panel1, BorderLayout.NORTH);
        contentPane.add(panel2,BorderLayout.SOUTH);
    }
}

    

