import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 383);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save AS");
		mnFile.add(mntmSaveAs);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmOpenProject = new JMenuItem("Open Project");
		mnEdit.add(mntmOpenProject);
		
		JMenu mnSource = new JMenu("Source");
		menuBar.add(mnSource);
		
		JMenuItem mntmComputerCity = new JMenuItem("Computer City");
		mnSource.add(mntmComputerCity);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHour = new JMenuItem("24 Hour");
		mnHelp.add(mntmHour);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                                                        About US ");
		lblNewLabel.setForeground(new Color(102, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 11, 589, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblBuildingAWebsite = new JLabel("Building a website is, in many ways, an exercise of willpower. It\u2019s tempting to get distracted by the");
		lblBuildingAWebsite.setForeground(new Color(153, 0, 0));
		lblBuildingAWebsite.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBuildingAWebsite.setBounds(10, 89, 576, 14);
		contentPane.add(lblBuildingAWebsite);
		
		JLabel lblBellsAndWhistles = new JLabel("bells and whistles of the design process, and forget all about creating compelling content.");
		lblBellsAndWhistles.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBellsAndWhistles.setBounds(10, 114, 576, 14);
		contentPane.add(lblBellsAndWhistles);
		
		JLabel lblItsThatCompelling = new JLabel("It's that compelling content that's crucial to making inbound marketing work for your business.");
		lblItsThatCompelling.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblItsThatCompelling.setBounds(10, 172, 576, 14);
		contentPane.add(lblItsThatCompelling);
	}
}
