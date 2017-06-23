package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.StreetSegment;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SteetSegmentEditPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public SteetSegmentEditPanel(JFrame currentFrame, Courier courier, StreetSegment ss, Boolean isAdd) {
		setLayout(null);
		
		JLabel lblStreetSegment = new JLabel("Street Segment");
		lblStreetSegment.setBounds(178, 18, 94, 16);
		add(lblStreetSegment);
		
		JLabel lblStreetno = new JLabel("StreetNo:");
		lblStreetno.setBounds(49, 64, 61, 16);
		add(lblStreetno);
		
		JLabel lblSource = new JLabel("Source:");
		lblSource.setBounds(49, 106, 61, 16);
		add(lblSource);
		
		JLabel lblDestination = new JLabel("Destination:");
		lblDestination.setBounds(49, 144, 77, 16);
		add(lblDestination);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(49, 189, 61, 16);
		add(lblWeight);
		
		JComboBox comboBoxSource = new JComboBox();
		comboBoxSource.setBounds(178, 102, 107, 27);
		add(comboBoxSource);
		
		JComboBox comboBoxDestination = new JComboBox();
		comboBoxDestination.setBounds(178, 140, 107, 27);
		add(comboBoxDestination);
		
		String getweight = ss.getWeight() + "";
		textField = new JTextField(getweight);
		textField.setBounds(178, 184, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(ss.getId());
		textField_1.setBounds(178, 59, 130, 26);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isAdd && !ss.getId().equals(textField_1.getText()))
				{
					courier.removeStreetSegment(ss);
					ss.setId(textField_1.getText());
					courier.addStreetSegment(ss);
				}
				if (isAdd)
				{
					ss.setId(textField_1.getText());
					courier.addStreetSegment(ss);
				}
				int weight = Integer.parseInt(textField.getText());
				ss.setWeight(weight);
				
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new StreetSegmentListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(58, 243, 117, 29);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new StreetSegmentListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(220, 243, 117, 29);
		add(btnCancel);
		
		

	}
}
