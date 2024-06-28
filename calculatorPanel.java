import java.io.*;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

public class calculatorPanel extends JPanel implements ActionListener{
    public String inp1 = "";
    public String inp2 = "";
    public int var = 0;
    public boolean change = false;
    public boolean ansb = false;
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
    JButton be = new JButton("=");
    JButton bClear = new JButton("Clear");
    JLabel label = new JLabel("");
    calculatorPanel(){
        this.setLayout(null);
        this.setPreferredSize(new Dimension(250, 250));
        this.setFocusable(true);
        panel.setLayout(null);
        b1.setSize(50, 50);
        b1.setLocation(0,150);
        b1.addActionListener(this);
        this.add(b1);
        b2.setSize(50, 50);
        b2.setLocation(50,150);
        b2.addActionListener(this);
        this.add(b2);
        b3.setSize(50, 50);
        b3.setLocation(100,150);
        b3.addActionListener(this);
        this.add(b3);
        b4.setSize(50, 50);
        b4.setLocation(0,100);
        b4.addActionListener(this);
        this.add(b4);
        b5.setSize(50, 50);
        b5.setLocation(50,100);
        b5.addActionListener(this);
        this.add(b5);
        b6.setSize(50, 50);
        b6.setLocation(100,100);
        b6.addActionListener(this);
        this.add(b6);
        b7.setSize(50, 50);
        b7.setLocation(0,50);
        b7.addActionListener(this);
        this.add(b7);
        b8.setSize(50, 50);
        b8.setLocation(50,50);
        b8.addActionListener(this);
        this.add(b8);
        b9.setSize(50, 50);
        b9.setLocation(100,50);
        b9.addActionListener(this);
        this.add(b9);
        b0.setSize(150, 50);
        b0.setLocation(0,200);
        b0.addActionListener(this);
        this.add(b0);
        bp.setSize(50, 50);
        bp.setLocation(150,150);
        bp.addActionListener(this);
        this.add(bp);
        bs.setSize(50, 50);
        bs.setLocation(200,150);
        bs.addActionListener(this);
        this.add(bs);
        bm.setSize(50, 50);
        bm.setLocation(150,100);
        bm.addActionListener(this);
        this.add(bm);
        bd.setSize(50, 50);
        bd.setLocation(200,100);
        bd.addActionListener(this);
        this.add(bd);
        be.setSize(100, 50);
        be.setLocation(150,200);
        be.addActionListener(this);
        this.add(be);
        bClear.setSize(100, 50);
        bClear.setLocation(150,50);
        bClear.addActionListener(this);
        this.add(bClear);
        label.setSize(250, 50);
        label.setLocation(0,0);
        this.add(label);
    }
    //public void paintComponent(Graphics g){

    //}
    public void actionPerformed(ActionEvent e){
        double ans = 0;
        int v1 = 0;
        int v2 = 0;
        //1
        if(e.getSource() == b1){
            if(change == false){
                inp1 += "1";
            }else{
                inp2 += "1";
            }
        //2
        }else if(e.getSource() == b2){
            if(change == false){
                inp1 += "2";
            }else{
                inp2 += "2";
            }
        //3
        }else if(e.getSource() == b3){
            if(change == false){
                inp1 += "3";
            }else{
                inp2 += "3";
            }
        //4
        }else if(e.getSource() == b4){
            if(change == false){
                inp1 += "4";
            }else{
                inp2 += "4";
            }
        //5
        }else if(e.getSource() == b5){
            if(change == false){
                inp1 += "5";
            }else{
                inp2 += "5";
            }
        //6
        }else if(e.getSource() == b6){
            if(change == false){
                inp1 += "6";
            }else{
                inp2 += "6";
            }
        //7
        }else if(e.getSource() == b7){
            if(change == false){
                inp1 += "7";
            }else{
                inp2 += "7";
            }
        //8
        }else if(e.getSource() == b8){
            if(change == false){
                inp1 += "8";
            }else{
                inp2 += "8";
            }
        //9
        }else if(e.getSource() == b9){
            if(change == false){
                inp1 += "9";
            }else{
                inp2 += "9";
            }
        //0
        }else if(e.getSource() == b0){
            if(change == false){
                inp1 += "0";
            }else{
                inp2 += "0";
            }
        }else if(e.getSource() == bp){
            change = true;
            var = 1;
        }else if(e.getSource() == bs){
            change = true;
            var = 2;
        }else if(e.getSource() == bm){
            change = true;
            var = 3;
        }else if(e.getSource() == bd){
            change = true;
            var = 4;
        }else if(e.getSource() == bClear){
            inp1 = "";
            inp2 = "";
            change = false;
        }
        if(e.getSource() == be){
            v1 = Integer.valueOf(inp1);
            v2 = Integer.valueOf(inp2);
            //System.out.println("var is "+var);
            switch(var){
                case 1:
                    System.out.println("adding");
                    ans = v1 + v2;
                    ansb = true;
                    break;
                case 2:
                    System.out.println("subtracting");
                    ans = v1 - v2;
                    ansb = true;
                    break;
                case 3:
                    System.out.println("multiplying");
                    ans = v1 * v2;
                    ansb = true;
                    break;
                case 4:
                    System.out.println("dividing");
                    ans = v1 / v2;
                    ansb = true;
                    break;
                default:
                    System.out.println("nothing happen");
            }
            label.setText(String.valueOf(ans));
        }
        if(change == false){
            label.setText(inp1);
        }else{
            label.setText(inp2);
        }
        if(ansb == true){
            label.setText(String.valueOf(ans));
            ansb = false;
        }
    }

}
