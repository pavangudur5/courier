package courierHI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import courierPD.Courier;

public class DriverBonusReport extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public DriverBonusReport(JFrame currentFrame, Courier courier) {

setLayout(null);
		
		JLabel lblDriverBonusReport = new JLabel("Driver Bonus Report");
		lblDriverBonusReport.setBounds(153, 41, 133, 16);
		add(lblDriverBonusReport);
		
		JLabel lblFromDate = new JLabel("From Date");
		lblFromDate.setBounds(6, 84, 74, 16);
		add(lblFromDate);
		
		JLabel lblNewLabel = new JLabel("To Date");
		lblNewLabel.setBounds(217, 84, 61, 16);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(75, 79, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(271, 79, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(413, 79, 31, 26);
		add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(32, 122, 371, 128);
		add(list);
	}

}
