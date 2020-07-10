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
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class Afterlogin extends JFrame {

	/**
	 * 
	 */
	
	Connection connection = null;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Afterlogin frame = new Afterlogin();
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
	public Afterlogin() {
		
		connection = sqliteConnection.dbConnector();
		
		
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
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton About = new JButton("About");
		About.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About a = new About();
				a.setVisible(true);
				dispose();
			}
		});
		About.setForeground(new Color(255, 192, 203));
		About.setFont(new Font("Tahoma", Font.PLAIN, 20));
		About.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		About.setBackground(Color.WHITE);
		About.setBounds(36, 63, 190, 150);
		panel_1.add(About);
		
		JButton Donarregistration = new JButton("Donor Registration");
		Donarregistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DonarRegistration DR = new DonarRegistration();
				DR.setVisible(true);
				dispose();
			}
		});
		Donarregistration.setForeground(new Color(255, 192, 203));
		Donarregistration.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Donarregistration.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Donarregistration.setBackground(Color.WHITE);
		Donarregistration.setBounds(283, 63, 190, 150);
		panel_1.add(Donarregistration);
		
		JButton Requestforblood = new JButton("Request For Blood");
		Requestforblood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Requestforblood rfb = new Requestforblood();
				rfb.setVisible(true);
				dispose();
			}
		});
		Requestforblood.setForeground(new Color(255, 192, 203));
		Requestforblood.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Requestforblood.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Requestforblood.setBackground(Color.WHITE);
		Requestforblood.setBounds(36, 260, 190, 150);
		panel_1.add(Requestforblood);
		
		JButton Searchby = new JButton("Search By");
		Searchby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Searchby sb = new Searchby();
				sb.setVisible(true);
				dispose();
			}
		});
		Searchby.setForeground(new Color(255, 192, 203));
		Searchby.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Searchby.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Searchby.setBackground(Color.WHITE);
		Searchby.setBounds(524, 260, 190, 150);
		panel_1.add(Searchby);
		
		JButton btnBack = new JButton("Logout");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(new Color(255, 192, 203));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(684, 10, 190, 40);
		panel_1.add(btnBack);
		
		JButton Donars = new JButton("Donors");
		Donars.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Donars d = new Donars();
				d.setVisible(true);
				dispose();
			}
		});
		Donars.setForeground(new Color(255, 192, 203));
		Donars.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Donars.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		Donars.setBackground(Color.WHITE);
		Donars.setBounds(524, 63, 190, 150);
		panel_1.add(Donars);
		
		JButton btnSearchForBuyers = new JButton("View BloodRequests");
		btnSearchForBuyers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Searchfor sf = new Searchfor();
				sf.setVisible(true);
				dispose();
				
			}
		});
		btnSearchForBuyers.setForeground(new Color(255, 192, 203));
		btnSearchForBuyers.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSearchForBuyers.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSearchForBuyers.setBackground(Color.WHITE);
		btnSearchForBuyers.setBounds(283, 260, 190, 150);
		panel_1.add(btnSearchForBuyers);
		
		setUndecorated(true);
		
	}
}
