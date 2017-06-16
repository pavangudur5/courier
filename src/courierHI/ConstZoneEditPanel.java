package courierHI;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import courierPD.ConstZone;
import courierPD.Courier;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;


public class ConstZoneEditPanel extends JPanel {
	private JTextField FromDate;
	private JTextField ToDate;
	private JTextField ConstructionNo;
	DateTimeFormatter Dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	/**
	 * Create the panel.
	 */
	public ConstZoneEditPanel(JFrame currentFrame, Courier courier, ConstZone constzone, Boolean isAdd) {
		setLayout(null);
		JLabel lblConstructionEdit = new JLabel("Construction Zone Edit");
		lblConstructionEdit.setBounds(156, 28, 145, 16);
		add(lblConstructionEdit);
		
		JLabel lblConstructionNumber = new JLabel("Construction No");
		lblConstructionNumber.setBounds(48, 81, 104, 16);
		add(lblConstructionNumber);
		
		JLabel lblAvenue = new JLabel("Avenue");
		lblAvenue.setBounds(48, 109, 46, 16);
		add(lblAvenue);
		
		JLabel lblStreetNo = new JLabel("Street No");
		lblStreetNo.setBounds(48, 137, 58, 16);
		add(lblStreetNo);
		
		JLabel lblFromDate = new JLabel("From Date");
		lblFromDate.setBounds(48, 165, 65, 16);
		add(lblFromDate);
		
		JLabel lblToDate = new JLabel("To Date");
		lblToDate.setBounds(48, 193, 49, 16);
		add(lblToDate);
		
		JComboBox Avenue = new JComboBox();
		Avenue.setBounds(175, 105, 65, 27);
		add(Avenue);
		
		JComboBox StreetNo = new JComboBox();
		StreetNo.setBounds(175, 133, 65, 27);
		add(StreetNo);
		
		FromDate = new JTextField();
		FromDate.setBounds(175, 160, 130, 26);
		add(FromDate);
		FromDate.setColumns(10);
		
		ToDate = new JTextField();
		ToDate.setBounds(175, 188, 130, 26);
		add(ToDate);
		ToDate.setColumns(10);
		
		ConstructionNo = new JTextField();
		ConstructionNo.setBounds(175, 76, 130, 26);
		add(ConstructionNo);
		ConstructionNo.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!isAdd && !constzone.getConstructionNo().equals(ConstructionNo.getText()))
				{
					courier.removeConstZone(constzone);
					constzone.setConstructionNo(ConstructionNo.getText());
					courier.addConstZone(constzone);
				}
				if(isAdd)
				{
					constzone.setConstructionNo(ConstructionNo.getText());
					courier.addConstZone(constzone);
				}
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new ConstZoneListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnSave.setBounds(86, 241, 117, 29);
		add(btnSave);
		
		JButton btnDelete = new JButton("Cancel");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new ConstZoneListPanel(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnDelete.setBounds(244, 241, 117, 29);
		add(btnDelete);

	}

}
