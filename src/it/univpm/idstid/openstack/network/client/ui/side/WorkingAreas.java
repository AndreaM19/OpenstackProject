package it.univpm.idstid.openstack.network.client.ui.side;

import it.univpm.idstid.openstack.network.client.ui.main.MainPanel;
import it.univpm.idstid.openstack.network.client.ui.main.Overview;
import it.univpm.idstid.openstack.network.client.ui.main.TestView;
import it.univpm.idstid.openstack.network.client.ui.main.networks.NetworkGui;
import it.univpm.idstid.openstack.network.client.ui.main.ports.PortGui;
import it.univpm.idstid.openstack.network.client.ui.main.subnets.SubnetGui;
import it.univpm.idstid.openstack.network.var.OpenstackNetConstants;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class WorkingAreas extends VerticalPanel implements ValueChangeHandler<String>{

	//	private Label lbl = new Label();
	private MainPanel p;


	public WorkingAreas(MainPanel p){
		this.p=p;

		// Create three hyperlinks that change the application's history.
		Hyperlink net = new Hyperlink(OpenstackNetConstants.MENU_ITEM_NETWORK, "net");
		Hyperlink sub = new Hyperlink(OpenstackNetConstants.MENU_ITEM_SUBNET, "sub");
		Hyperlink port = new Hyperlink(OpenstackNetConstants.MENU_ITEM_PORT, "port");
		Hyperlink overview = new Hyperlink(OpenstackNetConstants.MENU_ITEM_OVERVIEW, "overview");
		HTML br = new HTML("<br>", true);
		

		// If the application starts with no history token, redirect to a new
		// 'net' state.
		String initToken = History.getToken();
		if (initToken.length() == 0) {
			History.newItem("overview");
		}

		// Add widgets to the panel.
		this.add(net);
		this.add(sub);
		this.add(port);
		this.add(overview);
		this.add(br);

		// Add history listener
		History.addValueChangeHandler(this);

		// Now that we've setup our listener, fire the initial history state.
		History.fireCurrentHistoryState();
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		// This method is called whenever the application's history changes. Set
		// the content to reflect the current history token.

		TestView tv;

		switch(event.getValue()){
		case "net":
			//Add network gui
			p.clear();
			NetworkGui ng=new NetworkGui();
			p.add(ng);
			break;

		case "sub":
			//Add subnet gui
			p.clear();
			SubnetGui sg=new SubnetGui();
			p.add(sg);
			break;

		case "port":
			//Add port gui
			p.clear();
			PortGui pg=new PortGui();
			p.add(pg);
			break;

		case "overview":
			//Add overview gui
			p.clear();
			Overview ov=new Overview();
			p.add(ov);
			break;
		}

	}

}


