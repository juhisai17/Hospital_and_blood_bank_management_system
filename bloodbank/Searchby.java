package bloodbank;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Searchby extends JFrame {

	/**
	 * 
	 */
	
	Connection connection = null;
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearchBy;
	private JTable table;
	private JTextField textBloodgrp;
	private JTextField textCity;
	private JTextField textCountry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Searchby frame = new Searchby();
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
	
	public void loaddata(String query, String text ){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Name","Blood", "City", "Country"}, 0);
        try {
            connection = sqliteConnection.dbConnector();
            
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, text);
            ResultSet rs = pst.executeQuery();
            //table.setModel(DbUtils.resultSetToTableModel(rs));
            while(rs.next()){
                String i = rs.getString("Donarname");
                String n = rs.getString("Bloodgrp");
                String p = rs.getString("City");
                String d = rs.getString("Country");
                
                model.addRow(new Object[]{i,n,p,d});
            }

            table.setModel(model);
            table.setRowHeight(30);
            pst.close();
            rs.close();
            connection.close();
        }
        catch (Exception ez) {
            ez.printStackTrace();
        }
    }
	
	
	
	
	public Searchby() {
		
		connection = sqliteConnection.dbConnector();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
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
		
		txtSearchBy = new JTextField();
		txtSearchBy.setText("Search By");
		txtSearchBy.setHorizontalAlignment(SwingConstants.RIGHT);
		txtSearchBy.setForeground(Color.WHITE);
		txtSearchBy.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtSearchBy.setEditable(false);
		txtSearchBy.setColumns(10);
		txtSearchBy.setBorder(null);
		txtSearchBy.setBackground(new Color(255, 192, 203));
		txtSearchBy.setBounds(10, 90, 167, 25);
		contentPane.add(txtSearchBy);
		
		JButton button_3 = new JButton("Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Afterlogin af = new Afterlogin();
				af.setVisible(true);
				dispose();
				
			}
		});
		button_3.setForeground(new Color(255, 192, 203));
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(700, 90, 190, 30);
		contentPane.add(button_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 268, 880, 222);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		
		JLabel lblBloodGroup = new JLabel("Blood Group:");
		lblBloodGroup.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBloodGroup.setForeground(Color.WHITE);
		lblBloodGroup.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBloodGroup.setBackground(new Color(255, 192, 203));
		lblBloodGroup.setBounds(10, 130, 167, 30);
		contentPane.add(lblBloodGroup);
		
		textBloodgrp = new JTextField();
		textBloodgrp.setForeground(new Color(255, 192, 203));
		textBloodgrp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textBloodgrp.setColumns(10);
		textBloodgrp.setBorder(null);
		textBloodgrp.setBounds(187, 130, 275, 30);
		contentPane.add(textBloodgrp);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCity.setForeground(Color.WHITE);
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCity.setBackground(new Color(255, 192, 203));
		lblCity.setBounds(10, 170, 167, 30);
		contentPane.add(lblCity);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCountry.setForeground(Color.WHITE);
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCountry.setBackground(new Color(255, 192, 203));
		lblCountry.setBounds(10, 210, 167, 30);
		contentPane.add(lblCountry);
		
		textCity = new JTextField();
		textCity.setForeground(new Color(255, 192, 203));
		textCity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCity.setColumns(10);
		textCity.setBorder(null);
		textCity.setBounds(187, 170, 275, 30);
		contentPane.add(textCity);
		
		textCountry = new JTextField();
		textCountry.setForeground(new Color(255, 192, 203));
		textCountry.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textCountry.setColumns(10);
		textCountry.setBorder(null);
		textCountry.setBounds(187, 210, 275, 30);
		contentPane.add(textCountry);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String query = "SELECT * FROM Donarregistrationdb Where Bloodgrp = ? ";
		        String text = textBloodgrp.getText();
		        loaddata(query,text);
			}
		});
		btnSearch.setForeground(new Color(255, 192, 203));
		btnSearch.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSearch.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSearch.setBackground(Color.WHITE);
		btnSearch.setBounds(472, 130, 130, 30);
		contentPane.add(btnSearch);
		
		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String query = "SELECT * FROM Donarregistrationdb Where City = ? ";
		        String text = textCity.getText();
		        loaddata(query,text);
			}
		});
		btnSearch_1.setForeground(new Color(255, 192, 203));
		btnSearch_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSearch_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSearch_1.setBackground(Color.WHITE);
		btnSearch_1.setBounds(472, 170, 130, 30);
		contentPane.add(btnSearch_1);
		
		JButton btnSearch_2 = new JButton("Search");
		btnSearch_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String query = "SELECT * FROM Donarregistrationdb Where Country = ? ";
		        String text = textCountry.getText();
		        loaddata(query,text);
			}
		});
		btnSearch_2.setForeground(new Color(255, 192, 203));
		btnSearch_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSearch_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSearch_2.setBackground(Color.WHITE);
		btnSearch_2.setBounds(472, 210, 130, 30);
		contentPane.add(btnSearch_2);
		
		setUndecorated(true);
		
	}
}
