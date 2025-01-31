package Kal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator {
    protected JFrame frame;
    private JTextField textField;
    private String operator;
    private double num1, num2, result;
    boolean dot = true;


    public Kalkulator() {
        frame = new JFrame();
        frame.setTitle("Kalkulator");
        frame.setBounds(100, 100, 350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        textField = new JTextField();
        textField.setBounds(10, 11, 310, 40);
        frame.getContentPane().add(textField);
        textField.setColumns(10);



        JButton button7 = new JButton("7");
        button7.setBounds(10,60,70, 50);
        frame.getContentPane().add(button7);
        button7.addActionListener(this::buttonClicked);

        JButton button8 = new JButton("8");
        button8.setBounds(90,60,70,50);
        frame.getContentPane().add(button8);
        button8.addActionListener(this::buttonClicked);

        JButton button9 = new JButton("9");
        button9.setBounds(170,60,70,50);
        frame.getContentPane().add(button9);
        button9.addActionListener(this::buttonClicked);

        JButton buttonDzielenie = new JButton("/");
        buttonDzielenie.setBounds(250,60,70,50);
        frame.getContentPane().add(buttonDzielenie);
        buttonDzielenie.addActionListener(this::buttonClicked);

        JButton button4 = new JButton("4");
        button4.setBounds(10,120,70,50);
        frame.getContentPane().add(button4);
        button4.addActionListener(this::buttonClicked);

        JButton button5 = new JButton("5");
        button5.setBounds(90,120,70,50);
        frame.getContentPane().add(button5);
        button5.addActionListener(this::buttonClicked);

        JButton button6 = new JButton("6");
        button6.setBounds(170,120,70,50);
        frame.getContentPane().add(button6);
        button6.addActionListener(this::buttonClicked);

        JButton buttonMnozenie = new JButton("*");
        buttonMnozenie.setBounds(250,120,70,50);
        frame.getContentPane().add(buttonMnozenie);
        buttonMnozenie.addActionListener(this::buttonClicked);

        JButton button1 = new JButton("1");
        button1.setBounds(10,180,70,50);
        frame.getContentPane().add(button1);
        button1.addActionListener(this::buttonClicked);

        JButton button2 = new JButton("2");
        button2.setBounds(90, 180,70,50);
        frame.getContentPane().add(button2);
        button2.addActionListener(this::buttonClicked);

        JButton button3 = new JButton("3");
        button3.setBounds(170,180,70,50);
        frame.getContentPane().add(button3);
        button3.addActionListener(this::buttonClicked);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(250,180,70,50);
        frame.getContentPane().add(buttonMinus);
        buttonMinus.addActionListener(this::buttonClicked);

        JButton button0 = new JButton("0");
        button0.setBounds(10,240,70,50);
        frame.getContentPane().add(button0);
        button0.addActionListener(this::buttonClicked);

        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(90,240,70,50);
        frame.getContentPane().add(buttonDot);
        buttonDot.addActionListener(this::buttonClicked);

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(170,240,70,50);
        frame.getContentPane().add(buttonEqual);
        buttonEqual.addActionListener(this::buttonClicked);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(250,240,70,50);
        frame.getContentPane().add(buttonPlus);
        buttonPlus.addActionListener(this::buttonClicked);

        JButton buttonClear = new JButton("Wyczyść");
        buttonClear.setBounds(10,300,310,50);
        frame.getContentPane().add(buttonClear);
        buttonClear.addActionListener(this::buttonClicked);

    }

    private void buttonClicked(ActionEvent e) {
        String text = e.getActionCommand();

        if (text.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
            }
            textField.setText(String.valueOf(result));
            dot = true;
        } else if (text.equals("/") || text.equals("*") || text.equals("-") || text.equals("+")) {
            operator = text;
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            dot = true;
        }else if(text.equals("Wyczyść")) {
            textField.setText("");
            dot = true;
        } else if(text.equals(".")){
            if(dot){
                dot = false;
                textField.setText(textField.getText() + text);
            }
        } else {
            textField.setText(textField.getText() + text);
        }
    }
}
