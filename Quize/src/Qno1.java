import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Qno1 extends JFrame {

	private JPanel contentPane;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qno1 frame = new Qno1();
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
	public Qno1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Who invented Compact Disc?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(26, 23, 327, 36);
		contentPane.add(lblNewLabel);
		
		JRadioButton r1 = new JRadioButton(" James T Russel");
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(26, 100, 153, 23);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("Muhammad Azeem");
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(26, 150, 153, 23);
		contentPane.add(r2);
		
		JRadioButton r3 = new JRadioButton("Muhammad Ammar");
		r3.setFont(new Font("Tahoma", Font.BOLD, 11));
		r3.setBounds(26, 193, 153, 23);
		contentPane.add(r3);
		
		JRadioButton r4 = new JRadioButton("James A Gosling");
		r4.setFont(new Font("Tahoma", Font.BOLD, 11));
		r4.setBounds(26, 239, 153, 23);
		contentPane.add(r4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
		
					
				
				if (r1.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Your Answer is Right ");
					
					Qno2 obj3 = new Qno2();
					
					obj3.setVisible(true);
				
				
	
				
					
				}
				
				if (r2.isSelected() || r3.isSelected() || r4.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Wrong");
				}
				
				
				
				 
			}

			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(251, 289, 89, 23);
		contentPane.add(btnNewButton);
	}
}
