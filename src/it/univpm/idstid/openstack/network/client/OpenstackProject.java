package it.univpm.idstid.openstack.network.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

//SASA SITUATION
/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class OpenstackProject implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		// Create a Label and an HTML widget.
		Label lbl = new Label("This is just text.  It will not be interpreted "
				+ "as <html>.");

		HTML html = new HTML(
				"This is <b>HTML</b>.  It will be interpreted as such if you specify "
						+ "the <span style='font-family:fixed'>asHTML</span> flag.", true);

		// Add them to the root panel.
		VerticalPanel panel = new VerticalPanel();
		panel.add(lbl);
		panel.add(html);
		RootPanel.get("contentSection").add(panel);

	}
}
