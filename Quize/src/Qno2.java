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

public class Qno2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qno2 frame = new Qno2();
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
	public Qno2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel la = new JLabel("The first mechanical computer designed by Charles Babbage was called ?");
		la.setFont(new Font("Tahoma", Font.BOLD, 15));
		la.setBounds(22, 27, 563, 36);
		contentPane.add(la);
		
		JRadioButton ra1 = new JRadioButton("Abacus");
		ra1.setFont(new Font("Tahoma", Font.BOLD, 11));
		ra1.setBounds(22, 107, 153, 23);
		contentPane.add(ra1);
		
		JRadioButton ra2 = new JRadioButton("Analytical Engine");
		ra2.setFont(new Font("Tahoma", Font.BOLD, 11));
		ra2.setBounds(22, 151, 182, 23);
		contentPane.add(ra2);
		
		JRadioButton ra3 = new JRadioButton("Calculator");
		ra3.setFont(new Font("Tahoma", Font.BOLD, 11));
		ra3.setBounds(22, 197, 153, 23);
		contentPane.add(ra3);
		
		JRadioButton ra4 = new JRadioButton(" Processor");
		ra4.setFont(new Font("Tahoma", Font.BOLD, 11));
		ra4.setBounds(22, 246, 153, 23);
		contentPane.add(ra4);
		
		JButton bsub = new JButton("Submit");
		bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if (ra2.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Your Answer is Right ");
					
					Qno3 obj4 = new Qno3();
					 obj4.setVisible(true);
					 
					
					}
				
				 if (ra1.isSelected() || ra3.isSelected() || ra4.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
			}
		});
		bsub.setFont(new Font("Tahoma", Font.BOLD, 12));
		bsub.setBounds(235, 287, 89, 23);
		contentPane.add(bsub);
	}

}
