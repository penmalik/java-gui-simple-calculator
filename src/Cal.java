import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal{

    private JLabel jLabel;
    private JTextField input;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton plus;
    private JButton minus;
    private JButton mul;
    private JButton div;
    private JButton mod;
    private JButton equal_;
    private JButton clear;
    private JButton del;
    private JRadioButton off;
    private JRadioButton on;

    double number, ans;
    int calculation;
    private JLabel success;

    public static void main(String[] args) throws ScriptException {
        Cal calculator = new Cal();
        calculator.setupGUI();
    }

    public void arith(){

        switch (calculation){
            case 1: // addition
                ans = number + Double.parseDouble(input.getText());
                input.setText(Double.toString(ans));
                break;
            case 2: // subtraction
                ans = number - Double.parseDouble(input.getText());
                input.setText(Double.toString(ans));
                break;
            case 3: // multiplication
                ans = number * Double.parseDouble(input.getText());
                input.setText(Double.toString(ans));
                break;
            case 4: // division
                ans = number / Double.parseDouble(input.getText());
                input.setText(Double.toString(ans));
                break;
        }
    }

    public void setupGUI(){
        // GUI -> GRAPHICAL USER INTERFACE

        JPanel jpanel = new JPanel();
        JFrame jframe = new JFrame();

        // SETTING THE HEIGHT AND WIDTH OF THE MAIN WINDOW
        jframe.setSize(400, 450);
        // SETTING THE EXIT FUNCTION
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ADDING THE PANEL CLASS TO THE FRAME
        jframe.add(jpanel);

        // CHANGING THE SETTING OF AUTOMATIC ALIGNMENT TO NULL
        jpanel.setLayout(null);

        // creating instance of class JLABEL
        jLabel = new JLabel("CALCULATOR");

        jLabel.setBounds(150, 0, 120, 50);
        jpanel.add(jLabel);

        input = new JTextField(20);
        input.setBounds(40, 40, 280, 25);
        jpanel.add(input);

        b1 = new JButton("1");
        b1.setBounds(40, 80, 80, 25);
        jpanel.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b1.getText());
            }
        });

        b2 = new JButton("2");
        b2.setBounds(140, 80, 80, 25);
        jpanel.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b2.getText());
            }
        });

        b3 = new JButton("3");
        b3.setBounds(240, 80, 80, 25);
        jpanel.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b3.getText());
            }
        });

        b4 = new JButton("4");
        b4.setBounds(40, 120, 80, 25);
        jpanel.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b4.getText());
            }
        });

        b5 = new JButton("5");
        b5.setBounds(140, 120, 80, 25);
        jpanel.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b5.getText());
            }
        });

        b6 = new JButton("6");
        b6.setBounds(240, 120, 80, 25);
        jpanel.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b6.getText());
            }
        });

        b7 = new JButton("7");
        b7.setBounds(40, 160, 80, 25);
        jpanel.add(b7);

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b7.getText());
            }
        });

        b8 = new JButton("8");
        b8.setBounds(140, 160, 80, 25);
        jpanel.add(b8);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b8.getText());
            }
        });

        b9 = new JButton("9");
        b9.setBounds(240, 160, 80, 25);
        jpanel.add(b9);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b9.getText());
            }
        });

        b0 = new JButton("0");
        b0.setBounds(40, 200, 80, 25);
        jpanel.add(b0);
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + b0.getText());
            }
        });

        plus = new JButton("+");
        plus.setBounds(140, 200, 80, 25);
        jpanel.add(plus);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                input.setText(input.getText() + plus.getText());
                number = Double.parseDouble(input.getText());
                calculation = 1;
                input.setText("");
            }
        });

        minus = new JButton("-");
        minus.setBounds(240, 200, 80, 25);
        jpanel.add(minus);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                input.setText(input.getText() + minus.getText());
                number = Double.parseDouble(input.getText());
                calculation = 2;
                input.setText("");
            }
        });

        clear = new JButton("C");
        clear.setBounds(40, 240, 80, 25);
        jpanel.add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");
            }
        });

        mul = new JButton("*");
        mul.setBounds(140, 240, 80, 25);
        jpanel.add(mul);

        mul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                input.setText(input.getText() + mul.getText());
                number = Double.parseDouble(input.getText());
                calculation = 3;
                input.setText("");
            }
        });

        div = new JButton("/");
        div.setBounds(240, 240, 80, 25);
        jpanel.add(div);

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText(input.getText() + div.getText());
                number = Double.parseDouble(input.getText());
                calculation = 4;
                input.setText("");
            }
        });

        equal_ = new JButton("=");
        equal_.setBounds(140, 280, 180, 25);
        jpanel.add(equal_);
        equal_.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arith();
            }
        });



        del = new JButton("del");
        del.setBounds(40, 280, 80, 25);
        jpanel.add(del);
        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = input.getText().length();
                int num = input.getText().length() - 1;
                String store;

                if(len > 0){
                    StringBuilder back = new StringBuilder(input.getText());
                    back.deleteCharAt(num);
                    store = back.toString();
                    input.setText(store);
                }
            }
        });

        off = new JRadioButton("off");
        off.setBounds(40, 305, 80, 25);
        jpanel.add(off);

        off.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();
            }
        });

        on = new JRadioButton("on");
        on.setBounds(40, 325, 80, 25);
        jpanel.add(on);

        on.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enable();
            }
        });

        // FRAME VISIBILITY
        jframe.setVisible(true);
    }

    public void disable(){
        on.setEnabled(true);
        off.setEnabled(false);
        input.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
        b0.setEnabled(false);
        equal_.setEnabled(false);
        del.setEnabled(false);
        clear.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        div.setEnabled(false);
        mul.setEnabled(false);
    }

    public void enable(){
        on.setEnabled(false);
        off.setEnabled(true);
        input.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b0.setEnabled(true);
        equal_.setEnabled(true);
        del.setEnabled(true);
        clear.setEnabled(true);
        plus.setEnabled(true);
        minus.setEnabled(true);
        div.setEnabled(true);
        mul.setEnabled(true);
    }



}
