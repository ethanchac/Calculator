import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class calculatorPanel extends JPanel implements ActionListener{
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bp = new JButton("+");
    JButton bs = new JButton("-");
    JButton bm = new JButton("X");
    JButton bd = new JButton("%");
    calculatorPanel(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(780, 1000));
        this.setFocusable(true);
        panel.setLayout(null);
        b1.setSize(50, 50);
        b1.setLocation(0,0);
        b1.addActionListener(this);
        this.add(b1);
    }
    public void paintComponent(Graphics g){

    }
    public void actionPerformed(ActionEvent e){

    }

}