package courierHI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import courierPD.Courier;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyinfoEditPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public CompanyinfoEditPanel(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		JLabel lblCompanyInfo = new JLabel("Company Info");
		lblCompanyInfo.setBounds(178, 6, 119, 16);
		add(lblCompanyInfo);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(64, 39, 61, 16);
		add(lblName);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(64, 76, 61, 16);
		add(lblAddress);
		
		JLabel lblSt = new JLabel("st.");
		lblSt.setBounds(161, 76, 24, 16);
		add(lblSt);
		
		JLabel lblAve = new JLabel("Ave.");
		lblAve.setBounds(260, 76, 37, 16);
		add(lblAve);
		
		textField = new JTextField(courier.getname());
		textField.setBounds(161, 34, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(courier.getstreet());
		textField_1.setBounds(186, 71, 47, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(courier.getavenue());
		textField_2.setBounds(295, 71, 47, 26);
		add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				courier.setname(textField.getText());
				courier.setavenue(textField_2.getText());
				courier.setstreet(textField_1.getText());
				courier.setBlocksToMile(textField_3.getText());
				courier.setBonusAmount(textField_5.getText());
				courier.setDelivery_Chargers(textField_4.getText());
				currentFrame.getContentPane().add(new CourierHomePanel(courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(79, 232, 117, 29);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new CourierHomePanel(courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(225, 232, 117, 29);
		add(btnCancel);
		
		JLabel lblBlocksToMile = new JLabel("Blocks To Mile:");
		lblBlocksToMile.setBounds(64, 119, 95, 16);
		add(lblBlocksToMile);
		
		textField_3 = new JTextField(courier.getBlocksToMile());
		textField_3.setBounds(207, 114, 47, 26);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDeliveryChargers = new JLabel("Delivery Chargers:");
		lblDeliveryChargers.setBounds(64, 157, 119, 16);
		add(lblDeliveryChargers);
		
		textField_4 = new JTextField(courier.getDelivery_Chargers());
		textField_4.setBounds(207, 152, 47, 26);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblBonus = new JLabel("Bonus:");
		lblBonus.setBounds(64, 193, 61, 16);
		add(lblBonus);
		
		textField_5 = new JTextField(courier.getBonusAmount());
		textField_5.setBounds(207, 190, 47, 26);
		add(textField_5);
		textField_5.setColumns(10);

	}
}
