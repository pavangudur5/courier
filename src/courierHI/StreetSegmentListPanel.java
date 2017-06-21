package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StreetSegmentListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public StreetSegmentListPanel(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		JLabel lblSteetSegmentList = new JLabel("Steet Segment List");
		lblSteetSegmentList.setBounds(157, 20, 116, 16);
		add(lblSteetSegmentList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 62, 352, 159);
		add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAdd.setBounds(36, 242, 117, 29);
		add(btnAdd);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(163, 242, 117, 29);
		add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(292, 242, 117, 29);
		add(btnDelete);
		
		

	}
}
