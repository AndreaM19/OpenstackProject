package it.univpm.idstid.openstack.network.client.ui.main.ports;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;

public class PortGui  extends AbsolutePanel{
	private HTML br = new HTML("<br>", true);
	private HTML pageTitle=new HTML();

	public PortGui(){
		this.setSize("900px", "700px");
		//		this.clear();
		
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_PORT);
		this.add(pageTitle,0,0);

	}

	public void createPortUi(){
		this.clear();
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_PORT_CREATE);
		this.add(pageTitle,0,0);

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
		Button cancelButton = new Button("Cancel", new ClickHandler() {
			public void onClick(ClickEvent event) {
			}
		});
		this.add(cancelButton,300,340);

		Button createButton = new Button("Create", new ClickHandler() {
			public void onClick(ClickEvent event) {
			}
		});
		this.add(createButton,365,340);


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

}
