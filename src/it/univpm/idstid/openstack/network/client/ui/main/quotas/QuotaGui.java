package it.univpm.idstid.openstack.network.client.ui.main.quotas;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class QuotaGui  extends VerticalPanel{
	private HTML br = new HTML("<br>", true);
	private HTML pageTitle=new HTML();
	
	public QuotaGui(){
//		this.clear();
		//add Quota UI elements	
		pageTitle.setHTML(OpenstackNetConstants.HTML_PAGE_TITLE_PORT);
		this.add(pageTitle);
	}
	
	public void showQuotaUi(){
		this.clear();
		//add Quota UI elements
	}
	
	public void updateQuotaUi(){
		this.clear();
		//add Quota UI elements
	}
}
