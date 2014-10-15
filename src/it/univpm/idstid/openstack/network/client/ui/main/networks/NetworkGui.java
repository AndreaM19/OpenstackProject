package it.univpm.idstid.openstack.network.client.ui.main.networks;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

public class NetworkGui extends AbsolutePanel{
	private HTML br = new HTML("<br>", true);
	private HTML pageTitle=new HTML();
	private Button createB;
	private Button createMultipleB;

	public NetworkGui(){
		this.setSize("900px", "700px");
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_NETWORK);
//		Button createB=new Button(OpenstackNetConstants.BUTTON_NETWORK_CREATE);
//		Button createMultipleB=new Button(OpenstackNetConstants.BUTTON_NETWORK_CREATE_MULTIPLE);

		Grid grid = new Grid(4, 7);
		grid=this.setGrid(grid);

		this.setHomeButtons();

		//Adding elements
		this.add(pageTitle,0,0);
		this.add(createB,0,80);
		this.add(createMultipleB,120,80);
		this.add(grid, 0, 150);
	}

	public void createNetworkUi(){
		this.clear();
		//add networks UI elements
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_NETWORK_CREATE);
		this.add(pageTitle,0,0);

		CreateNetworkUiClass netUi = new CreateNetworkUiClass();
		this.add(netUi);		
	}

	public void createMultipleNetworkUi(){
		this.clear();
		//add networks UI elements
	}

	public void showNetworkUi(){
		this.clear();
		//create networks UI elements
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_NETWORK_SHOW);
		Label status = new Label(OpenstackNetConstants.LABEL_STATUS);
		Label statusValue = new Label("-");
		Label subnets = new Label(OpenstackNetConstants.LABEL_SUBNETS_ASSOCIATED);
		Label subnetsValue = new Label("-");
		Label adminState = new Label(OpenstackNetConstants.LABEL_ADMINSTATEUP);
		Label adminStateValue = new Label("-");
		Label name = new Label(OpenstackNetConstants.LABEL_NAME);
		Label nameValue = new Label("-");
		Label tenantId = new Label(OpenstackNetConstants.LABEL_TENANTID);
		Label tenantIdValue = new Label("-");
		Label id = new Label(OpenstackNetConstants.LABEL_ID);
		Label idValue = new Label("-");
		Button okB=new Button(OpenstackNetConstants.BUTTON_OK);

		//Adding elements
		this.add(pageTitle,0,0);
		this.add(status,0,80);
		this.add(statusValue,160,80);
		this.add(subnets,0,120);
		this.add(subnetsValue,160,120);
		this.add(adminState,0,170);
		this.add(adminStateValue,160,170);
		this.add(name,0,220);
		this.add(nameValue,160,220);
		this.add(tenantId,0,270);
		this.add(tenantIdValue,160,270);
		this.add(id,0,320);
		this.add(idValue,160,320);
		this.add(okB,0,380);
	}

	public void updateNetworkUi(){
		this.clear();

		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_NETWORK_UPDATE);
		this.add(pageTitle,0,0);

		//Port Name
		Label portLabel = new Label(OpenstackNetConstants.LABEL_PORTNAME);
		this.add(portLabel,0,100);
		TextBox portText = new TextBox();
		this.add(portText,150,100);

		//Shared
		Label sharedLabel = new Label(OpenstackNetConstants.LABEL_SHARED);
		this.add(sharedLabel,0,140);
		CheckBox sharedCheck = new CheckBox();
		this.add(sharedCheck,150,140);

		//Admin State Up
		Label adminLabel = new Label(OpenstackNetConstants.LABEL_ADMINSTATEUP);
		this.add(adminLabel,0,180);
		CheckBox adminCheck = new CheckBox();
		this.add(adminCheck,150,180);

		// Add Cancel and Update button
		Button cancelButton = new Button("Cancel", new ClickHandler() {
			public void onClick(ClickEvent event) {
			}
		});
		this.add(cancelButton,295,240);

		Button updateButton = new Button("Update", new ClickHandler() {
			public void onClick(ClickEvent event) {
			}
		});
		this.add(updateButton,360,240);

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

		// Add elements to the grid
		int numRows = g.getRowCount();
		int numColumns = g.getColumnCount();
		for (int row = 1; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				g.setWidget(row, col, new HTML("<h4> Element </h4>"));
				if(col==6) g.setWidget(row, col, this.setIcons());
			}
		}
		return g;
	}

	//Set icons
	private FlowPanel setIcons(){
		FlowPanel panel=new FlowPanel();

		Image showIcon=new Image();
		showIcon.setUrl(OpenstackNetConstants.ICON_SHOW);
		showIcon.setPixelSize(25, 25);
		panel.add(showIcon);

		Image updateIcon=new Image();
		updateIcon.setUrl(OpenstackNetConstants.ICON_UPDATE);
		updateIcon.setPixelSize(25, 25);
		panel.add(updateIcon);

		Image deleteIcon=new Image();
		deleteIcon.setUrl(OpenstackNetConstants.ICON_DELETE);
		deleteIcon.setPixelSize(25, 25);
		panel.add(deleteIcon);

		return panel;
	}

	//Set button Handler
	private void setHomeButtons(){

		this.createB=new Button(OpenstackNetConstants.BUTTON_NETWORK_CREATE, new ClickHandler() {
			public void onClick(ClickEvent event) {
				createNetworkUi();
			}
		});
		this.createMultipleB=new Button(OpenstackNetConstants.BUTTON_NETWORK_CREATE_MULTIPLE, new ClickHandler() {
			public void onClick(ClickEvent event) {

			}
		});
	}


		//--------------------------------------------------------
		//Private classes
		//--------------------------------------------------------
		private class CreateNetworkUiClass extends AbsolutePanel{

			private CreateNetworkUiClass(){
				this.setSize("900px", "700px");

				//Name
				Label nameLabel = new Label(OpenstackNetConstants.LABEL_NAME);
				this.add(nameLabel,0,100);
				TextBox nameText = new TextBox();
				this.add(nameText,150,100);

				//Admin State Up
				Label adminLabel = new Label(OpenstackNetConstants.LABEL_ADMINSTATEUP);
				this.add(adminLabel,0,180);
				CheckBox adminCheck = new CheckBox();
				this.add(adminCheck,150,180);

				// Add Cancel and Create button
				Button cancelButton = new Button(OpenstackNetConstants.BUTTON_CANCEL, new ClickHandler() {
					public void onClick(ClickEvent event) {
					}
				});
				this.add(cancelButton,300,240);

				Button createButton = new Button(OpenstackNetConstants.BUTTON_CREATE, new ClickHandler() {
					public void onClick(ClickEvent event) {
					}
				});
				this.add(createButton,365,240);
			}
		}
	}
