package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.DeliveryTicket;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeliveryTicketEdit extends JPanel {

	/**
	 * Create the panel.
	 */
	public DeliveryTicketEdit(JFrame currentFrame, Courier courier, DeliveryTicket deliveryticket, Boolean isAdd) {
		setLayout(null);
		
		JLabel lblDeliveryTicket = new JLabel("Delivery Ticket");
		lblDeliveryTicket.setBounds(173, 17, 99, 16);
		add(lblDeliveryTicket);

	}
}
