package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Customer;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;

import javax.swing.event.ListSelectionEvent;

public class CustomerListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	JButton btnEdit;
	JButton btnDelete;
	public CustomerListPanel(JFrame currentFrame,Courier courier) {
		setLayout(null);
		
		DefaultListModel listModel = new DefaultListModel();
		for (Entry<String, Customer> customerEntry : courier.getCustomer().entrySet())
			listModel.addElement(customerEntry.getValue());
		
		JLabel lblCustomersList = new JLabel("Customers List");
		lblCustomersList.setBounds(167, 23, 108, 16);
		add(lblCustomersList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 66, 355, 174);
		add(scrollPane);
		
		JList list = new JList(listModel);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue() != null)
				{
					btnEdit.setEnabled(true);
					btnDelete.setEnabled(true);
				}
				Customer si = (Customer)list.getSelectedValue();
			}
		});
		scrollPane.setViewportView(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerEditPanel customerEditPanel = 
						new CustomerEditPanel(currentFrame, courier, new Customer(), true);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(customerEditPanel);
				currentFrame.revalidate();
			}
		});
		btnAdd.setBounds(49, 252, 117, 29);
		add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerEditPanel customerEditPanel = 
						new CustomerEditPanel(currentFrame,courier,(Customer)list.getSelectedValue(), false);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(customerEditPanel);
				currentFrame.revalidate();
			}
		});
		btnEdit.setBounds(167, 252, 117, 29);
		add(btnEdit);
		btnEdit.setEnabled(false);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courier.removeCustomer((Customer)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(287, 252, 117, 29);
		add(btnDelete);
		btnDelete.setEnabled(false);

	}
}
