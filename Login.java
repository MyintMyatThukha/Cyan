package samplePrj;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtname;
	private JLabel lblpassword;
	private JPasswordField txtpassword;
	private JLabel lblImage;
	static boolean firstTime = true;

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
		setTitle("Login Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblname = new JLabel("Enter username");
		lblname.setForeground(new Color(255, 0, 128));
		lblname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblname.setBackground(new Color(128, 255, 0));
		lblname.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblname.setBounds(10, 34, 140, 27);
		contentPane.add(lblname);
		
		txtname = new JTextField();
		txtname.setBounds(160, 33, 150, 27);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		lblpassword = new JLabel("Enter Password");
		lblpassword.setForeground(new Color(255, 0, 128));
		lblpassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblpassword.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblpassword.setBackground(new Color(128, 255, 0));
		lblpassword.setBounds(10, 79, 140, 27);
		contentPane.add(lblpassword);
		
		txtpassword = new JPasswordField();
		txtpassword.setBounds(160, 81, 150, 25);
		contentPane.add(txtpassword);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setForeground(new Color(128, 0, 128));
		btnlogin.setBackground(new Color(255, 0, 128));
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtname.getText().equals("Admin") && txtpassword.getText().equals("1234")) {
					JOptionPane.showMessageDialog(null, "Login successfully!!");
				
				AddShop addShop = new AddShop();
				addShop.setVisible(true);
				
				dispose();
				}
				
				
				else if(txtname.getText().equals("User") && txtpassword.getText().equals("1212")) {
					JOptionPane.showMessageDialog(null, "Login successfully!!");
					
					ViewShopList viewShop = new ViewShopList();
					viewShop.setVisible(true);
					
					dispose();
				}
			
				else
					JOptionPane.showMessageDialog(null, "Please try again. Username and password are incorrect!");
			}
		});
		btnlogin.setBounds(122, 131, 89, 45);
		contentPane.add(btnlogin);
		
		JButton btncancel = new JButton("Cancel");
		btncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtname.setText(null);
				txtpassword.setText(null);
			}
		});
		btncancel.setForeground(new Color(128, 0, 128));
		btncancel.setBackground(new Color(255, 0, 128));
		btncancel.setBounds(221, 131, 89, 45);
		contentPane.add(btncancel);
		
		lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(Login.class.getResource("/IMG/download (7).jpg")));
		lblImage.setBounds(320, 33, 104, 142);
		contentPane.add(lblImage);
	}
}
