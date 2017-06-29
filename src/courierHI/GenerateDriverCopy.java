package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierDM.CourierDM;
import courierPD.Courier;
import courierPD.DeliveryTicket;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GenerateDriverCopy extends JPanel {

	/**
	 * Create the panel.
	 */
	public GenerateDriverCopy(JFrame currentFrame, Courier courier, DeliveryTicket deliveryticket) {
		setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DeliveryTicketEdit(currentFrame,courier, deliveryticket,false));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnBack.setBounds(0, 6, 117, 29);
		add(btnBack);
		
		JLabel lblTicketNumber = new JLabel("Ticket Number:");
		lblTicketNumber.setBounds(164, 11, 97, 16);
		add(lblTicketNumber);
		
		JLabel labelticNumber = new JLabel(deliveryticket.getNumber());
		labelticNumber.setBounds(273, 11, 61, 16);
		add(labelticNumber);

	}
}
