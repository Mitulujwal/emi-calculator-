import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;
/*<applet code="emi.class" width="500" height="500">
</applet>*/
public class emi extends Applet implements ActionListener
{
Button b1=new Button("EMI");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
TextField t3=new TextField(20);
TextField t4=new TextField(20);
Label L1=new Label("AMOUNT");
Label L2=new Label("INTEREST RATE");
Label L3=new Label("TIME");
Label L4=new Label("EMI");
public void init()
{
add(L1);
add(t1);
add(L2);
add(t2);
add(L3);
add(t3);
add(L4);
add(b1);
add(t4);

b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
 {
   float r,t,emi,p;
   p=Float.parseFloat(t1.getText());
   r=Float.parseFloat(t2.getText());
   t=Float.parseFloat(t3.getText());
   r=r/(12*100);
   t=t*12;
  // emi=(p*r*(float)Math.pow(1+r,t))/(float)(Math.pow(1+r,t)-1);
   t4.setText(" "+(p*r*(float)Math.pow(1+r,t))/(float)(Math.pow(1+r,t)-1));
} 
}
}