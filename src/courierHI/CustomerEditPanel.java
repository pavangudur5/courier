 package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Customer;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerEditPanel extends JPanel {
	private JTextField textFieldName;
	private JTextField textFieldNumber;
	private JTextField textFieldPhno;
	private JTextField textField;
	private JTextField textField_1;
	JButton btnSave;

	/**
	 * Create the panel.
	 */
	public CustomerEditPanel(JFrame currentFrame, Courier courier, Customer customer, boolean isAdd) {
		setLayout(null);
		
		
		JLabel lblEditCustomer = new JLabel("Edit Customer");
		lblEditCustomer.setBounds(169, 28, 100, 16);
		add(lblEditCustomer);
		
		JLabel lblCustomerName = new JLabel("Customer Name:");
		lblCustomerName.setBounds(39, 86, 105, 16);
		add(lblCustomerName);
		
		JLabel lblCustomerNumber = new JLabel("Customer Number:");
		lblCustomerNumber.setBounds(39, 126, 124, 16);
		add(lblCustomerNumber);
		
		JLabel lblCustomerPhno = new JLabel("Customer Phno:");
		lblCustomerPhno.setBounds(39, 166, 105, 16);
		add(lblCustomerPhno);
		
		JLabel lblCutomerAddress = new JLabel("Customer address:");
		lblCutomerAddress.setBounds(39, 207, 124, 16);
		add(lblCutomerAddress);
		
		textFieldName = new JTextField(customer.getName());
		textFieldName.setBounds(191, 81, 130, 26);
		add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldNumber = new JTextField(customer.getNumber());
		textFieldNumber.setBounds(191, 121, 130, 26);
		add(textFieldNumber);
		textFieldNumber.setColumns(10);
		
		textFieldPhno = new JTextField(customer.getPhno());
		textFieldPhno.setBounds(191, 161, 130, 26);
		add(textFieldPhno);
		textFieldPhno.setColumns(10);
		
		JLabel lblAve = new JLabel("Ave:");
		lblAve.setBounds(191, 207, 29, 16);
		add(lblAve);
		
		textField = new JTextField(customer.getAvenue());
		textField.setBounds(221, 202, 42, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblSt = new JLabel("St.");
		lblSt.setBounds(276, 207, 29, 16);
		add(lblSt);
		
		textField_1 = new JTextField(customer.getStreet());
		textField_1.setBounds(297, 202, 42, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isAdd && !customer.getNumber().equals(textFieldNumber.getText()))
				{
					courier.removeCustomer(customer);
					customer.setNumber(textFieldNumber.getText());
					courier.addCustomer(customer);
				}
				
				if (isAdd)
				{
					customer.setNumber(textFieldNumber.getText());
					courier.addCustomer(customer);
				}
				
				customer.setName(textFieldName.getText());
				customer.setAvenue(textField.getText());
				customer.setStreet(textField_1.getText());
				customer.setPhno(textFieldPhno.getText());
				
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new CustomerListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(87, 249, 117, 29);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new CustomerListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(252, 249, 117, 29);
		add(btnCancel);

	}
}
