package courierHI;

import javax.swing.JPanel;

import courierPD.Courier;
import courierPD.DeliveryTicket;
import courierPD.Driver;
import courierPD.User;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.lang.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class DeliveryTicketEdit extends JPanel {
	private LocalDateTime Date = LocalDateTime.now();
	DateTimeFormatter Dateformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	DateTimeFormatter Timeformatter = DateTimeFormatter.ofPattern("HH:mm"); 
	String FormattedDate = Date.format(Dateformatter);
	String FormattedTime = Date.format(Timeformatter);
	private JTextField textFieldCusName;
	private JTextField textFieldPickUpTime;
	private JTextField textFieldBillPickUp;
	Random rand = new Random();
	int  n = rand.nextInt(50) + 1;
	String nn = "" + n;
	private JTextField textFieldestdeltime;
	private JTextField textFieldEstBlocks;
	private JTextField textFieldQuotedPrice;
	private JTextField textField;
	private JTextField textFieldBillDelivery;
	private JTextField textFieldAssTime;
	private JTextField textFieldActPickUp;
	private JTextField textFieldActDel;
	private JTextField textFieldBonus;
	private JTextField textFieldPackageID;

	/**
	 * Create the panel.
	 */
	public DeliveryTicketEdit(JFrame currentFrame, Courier courier, DeliveryTicket deliveryticket, Boolean isAdd) {
		setLayout(null);
		
		JLabel lblDeliveryTicket = new JLabel("Delivery Ticket");
		lblDeliveryTicket.setBounds(253, 6, 99, 28);
		add(lblDeliveryTicket);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setBounds(47, 54, 61, 16);
		add(lblDate);
		
		JLabel labelDate = new JLabel(FormattedDate);
		labelDate.setBounds(98, 54, 120, 16);
		add(labelDate);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setBounds(230, 54, 41, 16);
		add(lblTime);
		
		JLabel labelTime = new JLabel(FormattedTime);
		labelTime.setBounds(274, 54, 61, 16);
		add(labelTime);
		
		JLabel lblOrderTakenBy = new JLabel("Order Taken By:");
		lblOrderTakenBy.setBounds(364, 54, 106, 16);
		add(lblOrderTakenBy);
		
		JComboBox comboBoxName = new JComboBox(courier.getUserList().toArray());
		comboBoxName.setBounds(469, 50, 101, 27);
		add(comboBoxName);
		
		JLabel lblPickUpInfo = new JLabel("Pick up info");
		lblPickUpInfo.setBounds(22, 88, 75, 16);
		add(lblPickUpInfo);
		
		JLabel lblCustomerNumber = new JLabel("Customer Number:");
		lblCustomerNumber.setBounds(6, 115, 120, 16);
		add(lblCustomerNumber);
		
		JLabel lblCustomerName = new JLabel("Customer  Name:");
		lblCustomerName.setBounds(6, 143, 120, 16);
		add(lblCustomerName);
		
		JLabel lblPickUpTime = new JLabel("Pick up Time:");
		lblPickUpTime.setBounds(6, 171, 85, 16);
		add(lblPickUpTime);
		
		JLabel lblBillToPick = new JLabel("Bill To pick up:");
		lblBillToPick.setBounds(6, 199, 102, 16);
		add(lblBillToPick);
		
		JLabel lblTicketInfo = new JLabel("Ticket Info");
		lblTicketInfo.setBounds(22, 249, 86, 16);
		add(lblTicketInfo);
		
		JLabel lblPackageId = new JLabel("Package ID:");
		lblPackageId.setBounds(6, 277, 75, 16);
		add(lblPackageId);
		
		JLabel lblEstDelTime = new JLabel("Est. Delivery Time:");
		lblEstDelTime.setBounds(6, 305, 120, 16);
		add(lblEstDelTime);
		
		JLabel lblEstBlocks = new JLabel("Est. Blocks");
		lblEstBlocks.setBounds(6, 333, 75, 16);
		add(lblEstBlocks);
		
		JLabel lblQuotedPrice = new JLabel("Quoted Price:");
		lblQuotedPrice.setBounds(6, 361, 91, 16);
		add(lblQuotedPrice);
		
		JComboBox comboBox = new JComboBox(courier.getCustomerList().toArray());
		comboBox.setBounds(138, 111, 130, 27);
		add(comboBox);
		
		textFieldCusName = new JTextField(deliveryticket.getCustomerNamep());
		textFieldCusName.setBounds(138, 138, 130, 26);
		add(textFieldCusName);
		textFieldCusName.setColumns(10);
		
		textFieldPickUpTime = new JTextField();
		textFieldPickUpTime.setBounds(138, 166, 130, 26);
		add(textFieldPickUpTime);
		textFieldPickUpTime.setColumns(10);
		
		textFieldBillPickUp = new JTextField();
		textFieldBillPickUp.setBounds(138, 194, 130, 26);
		add(textFieldBillPickUp);
		textFieldBillPickUp.setColumns(10);
		
		textFieldestdeltime = new JTextField(deliveryticket.getEstDeliveryTime());
		textFieldestdeltime.setBounds(138, 300, 130, 26);
		add(textFieldestdeltime);
		textFieldestdeltime.setColumns(10);
		
		textFieldEstBlocks = new JTextField();
		textFieldEstBlocks.setBounds(138, 328, 130, 26);
		add(textFieldEstBlocks);
		textFieldEstBlocks.setColumns(10);
		
		textFieldQuotedPrice = new JTextField();
		textFieldQuotedPrice.setBounds(138, 356, 130, 26);
		add(textFieldQuotedPrice);
		textFieldQuotedPrice.setColumns(10);
		
		JLabel lblDeliveryInfo = new JLabel("Delivery Info");
		lblDeliveryInfo.setBounds(333, 88, 85, 16);
		add(lblDeliveryInfo);
		
		JLabel lblCustomerNumber_1 = new JLabel("Customer Number:");
		lblCustomerNumber_1.setBounds(319, 115, 120, 16);
		add(lblCustomerNumber_1);
		
		JComboBox comboBox_1 = new JComboBox(courier.getCustomerList().toArray());
		comboBox_1.setBounds(451, 111, 130, 27);
		add(comboBox_1);
		
		JLabel lblCustomerName_1 = new JLabel("Customer Name:");
		lblCustomerName_1.setBounds(319, 143, 120, 16);
		add(lblCustomerName_1);
		
		textField = new JTextField();
		textField.setBounds(451, 138, 130, 26);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblBillToDeliveryUp = new JLabel("Bill To Delivery Up:");
		lblBillToDeliveryUp.setBounds(319, 171, 120, 16);
		add(lblBillToDeliveryUp);
		
		textFieldBillDelivery = new JTextField();
		textFieldBillDelivery.setBounds(451, 166, 130, 26);
		add(textFieldBillDelivery);
		textFieldBillDelivery.setColumns(10);
		
		JLabel lblDriversNumber = new JLabel("Driver's Number:");
		lblDriversNumber.setBounds(319, 249, 120, 16);
		add(lblDriversNumber);
		
		JLabel lblAssignedTime = new JLabel("Assigned Time:");
		lblAssignedTime.setBounds(319, 277, 99, 16);
		add(lblAssignedTime);
		
		JLabel lblActPickUp = new JLabel("Act. Pick up Time:");
		lblActPickUp.setBounds(319, 305, 130, 16);
		add(lblActPickUp);
		
		JLabel lblActDeliveryTime = new JLabel("Act. Delivery Time:");
		lblActDeliveryTime.setBounds(319, 333, 130, 16);
		add(lblActDeliveryTime);
		
		JLabel lblBonus = new JLabel("Bonus\n");
		lblBonus.setBounds(319, 361, 61, 16);
		add(lblBonus);
		
		JComboBox ComboDriverNum = new JComboBox(courier.getDriverList().toArray());
		ComboDriverNum.setBounds(451, 245, 106, 27);
		add(ComboDriverNum);
		
		textFieldAssTime = new JTextField();
		textFieldAssTime.setBounds(451, 272, 130, 26);
		add(textFieldAssTime);
		textFieldAssTime.setColumns(10);
		
		textFieldActPickUp = new JTextField();
		textFieldActPickUp.setBounds(451, 300, 130, 26);
		add(textFieldActPickUp);
		textFieldActPickUp.setColumns(10);
		
		textFieldActDel = new JTextField();
		textFieldActDel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				calculatebonus();
			}

			private void calculatebonus() {
				String esttime = deliveryticket.getEstDeliveryTime();
				String acttime = textFieldActDel.getText();
						System.out.println(esttime + acttime);
				if (esttime.equalsIgnoreCase(acttime))
				{ 
					deliveryticket.setBonus("2");
					textFieldBonus.setText("2");
				}
				else //complete this
				{
					deliveryticket.setBonus("0");
					textFieldBonus.setText("0");
				}
				
			}
		});
		textFieldActDel.setBounds(451, 328, 130, 26);
		add(textFieldActDel);
		textFieldActDel.setColumns(10);
		textFieldBonus = new JTextField();
		textFieldBonus.setBounds(451, 356, 130, 26);
		add(textFieldBonus);
		textFieldBonus.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!isAdd && !deliveryticket.getNumber().equals(n));
				{
					courier.removeDileveryTicket(deliveryticket);
					deliveryticket.setNumber(textFieldPackageID.getText());
					courier.addDileveryTicket(deliveryticket);
				}
				if (isAdd)
				{
					
					courier.addDileveryTicket(deliveryticket);
					deliveryticket.setNumber(textFieldPackageID.getText());
				}
				
				System.out.println(deliveryticket.getNumber());
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DeliveryTicketList(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
				
				deliveryticket.setBonus(textFieldBonus.getText());
				LocalTime ef,df;
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:MM");
				ef = LocalTime.parse(textFieldActDel.getText(), formatter);
				df = LocalTime.parse(textFieldPickUpTime.getText(), formatter);
				deliveryticket.setActDeliveryTime(ef);
			}
		});
		btnSave.setBounds(154, 402, 117, 29);
		add(btnSave);
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new DeliveryTicketList(currentFrame,courier));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnCancel.setBounds(319, 402, 117, 29);
		add(btnCancel);
		
		JButton btnGenerateDriverCopy = new JButton("Generate Driver Copy");
		btnGenerateDriverCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(new GenerateDriverCopy(currentFrame,courier,deliveryticket));
				currentFrame.getContentPane().revalidate();
			}
		});
		btnGenerateDriverCopy.setBounds(366, 208, 171, 29);
		add(btnGenerateDriverCopy);
		
		textFieldPackageID = new JTextField(deliveryticket.getNumber());
		textFieldPackageID.setBounds(138, 249, 130, 26);
		add(textFieldPackageID);
		textFieldPackageID.setColumns(10);
		
		JLabel labelpacid = new JLabel(nn);
		labelpacid.setBounds(138, 277, 61, 16);
		add(labelpacid);

	}
}
