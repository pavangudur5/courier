package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Customer;
import courierPD.DeliveryTicket;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;

public class DeliveryTicketList extends JPanel {

	/**
	 * Create the panel.
	 */
	public DeliveryTicketList(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		JLabel lblDeliveryTicketsList = new JLabel("Delivery Tickets List");
		lblDeliveryTicketsList.setBounds(148, 21, 140, 16);
		add(lblDeliveryTicketsList);
		
		JList list = new JList();
		list.setBounds(51, 60, 345, 155);
		add(list);
		
//		DefaultListModel listModel = new DefaultListModel();
//		for (Entry<String, DeliveryTicket> customerEntry : courier.getDeliveryTicket().entrySet())
//			listModel.addElement(DeliveryTicketEntry.getValue());
//		Complete this.
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryTicketEdit deliveryTicketEdit = new DeliveryTicketEdit(currentFrame, courier, new DeliveryTicket(), true);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(deliveryTicketEdit);
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCreate.setBounds(42, 245, 117, 29);
		add(btnCreate);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryTicketEdit deliveryTicketEdit = new DeliveryTicketEdit(currentFrame, courier, (DeliveryTicket)list.getSelectedValue(), false);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(deliveryTicketEdit);
				currentFrame.getContentPane().revalidate();
			}
		});
		btnEdit.setBounds(171, 245, 117, 29);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				courier.removeDeliveryTicket((DeliveryTicket)list.getSelectedValue());
//				listModel.removeElement(list.getSelectedValue());
//				Add this after adding the delivery ticket.
			}
		});
		btnDelete.setBounds(300, 245, 117, 29);
		add(btnDelete);
		
		

	}
}
