package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Customer;
import courierPD.DeliveryTicket;
import courierPD.Driver;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class DeliveryTicketList extends JPanel {

	/**
	 * Create the panel.
	 */
	JButton btnDelete;
	JButton btnEdit;
	public DeliveryTicketList(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		JLabel lblDeliveryTicketsList = new JLabel("Delivery Tickets List");
		lblDeliveryTicketsList.setBounds(148, 21, 140, 16);
		add(lblDeliveryTicketsList);
		
		DefaultListModel listModel = new DefaultListModel();
		for (Entry<String, DeliveryTicket> DeliveryTicketEntry : courier.getDeliveryTicket().entrySet())
			listModel.addElement(DeliveryTicketEntry.getValue());
		
		JList list = new JList(listModel);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue() !=null)
				{
					btnEdit.setEnabled(true);
					btnDelete.setEnabled(true);
				}
				DeliveryTicket dt = (DeliveryTicket)list.getSelectedValue();
			}
		});
		list.setBounds(51, 60, 345, 155);
		add(list);
		
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
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeliveryTicketEdit deliveryTicketEdit = new DeliveryTicketEdit(currentFrame, courier, (DeliveryTicket)list.getSelectedValue(), false);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(deliveryTicketEdit);
				currentFrame.getContentPane().revalidate();
			}
		});
		btnEdit.setBounds(171, 245, 117, 29);
		btnEdit.setEnabled(false);
		add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courier.removeDileveryTicket((DeliveryTicket)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(300, 245, 117, 29);
		btnDelete.setEnabled(false);
		add(btnDelete);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(currentFrame,courier);
				currentFrame.revalidate();
			}
		});
		btnBack.setBounds(171, 271, 117, 29);
		add(btnBack);
		
		

	}
}
