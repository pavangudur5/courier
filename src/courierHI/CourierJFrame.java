package courierHI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import courierPD.Courier;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CourierJFrame extends JFrame {

	private JPanel contentPane;
	private JFrame currentFrame;

	/**
	 * Launch the application.
	 */
	public static void run(final Courier courier) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourierJFrame frame = new CourierJFrame(courier);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CourierJFrame(final Courier courier) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		currentFrame = this;
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMain = new JMenu("Maintenance");
//		mnMain.setEnabled(false);
		menuBar.add(mnMain);
		
		JMenuItem mntmCustomer = new JMenuItem("Customer");
		mntmCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new CustomerListPanel(currentFrame,courier));
				getContentPane().revalidate();
			}
		});
		mnMain.add(mntmCustomer);
		
		JMenuItem mntmDriver = new JMenuItem("Driver");
		mntmDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new DriverListPanel(currentFrame,courier));
				getContentPane().revalidate();
			}
		});
		mnMain.add(mntmDriver);
		
		JMenuItem mntmUser = new JMenuItem("User");
		mntmUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new UserListPanel(currentFrame,courier));
				getContentPane().revalidate();
			}
		});
		mnMain.add(mntmUser);
		
		JMenuItem mntmConstZone = new JMenuItem("Const. Zone");
		mntmConstZone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new ConstZoneListPanel(currentFrame,courier));
				getContentPane().revalidate();
			}
		});
		mnMain.add(mntmConstZone);
		
		JMenuItem mntmMapInfo = new JMenuItem("Map Info");
		mnMain.add(mntmMapInfo);
		
		JMenuItem mntmCompanyInfo = new JMenuItem("Company Info");
		mntmCompanyInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new CompanyinfoEditPanel(currentFrame, courier));
				getContentPane().revalidate();
			}
		});
		mnMain.add(mntmCompanyInfo);
		
		JMenuItem mntmDeliveryTicket = new JMenuItem("Delivery Ticket");
		mntmDeliveryTicket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new DeliveryTicketList(currentFrame, courier));
				getContentPane().revalidate();
			}
		});
		mnMain.add(mntmDeliveryTicket);
		
		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);
		
		JMenuItem mntmWeeklyBillReport = new JMenuItem("Weekly Bill");
		mntmWeeklyBillReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new WeeklyBillReport(currentFrame, courier));
				getContentPane().revalidate();
			}
		});
		mnReports.add(mntmWeeklyBillReport);
		
		JMenuItem mntmDeliveryBonusReport = new JMenuItem("Delivery Bonus");
		mntmDeliveryBonusReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				getContentPane().add(new DriverBonusReport(currentFrame, courier));
				getContentPane().revalidate();
			}
		});
		mnReports.add(mntmDeliveryBonusReport);
		
		JMenuItem mntmCustomerPerformanceReport = new JMenuItem("Customer Performance");
		mnReports.add(mntmCustomerPerformanceReport);
		
		contentPane = new CourierLogin(currentFrame, courier);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
	}
}
