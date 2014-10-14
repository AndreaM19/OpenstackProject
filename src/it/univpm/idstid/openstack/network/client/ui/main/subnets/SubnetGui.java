package it.univpm.idstid.openstack.network.client.ui.main.subnets;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SubnetGui  extends VerticalPanel{
	private HTML br = new HTML("<br>", true);
	private HTML pageTitle=new HTML();
	
	public SubnetGui(){
//		this.clear();
		//add Subnets UI elements
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_SUBNET);
		this.add(pageTitle);
	}
	
	public void createSubnetUi(){
		this.clear();
		//add Subnets UI elements
	}
	
	public void createMultipleSubnetUi(){
		this.clear();
		//add Subnets UI elements
	}
	
	public void showSubnetUi(){
		this.clear();
		//add Subnets UI elements
	}
	
	public void updateSubnetUi(){
		this.clear();
		//add Subnets UI elements
	}

}
