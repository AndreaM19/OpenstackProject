package it.univpm.idstid.openstack.network.client.ui.main.networks;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class NetworkGui  extends VerticalPanel{

	public NetworkGui(){
		//		this.clear();
		//add networks UI elements	
		HTML pageTitle = new HTML(OpenstackNetConstants.HTML_PAGE_TITLE_NETWORK, true);
		this.add(pageTitle);
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
