package memoPackage;

import javax.swing.JButton;

public class Button extends JButton{
	
int id = 101;
boolean condition = false;

public void setId(int id){
	this.id = id;	
}
public int getId(){
	return this.id;
} 

public void setCondition(boolean condition){
	this.condition = condition;
}
public boolean getCondition(){
	return this.condition;
}
}