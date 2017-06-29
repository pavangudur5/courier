package courierHI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import courierPD.Courier;
import courierPD.Intersection;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntersectionEditPanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public IntersectionEditPanel(JFrame currentFrame, Courier courier, Intersection intersection, Boolean isAdd) {
		setLayout(null);
		
		JLabel lblIntersectionEdit = new JLabel("Intersection Edit");
		lblIntersectionEdit.setBounds(167, 25, 103, 16);
		add(lblIntersectionEdit);
		
		JLabel lblIntersection = new JLabel("Intersection");
		lblIntersection.setBounds(56, 94, 81, 16);
		add(lblIntersection);
		
		textField = new JTextField();
		textField.setBounds(197, 89, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isAdd && !intersection.getId().equals(textField.getText()))
				{
					courier.removeIntersection(intersection);
					intersection.setId(textField.getText());
					courier.addIntersection(intersection);
				}
				if (isAdd)
				{
					intersection.setId(textField.getText());
					courier.addIntersection(intersection);
				}
				
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new IntersectionListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(75, 193, 117, 29);
		add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new IntersectionListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(236, 193, 117, 29);
		add(btnCancel);
	}
}
