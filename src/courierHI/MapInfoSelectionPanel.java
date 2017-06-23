package courierHI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import courierPD.Courier;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MapInfoSelectionPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MapInfoSelectionPanel(JFrame currentFrame, Courier courier) {
		setLayout(new BorderLayout(0, 0));
		
		JButton btnStreetSegment = new JButton("Street Segment");
		btnStreetSegment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StreetSegmentListPanel streetsegmentlistpanel = new StreetSegmentListPanel(currentFrame, courier);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(streetsegmentlistpanel);
				currentFrame.revalidate();
			}
		});
		add(btnStreetSegment, BorderLayout.WEST);
		
		JButton btnIntersections = new JButton("Intersections");
		btnIntersections.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IntersectionListPanel intersectionlistpanel = new IntersectionListPanel(currentFrame , courier);
				currentFrame.getContentPane().removeAll();
				currentFrame.getContentPane().add(intersectionlistpanel);
				currentFrame.revalidate();
			}
		});
		add(btnIntersections, BorderLayout.EAST);
		
		JLabel lblMapInfo = new JLabel("         \t     \t\t Map Info");
		add(lblMapInfo, BorderLayout.CENTER);

	}

}
