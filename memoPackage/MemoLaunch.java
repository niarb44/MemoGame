package memoPackage;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Launch extends JFrame{
    JButton button1;
    JButton button2;
    JButton button3;
    static int pairs;
            
    Launch(){
    button1 = new JButton("20 cards");
    button2 = new JButton("30 cards");
    button3 = new JButton("40 cards");    
        setLayout(new GridLayout(3, 1));
        setTitle("Number of pairs");
        
         setPreferredSize(new Dimension(500, 500));
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocation(300, 150);
            pack();
            add(button1);
            add(button2);  
            add(button3);            
            button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1){
            pairs=10;
            MemoFrame frame = new MemoFrame();
            frame.setLayout(new GridLayout(4, 5));
            setVisible(false);
            frame.setVisible(true);
            }   
            });
            
            button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){
            pairs=15;
            MemoFrame frame = new MemoFrame();
            frame.setLayout(new GridLayout(5, 6));
            setVisible(false);
            frame.setVisible(true);
            }   
            });

            button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e3){
            pairs=20;
            MemoFrame frame = new MemoFrame();            
            frame.setLayout(new GridLayout(5, 8));
            setVisible(false);
            frame.setVisible(true);
            }   
            });            
    }
    
public static  void main(String[] args){
    
Launch frame1 = new Launch();
frame1.setVisible(true);
}
            
}
