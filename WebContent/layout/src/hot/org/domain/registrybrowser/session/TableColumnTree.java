package org.domain.registrybrowser.session;

import org.jboss.seam.annotations.Name;
import org.richfaces.model.TreeNodeImpl;

@Name("stations")
public class TableColumnTree {
	
	private TreeNodeImpl stationRoot = new TreeNodeImpl();

	private TreeNodeImpl stationNodes = new TreeNodeImpl(); 

	private String[] kickRadioFeed = { "Hall & Oates - Kiss On My List", 
			"David Bowie - Let's Dance", "Lyn Collins - Think (About It)",
			"Kim Carnes - Bette Davis Eyes", 
			"KC & the Sunshine Band - Give It Up" };
	
	public TableColumnTree(){
		stationRoot.setData("KickRadio");

		stationNodes.addChild(0, stationRoot);

		for (int i = 0; i < kickRadioFeed.length; i++){

		    TreeNodeImpl child = new TreeNodeImpl();

		    child.setData(kickRadioFeed[i]);

		    stationRoot.addChild(i, child);

		}
		stationNodes.addChild(1, stationRoot);

	}

	public TreeNodeImpl getStationRoot() {
		return stationRoot;
	}

	public void setStationRoot(TreeNodeImpl stationRoot) {
		this.stationRoot = stationRoot;
	}

	public TreeNodeImpl getStationNodes() {
		
		System.out.println("Station Nodes Called");
		stationRoot.setData("KickRadio");

		stationNodes.addChild(0, stationRoot);

		for (int i = 0; i < kickRadioFeed.length; i++){

		    TreeNodeImpl child = new TreeNodeImpl();

		    child.setData(kickRadioFeed[i]);

		    stationRoot.addChild(i, child);

		}
		return stationNodes;
	}

	public void setStationNodes(TreeNodeImpl stationNodes) {
		this.stationNodes = stationNodes;
	}

	public String[] getKickRadioFeed() {
		return kickRadioFeed;
	}

	public void setKickRadioFeed(String[] kickRadioFeed) {
		this.kickRadioFeed = kickRadioFeed;
	}
	
	


}
