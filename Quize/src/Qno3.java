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

public class Qno3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Qno3 frame = new Qno3();
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
	public Qno3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 383);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhichIsA = new JLabel("Which is a single integrated circuit?");
		lblWhichIsA.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWhichIsA.setBounds(10, 11, 563, 36);
		contentPane.add(lblWhichIsA);
		
		JRadioButton r1 = new JRadioButton("Gate");
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(10, 79, 153, 23);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("Mother Board");
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(10, 124, 153, 23);
		contentPane.add(r2);
		
		JRadioButton r3 = new JRadioButton("Chip");
		r3.setFont(new Font("Tahoma", Font.BOLD, 11));
		r3.setBounds(10, 165, 153, 23);
		contentPane.add(r3);
		
		JRadioButton r4 = new JRadioButton("CPU");
		r4.setFont(new Font("Tahoma", Font.BOLD, 11));
		r4.setBounds(10, 210, 153, 23);
		contentPane.add(r4);
		
		JButton bsubm = new JButton("Submit");
		bsubm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (r1.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Your Answer is Right ");
					
	
					 Qno4 obj5 = new Qno4();
					 obj5.setVisible(true);
					 
					
					}
				
				 if (r2.isSelected() || r3.isSelected() || r4.isSelected())
				{
					JOptionPane.showMessageDialog(null, "Wrong Answer");
				}
			}
		});
		bsubm.setFont(new Font("Tahoma", Font.BOLD, 12));
		bsubm.setBounds(217, 264, 89, 23);
		contentPane.add(bsubm);
	}

}
