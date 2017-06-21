package courierHI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class CustomerPerfReport extends JPanel {
	private JTextField FromDate;
	private JTextField ToDate;

	/**
	 * Create the panel.
	 */
	public CustomerPerfReport() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Performance Report");
		lblNewLabel.setBounds(127, 22, 201, 16);
		add(lblNewLabel);
		
		JLabel lblFromDate = new JLabel("From Date");
		lblFromDate.setBounds(6, 70, 73, 16);
		add(lblFromDate);
		
		FromDate = new JTextField();
		FromDate.setBounds(72, 65, 130, 26);
		add(FromDate);
		FromDate.setColumns(10);
		
		JLabel lblToDate = new JLabel("To Date");
		lblToDate.setBounds(201, 70, 61, 16);
		add(lblToDate);
		
		ToDate = new JTextField();
		ToDate.setBounds(254, 65, 130, 26);
		add(ToDate);
		ToDate.setColumns(10);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(408, 65, 24, 26);
		add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(26, 98, 392, 171);
		add(list);

	}
}
