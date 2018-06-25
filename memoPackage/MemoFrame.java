package memoPackage;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Frame extends JFrame{
    
Timer time;
MemoButton c;
MemoButton b;
MemoButton b1;
Object source;	
Object source1;
List<MemoButton> buttons;
int help1;
int xyz;
int clickers;
String clickers2;
	
public MemoFrame(){
                //pairs=10;
		List<Integer> cartsId = new ArrayList<Integer>();
		buttons = new ArrayList<MemoButton>();

		b = new MemoButton();
		b1 = new MemoButton();
	
		time = new Timer(300, new ActionListener(){ //---------
	public void actionPerformed(ActionEvent e1){
	helpp();
	}
	});
	time.setRepeats(false);
MemoStart startt = new MemoStart();
xyz = MemoStart.pairs;
for(int i=0;i<xyz;i++){
	cartsId.add(i);
	cartsId.add(i);
}	

Collections.shuffle(cartsId);

for(int val : cartsId){
	c = new MemoButton();
	c.setId(val);
	buttons.add(c);
	
	}

            Container pane = getContentPane();

	for(MemoButton but : buttons){
				add(but);
	}
	for(MemoButton but : buttons){
		

		but.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			clickers+=1;
			clickers2=Integer.toString(clickers);
			setTitle("Liczba ruchow: "+clickers2);
	loop2: {	
	if(b.getCondition()==b1.getCondition() && b.getCondition()!=false && source!=source1){
	break loop2;
	}
		
		if(b.getCondition()==false){
			b = but;
			b.setCondition(true);
			source = e.getSource();
			but.setText(String.valueOf(b.getId()));
		}
		else if(b.getCondition()==true){
			b1 = but;
			b1.setCondition(true);
			source1 = e.getSource();
			but.setText(String.valueOf(b1.getId()));
			time.start();
		}
		
		
	
	}		
			}
		});

	}
	
	            setPreferredSize(new Dimension(500, 500));
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocation(300, 150);
            pack();
            
	
}
public void helpp(){
	loop: {	

			if(b.getId()==b1.getId() && source!=source1){
				b.setEnabled(false);
				b1.setEnabled(false);
				help1+=1;
				
			}
			else if(b.getId()!=b1.getId()){
				b.setText("");
				b1.setText("");
			}
			
			
			if(source==source1){
				break loop;
			}
			
			
			b.setCondition(false);
			b1.setCondition(false);		

		if(help1==xyz){
		JOptionPane.showMessageDialog(null, "You Win!");
		}

	}

		}

	}


	