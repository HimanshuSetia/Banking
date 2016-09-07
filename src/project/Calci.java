package project;

import javax.swing.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
public class Calci
{
public static int i=1,h=1;
public static double p=0,q=0;
public static String lastcommand="";
public static double result=0;

public static void go()
{

JFrame frame= new JFrame("Calculator");
frame.setSize(960,760);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);
frame.setResizable(false);
frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

JTextField tf= new JTextField();
tf.setSize(960,40);
tf.setLocation(0,0);
frame.add(tf);

JButton n1=new JButton("1");
n1.setSize(240,120);
n1.setLocation(0,280);
frame.add(n1);

JButton n2=new JButton("2");
n2.setSize(240,120);
n2.setLocation(240,280);
frame.add(n2);

JButton n3=new JButton("3");
n3.setSize(240,120);
n3.setLocation(480,280);
frame.add(n3);

JButton n4=new JButton("4");
n4.setSize(240,120);
n4.setLocation(0,160);
frame.add(n4);

JButton n5=new JButton("5");
n5.setSize(240,120);
n5.setLocation(240,160);
frame.add(n5);

JButton n6=new JButton("6");
n6.setSize(240,120);
n6.setLocation(480,160);
frame.add(n6);

JButton n7=new JButton("7");
n7.setSize(240,120);
n7.setLocation(0,40);
frame.add(n7);

JButton n8=new JButton("8");
n8.setSize(240,120);
n8.setLocation(240,40);
frame.add(n8);

JButton n9=new JButton("9");
n9.setSize(240,120);
n9.setLocation(480,40);
frame.add(n9);

JButton n0=new JButton("0");
n0.setSize(240,120);
n0.setLocation(240,400);
frame.add(n0);

JButton eq=new JButton("=");
eq.setSize(240,120);
eq.setLocation(240,640);
frame.add(eq);

JButton plus=new JButton("+");
plus.setSize(240,120);
plus.setLocation(720,40);
frame.add(plus);

JButton min=new JButton("-");
min.setSize(240,120);
min.setLocation(720,160);
frame.add(min);

JButton mul=new JButton("*");
mul.setSize(240,120);
mul.setLocation(720,280);
frame.add(mul);

JButton div=new JButton("/");
div.setSize(240,120);
div.setLocation(720,400);
frame.add(div);

JButton root=new JButton("_/```");
root.setSize(240,120);
root.setLocation(720,520);
frame.add(root);

JButton epx=new JButton("e`x");
epx.setSize(240,120);
epx.setLocation(720,640);
frame.add(epx);

JButton cl=new JButton("C");
cl.setSize(240,120);
cl.setLocation(0,400);
frame.add(cl);

JButton xpy=new JButton("x`y");
xpy.setSize(240,120);
xpy.setLocation(0,520);
frame.add(xpy);

JButton pi=new JButton("PI");
pi.setSize(240,120);
pi.setLocation(0,640);
frame.add(pi);

JButton rec=new JButton("1/x");
rec.setSize(240,120);
rec.setLocation(240,520);
frame.add(rec);

JButton bs=new JButton("<---");
bs.setSize(240,120);
bs.setLocation(480,400);
frame.add(bs);

JButton em=new JButton("!");
em.setSize(240,120);
em.setLocation(480,520);
frame.add(em);

JButton pt=new JButton(".");
pt.setSize(240,120);
pt.setLocation(480,640);
frame.add(pt);

tf.setText("");

ActionListener x=new ActionListener(){
public void actionPerformed(ActionEvent e){
if(e.getSource()==pi)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("3.14159265");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"3.14159265");
	}
}
else if(e.getSource()==n1)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("1");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"1");
	}
}

else if(e.getSource()==n2)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("2");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"2");
	}
}
else if(e.getSource()==n3)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("3");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"3");
	}
}
else if(e.getSource()==n4)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("4");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"4");
	}
}
else if(e.getSource()==n5)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("5");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"5");
	}
}
else if(e.getSource()==n6)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("6");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"6");
	}
}
else if(e.getSource()==n7)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("7");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"7");
	}
}
else if(e.getSource()==n8)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("8");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"8");
	}
}
else if(e.getSource()==n9)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("9");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"9");
	}
}
else if(e.getSource()==n0)
{
	if((tf.getText()).equals(""))
	{
	tf.setText("0");
	}
	else if(lastcommand.equals("="))
	{
	lastcommand=null;
	}
	else
	{
	tf.setText(tf.getText()+"0");
	}
}
else if(e.getSource()==xpy)
{
p=Double.parseDouble(tf.getText());
lastcommand="x`y";
tf.setText("");
}
else if(e.getSource()==cl)
{
tf.setText("");
lastcommand="";
}
else if(e.getSource()==em)
{
p=Double.parseDouble(tf.getText());
lastcommand="!";
tf.setText("");
}
else if(e.getSource()==plus)
{
p=Double.parseDouble(tf.getText());
lastcommand="+";
tf.setText("");
}
else if(e.getSource()==min)
{
p=Double.parseDouble(tf.getText());
lastcommand="-";
tf.setText("");
}
else if(e.getSource()==mul)
{
p=Double.parseDouble(tf.getText());
lastcommand="*";
tf.setText("");
}
else if(e.getSource()==div)
{
p=Double.parseDouble(tf.getText());
lastcommand="/";
tf.setText("");
}
else if(e.getSource()==rec)
{
p=Double.parseDouble(tf.getText());
lastcommand="1/x";
tf.setText("");
}
else if(e.getSource()==eq)
{
if(lastcommand.equals("1/x"))
{
result=1/p;
}
else if(lastcommand.equals("x`y"))
{
q=Double.parseDouble(tf.getText());
h=(int)p;
for(i=1;i<(int)q;i++)
{
h=h*(int)p;
}
result=h;
}
else if(lastcommand.equals("+"))
{
q=Double.parseDouble(tf.getText());
result=p+q;
}
else if(lastcommand.equals("!"))
{
h=(int)p;
i=(int)p;
if(i==2 || i==1)
{
result=i;
}
else
{
while(i>2)
{
h=h*(i-1);
i--;
}
result=h;
}
}
else if(lastcommand.equals("-"))
{
q=Double.parseDouble(tf.getText());
result=p-q;
}
else if(lastcommand.equals("*"))
{
q=Double.parseDouble(tf.getText());
result=p*q;
}
else if(lastcommand.equals("/"))
{
q=Double.parseDouble(tf.getText());
result=p/q;
}
tf.setText(""+result);
lastcommand="=";
}
}
};
frame.setVisible(true);
n1.addActionListener(x);
n2.addActionListener(x);
n3.addActionListener(x);
n4.addActionListener(x);
n5.addActionListener(x);
n6.addActionListener(x);
n7.addActionListener(x);
n8.addActionListener(x);
n9.addActionListener(x);
n0.addActionListener(x);
plus.addActionListener(x);
eq.addActionListener(x);
min.addActionListener(x);
mul.addActionListener(x);
div.addActionListener(x);
cl.addActionListener(x);
em.addActionListener(x);
rec.addActionListener(x);
xpy.addActionListener(x);
pi.addActionListener(x);
}
}