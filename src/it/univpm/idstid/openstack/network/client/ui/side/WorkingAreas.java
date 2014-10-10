package it.univpm.idstid.openstack.network.client.ui.side;

import it.univpm.idstid.openstack.network.client.ui.main.MainPanel;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class WorkingAreas extends VerticalPanel implements ValueChangeHandler<String>{

	private Label lbl = new Label();


	public WorkingAreas(MainPanel P){

		// Create three hyperlinks that change the application's history.
		Hyperlink link0 = new Hyperlink("link to foo", "foo");
		Hyperlink link1 = new Hyperlink("link to bar", "bar");
		Hyperlink link2 = new Hyperlink("link to baz", "baz");

		// If the application starts with no history token, redirect to a new
		// 'baz' state.
		String initToken = History.getToken();
		if (initToken.length() == 0) {
			History.newItem("baz");
		}

		// Add widgets to the panel.
		this.add(lbl);
		this.add(link0);
		this.add(link1);
		this.add(link2);

		// Add history listener
				History.addValueChangeHandler(this);

		// Now that we've setup our listener, fire the initial history state.
				History.fireCurrentHistoryState();
	}

	public void onValueChange(ValueChangeEvent<String> event) {
		// This method is called whenever the application's history changes. Set
		// the label to reflect the current history token.
		lbl.setText("The current history token is: " + event.getValue());
	}

}


