package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domain.VojnoLice;

public class FormMain extends JFrame {

	private JPanel contentPane;
	private VojnoLice currentUser;


	/**
	 * Create the frame.
	 */
	public FormMain(VojnoLice currUsr) {
		setTitle("Greencorp Defences");
		
		currentUser = currUsr;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
