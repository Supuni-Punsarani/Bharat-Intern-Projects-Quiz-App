package quiz.app;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 150, 300, 250);
        add(image);

        JLabel heading = new JLabel("Thank you " + name + " for playing Quizizz");
        heading.setBounds(100, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        heading.setForeground(new Color(128, 0, 128));
        add(heading);

        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        lblscore.setForeground(new Color(128, 0, 128));
        add(lblscore);

        JButton playAgain = new JButton("Play Again");
        playAgain.setBounds(320, 270, 120, 30);
        playAgain.setBackground(new Color(128, 0, 128));
        playAgain.setForeground(Color.WHITE);
        playAgain.addActionListener(this);
        add(playAgain);

        JButton exit = new JButton("Exit");
        exit.setBounds(480, 270, 120, 30);
        exit.setBackground(new Color(128, 0, 128));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);

        if (score == 100) {
            JLabel congrats = new JLabel("Congratulations!");
            congrats.setBounds(370, 350, 300, 30);
            congrats.setFont(new Font("Tahoma", Font.PLAIN, 26));
            congrats.setForeground(new Color(128, 0, 128));
            add(congrats);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Play Again")) {
            setVisible(false);
            new Rules("User");
        } else if (ae.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Score("User", 100); // Example usage, replace with actual score
    }
}
