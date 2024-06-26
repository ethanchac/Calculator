import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;

public class calculatorF extends JFrame{
    calculatorF(){
        this.add(new calculatorPanel());
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}