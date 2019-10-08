package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;
import domain.VojnoLice;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FromStart extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private JLabel lblLblerrorlogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FromStart frame = new FromStart();
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
	public FromStart() {
		setTitle("Greencorp Defences");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Controller cont = new Controller();
					
					char[] pas = passwordField.getPassword();
					
					VojnoLice vl = cont.vojnoLiceLogIn(textFieldUsername.getText().trim(), new String(pas));
					
					
				
					ConfirmationLogIn cl = new ConfirmationLogIn(vl);
					cl.setVisible(true);
					
					
					setVisible(false);
				
					
					
					
				} catch (Exception e2) {
					lblLblerrorlogin.setText(e2.getMessage());
				}
				
				
				
			}
		});
		btnLogIn.setBounds(398, 135, 89, 23);
		contentPane.add(btnLogIn);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(388, 47, 125, 20);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(388, 22, 125, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(388, 79, 125, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(388, 100, 125, 20);
		contentPane.add(passwordField);
		
		lblLblerrorlogin = new JLabel("");
		lblLblerrorlogin.setForeground(Color.RED);
		lblLblerrorlogin.setBounds(388, 180, 125, 14);
		contentPane.add(lblLblerrorlogin);
	}
}
