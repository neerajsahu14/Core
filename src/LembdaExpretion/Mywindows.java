package LembdaExpretion;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Mywindows {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My widows");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        JButton button = new JButton("click me !!");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("button click");
             JOptionPane.showMessageDialog(null, "hey Bottun click");
                
            }
            
        });
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
