package it.univpm.idstid.openstack.network.client.ui.main;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.VerticalPanel;

public class TestView extends VerticalPanel {

	public TestView(String message){
		// Create a Label and an HTML widget.
		HTML html = new HTML(
				"This is a <b>TEST</b> label: "+message, true);

		// Add them to the root panel.
		this.add(html);
	}
}
