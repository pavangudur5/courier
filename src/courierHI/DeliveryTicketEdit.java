package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.DeliveryTicket;
import courierPD.User;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.lang.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JComboBox;

public class DeliveryTicketEdit extends JPanel {
	private LocalDateTime Date = LocalDateTime.now();
	DateTimeFormatter Dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	DateTimeFormatter Timeformatter = DateTimeFormatter.ofPattern("HH:mm"); 
	String FormattedDate = Date.format(Dateformatter);
	String FormattedTime = Date.format(Timeformatter);

	/**
	 * Create the panel.
	 */
	public DeliveryTicketEdit(JFrame currentFrame, Courier courier, DeliveryTicket deliveryticket, Boolean isAdd) {
		setLayout(null);
		
		JLabel lblDeliveryTicket = new JLabel("Delivery Ticket");
		lblDeliveryTicket.setBounds(253, 6, 99, 28);
		add(lblDeliveryTicket);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setBounds(47, 54, 61, 16);
		add(lblDate);
		
		JLabel labelDate = new JLabel(FormattedDate);
		labelDate.setBounds(98, 54, 120, 16);
		add(labelDate);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(230, 54, 41, 16);
		add(lblTime);
		
		JLabel labelTime = new JLabel(FormattedTime);
		labelTime.setBounds(274, 54, 61, 16);
		add(labelTime);
		
		JLabel lblOrderTakenBy = new JLabel("Order Taken By:");
		lblOrderTakenBy.setBounds(364, 54, 106, 16);
		add(lblOrderTakenBy);
		
		JComboBox comboBoxName = new JComboBox(courier.getUserList().toArray());
		comboBoxName.setBounds(469, 50, 101, 27);
		add(comboBoxName);

	}
}
