package bloodbank;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;

public class About extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 900, 80);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Hospital and Blood bank information");
		lblNewLabel.setBackground(new Color(255, 192, 203));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setForeground(new Color(255, 192, 203));
		lblNewLabel.setBorder(null);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(0, 80, 900,420);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Afterlogin af = new Afterlogin();
				af.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(new Color(255, 192, 203));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(700, 370, 190, 40);
		panel_1.add(btnBack);
		
		JEditorPane dtrpnAccessingTheInformation = new JEditorPane();
		dtrpnAccessingTheInformation.setText("Hospital And Blood Bank Information is to provide services for the people who need blood by getting help from the donors who are interested in donating blood for the people and also for the people who can be able to search blood according to their Blood Group, Country, City. There are Eight main features in this system.\r\nLogin\r\nSignUp\r\nAbout\r\nDonor registration.\r\nDonors\r\nRequest For Blood\r\nView Blood Requests\r\nSearch By\r\n");
		dtrpnAccessingTheInformation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dtrpnAccessingTheInformation.setForeground(new Color(255, 255, 255));
		dtrpnAccessingTheInformation.setBackground(new Color(255, 192, 203));
		dtrpnAccessingTheInformation.setBounds(10, 49, 880, 311);
		panel_1.add(dtrpnAccessingTheInformation);
		
		
		setUndecorated(true);
		
	}

}
