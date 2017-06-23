package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Customer;
import courierPD.Intersection;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class IntersectionListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	JButton btnEdit;
	JButton btnDelete;
	public IntersectionListPanel(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		DefaultListModel listModel = new DefaultListModel();
		for (Entry<String, Intersection> intersectionEntry : courier.getIs().entrySet())
				listModel.addElement(intersectionEntry.getValue());
		
		JLabel lblIntersections = new JLabel("Intersections");
		lblIntersections.setBounds(174, 18, 82, 16);
		add(lblIntersections);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(55, 55, 338, 146);
		add(scrollPane);
		
		JList list = new JList(listModel);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue() != null)
				{
					btnEdit.setEnabled(true);
					btnDelete.setEnabled(true);
				}
				Intersection si = (Intersection)list.getSelectedValue();
			}
		});
		scrollPane.setViewportView(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntersectionEditPanel intersectioneditpanel = new IntersectionEditPanel(currentFrame, courier, new Intersection(), true);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(intersectioneditpanel);
				currentFrame.revalidate();
			}
		});
		btnAdd.setBounds(38, 232, 117, 29);
		add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntersectionEditPanel intersectioneditpanel = new IntersectionEditPanel(currentFrame, courier, (Intersection)list.getSelectedValue(), true);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(intersectioneditpanel);
				currentFrame.revalidate();
			}
		});
		btnEdit.setBounds(164, 232, 117, 29);
		btnEdit.setEnabled(false);
		add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnDelete.setBounds(293, 232, 117, 29);
		btnDelete.setEnabled(false);
		add(btnDelete);

	}
}
