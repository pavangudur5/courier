package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.ConstZone;
import courierPD.Courier;
import courierPD.Customer;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class ConstZoneListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	JButton btnEdit;
	JButton btnDelete;
	public ConstZoneListPanel(JFrame currentFrame , Courier courier) {
		setLayout(null);
		
		DefaultListModel listModel = new DefaultListModel();
		for (Entry<String, ConstZone> ConstZoneEntry : courier.getConstzone().entrySet())
			listModel.addElement(ConstZoneEntry.getValue());

		JLabel lblConstructionZoneList = new JLabel("Construction Zone List");
		lblConstructionZoneList.setBounds(148, 18, 151, 16);
		add(lblConstructionZoneList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 56, 365, 168);
		add(scrollPane);
		
		JList list = new JList(listModel);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue() != null)
				{
					btnEdit.setEnabled(true);
					btnDelete.setEnabled(true);
				}
				ConstZone si = (ConstZone)list.getSelectedValue();
			}
		});
		scrollPane.setViewportView(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConstZoneEditPanel ConstZoneEditPanel = new ConstZoneEditPanel(currentFrame,courier, new ConstZone(),true);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(ConstZoneEditPanel);
				currentFrame.revalidate();
			}
		});
		btnAdd.setBounds(33, 250, 117, 29);
		add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConstZoneEditPanel ConstZoneEditPanel = new ConstZoneEditPanel(currentFrame, courier, (ConstZone)list.getSelectedValue() ,false);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(ConstZoneEditPanel);
				currentFrame.revalidate();
			}
		});
		btnEdit.setBounds(163, 250, 117, 29);
		btnEdit.setEnabled(false);
		add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courier.removeConstZone((ConstZone)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
				ConstZoneEditPanel.call(courier);
			}
		});
		btnDelete.setBounds(297, 250, 117, 29);
		btnDelete.setEnabled(false);
		add(btnDelete);

	}
}
