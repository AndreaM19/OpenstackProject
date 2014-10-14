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
		
		// Create a grid
	    Grid grid = new Grid(4, 7);
	    grid.setStyleName("grid-working-area-homepage");
	    grid.setText(0, 0, "Testo di prova_1");
	    grid.setText(0, 1, "Testo di prova_2");
	    grid.setText(0, 2, "Testo di prova_3");
	    grid.setText(0, 3, "Testo di prova_4");
	    grid.setText(0, 4, "Testo di prova_5");
	    grid.setText(0, 5, "Testo di prova_6");
	    grid.setText(0, 6, "Testo di prova_7");
	    
	    
//	    // Add elements to the grid
//	    int numRows = grid.getRowCount();
//	    int numColumns = grid.getColumnCount();
//	    for (int row = 0; row < numRows; row++) {
//	      for (int col = 0; col < numColumns; col++) {
//	        grid.setWidget(row, col, new HTML("<h4> Grid Element </h4>"));
//	      }
//	    }
	    

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
}
