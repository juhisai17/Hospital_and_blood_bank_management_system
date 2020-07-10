package bloodbank;

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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import javax.swing.JScrollPane;

public class Donars extends JFrame {

	/**
	 * 
	 */
	
	Connection connection = null;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Donars frame = new Donars();
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
	public Donars() {
		
		connection = sqliteConnection.dbConnector();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
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
		
		JButton btnLoad = new JButton("Click here to see Donor information");
		btnLoad.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLoad.setBackground(new Color(255, 255, 255));
		btnLoad.setForeground(new Color(255, 192, 203));
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "SELECT ID,Donarname,Bloodgrp,Gender,Age,Healthcondition,Hemoglobin,Address,Mobileno FROM Donarregistrationdb";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
					rs.close();
					connection.close();
				}
				catch (Exception ez) {
					ez.printStackTrace();
				}
			}
		});
		btnLoad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLoad.setBounds(10, 90, 454, 44);
		contentPane.add(btnLoad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(10, 144, 880, 346);
		contentPane.add(scrollPane);
		
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setForeground(new Color(255, 192, 203));
		
		JButton button = new JButton("Back");
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
		button.setBounds(700, 90, 190, 40);
		contentPane.add(button);
		
		setUndecorated(true);
		
		
	}
}
