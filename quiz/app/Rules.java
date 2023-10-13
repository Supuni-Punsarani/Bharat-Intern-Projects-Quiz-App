package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Hi " + name + "! " + "Welcome " + "to Quizizz");
        heading.setBounds(150, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(128, 0, 128));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(30, 95, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>" + 
            "1. You are trained to be a programmer and not a story teller, answer point to point." + "<br><br>" +
            "2. Ensure your device, internet connection, and browser are all in working order. " + "<br><br>" +
            "3. Clear your workspace of any unnecessary items and have all necessary materials (e.g., pen, paper) ready." + "<br><br>" +
            "4. Pay attention to time limits for each question or section." + "<br><br>" +
            "5. Start with questions you're confident about." + "<br><br>" +
            "6. Before submitting, review your answers to ensure you haven't missed any questions or made any careless errors." + "<br><br>" +
            "7. Keep an eye on the timer and submit your quiz before the specified deadline." + "<br><br>" +
            "8. Good luck for your quiz." + "<br><br>" +
            "<html>"
        );
        add(rules);

       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/rules.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(800, 150, 300, 400);
        add(image);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(128, 0, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(128, 0, 128));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(1000, 600);
        setLocation(200, 50);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
