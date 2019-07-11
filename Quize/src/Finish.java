import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Finish extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finish frame = new Finish();
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
	public Finish() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 51));
		panel.setBounds(0, 11, 599, 41);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFinish = new JLabel("                                    Finish");
		lblFinish.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFinish.setBounds(100, 11, 362, 14);
		panel.add(lblFinish);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 255, 51));
		panel_1.setBounds(0, 303, 599, 41);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Wellcome obj7 = new Wellcome();
				 obj7.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\Quize\\img\\icons8-home-64.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(10, 135, 198, 90);
		contentPane.add(btnNewButton);
		
		JButton btabout = new JButton("About US");
		btabout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				About obj8 = new About();
				obj8.setVisible(true);
			}
		});
		btabout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btabout.setBounds(294, 135, 198, 90);
		contentPane.add(btabout);
	}
}
