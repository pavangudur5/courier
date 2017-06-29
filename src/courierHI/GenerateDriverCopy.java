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
		
		JLabel lblFrom = new JLabel("From :");
		lblFrom.setBounds(22, 47, 61, 16);
		add(lblFrom);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(115, 47, 97, 16);
		add(lblNewLabel);
		
		JLabel lblTo = new JLabel("To: ");
		lblTo.setBounds(22, 96, 61, 16);
		add(lblTo);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(115, 96, 79, 16);
		add(lblNewLabel_1);
		
		JLabel lblEstTime = new JLabel("Est. Time:");
		lblEstTime.setBounds(22, 157, 95, 16);
		add(lblEstTime);
		
		JLabel label = new JLabel();
		label.setBounds(115, 157, 61, 16);
		add(label);

		
		
	}
}
