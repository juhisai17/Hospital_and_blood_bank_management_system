package bloodbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;


public class Login extends JFrame {

	/**
	 * 
	 */
	
	Connection connection = null;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLoginHere;
	private JTextField textUsername;
	private JPasswordField textPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		connection = sqliteConnection.dbConnector();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,900, 500);
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
		
		txtLoginHere = new JTextField();
		txtLoginHere.setEditable(false);
		txtLoginHere.setBorder(null);
		txtLoginHere.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtLoginHere.setForeground(new Color(255, 255, 255));
		txtLoginHere.setBackground(new Color(255, 192, 203));
		txtLoginHere.setHorizontalAlignment(SwingConstants.CENTER);
		txtLoginHere.setText("Login Here");
		txtLoginHere.setBounds(373, 55, 150, 40);
		panel_1.add(txtLoginHere);
		txtLoginHere.setColumns(10);
		
		textUsername = new JTextField();
		textUsername.setBorder(null);
		textUsername.setForeground(new Color(255, 192, 203));
		textUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textUsername.setBounds(348, 148, 310, 40);
		panel_1.add(textUsername);
		textUsername.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBorder(null);
		textPassword.setEchoChar('*');
		textPassword.setForeground(new Color(255, 192, 203));
		textPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textPassword.setBounds(348, 212, 310, 40);
		panel_1.add(textPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
		            String query = "SELECT * FROM Userdb where username=? and password=? ";
		            PreparedStatement pst = connection.prepareStatement(query);
		            pst.setString(1, textUsername.getText());
		            pst.setString(2, textPassword.getText());

		            ResultSet rs = pst.executeQuery();
		            int count = 0;
		            while (rs.next()) {
		                count = count + 1;
		            }
		            if (count == 1) {
		                //JOptionPane.showMessageDialog(null, "Successful Login");
		                new Afterlogin().setVisible(true);
		                this.setVisible(false);
		            } else {
		                JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
		            }

		            rs.close();
		            pst.close();
		            connection.close();
		        } catch (Exception ez) {
		            JOptionPane.showMessageDialog(null, ez);
		        }
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}

		});
		btnLogin.setForeground(new Color(255, 192, 203));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setBounds(403, 275, 100, 40);
		panel_1.add(btnLogin);
		
		JButton btnClickHereTo = new JButton("Click here to Sign Up");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp su = new SignUp();
				su.setVisible(true);
				dispose();
			}
		});
		
		btnClickHereTo.setForeground(new Color(255, 192, 203));
		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClickHereTo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClickHereTo.setBackground(Color.WHITE);
		btnClickHereTo.setBounds(331, 340, 235, 40);
		panel_1.add(btnClickHereTo);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(216, 147, 122, 40);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(216, 211, 122, 40);
		panel_1.add(lblPassword);
		
		setUndecorated(true);
	}
}
