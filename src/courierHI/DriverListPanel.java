package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Driver;

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

public class DriverListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	JButton btnEdit;
	JButton btnDelete;
	public DriverListPanel(JFrame currentFrame,Courier courier) {
		setLayout(null);
		
		JLabel lblDriversList = new JLabel("Driver's List");
		lblDriversList.setBounds(177, 23, 75, 16);
		add(lblDriversList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 64, 327, 159);
		add(scrollPane);
		
		DefaultListModel listModel = new DefaultListModel();
		for (Entry<String, Driver> driverEntry : courier.getDriver().entrySet())
		{
			listModel.addElement(driverEntry.getValue());
//			System.out.println(driver.toString());
		}
		
		
		JList list = new JList(listModel);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue() !=null)
				{
					btnEdit.setEnabled(true);
					btnDelete.setEnabled(true);
				}
				Driver driver = (Driver)list.getSelectedValue();
			}
		});
		scrollPane.setViewportView(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DriverEditPanel driverEditPanel = new DriverEditPanel(currentFrame, courier, new Driver(), true);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(driverEditPanel);
				currentFrame.revalidate();
			}
		});
		btnAdd.setBounds(40, 240, 117, 29);
		add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DriverEditPanel driverEditPanel = new DriverEditPanel(currentFrame, courier, (Driver)list.getSelectedValue() , true);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(driverEditPanel);
				currentFrame.revalidate();
			}
		});
		btnEdit.setBounds(177, 240, 117, 29);
		btnEdit.setEnabled(false);
		add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courier.removeDriver((Driver)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(307, 240, 117, 29);
		btnDelete.setEnabled(false);
		add(btnDelete);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new CourierHomePanel(courier));
				currentFrame.revalidate();
			}
		});
		btnBack.setBounds(177, 271, 117, 29);
		add(btnBack);

	}
}
