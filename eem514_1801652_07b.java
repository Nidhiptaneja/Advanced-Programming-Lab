import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class eem514_1801652_07b extends JPanel implements ActionListener
{
	private JLabel input_Label, output_Label;
	private JTextField fahrenheit,celsius;
	private JButton b1;
	public eem514_1801652_07b() 
	{
		input_Label = new JLabel("Enter Temperature in Fahrenheit:");
		output_Label = new JLabel("Temperature in Celsius: ");
		fahrenheit = new JTextField(20);
		celsius= new JTextField(20);
		b1 =new JButton("Convert");
		celsius.setEditable(false);

		add(input_Label);
		add(fahrenheit);
		add(output_Label);
		add(celsius);
		add(b1);
		b1.addActionListener(this);
		setLayout(new FlowLayout());

	}


	public void actionPerformed(ActionEvent event) 
	{
		int fahrenheitTemp, celsiusTemp;
		String text = fahrenheit.getText();
		fahrenheitTemp = Integer.parseInt(text);
		celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
		celsius.setText(Integer.toString(celsiusTemp));
	}
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("                                                                                        Fahrenheit to Celsius Converter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eem514_1801652_07b panel = new eem514_1801652_07b();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}