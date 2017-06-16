package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.DeliveryTicket;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
//		System.out.println(deliveryticket.getCustomerNamed());

	}

}
