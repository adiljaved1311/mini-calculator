
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MiniCalci extends JFrame {
	class W extends WindowAdapter{
		public void windowClosing(WindowEvent args0) {
			dispose();
		}
	}
	class A implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent args0) {
			try {
			String s1=t1.getText();
			String s2=t2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int n=n1+n2;
			l4.setText(String.valueOf(n));
			}catch(Exception e){
				l4.setText(e.getMessage());
			}
		}
		
	}
	class B implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent args0) {
			try {
			String s1=t1.getText();
			String s2=t2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int n=n1-n2;
			l4.setText(String.valueOf(n));
			}catch(Exception e){
				l4.setText(e.getMessage());
			}
		}
		
	}
	class C implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent args0) {
			try {
			String s1=t1.getText();
			String s2=t2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int n=n1*n2;
			l4.setText(String.valueOf(n));
			}catch(Exception e){
				l4.setText(e.getMessage());
			}
		}
		
	}
	class D implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent args0) {
			try {
			String s1=t1.getText();
			String s2=t2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int n=n1/n2;
			l4.setText(String.valueOf(n));
			}catch(Exception e){
				l4.setText(e.getMessage());
			}
		}
		
	}
	class E implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent args0) {
			try {
			String s1=t1.getText();
			String s2=t2.getText();
			int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			int n=n1%n2;
			l4.setText(String.valueOf(n));
			}catch(Exception e){
				l4.setText(e.getMessage());
			}
		}
		
	}
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JPanel p;
	
	MiniCalci(){
		//addWindowListener(new W());
		setLayout(null);
		setTitle("Mini Calci");
		setBackground(Color.YELLOW);
		setSize(440,350);
		p = new JPanel();
		p.setLayout(null);
		p.setBackground(Color.BLUE);
		p.setBounds(50,70,300,160);
		add(p);
		
		l1 = new JLabel("1st No: ");
		l1.setForeground(Color.WHITE);
		l1.setBounds(40,20,70,20);
		p.add(l1);
		
		t1 = new JTextField();
		t1.setForeground(Color.RED);
		t1.setBounds(130,20,130,20);
		p.add(t1);
		
		l2 = new JLabel("2nd No : ");
		l2.setForeground(Color.WHITE);
		l2.setBounds(40,60,70,20);
		p.add(l2);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setBounds(130,60,130,20);
		p.add(t2);
		
		b1 = new JButton("+");
		b1.addActionListener(new A());
		b1.setBackground(Color.YELLOW);
		b1.setBounds(40,100,45,30);
		p.add(b1);
		
		b2 = new JButton("-");
		b2.addActionListener(new B());
		b2.setBounds(90,100,45,30);
		b2.setBackground(Color.YELLOW);
		p.add(b2);
		
		b3 = new JButton("*");
		b3.addActionListener(new C());
		b3.setBounds(140,100,45,30);
		b3.setBackground(Color.YELLOW);
		p.add(b3);
		
		b4 = new JButton("/");
		b4.addActionListener(new D());
		b4.setBounds(190,100,45,30);
		b4.setBackground(Color.YELLOW);
		p.add(b4);
		
		b5 = new JButton("%");
		b5.addActionListener(new E());
		b5.setBounds(240,100,45,30);
		b5.setBackground(Color.YELLOW);
		p.add(b5);
		
		l3 = new JLabel("Answer : ");
		l3.setBounds(50,250,80,20);
		add(l3);
		
		l4 = new JLabel("-----------------------------------------");
		l4.setBounds(150,250,200,20);
		add(l4);
		
	}
}

public class Calc {

	public static void main(String[] args) {
		MiniCalci g = new MiniCalci();
		g.setVisible(true);

	}

}
