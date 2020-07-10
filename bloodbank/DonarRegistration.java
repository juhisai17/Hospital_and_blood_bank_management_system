package bloodbank;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class DonarRegistration extends JFrame {

	/**
	 * 
	 */
	Connection connection = null;
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBloodGroup;
	private JTextField txtBloodGroup_1;
	private JTextField txtGender;
	private JTextField txtAge;
	private JTextField txtHealthCondition;
	private JTextField txtHemoglobinPercentage;
	private JTextField txtAddress;
	private JTextField txtHaveYouEver;
	private JTextArea textAddress;
	private JTextField textDonarname;
	private JTextField textBloodgrp;
	private JTextField textHealth;
	private JTextField textMobileno;
	private JTextField txtMobileNo;
	private JTextField txtCountry;
	private JTextField txtCity;
	private JTextField textCity;
	private JTextField txtNearByHospital;
	private JTextField textNearbyhospital;
	private JTextField textCountry;
	private JTextField textAge;
	private JTextField textHemoglobin;
	private JTextField textGender;
	private JTextField textHistory;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DonarRegistration frame = new DonarRegistration();
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
	public DonarRegistration() {
		
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
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(null);
		
		txtBloodGroup = new JTextField();
		txtBloodGroup.setEditable(false);
		txtBloodGroup.setText("Donor Name:");
		txtBloodGroup.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBloodGroup.setForeground(Color.WHITE);
		txtBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtBloodGroup.setColumns(10);
		txtBloodGroup.setBorder(null);
		txtBloodGroup.setBackground(new Color(255, 192, 203));
		txtBloodGroup.setBounds(10, 10, 150, 30);
		panel_1.add(txtBloodGroup);
		
		txtBloodGroup_1 = new JTextField();
		txtBloodGroup_1.setEditable(false);
		txtBloodGroup_1.setText("Blood Group:");
		txtBloodGroup_1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtBloodGroup_1.setForeground(Color.WHITE);
		txtBloodGroup_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtBloodGroup_1.setColumns(10);
		txtBloodGroup_1.setBorder(null);
		txtBloodGroup_1.setBackground(new Color(255, 192, 203));
		txtBloodGroup_1.setBounds(10, 50, 150, 30);
		panel_1.add(txtBloodGroup_1);
		
		txtGender = new JTextField();
		txtGender.setEditable(false);
		txtGender.setText("Gender:");
		txtGender.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGender.setForeground(Color.WHITE);
		txtGender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtGender.setColumns(10);
		txtGender.setBorder(null);
		txtGender.setBackground(new Color(255, 192, 203));
		txtGender.setBounds(10, 90, 150, 30);
		panel_1.add(txtGender);
		
		txtAge = new JTextField();
		txtAge.setEditable(false);
		txtAge.setText("Age:");
		txtAge.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAge.setForeground(Color.WHITE);
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAge.setColumns(10);
		txtAge.setBorder(null);
		txtAge.setBackground(new Color(255, 192, 203));
		txtAge.setBounds(10, 130, 150, 30);
		panel_1.add(txtAge);
		
		txtHealthCondition = new JTextField();
		txtHealthCondition.setEditable(false);
		txtHealthCondition.setText("Health Condition:");
		txtHealthCondition.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHealthCondition.setForeground(Color.WHITE);
		txtHealthCondition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtHealthCondition.setColumns(10);
		txtHealthCondition.setBorder(null);
		txtHealthCondition.setBackground(new Color(255, 192, 203));
		txtHealthCondition.setBounds(0, 170, 160, 30);
		panel_1.add(txtHealthCondition);
		
		txtHemoglobinPercentage = new JTextField();
		txtHemoglobinPercentage.setEditable(false);
		txtHemoglobinPercentage.setText("Hemoglobin%:");
		txtHemoglobinPercentage.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHemoglobinPercentage.setForeground(Color.WHITE);
		txtHemoglobinPercentage.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtHemoglobinPercentage.setColumns(10);
		txtHemoglobinPercentage.setBorder(null);
		txtHemoglobinPercentage.setBackground(new Color(255, 192, 203));
		txtHemoglobinPercentage.setBounds(10, 210, 150, 30);
		panel_1.add(txtHemoglobinPercentage);
		
		txtAddress = new JTextField();
		txtAddress.setEditable(false);
		txtAddress.setText("Address:");
		txtAddress.setHorizontalAlignment(SwingConstants.RIGHT);
		txtAddress.setForeground(Color.WHITE);
		txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtAddress.setColumns(10);
		txtAddress.setBorder(null);
		txtAddress.setBackground(new Color(255, 192, 203));
		txtAddress.setBounds(10, 250, 150, 30);
		panel_1.add(txtAddress);
		
		txtHaveYouEver = new JTextField();
		txtHaveYouEver.setEditable(false);
		txtHaveYouEver.setText("Have you ever donated blood or not..?");
		txtHaveYouEver.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHaveYouEver.setForeground(Color.WHITE);
		txtHaveYouEver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtHaveYouEver.setColumns(10);
		txtHaveYouEver.setBorder(null);
		txtHaveYouEver.setBackground(new Color(255, 192, 203));
		txtHaveYouEver.setBounds(10, 330, 352, 30);
		panel_1.add(txtHaveYouEver);
		
		textAddress = new JTextArea();
		textAddress.setRows(4);
		textAddress.setLineWrap(true);
		textAddress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textAddress.setForeground(new Color(255, 192, 203));
		textAddress.setBorder(null);
		textAddress.setBounds(165, 250, 280, 70);
		panel_1.add(textAddress);
		
		textDonarname = new JTextField();
		textDonarname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textDonarname.setForeground(new Color(255, 192, 203));
		textDonarname.setColumns(10);
		textDonarname.setBorder(null);
		textDonarname.setBounds(165, 10, 280, 30);
		panel_1.add(textDonarname);
		
		textBloodgrp = new JTextField();
		textBloodgrp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodgrp.setForeground(new Color(255, 192, 203));
		textBloodgrp.setColumns(10);
		textBloodgrp.setBorder(null);
		textBloodgrp.setBounds(165, 50, 280, 30);
		panel_1.add(textBloodgrp);
		
		textHealth = new JTextField();
		textHealth.setToolTipText("Ex:-Good");
		textHealth.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textHealth.setForeground(new Color(255, 192, 203));
		textHealth.setColumns(10);
		textHealth.setBorder(null);
		textHealth.setBounds(165, 170, 280, 30);
		panel_1.add(textHealth);
		
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Afterlogin af = new Afterlogin();
				af.setVisible(true);
				dispose();
			}
		});
		button.setForeground(new Color(255, 192, 203));
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button.setBackground(Color.WHITE);
		button.setBounds(118, 370, 100, 40);
		panel_1.add(button);
		
		JButton btnDonate = new JButton("Donate");
		btnDonate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            String query = "INSERT INTO Donarregistrationdb (Donarname,Bloodgrp,Gender,Age,Healthcondition,Hemoglobin,Address,History,Mobileno,Country,City,Nearbyhospital) Values(?,?,?,?,?,?,?,?,?,?,?,?)";
		            PreparedStatement pst = connection.prepareStatement(query);
		            pst.setString(1, textDonarname.getText());
		            pst.setString(2, textBloodgrp.getText());
		            pst.setString(3, textGender.getText());
		            pst.setLong(4, Integer.parseInt(textAge.getText()));
		            pst.setString(5, textHealth.getText());
		            pst.setLong(6, Integer.parseInt(textHemoglobin.getText()));
		            pst.setString(7, textAddress.getText());
		            pst.setString(8, textHistory.getText());
		            pst.setLong(9, Integer.parseInt(textMobileno.getText()));
		            pst.setString(10, textCountry.getText());
		            pst.setString(11, textCity.getText());
		            pst.setString(12, textNearbyhospital.getText());
		            pst.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Registration Successfully completed");
		            pst.close();
		            connection.close();
		        } catch (Exception ez) {
		            ez.printStackTrace();
		        }
			}
		});
		btnDonate.setForeground(new Color(255, 192, 203));
		btnDonate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDonate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDonate.setBackground(Color.WHITE);
		btnDonate.setBounds(272, 370, 100, 40);
		panel_1.add(btnDonate);
		
		textMobileno = new JTextField();
		textMobileno.setToolTipText("Enter Valid 10 Digits number");
		textMobileno.setForeground(new Color(255, 192, 203));
		textMobileno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textMobileno.setColumns(10);
		textMobileno.setBorder(null);
		textMobileno.setBounds(610, 10, 280, 30);
		panel_1.add(textMobileno);
		
		txtMobileNo = new JTextField();
		txtMobileNo.setEditable(false);
		txtMobileNo.setText("Mobile No.:");
		txtMobileNo.setHorizontalAlignment(SwingConstants.RIGHT);
		txtMobileNo.setForeground(Color.WHITE);
		txtMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMobileNo.setColumns(10);
		txtMobileNo.setBorder(null);
		txtMobileNo.setBackground(new Color(255, 192, 203));
		txtMobileNo.setBounds(450, 10, 150, 30);
		panel_1.add(txtMobileNo);
		
		txtCountry = new JTextField();
		txtCountry.setEditable(false);
		txtCountry.setText("Country:");
		txtCountry.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCountry.setForeground(Color.WHITE);
		txtCountry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCountry.setColumns(10);
		txtCountry.setBorder(null);
		txtCountry.setBackground(new Color(255, 192, 203));
		txtCountry.setBounds(450, 50, 150, 30);
		panel_1.add(txtCountry);
		
		txtCity = new JTextField();
		txtCity.setEditable(false);
		txtCity.setText("City:");
		txtCity.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCity.setForeground(Color.WHITE);
		txtCity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCity.setColumns(10);
		txtCity.setBorder(null);
		txtCity.setBackground(new Color(255, 192, 203));
		txtCity.setBounds(451, 90, 150, 30);
		panel_1.add(txtCity);
		
		textCity = new JTextField();
		textCity.setForeground(new Color(255, 192, 203));
		textCity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCity.setColumns(10);
		textCity.setBorder(null);
		textCity.setBounds(610, 90, 280, 30);
		panel_1.add(textCity);
		
		txtNearByHospital = new JTextField();
		txtNearByHospital.setText("NearbyHospital:");
		txtNearByHospital.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNearByHospital.setForeground(Color.WHITE);
		txtNearByHospital.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNearByHospital.setEditable(false);
		txtNearByHospital.setColumns(10);
		txtNearByHospital.setBorder(null);
		txtNearByHospital.setBackground(new Color(255, 192, 203));
		txtNearByHospital.setBounds(450, 130, 150, 30);
		panel_1.add(txtNearByHospital);
		
		textNearbyhospital = new JTextField();
		textNearbyhospital.setForeground(new Color(255, 192, 203));
		textNearbyhospital.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textNearbyhospital.setColumns(10);
		textNearbyhospital.setBorder(null);
		textNearbyhospital.setBounds(610, 130, 280, 30);
		panel_1.add(textNearbyhospital);
		
		textCountry = new JTextField();
		textCountry.setForeground(new Color(255, 192, 203));
		textCountry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCountry.setColumns(10);
		textCountry.setBorder(null);
		textCountry.setBounds(610, 50, 280, 30);
		panel_1.add(textCountry);
		
		textAge = new JTextField();
		textAge.setForeground(new Color(255, 192, 203));
		textAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textAge.setColumns(10);
		textAge.setBorder(null);
		textAge.setBounds(165, 130, 280, 30);
		panel_1.add(textAge);
		
		textHemoglobin = new JTextField();
		textHemoglobin.setToolTipText("Enter below 18");
		textHemoglobin.setForeground(new Color(255, 192, 203));
		textHemoglobin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textHemoglobin.setColumns(10);
		textHemoglobin.setBorder(null);
		textHemoglobin.setBounds(165, 210, 280, 30);
		panel_1.add(textHemoglobin);
		
		textGender = new JTextField();
		textGender.setToolTipText("Male/Female/Others");
		textGender.setForeground(new Color(255, 192, 203));
		textGender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textGender.setColumns(10);
		textGender.setBorder(null);
		textGender.setBounds(165, 90, 280, 30);
		panel_1.add(textGender);
		
		textHistory = new JTextField();
		textHistory.setToolTipText("Yes/No");
		textHistory.setForeground(new Color(255, 192, 203));
		textHistory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textHistory.setColumns(10);
		textHistory.setBorder(null);
		textHistory.setBounds(372, 330, 73, 30);
		panel_1.add(textHistory);
		
		setUndecorated(true);
		
		
	}
}
