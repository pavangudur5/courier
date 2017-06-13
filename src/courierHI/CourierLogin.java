package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.User;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Label;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CourierLogin extends JPanel {
	private JPasswordField passwordField;
	private Label lblMessageLabel_1;
	private JTextField textFieldname;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CourierLogin(JFrame currentFrame, Courier courier) {
		setLayout(null);
		JMenuBar menuBar = new JMenuBar();
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(200, 26, 61, 16);
		add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(66, 78, 73, 16);
		add(lblUsername);
		
		JLabel lblUserenumber = new JLabel("UsereNumber:");
		lblUserenumber.setBounds(66, 127, 89, 16);
		add(lblUserenumber);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(66, 179, 89, 16);
		add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 174, 126, 26);
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				if(User.isAuthorized(passwordField.getText()) )
//				{
//						currentFrame.getContentPane().removeAll();
//						currentFrame.getContentPane().add(new CourierHomePanel(courier));
//						currentFrame.getContentPane().revalidate();
//				}
				if(1 == 1)
				{
					
					lblMessageLabel_1.setText("Invalid Password for Number. Try Again");
				}
				
			}
		});
		btnLogin.setBounds(184, 236, 117, 29);
		add(btnLogin);
		
		textFieldname = new JTextField();
		textFieldname.setBounds(209, 73, 130, 26);
		add(textFieldname);
		textFieldname.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(209, 122, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		lblMessageLabel_1 = new Label("");
		lblMessageLabel_1.setBounds(82, 59, 262, 16);
		add(lblMessageLabel_1);

	}
}
