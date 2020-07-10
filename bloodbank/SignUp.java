package bloodbank;

import java.sql.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SignUp extends JFrame {

	/**
	 * 
	 */
	Connection connection = null;
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSignupPage;
	private JTextField textFirstname;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtConfirmPassword;
	private JTextField txtDateOfBirth;
	private JTextField txtAddress;
	private JTextField textLastname;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private JPasswordField passwordField_1;
	private JTextField textDob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		
		connection = sqliteConnection.dbConnector();
		 
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 192, 203));
		panel_1.setBounds(0, 80, 900,420);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtSignupPage = new JTextField();
		txtSignupPage.setEditable(false);
		txtSignupPage.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtSignupPage.setForeground(new Color(255, 255, 255));
		txtSignupPage.setText("SignUp Page");
		txtSignupPage.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignupPage.setBorder(null);
		txtSignupPage.setBackground(new Color(255, 192, 203));
		txtSignupPage.setBounds(210, 0, 480, 45);
		panel_1.add(txtSignupPage);
		txtSignupPage.setColumns(10);
		
		textFirstname = new JTextField();
		textFirstname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFirstname.setForeground(new Color(255, 192, 203));
		textFirstname.setBorder(null);
		textFirstname.setBounds(355, 45, 275, 30);
		panel_1.add(textFirstname);
		textFirstname.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setEditable(false);
		txtFirstName.setBorder(null);
		txtFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtFirstName.setText("First Name:");
		txtFirstName.setForeground(new Color(255, 255, 255));
		txtFirstName.setBackground(new Color(255, 192, 203));
		txtFirstName.setBounds(195, 45, 150, 30);
		panel_1.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setEditable(false);
		txtLastName.setText("Last Name:");
		txtLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		txtLastName.setForeground(Color.WHITE);
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtLastName.setColumns(10);
		txtLastName.setBorder(null);
		txtLastName.setBackground(new Color(255, 192, 203));
		txtLastName.setBounds(195, 85, 150, 30);
		panel_1.add(txtLastName);
		
		txtUsername = new JTextField();
		txtUsername.setEditable(false);
		txtUsername.setText("Username:");
		txtUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBackground(new Color(255, 192, 203));
		txtUsername.setBounds(195, 125, 150, 30);
		panel_1.add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setEditable(false);
		txtPassword.setText("Password:");
		txtPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPassword.setColumns(10);
		txtPassword.setBorder(null);
		txtPassword.setBackground(new Color(255, 192, 203));
		txtPassword.setBounds(195, 165, 150, 30);
		panel_1.add(txtPassword);
		
		txtConfirmPassword = new JTextField();
		txtConfirmPassword.setEditable(false);
		txtConfirmPassword.setText("Confirm Password:");
		txtConfirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		txtConfirmPassword.setForeground(Color.WHITE);
		txtConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtConfirmPassword.setColumns(10);
		txtConfirmPassword.setBorder(null);
		txtConfirmPassword.setBackground(new Color(255, 192, 203));
		txtConfirmPassword.setBounds(164, 205, 181, 30);
		panel_1.add(txtConfirmPassword);
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setEditable(false);
		txtDateOfBirth.setText("Date Of Birth:");
		txtDateOfBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDateOfBirth.setForeground(Color.WHITE);
		txtDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDateOfBirth.setColumns(10);
		txtDateOfBirth.setBorder(null);
		txtDateOfBirth.setBackground(new Color(255, 192, 203));
		txtDateOfBirth.setBounds(195, 245, 150, 30);
		panel_1.add(txtDateOfBirth);
		
		txtAddress = new JTextField();
		txtAddress.setEditable(false);
		txtAddress.setText("Address:");
		txtAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAddress.setForeground(Color.WHITE);
		txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAddress.setColumns(10);
		txtAddress.setBorder(null);
		txtAddress.setBackground(new Color(255, 192, 203));
		txtAddress.setBounds(195, 285, 150, 30);
		panel_1.add(txtAddress);
		
		textLastname = new JTextField();
		textLastname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textLastname.setForeground(new Color(255, 192, 203));
		textLastname.setColumns(10);
		textLastname.setBorder(null);
		textLastname.setBounds(355, 85, 275, 30);
		panel_1.add(textLastname);
		
		textUsername = new JTextField();
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUsername.setForeground(new Color(255, 192, 203));
		textUsername.setColumns(10);
		textUsername.setBorder(null);
		textUsername.setBounds(355, 125, 275, 30);
		panel_1.add(textUsername);
		
		textPassword = new JPasswordField();
		textPassword.setEchoChar('*');
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPassword.setForeground(new Color(255, 192, 203));
		textPassword.setBorder(null);
		textPassword.setBounds(355, 165, 275, 30);
		panel_1.add(textPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField_1.setEchoChar('*');
		passwordField_1.setForeground(new Color(255, 192, 203));
		passwordField_1.setBorder(null);
		passwordField_1.setBounds(355, 205, 275, 30);
		panel_1.add(passwordField_1);
		
		JTextArea textAddress = new JTextArea();
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textAddress.setForeground(new Color(255, 192, 203));
		textAddress.setBorder(null);
		textAddress.setBounds(355, 285, 275, 70);
		panel_1.add(textAddress);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				dispose();
			}
		});
		btnCancel.setForeground(new Color(255, 192, 203));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnCancel.setBackground(new Color(255, 255, 255));
		btnCancel.setBounds(295, 370, 100, 40);
		panel_1.add(btnCancel);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            String query = "INSERT INTO Userdb (Firstname,Lastname,Username,Password,Dob,Address) Values(?,?,?,?,?,?)";
		            PreparedStatement pst = connection.prepareStatement(query);
		            pst.setString(1, textFirstname.getText());
		            pst.setString(2, textLastname.getText());
		            pst.setString(3, textUsername.getText());
		            pst.setString(4, textPassword.getText());
		            pst.setString(5, textDob.getText());
		            pst.setString(6, textAddress.getText());
		            pst.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Account Created. Please Login!");
		            pst.close();
		            connection.close();
		        } catch (Exception ez) {
		            ez.printStackTrace();
		        }
				
				Login l = new Login();
				l.setVisible(true);
				dispose();
				
				
			}
		});
		btnSignUp.setForeground(new Color(255, 192, 203));
		btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSignUp.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSignUp.setBackground(new Color(255, 255, 255));
		btnSignUp.setBounds(425, 370, 100, 40);
		panel_1.add(btnSignUp);
		
		textDob = new JTextField();
		textDob.setForeground(new Color(255, 192, 203));
		textDob.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textDob.setColumns(10);
		textDob.setBorder(null);
		textDob.setBounds(355, 245, 275, 30);
		panel_1.add(textDob);
		
		setUndecorated(true);

	}
}
