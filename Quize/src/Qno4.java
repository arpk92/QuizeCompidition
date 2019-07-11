import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Qno4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qno4 frame = new Qno4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Qno4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCIs = new JLabel("C is ?");
		lblCIs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCIs.setBounds(10, 11, 563, 36);
		contentPane.add(lblCIs);
		
		JRadioButton r1 = new JRadioButton("A third generation high level language");
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(10, 69, 311, 23);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("A machine language");
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(10, 131, 264, 23);
		contentPane.add(r2);
		
		JRadioButton r3 = new JRadioButton("An assembly language");
		r3.setFont(new Font("Tahoma", Font.BOLD, 11));
		r3.setBounds(10, 185, 236, 23);
		contentPane.add(r3);
		
		JRadioButton r4 = new JRadioButton("All of the above");
		r4.setFont(new Font("Tahoma", Font.BOLD, 11));
		r4.setBounds(10, 251, 236, 23);
		contentPane.add(r4);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (r1.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Your Answer is Right ");
					
	                       Qno5 obj6 = new Qno5();
	                       
	                       obj6.setVisible(true);
					 
					
					}
				
				 if (r2.isSelected() || r3.isSelected() || r4.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBounds(218, 288, 89, 23);
		contentPane.add(button);
	}

}
