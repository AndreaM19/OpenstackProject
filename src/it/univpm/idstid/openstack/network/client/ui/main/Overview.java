package it.univpm.idstid.openstack.network.client.ui.main;

import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Overview extends VerticalPanel {

	public Overview(){
		// Create a Label and an HTML widget.
		HTML pageTitle = new HTML(OpenstackNetConstants.HTML_PAGE_TITLE_OVERVIEW, true);
		
		HTML OverviewDescription_1 = new HTML(OpenstackNetConstants.HTML_OVERVIEW_1, true);
		HTML OverviewDescription_2 = new HTML(OpenstackNetConstants.HTML_OVERVIEW_2, true);
		// Add them to the root panel.
		this.add(pageTitle);
		this.add(OverviewDescription_1);
		this.add(OverviewDescription_2);
	}
}
