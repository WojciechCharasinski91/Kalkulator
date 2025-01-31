package Kal;

import javax.swing.*;
import java.awt.*;

public class Main {
    private JFrame frame;
    private JTextField textField;
    private String operator;
    private double num1, num2, result;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Kalkulator window = new Kalkulator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}

