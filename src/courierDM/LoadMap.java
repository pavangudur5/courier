package courierDM;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import courierPD.Courier;
import courierPD.DijAlgo;
import courierPD.Graph;
import courierPD.Intersection;
import courierPD.StreetSegment;

public class LoadMap {
	
	private List<Intersection> nodes;
	private List<StreetSegment> edges;
	
	public void loadMapinfo(Courier mycourier) {
		
		nodes = new ArrayList<Intersection>();
		edges = new ArrayList<StreetSegment>();
		for(int i = 0; i < 102; i++ )
		{
			Intersection location = new Intersection("" +i, "" +i);
		nodes.add(location);
		}
		
		
		String fileName1 = "streets.csv";
		String line = null;
		try {
		FileReader fileReader1 = new FileReader(fileName1);
		BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
		
		while((line = bufferedReader1.readLine()) != null)
		{
			String [] block = line.split(",");
			switch (block[0])
			{
			case  "road":
				int x = Integer.parseInt(block[2]);
				int y = Integer.parseInt(block[3]);
				int z = Integer.parseInt(block[4]);
				addLane(block[1],x,y,z);
				
				break;
				default:
					System.out.println("something is rong in loading map info");
			}	
		}
			bufferedReader1.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Unable to open file:" +fileName1);
		}
		catch (IOException ex)
		{
			System.out.println("Error reading file:" +fileName1);
		} 
	
		Graph graph = new Graph(nodes, edges);
		DijAlgo DijAlgo = new DijAlgo(graph);

	}
	
	private void addLane(String id, int source, int destination, int weight) {
		StreetSegment lane = new StreetSegment(id, nodes.get(source), nodes.get(destination), weight);
		edges.add(lane);
		System.out.println(lane.toString());
		
	}
}
