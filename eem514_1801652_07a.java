import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class eem514_1801652_07a extends JFrame implements ActionListener
{
	public static JLabel l1,l2;
	public static JButton b1,b2,b3;
	public static int score=0;
	public static String c="";
	private Color background;
	

	public eem514_1801652_07a(String title)
	{
		setTitle(title);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		l1 = new JLabel("Click:");
		b1 = new JButton("Blue");
		b2 = new JButton("Green");
		b3 = new JButton("Pink");
		l2 = new JLabel("");

		b1.setBackground(Color.blue);
		b2.setBackground(Color.green);
		b3.setBackground(Color.pink);

		b1.setActionCommand("b1");
		b2.setActionCommand("b2");
		b3.setActionCommand("b3");

		setLayout(new FlowLayout());
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(l2);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);


		setVisible(true);
	}

	private void generateBackgroundColor() 
	{
		Random rand = new Random();
		int n = rand.nextInt(3);
		
		if(n==0)
			background = Color.blue;
		else if(n==1)
			background = Color.green;
		else
			background = Color.pink;
	}

	public void actionPerformed(ActionEvent evt)
	{
		generateBackgroundColor();
		if(evt.getActionCommand().equals("b1"))
		{
			if(background.equals(Color.blue))
			{
				getContentPane().setBackground(Color.blue);
				score+=3;
				String s = Integer.toString(score);
		        l1.setText("Right Choice!");
		        l2.setText("Score:"+s);
			}
			else
			{
				getContentPane().setBackground(Color.red);
				score-=1;
				String s = Integer.toString(score);
		        l1.setText("Wrong Choice!");
		        l2.setText("Score:"+s);
			}

		}
		else if(evt.getActionCommand().equals("b2"))
		{
			if(background.equals(Color.green))
			{
				getContentPane().setBackground(Color.green);
				score+=3;
				String s = Integer.toString(score);
		        l1.setText("Right Choice!");
		        l2.setText("Score:"+s);

			}
			else
			{
				getContentPane().setBackground(Color.red);
				score-=1;
				String s = Integer.toString(score);
		        l1.setText("Wrong Choice!");
		        l2.setText("Score:"+s);

			}
		}
		else if(evt.getActionCommand().equals("b3"))
		{
			if(background.equals(Color.pink))
			{
				getContentPane().setBackground(Color.pink);
				score+=3;
				String s = Integer.toString(score);
		        l1.setText("Right Choice!");
		        l2.setText("Score:"+s);
			}
			else
			{
				getContentPane().setBackground(Color.red);
				score-=1;
				String s = Integer.toString(score);
		        l1.setText("Wrong Choice!");
		        l2.setText("Score:"+s);
			}
		}
	
		repaint();
	}

	public static void main(String[] args) 
	{
		eem514_1801652_07a f = new eem514_1801652_07a("Guess my real background color?");
	} 


}