package courierHI;

import courierDM.CourierDM;
import courierDM.LoadMap;
import courierHI.CourierJFrame;
import courierPD.Courier;

public class CourierStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courier courier = new Courier();
		LoadMap loadmap = new LoadMap();
		try
		{
			courierDM.CourierDM.LoadCompanyInfo(courier);
			courierDM.CourierDM.LoadCustomerInfo(courier);
			loadmap.loadMapinfo(courier);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		CourierJFrame.run(courier);
	}

}
