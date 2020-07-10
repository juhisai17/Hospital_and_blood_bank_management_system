package bloodbank;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Requestforblood extends JFrame {

	/**
	 * 
	 */
	
	Connection connection = null;
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textDate;
	private JTextField textMobileno;
	private JTextField textFirstname;
	private JTextField textLastname;
	private JTextField textBloodgrp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Requestforblood frame = new Requestforblood();
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
	public Requestforblood() {
		
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
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnReturn = new JButton("Cancel");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Afterlogin af = new Afterlogin();
				af.setVisible(true);
				dispose();
			}
		});
		btnReturn.setForeground(new Color(255, 192, 203));
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnReturn.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReturn.setBackground(Color.WHITE);
		btnReturn.setBounds(329, 374, 118, 40);
		panel_1.add(btnReturn);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstName.setBackground(new Color(255, 192, 203));
		lblFirstName.setBounds(194, 88, 167, 30);
		panel_1.add(lblFirstName);
		
		textDate = new JTextField();
		textDate.setForeground(new Color(255, 192, 203));
		textDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textDate.setColumns(10);
		textDate.setBorder(null);
		textDate.setBounds(371, 249, 275, 30);
		panel_1.add(textDate);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLastName.setBackground(new Color(255, 192, 203));
		lblLastName.setBounds(194, 128, 167, 30);
		panel_1.add(lblLastName);
		
		JLabel lblBloodGroup = new JLabel("Blood Group:");
		lblBloodGroup.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBloodGroup.setForeground(Color.WHITE);
		lblBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBloodGroup.setBackground(new Color(255, 192, 203));
		lblBloodGroup.setBounds(194, 168, 167, 30);
		panel_1.add(lblBloodGroup);
		
		JLabel lblMobileNo = new JLabel("Mobile No.:");
		lblMobileNo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMobileNo.setForeground(Color.WHITE);
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMobileNo.setBackground(new Color(255, 192, 203));
		lblMobileNo.setBounds(194, 208, 167, 30);
		panel_1.add(lblMobileNo);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDate.setBackground(new Color(255, 192, 203));
		lblDate.setBounds(194, 248, 167, 30);
		panel_1.add(lblDate);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBackground(new Color(255, 192, 203));
		lblAddress.setBounds(194, 288, 167, 30);
		panel_1.add(lblAddress);
		
		textMobileno = new JTextField();
		textMobileno.setForeground(new Color(255, 192, 203));
		textMobileno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textMobileno.setColumns(10);
		textMobileno.setBorder(null);
		textMobileno.setBounds(371, 209, 275, 30);
		panel_1.add(textMobileno);
		
		textFirstname = new JTextField();
		textFirstname.setForeground(new Color(255, 192, 203));
		textFirstname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFirstname.setColumns(10);
		textFirstname.setBorder(null);
		textFirstname.setBounds(371, 89, 275, 30);
		panel_1.add(textFirstname);
		
		textLastname = new JTextField();
		textLastname.setForeground(new Color(255, 192, 203));
		textLastname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textLastname.setColumns(10);
		textLastname.setBorder(null);
		textLastname.setBounds(371, 129, 275, 30);
		panel_1.add(textLastname);
		
		textBloodgrp = new JTextField();
		textBloodgrp.setForeground(new Color(255, 192, 203));
		textBloodgrp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodgrp.setColumns(10);
		textBloodgrp.setBorder(null);
		textBloodgrp.setBounds(371, 169, 275, 30);
		panel_1.add(textBloodgrp);
		
		JTextArea textAddress = new JTextArea();
		textAddress.setForeground(new Color(255, 192, 203));
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textAddress.setBorder(null);
		textAddress.setBounds(371, 288, 275, 76);
		panel_1.add(textAddress);
		
		JLabel lblRequestForBlood = new JLabel("Request for blood");
		lblRequestForBlood.setHorizontalAlignment(SwingConstants.CENTER);
		lblRequestForBlood.setForeground(Color.WHITE);
		lblRequestForBlood.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblRequestForBlood.setBackground(new Color(255, 192, 203));
		lblRequestForBlood.setBounds(306, 27, 284, 30);
		panel_1.add(lblRequestForBlood);
		
		JButton btnRequest = new JButton("Request");
		btnRequest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            String query = "INSERT INTO Requestforblooddb (Firstname,Lastname,Bloodgrp,Mobileno,Date,Address) Values(?,?,?,?,?,?)";
		            PreparedStatement pst = connection.prepareStatement(query);
		            pst.setString(1, textFirstname.getText());
		            pst.setString(2, textLastname.getText());
		            pst.setString(3, textBloodgrp.getText());
		            pst.setLong(4, Integer.parseInt(textMobileno.getText()));
		            pst.setLong(5, Integer.parseInt(textDate.getText()));
		            pst.setString(6, textAddress.getText());
		            pst.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Your request for blood is successfully done..!!");
		            pst.close();
		            connection.close();
		        } catch (Exception ez) {
		            ez.printStackTrace();
		        }
				
				Searchfor sf = new Searchfor();
				sf.setVisible(true);
				dispose();
			}
		});
		btnRequest.setForeground(new Color(255, 192, 203));
		btnRequest.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnRequest.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnRequest.setBackground(Color.WHITE);
		btnRequest.setBounds(490, 374, 118, 40);
		panel_1.add(btnRequest);
		
		setUndecorated(true);
		
	}
}
