package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Customer;
import courierPD.Driver;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DriverEditPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public DriverEditPanel(JFrame currentFrame, Courier courier, Driver driver, boolean isAdd) {
		setLayout(null);
		
		JLabel lblDriverEditPanel = new JLabel("Edit Driver");
		lblDriverEditPanel.setBounds(180, 23, 73, 16);
		add(lblDriverEditPanel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(56, 67, 61, 16);
		add(lblName);
		
		JLabel lblNumber = new JLabel("Number:");
		lblNumber.setBounds(56, 110, 61, 16);
		add(lblNumber);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isAdd && !driver.getNumber().equals(textField_1.getText()))
				{
					courier.removeDriver(driver);
					driver.setNumber(textField_1.getText());
					courier.addDriver(driver);
					if (isAdd)
					{
						driver.setNumber(textField_1.getText());
						courier.addDriver(driver);
					}
					driver.setName(textField.getText());
					
					currentFrame.getContentPane().removeAll();
					currentFrame.getContentPane().add(new DriverListPanel(currentFrame,courier));
					currentFrame.getContentPane().revalidate();
				}
			}
		});
		btnSave.setBounds(90, 223, 117, 29);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DriverListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(261, 223, 117, 29);
		add(btnCancel);
		
		textField = new JTextField(driver.getName());
		textField.setBounds(146, 62, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(driver.getNumber());
		textField_1.setBounds(146, 105, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);

	}

}
