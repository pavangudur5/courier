package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.DeliveryTicket;

public class GenerateDriverCopy extends JPanel {

	/**
	 * Create the panel.
	 */
	public GenerateDriverCopy(JFrame currentFrame, Courier courier, DeliveryTicket deliveryticket) {
		
		System.out.println(deliveryticket.getCustomerNamed());

	}

}
