package it.univpm.idstid.openstack.network.var;

import com.google.gwt.user.client.ui.HTML;

public class OpenstackNetConstants {
	
	//Menu items
	public static final String MENU_ITEM_NETWORK="Networks";
	public static final String MENU_ITEM_SUBNET="Subnets";
	public static final String MENU_ITEM_PORT="Ports";
	public static final String MENU_ITEM_QUOTA="Quotas";
	public static final String MENU_ITEM_OVERVIEW="Overview";

	//Page labels
	public static final String PAGE_LABEL_NETWORK="Networks";
	public static final String PAGE_LABEL_SUBNET="Subnets";
	public static final String PAGE_LABEL_PORT="Ports";
	public static final String PAGE_LABEL_QUOTA="Quotas";
	public static final String PAGE_LABEL_OVERVIEW="Overview";
	public static final String PAGE_LABEL_PORT_CREATE="Ports - Create port";
	public static final String PAGE_LABEL_PORT_UPDATE="Ports - Update port";
	
	//HTML Elements
	public static final String HTML_PAGE_TITLE_NETWORK="<h3 id='sectionTitle' class='section-title'>"+OpenstackNetConstants.PAGE_LABEL_NETWORK+"</h3>";
	public static final String HTML_PAGE_TITLE_SUBNET="<h3 id='sectionTitle' class='section-title'>"+OpenstackNetConstants.PAGE_LABEL_SUBNET+"</h3>";
	public static final String HTML_PAGE_TITLE_PORT="<h3 id='sectionTitle' class='section-title'>"+OpenstackNetConstants.PAGE_LABEL_PORT+"</h3>";
	public static final String HTML_PAGE_TITLE_QUOTA="<h3 id='sectionTitle' class='section-title'>"+OpenstackNetConstants.PAGE_LABEL_QUOTA+"</h3>";
	public static final String HTML_PAGE_TITLE_OVERVIEW="<h3 id='sectionTitle' class='section-title'>"+OpenstackNetConstants.PAGE_LABEL_OVERVIEW+"</h3>";
	public static final String HTML_PAGE_TITLE_PORT_UPDATE="<h3 id='sectionTitle' class='section-title'>"+OpenstackNetConstants.PAGE_LABEL_PORT_UPDATE+"</h3>";
	public static final String HTML_PAGE_TITLE_PORT_CREATE="<h3 id='sectionTitle' class='section-title'>"+OpenstackNetConstants.PAGE_LABEL_PORT_CREATE+"</h3>";
		
	public static final String HTML_OVERVIEW_1="<p><br>OVERVIEW NEUTRON PROJECT <br>This section shows the Openstack network functionalities, whose architecture has been renamed Neutron.<br>From here you can create a virtual network and interact with to manage subnets and ports associated with them.<br>Only to admin is given the possibility to access some functions, like the ability to define the quotas values ​​and other extended features.<br>Available functions are related to the macro-areas:<br></p>";
	public static final String HTML_OVERVIEW_2="<p>NETWORK: In Openstack a network is an isolated virtual layer-2 broadcast domain that is typically reserved for the tenant who created it unless the network is configured to be shared. Tenants can create multiple networks until they reach the thresholds specified by per-tenant quotas.<br>In the Networking API v2.0, the network is the main entity. Ports and subnets are always associated with a network.</p>";
	public static final String HTML_OVERVIEW_3="";
	
	//Label
	public static final String LABEL_ADMINSTATEUP="Admin State Up";
	public static final String LABEL_DEVICEID="Device Id";
	public static final String LABEL_NAME="Name";
	public static final String LABEL_NETWORKID="Network Id";
	public static final String LABEL_SECURITYGROUPS="Security groups";
	public static final String LABEL_SUBNETS_ASSOCIATED="Subnets associated";
	public static final String LABEL_SHARED="Shared";
	public static final String LABEL_STATUS="Status";
	public static final String LABEL_ACTIONS="Actions";
	
	//Buttons
	public static final String BUTTON_NETWORK_CREATE="Create network";
	public static final String BUTTON_NETWORK_CREATE_MULTIPLE="Create multiple network";
}
