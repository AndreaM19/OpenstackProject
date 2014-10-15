package it.univpm.idstid.openstack.network.client.ui.main.ports;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;

public class PortGui  extends AbsolutePanel{
	private HTML br = new HTML("<br>", true);
	private HTML pageTitle=new HTML();
	private Button createB;
	private Button createMultipleB;

	public PortGui(){
		
		this.setSize("900px", "700px");
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_PORT);

		Grid grid = new Grid(4, 4);
		grid=this.setGrid(grid);
		
		this.setHomeButtons();

		//Adding elements
		this.add(pageTitle,0,0);
		this.add(createB,0,80);
		this.add(createMultipleB,120,80);
		this.add(grid, 0, 150);

	}

	public void createPortUi(){
		this.clear();
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_PORT_CREATE);
		this.add(pageTitle,0,0);

		CreatePortUiClass netUi = new CreatePortUiClass();
		this.add(netUi);		
	}

	public void createMultiplePortUi(){
		this.clear();
		//add Ports UI elements
	}

	public void showPortUi(){
		this.clear();
		//add Ports UI elements
	}

	public void updatePortUi(){
		this.clear();

		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_PORT_UPDATE);
		this.add(pageTitle,0,0);

		//Port Name
		Label portLabel = new Label(OpenstackNetConstants.LABEL_PORTNAME);
		this.add(portLabel,0,100);
		TextBox portText = new TextBox();
		this.add(portText,150,100);

		//Security groups
		Label securityLabel = new Label(OpenstackNetConstants.LABEL_SECURITYGROUPS);
		this.add(securityLabel,0,140);
		TextBox securityText = new TextBox();
		this.add(securityText,150,140);

		//Ip address
		Label ipLabel = new Label(OpenstackNetConstants.LABEL_IPADDRESS);
		this.add(ipLabel,0,180);
		TextBox ipText = new TextBox();
		this.add(ipText,150,180);

		//Admin State Up
		Label adminLabel = new Label(OpenstackNetConstants.LABEL_ADMINSTATEUP);
		this.add(adminLabel,0,220);
		CheckBox adminCheck = new CheckBox();
		this.add(adminCheck, 150,220);

		// Add Cancel and Update button
		Button cancelButton = new Button("Cancel", new ClickHandler() {
			public void onClick(ClickEvent event) {
			}
		});
		this.add(cancelButton,295,340);

		Button updateButton = new Button("Update", new ClickHandler() {
			public void onClick(ClickEvent event) {
			}
		});
		this.add(updateButton,360,340);
	}

	//--------------------------------------------------------
	//Private methods
	//--------------------------------------------------------

	//Set grid properties
	private Grid setGrid(Grid g){
		// Create a grid
		g.setStyleName("grid-working-area-homepage");
		g.setText(0, 0, OpenstackNetConstants.LABEL_NAME);
		g.setText(0, 1, OpenstackNetConstants.LABEL_PORTNUMBER);
		g.setText(0, 2, OpenstackNetConstants.LABEL_STATUS);
		g.setText(0, 3, OpenstackNetConstants.LABEL_ACTIONS);

		// Add elements to the grid
		int numRows = g.getRowCount();
		int numColumns = g.getColumnCount();
		for (int row = 1; row < numRows; row++) {
			for (int col = 0; col < numColumns; col++) {
				g.setWidget(row, col, new HTML("<h4> Element </h4>"));
				if(col==3) g.setWidget(row, col, this.setIcons());
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
	
	private void setHomeButtons(){		
		this.createB=new Button(OpenstackNetConstants.BUTTON_PORT_CREATE, new ClickHandler() {
			public void onClick(ClickEvent event) {
				createPortUi();
			}
		});
		this.createMultipleB=new Button(OpenstackNetConstants.BUTTON_PORT_CREATE_MULTIPLE, new ClickHandler() {
			public void onClick(ClickEvent event) {
				
			}
		});
		
	}

	//--------------------------------------------------------
	//Private classes
	//--------------------------------------------------------
	private class CreatePortUiClass extends AbsolutePanel{

		private CreatePortUiClass(){
			this.setSize("900px", "700px");
			//Admin State Up
			Label adminLabel = new Label(OpenstackNetConstants.LABEL_ADMINSTATEUP);
			this.add(adminLabel,0,100);
			CheckBox adminCheck = new CheckBox();
			this.add(adminCheck, 150,100);

			//Device Id
			Label deviceLabel = new Label(OpenstackNetConstants.LABEL_DEVICEID);
			this.add(deviceLabel,0,140);
			TextBox deviceText = new TextBox();
			this.add(deviceText,150,140);

			//Name
			Label nameLabel = new Label(OpenstackNetConstants.LABEL_NAME);
			this.add(nameLabel,0,180);
			TextBox nameText = new TextBox();
			this.add(nameText,150,180);

			//Network Id
			Label networkLabel = new Label(OpenstackNetConstants.LABEL_NETWORKID);
			this.add(networkLabel,0,220);
			TextBox networkText = new TextBox();
			this.add(networkText,150,220);

			//Security groups
			Label securityLabel = new Label(OpenstackNetConstants.LABEL_SECURITYGROUPS);
			this.add(securityLabel,0,260);
			TextBox securityText = new TextBox();
			this.add(securityText,150,260);

			// Add Cancel and Create button
			Button cancelButton = new Button(OpenstackNetConstants.BUTTON_CANCEL, new ClickHandler() {
				public void onClick(ClickEvent event) {
				}
			});
			this.add(cancelButton,300,340);

			Button createButton = new Button(OpenstackNetConstants.BUTTON_CREATE, new ClickHandler() {
				public void onClick(ClickEvent event) {
				}
			});
			this.add(createButton,365,340);

		}
	}
}
