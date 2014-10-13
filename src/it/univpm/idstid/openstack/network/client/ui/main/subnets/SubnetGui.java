package it.univpm.idstid.openstack.network.client.ui.main.subnets;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SubnetGui  extends VerticalPanel{
	
	public SubnetGui(){
//		this.clear();
		//add Subnets UI elements
		HTML pageTitle = new HTML(OpenstackNetConstants.HTML_PAGE_TITLE_SUBNET, true);
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
