package bloodbank;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Searchfor extends JFrame {

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
					Searchfor frame = new Searchfor();
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
	public Searchfor() {
		
		connection = sqliteConnection.dbConnector();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 151, 880, 339);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnClickHereTo = new JButton("Click here to View BloodRequests");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query = "SELECT * FROM Requestforblooddb";
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
		btnClickHereTo.setForeground(new Color(255, 192, 203));
		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClickHereTo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClickHereTo.setBackground(Color.WHITE);
		btnClickHereTo.setBounds(10, 90, 410, 44);
		contentPane.add(btnClickHereTo);
		
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
