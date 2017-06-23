package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Driver;
import courierPD.StreetSegment;

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

public class StreetSegmentListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	JButton btnEdit;
	JButton btnDelete;
	public StreetSegmentListPanel(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		JLabel lblSteetSegmentList = new JLabel("Steet Segment List");
		lblSteetSegmentList.setBounds(157, 20, 116, 16);
		add(lblSteetSegmentList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 62, 352, 159);
		add(scrollPane);
		
		DefaultListModel listModel = new DefaultListModel();
		for (Entry<String, StreetSegment> streetsegmentEntry : courier.getSg().entrySet())
		listModel.addElement(streetsegmentEntry.getValue());
		
		
		JList list = new JList(listModel);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue() !=null)
				{
					btnEdit.setEnabled(true);
					btnDelete.setEnabled(true);
				}
				StreetSegment SS = (StreetSegment)list.getSelectedValue();
			}
		});
		scrollPane.setViewportView(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
		});
		btnAdd.setBounds(36, 242, 117, 29);
		add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.setBounds(163, 242, 117, 29);
		add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(292, 242, 117, 29);
		add(btnDelete);
		
		

	}
}
