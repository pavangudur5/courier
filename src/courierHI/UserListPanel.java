package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.Customer;
import courierPD.User;

import javax.swing.JLabel;
import javax.swing.JList;

import java.util.Map.Entry;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	JButton btnEdit;
	JButton btnDelete;
	JButton btnAdd;
	private JScrollPane scrollPane;
	public UserListPanel(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		DefaultListModel listModel = new DefaultListModel();
		for (Entry<String, User> userEntry : courier.getUser().entrySet())
			listModel.addElement(userEntry.getValue());
		
		JLabel lblUserList = new JLabel("User List");
		lblUserList.setBounds(181, 20, 61, 16);
		add(lblUserList);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 54, 336, 168);
		add(scrollPane);
		
		JList list = new JList(listModel);
		scrollPane.setViewportView(list);
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			if(list.getSelectedValue()!= null)
			{
				btnEdit.setEnabled(true);
				btnDelete.setEnabled(true);
			}
			User ui = (User)list.getSelectedValue();
			}
		});
		scrollPane.setViewportView(list);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserditPanel usereditpanel = new UserditPanel(currentFrame, courier, new User(), true);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(usereditpanel);
				currentFrame.revalidate();
			}
		});
		btnAdd.setBounds(36, 240, 117, 29);
		add(btnAdd);

		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			UserditPanel usereditpanel = 
					new UserditPanel(currentFrame,courier,(User)list.getSelectedValue(), false);
			currentFrame.getContentPane().removeAll();
			currentFrame.getContentPane().add(usereditpanel);
			currentFrame.revalidate();
			}
		});
		btnEdit.setBounds(169, 240, 117, 29);
		btnEdit.setEnabled(false);
		add(btnEdit);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				courier.removeUser((User)list.getSelectedValue());
				listModel.removeElement(list.getSelectedValue());
			}
		});
		btnDelete.setBounds(302, 240, 117, 29);
		btnDelete.setEnabled(false);
		add(btnDelete);

	}
}
