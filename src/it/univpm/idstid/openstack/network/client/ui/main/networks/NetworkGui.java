package it.univpm.idstid.openstack.network.client.ui.main.networks;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class NetworkGui extends VerticalPanel{
	private HTML br = new HTML("<br>", true);
	private HTML pageTitle=new HTML();

	public NetworkGui(){
		//		this.clear();
		//add networks UI elements	
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_NETWORK);
		Button button=new Button("Test Button");
		
		this.add(pageTitle);
		this.add(br);
		this.add(button);
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
