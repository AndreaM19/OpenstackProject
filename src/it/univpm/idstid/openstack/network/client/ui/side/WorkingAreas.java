package it.univpm.idstid.openstack.network.client.ui.side;

import it.univpm.idstid.openstack.network.client.ui.main.MainPanel;
import it.univpm.idstid.openstack.network.client.ui.main.TestView;
import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class WorkingAreas extends VerticalPanel implements ValueChangeHandler<String>{

	private Label lbl = new Label();
	private MainPanel p;


	public WorkingAreas(MainPanel p){
		this.p=p;

		// Create three hyperlinks that change the application's history.
		Hyperlink link0 = new Hyperlink(OpenstackNetConstants.MENU_ITEM_NETWORK, "net");
		Hyperlink link1 = new Hyperlink(OpenstackNetConstants.MENU_ITEM_SUBNET, "sub");
		Hyperlink link2 = new Hyperlink(OpenstackNetConstants.MENU_ITEM_PORT, "port");
		Hyperlink link3 = new Hyperlink(OpenstackNetConstants.MENU_ITEM_OVERVIEW, "overview");
		Hyperlink link4 = new Hyperlink("Clear view", "clear");

		// If the application starts with no history token, redirect to a new
		// 'baz' state.
		String initToken = History.getToken();
		if (initToken.length() == 0) {
			History.newItem("net");
		}

		// Add widgets to the panel.
		this.add(lbl);
		this.add(link0);
		this.add(link1);
		this.add(link2);
		this.add(link3);
		this.add(link4);

		// Add history listener
				History.addValueChangeHandler(this);

		// Now that we've setup our listener, fire the initial history state.
				History.fireCurrentHistoryState();
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		// This method is called whenever the application's history changes. Set
		// the label to reflect the current history token.
		lbl.setText("The current history token is: " + event.getValue());
		
		if(event.getValue()=="sub"){
			TestView tv=new TestView("From menu");
			p.add(tv);
		}
		if(event.getValue()=="clear"){
			p.clear();
		}
	}

}


