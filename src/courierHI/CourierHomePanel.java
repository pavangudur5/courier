package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;

import javax.swing.JLabel;

public class CourierHomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CourierHomePanel(Courier courier) {
		setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setBounds(188, 83, 61, 16);
		add(lblWelcome);
		
		JLabel lblAcmeCourierSystem = new JLabel(courier.getname());
		lblAcmeCourierSystem.setBounds(152, 130, 135, 16);
		add(lblAcmeCourierSystem);

	}
}
