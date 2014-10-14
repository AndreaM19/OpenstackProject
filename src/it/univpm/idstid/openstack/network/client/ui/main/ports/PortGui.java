package it.univpm.idstid.openstack.network.client.ui.main.ports;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

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
		//add Ports UI elements
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_PORT);
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
		
		//Network Id
		Label networkLabel = new Label(OpenstackNetConstants.LABEL_NETWORKID);
		this.add(networkLabel,0,220);
		
		//Security groups
		Label securityLabel = new Label(OpenstackNetConstants.LABEL_SECURITYGROUPS);
		this.add(securityLabel,0,260);
		
		
				
	}
	
	public void createPortUi(){
		this.clear();
		//add Ports UI elements
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
		//add Ports UI elements
	}

}
