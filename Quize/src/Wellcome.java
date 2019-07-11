import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wellcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wellcome frame = new Wellcome();
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
	public Wellcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 457);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELLCOME  TO QUIZE COMPETITION");
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 22, 587, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("RULES OF QUIZ COMPETITION");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(29, 108, 465, 37);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("There are 10 Question Based on different subjects. You have 4 Options to choose select the ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(29, 170, 563, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("correct answer. Best of Luck");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(39, 212, 504, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NOTE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(25, 259, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u2022  Don\u2019t use Internet");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(23, 299, 135, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblYouHave = new JLabel("\u2022  You have only 10 mints to solve the Quize");
		lblYouHave.setForeground(Color.RED);
		lblYouHave.setBounds(33, 324, 255, 14);
		contentPane.add(lblYouHave);
		
		JButton btstart = new JButton("Click Here To Start");
		btstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 Qno1 obj = new Qno1();
				 obj.setVisible(true);
				 
				
				 
				
			
				 
				
				
			}
		});
		btstart.setFont(new Font("Tahoma", Font.BOLD, 14));
		btstart.setForeground(Color.RED);
		btstart.setBounds(208, 370, 186, 23);
		contentPane.add(btstart);
	}
}
