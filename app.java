import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import javax.swing.JFrame;
import java.util.regex.*;

public class app {
    public static void main(String[] args) {
        // Declare pieces
        JFrame frame = new JFrame("Function identifier");
        JPanel panel = new JPanel();
        JPanel sc = new JPanel();
        JLabel label = new JLabel("What is the equ?: ");
        label.setForeground(Color.BLUE);
        JLabel label2 = new JLabel("Sqrt: ");
        label2.setForeground(Color.BLUE);
        JLabel label3 = new JLabel("Cbrt: ");
        label3.setForeground(Color.BLUE);
        JButton submit = new JButton("submit");
        JButton cbrt = new JButton("∛");
        JButton sqrt = new JButton("√");
        JButton reset = new JButton("reset");
        JTextField tf = new JTextField(10);
        // sqrt button function
        sqrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt1) {
                tf.setText(tf.getText() + "√");
            }
        });
        // cbrt button function
        cbrt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt1) {
                tf.setText(tf.getText() + "∛");
            }
        });
        // reset button function
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt2) {
                tf.setText("");
            }
        });
        // submit button function
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String equ = tf.getText();
                // quadratic checks
                boolean quad = Pattern.matches("\\d*x\\^2(?:\\+|-)\\d*x(?:\\+|-)\\d*|x\\^2(?:\\+|-)\\d*x(?:\\+|-)\\d*",
                        equ);
                boolean quad2 = Pattern.matches("\\d*x\\^2|x\\^2", equ);
                boolean quad3 = Pattern.matches("\\d*x\\^2(?:\\+|-)\\d*|x\\^2(?:\\+|-)\\d*", equ);
                boolean quad4 = Pattern.matches("\\d*x\\^2(?:\\+|-)\\d*x|x\\^2(?:\\+|-)\\d*x", equ);
                boolean quad5 = Pattern.matches("\\(x(?:\\+|-)(\\d)*\\)\\^2((?:\\+|-)\\d*)", equ);
                boolean quad6 = Pattern.matches("\\d*\\(x(?:\\+|-)(\\d)*\\)\\^2((?:\\+|-)\\d*)", equ);
                boolean quad7 = Pattern.matches("\\d*\\(x(?:\\+|-)\\d*\\)\\^2", equ);
                boolean quad8 = Pattern.matches("\\(x(?:\\+|-)\\d*\\)\\^2", equ);
                // cubic checks
                boolean cubic = Pattern.matches("\\d*x\\^3(?:\\+|-)\\d*x(?:\\+|-)\\d*|x\\^3(?:\\+|-)\\d*x(?:\\+|-)\\d*",
                        equ);
                boolean cubic2 = Pattern.matches("\\d*x\\^3|x\\^3", equ);
                boolean cubic3 = Pattern.matches("\\d*x\\^3(?:\\+|-)\\d*|x\\^3(?:\\+|-)\\d*", equ);
                boolean cubic4 = Pattern.matches("\\d*x\\^3(?:\\+|-)\\d*x|x\\^3(?:\\+|-)\\d*x", equ);
                boolean cubic5 = Pattern.matches("\\(x(?:\\+|-)(\\d)*\\)\\^3((?:\\+|-)\\d*)", equ);
                boolean cubic6 = Pattern.matches("\\d*\\(x(?:\\+|-)(\\d)*\\)\\^3((?:\\+|-)\\d*)", equ);
                boolean cubic7 = Pattern.matches("\\d*\\(x(?:\\+|-)\\d*\\)\\^3", equ);
                boolean cubic8 = Pattern.matches("\\(x(?:\\+|-)\\d*\\)\\^3", equ);
                // square root checks
                boolean sqrt1 = Pattern.matches("√x|\\d*√x", equ);
                boolean sqrt2 = Pattern.matches("√x(?:\\+|-)\\d*|\\d*√x(?:\\+|-)\\d*", equ);
                boolean sqrt3 = Pattern.matches("√x (?:\\+|-) \\d*|\\d*√x (?:\\+|-) \\d*", equ);
                boolean sqrt4 = Pattern.matches("√x(?:\\+|-)\\d* (?:\\+|-) \\d*|\\d*√x(?:\\+|-)\\d* (?:\\+|-) \\d*",
                        equ);
                // abs-val checks
                boolean abs1 = Pattern.matches("\\|x\\||\\d*\\|x\\|", equ);
                boolean abs2 = Pattern.matches("\\|x(?:\\+|-)\\d*\\||\\d*\\|x(?:\\+|-)\\d\\|*", equ);
                boolean abs3 = Pattern.matches("\\|x\\|(?:\\+|-)\\d*|\\d*\\|x\\|(?:\\+|-)\\d*", equ);
                boolean abs4 = Pattern
                        .matches("\\|x(?:\\+|-)\\d*\\|(?:\\+|-)\\d*|\\d*\\|x(?:\\+|-)\\d*\\|(?:\\+|-)\\d*", equ);
                // cbrt checks
                boolean cbrt1 = Pattern.matches("∛x|\\d*∛x", equ);
                boolean cbrt2 = Pattern.matches("∛x(?:\\+|-)\\d*|\\d*∛x(?:\\+|-)\\d*", equ);
                boolean cbrt3 = Pattern.matches("∛x (?:\\+|-) \\d*|\\d*∛x (?:\\+|-) \\d*", equ);
                boolean cbrt4 = Pattern.matches("∛x(?:\\+|-)\\d* (?:\\+|-) \\d*|\\d*∛x(?:\\+|-)\\d* (?:\\+|-) \\d*",
                        equ);
                // if elif else structure
                if (quad == true || quad2 == true || quad3 == true || quad4 == true || quad5 == true || quad6 == true
                        || quad7 == true || quad8 == true) {
                    JOptionPane.showMessageDialog(panel, "quadratic function");
                } else if (cubic == true || cubic2 == true || cubic3 == true || cubic4 == true || cubic5 == true
                        || cubic6 == true || cubic7 == true || cubic8 == true) {
                    JOptionPane.showMessageDialog(frame, "cubic function");
                } else if (sqrt1 == true || sqrt2 == true || sqrt3 == true || sqrt4 == true) {
                    JOptionPane.showMessageDialog(frame, "square root function");
                } else if (abs1 == true || abs2 == true || abs3 == true || abs4 == true) {
                    JOptionPane.showMessageDialog(frame, "absolute value function");
                } else if (cbrt1 == true || cbrt2 == true || cbrt3 == true || cbrt4 == true) {
                    JOptionPane.showMessageDialog(frame, "cube root function");
                } else {
                    JOptionPane.showMessageDialog(frame, "Could not identify equation try again");
                }
                tf.setText("");
            }
        });
        //adding stuff to special chars
        sc.add(label2);
        sc.add(sqrt);
        sc.add(label3);
        sc.add(cbrt);
        // adding stuff to panel
        panel.add(label);
        panel.add(tf);
        panel.add(submit);
        panel.add(reset);
        // add the panel to the frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, sc);
        frame.getContentPane().setBackground(Color.RED);
        // frame settings
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.pack();
        frame.setVisible(true);
    }
}
