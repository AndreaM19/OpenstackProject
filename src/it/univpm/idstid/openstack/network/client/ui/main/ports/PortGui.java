package it.univpm.idstid.openstack.network.client.ui.main.ports;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class PortGui  extends VerticalPanel{
	private HTML br = new HTML("<br>", true);
	private HTML pageTitle=new HTML();
	
	public PortGui(){
//		this.clear();
		//add Ports UI elements
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_PORT);
		this.add(pageTitle);
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
