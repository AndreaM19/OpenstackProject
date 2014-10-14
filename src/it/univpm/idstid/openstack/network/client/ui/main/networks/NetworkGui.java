package it.univpm.idstid.openstack.network.client.ui.main.networks;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;


public class NetworkGui extends AbsolutePanel{
	private HTML br = new HTML("<br>", true);
	private HTML pageTitle=new HTML();

	public NetworkGui(){
		//		this.clear();
		//add networks UI elements
		this.setSize("900px", "700px");
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_NETWORK);
		Button createB=new Button(OpenstackNetConstants.BUTTON_NETWORK_CREATE);
		Button createMultipleB=new Button(OpenstackNetConstants.BUTTON_NETWORK_CREATE_MULTIPLE);
		
		Grid grid = new Grid(4, 7);
		grid=this.setGrid(grid);

		//Adding elements
		this.add(pageTitle,0,0);
		this.add(createB,0,80);
		this.add(createMultipleB,120,80);
		this.add(grid, 0, 150);
				
	}

	public void createNetworkUi(){
		this.clear();
		//add networks UI elements
	}

	public void createMultipleNetworkUi(){
		this.clear();
		//add networks UI elements
	}

	public void showNetworkUi(){
		this.clear();
		//add networks UI elements
	}

	public void updateNetworkUi(){
		this.clear();
		//add networks UI elements
	}
	
	//--------------------------------------------------------
	//Private methods
	//--------------------------------------------------------
	
	//Set grid properties
	private Grid setGrid(Grid g){
		// Create a grid
	    g.setStyleName("grid-working-area-homepage");
	    g.setText(0, 0, OpenstackNetConstants.LABEL_NAME);
	    g.setText(0, 1, OpenstackNetConstants.LABEL_NETWORKID);
	    g.setText(0, 2, OpenstackNetConstants.LABEL_SUBNETS_ASSOCIATED);
	    g.setText(0, 3, OpenstackNetConstants.LABEL_SHARED);
	    g.setText(0, 4, OpenstackNetConstants.LABEL_STATUS);
	    g.setText(0, 5, OpenstackNetConstants.LABEL_ADMINSTATEUP);
	    g.setText(0, 6, OpenstackNetConstants.LABEL_ACTIONS);
	    
//	    // Add elements to the grid
//	    int numRows = grid.getRowCount();
//	    int numColumns = grid.getColumnCount();
//	    for (int row = 0; row < numRows; row++) {
//	      for (int col = 0; col < numColumns; col++) {
//	        grid.setWidget(row, col, new HTML("<h4> Grid Element </h4>"));
//	      }
//	    }
	    return g;
	}
}
