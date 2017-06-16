package courierHI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import courierPD.Courier;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class WeeklyBillReport extends JPanel {
	private JTextField FromDate;
	private JTextField ToDate;

	/**
	 * Create the panel.
	 */
	public WeeklyBillReport(JFrame currentFrame, Courier courier) {
		setLayout(null);
		
		JLabel lblWeeklyBillReport = new JLabel("Weekly Bill Report");
		lblWeeklyBillReport.setBounds(175, 31, 151, 16);
		add(lblWeeklyBillReport);
		
		JLabel lblFromDate = new JLabel("From Date");
		lblFromDate.setBounds(6, 85, 77, 16);
		add(lblFromDate);
		
		JLabel lblToDate = new JLabel("To Date");
		lblToDate.setBounds(207, 85, 77, 16);
		add(lblToDate);
		
		FromDate = new JTextField();
		FromDate.setBounds(78, 80, 130, 26);
		add(FromDate);
		FromDate.setColumns(10);
		
		ToDate = new JTextField();
		ToDate.setBounds(263, 80, 130, 26);
		add(ToDate);
		ToDate.setColumns(10);
		
		JList list = new JList();
		list.setBounds(42, 123, 351, 119);
		add(list);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(409, 85, 21, 16);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Send Bill");
		btnNewButton_1.setBounds(175, 254, 117, 29);
		add(btnNewButton_1);

	}

}
