package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.User;

import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Label;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CourierLogin extends JPanel {
	private JPasswordField passwordField;
	private Label lblMessageLabel_1;
	private DefaultComboBoxModel userlist;
	private JComboBox usercomboBox;

	/**
	 * Create the panel.
	 */
	public CourierLogin(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(200, 26, 61, 16);
		add(lblLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(82, 109, 73, 16);
		add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(82, 153, 89, 16);
		add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 148, 126, 26);
		add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User user = (User) usercomboBox.getSelectedItem();
				
				if(user.isAuthorized(passwordField.getText()) )
				{
						currentFrame.getContentPane().removeAll();
						currentFrame.getContentPane().add(new CourierHomePanel(courier));
						currentFrame.getContentPane().revalidate();
				}
				else
				{
					
					lblMessageLabel_1.setText("Invalid Password for Number. Try Again");
				}
				
			}
		});
		btnLogin.setBounds(155, 236, 117, 29);
		add(btnLogin);
		
		lblMessageLabel_1 = new Label("");
		lblMessageLabel_1.setBounds(82, 59, 262, 16);
		add(lblMessageLabel_1);
		
		userlist= new  DefaultComboBoxModel(courier.getUserList().toArray());
		usercomboBox = new JComboBox(userlist);
		usercomboBox.setBounds(200, 105, 126, 27);
		add(usercomboBox);

	}
}
