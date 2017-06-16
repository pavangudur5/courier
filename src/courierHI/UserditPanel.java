package courierHI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import courierPD.Courier;
import courierPD.User;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class UserditPanel extends JPanel {
	private JTextField textFieldName;
	private JTextField textFieldNumber;
	private JPasswordField textFieldPass;
	private JTextField textFieldPhno;
	private JTextField textFieldEmail;
	private JTextField textFieldRole;

	/**
	 * Create the panel.
	 */
	public UserditPanel(JFrame currentFrame, Courier courier, User user, boolean isAdd) {
		setLayout(null);
		
		JLabel lblEditUser = new JLabel("Edit User");
		lblEditUser.setBounds(183, 20, 61, 16);
		add(lblEditUser);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(58, 66, 61, 16);
		add(lblName);
		
		JLabel lblNumber = new JLabel("Number:");
		lblNumber.setBounds(58, 92, 61, 16);
		add(lblNumber);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(58, 120, 74, 16);
		add(lblPassword);
		
		JLabel lblPhno = new JLabel("Phno:");
		lblPhno.setBounds(58, 148, 61, 16);
		add(lblPhno);
		
		JLabel lblEmailid = new JLabel("EmailId:");
		lblEmailid.setBounds(58, 176, 61, 16);
		add(lblEmailid);
		
		JLabel lblRole = new JLabel("Role:");
		lblRole.setBounds(58, 204, 61, 16);
		add(lblRole);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isAdd && !user.getNumber().equals(textFieldNumber.getText()))
				{
					courier.removeUser(user);
					user.setNumber(textFieldNumber.getText());
					courier.addUser(user);
				}
				if (isAdd)
				{
					user.setNumber(textFieldNumber.getText());
					courier.addUser(user);
				}
				
				user.setEmail_id(textFieldEmail.getText());
				user.setRole(textFieldRole.getText());
				user.setName(textFieldName.getText());
				user.setPassword(textFieldPass.getText());
				user.setPhno(textFieldPhno.getText());
				
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UserListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(91, 248, 117, 29);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new UserListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(234, 248, 117, 29);
		add(btnCancel);
		
		textFieldName = new JTextField(user.getName());
		textFieldName.setBounds(158, 61, 130, 26);
		add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldNumber = new JTextField(user.getNumber());
		textFieldNumber.setBounds(158, 87, 130, 26);
		add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		textFieldPass = new JPasswordField(user.getPassword());
		textFieldPass.setBounds(158, 115, 130, 26);
		add(textFieldPass);
		textFieldPass.setColumns(10);
		
		textFieldPhno = new JTextField(user.getPhno());
		textFieldPhno.setBounds(158, 143, 130, 26);
		add(textFieldPhno);
		textFieldPhno.setColumns(10);
		
		textFieldEmail = new JTextField(user.getEmail_id());
		textFieldEmail.setBounds(158, 171, 130, 26);
		add(textFieldEmail);
		textFieldEmail.setColumns(10);
		
		textFieldRole = new JTextField(user.getRole());
		textFieldRole.setBounds(158, 199, 130, 26);
		add(textFieldRole);
		textFieldRole.setColumns(10);

	}
}
