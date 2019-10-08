package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import domain.VojnoLice;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfirmationLogIn extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtUspesnoLogovanje;

	

	/**
	 * Create the dialog.
	 */
	public ConfirmationLogIn(VojnoLice vl) {
		setTitle("Greencorp Defences");
		setBounds(100, 100, 390, 152);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.WHITE);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			txtUspesnoLogovanje = new JTextField();
			txtUspesnoLogovanje.setFont(new Font("Tahoma", Font.PLAIN, 20));
			txtUspesnoLogovanje.setText("Uspesno logovanje");
			txtUspesnoLogovanje.setBackground(Color.WHITE);
			txtUspesnoLogovanje.setBorder(null);
			txtUspesnoLogovanje.setCaretColor(Color.WHITE);
			
			
			contentPanel.add(txtUspesnoLogovanje);
			txtUspesnoLogovanje.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String confText = txtUspesnoLogovanje.getText();
						if(vl.getSifraPodslojnogNaloga() != null  && confText.equals(vl.getSifraPodslojnogNaloga())) {
							FormMainHighCommand newFormHighCommand = new FormMainHighCommand(vl);
							newFormHighCommand.setVisible(true);
						}else {
							FormMain newFormMain = new FormMain(vl);
							newFormMain.setVisible(true);
						}
						
						dispose();
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		
	}

}
