package com.dagrest.tracklocation.utils;

public class CommonConst {
	
	public static final String 	LOG_TAG 						= "TrackLocation";
	public static final String 	STACK_TRACE						= "FALSE";
	public static final String 	TRACK_LOCATION_PROJECT_PREFIX 	= "com.dagrest.tracklocation";
	public static final String 	GOOGLE_PROJECT_NUMBER 			= "GoogleProjectNumber";
	public static final String 	IS_TRACK_LOCATION_RUNNING 		= "IsTrackLocationRunning";
	public static final String	IS_BRING_TO_TOP					= "IsBringToTop"; 
	public static final String 	APP_INST_DETAILS 				= "AppInstDetails";


	public static final String 	PREFERENCES_PHONE_NUMBER 		= "PhoneNumber";
	public static final String 	PREFERENCES_PHONE_MAC_ADDRESS 	= "PhoneMacAddress";
	public static final String 	PREFERENCES_PHONE_ACCOUNT 		= "PhoneAccount";
	// public static final String 	PREFERENCES_OWNER_GUID 			= "OwnerGuid";
	
	public static final String 	PREFERENCES_HANDLED_SMS_LIST 	= "HandledSMSList";
	
	// checkPlayServices
	public static final String 	PLAYSERVICES_ERROR	 			= "ERROR";
	public static final String 	PLAYSERVICES_DEVICE_NOT_SUPPORTED= "DEVICE_NOT_SUPPORTED";
	
	public static final String 	SHARED_PREFERENCES_NAME = "TRACK_LOCATION";
	// public static final String 	LOCATION_PROVIDER_NAME = "LOCATION_PROVIDER_NAME";
	public static final String 	LOCATION_SERVICE_INTERVAL = "LOCATION_SERVICE_INTERVAL";
	public static final String 	LOCATION_DEFAULT_UPDATE_INTERVAL = "1000"; // in milliseconds: 1000 ms = 1 second
	public static final String 	GPS = "GPS";
	public static final String 	NETWORK = "NETWORK";
	public static final String 	LOCATION_LISTENER = "LocationListener";
	public static final String 	LOCATION_INFO_ = "LOCATION_INFO_";
	public static final String 	LOCATION_INFO_GPS = "LOCATION_INFO_GPS";
	public static final String 	LOCATION_INFO_NETWORK = "LOCATION_INFO_NETWORK";
	// public static final String 	IS_LOCATION_PROVIDER_AVAILABLE = "IS_LOCATION_PROVIDER_AVAILABLE";
	public static final String 	TRACK_LOCATION_WAKE_LOCK = "TRACK_LOCATION_WAKE_LOCK";
	public static final long    REPEAT_PERIOD_DEFAULT = 60000 * 2; // 2 minutes;
	public static final long    REPEAT_PERIOD_DEFAULT_TRACKING_AUTOSTARTER = 60000; // 1 munite
	
	public static final String 	PREFERENCES_REG_ID = "registration_id";
	public static final String  REGISTRATION_ID_TO_RETURN_MESSAGE_TO = "regIDToReturnMessageTo";
	
	// Registry ID list of contacts that will be updated by requested info: location/status/...
	public static final String 	PREFERENCES_RETURN_TO_REG_ID_LIST = "return_to_reg_id_list";
	public static final String 	PREFERENCES_RETURN_TO_CONTACT_MAP = "return_to_contact_map";
	// Registry ID list of contacts that should receive notification
	public static final String 	PREFERENCES_NOTIFY_CONTACTS_LIST = "notify_contcats_list"; 
	// Registry ID list of contacts that should receive "TraclLocationService started" notification
	public static final String 	PREFERENCES_NOTIFY_START_CONTACTS_LIST = "notify_start_contcats_list"; 
	// Registry ID list of contacts that should receive "TraclLocationService stopped" notification
	public static final String 	PREFERENCES_NOTIFY_STOP_CONTACTS_LIST = "notify_stop_contcats_list"; 
	
	public static final String 	JOIN_FLAG_SMS = "JOIN_TRACK_LOCATION";
	public static final String 	JOIN_COMPLETED = "JOIN_COMPLETED";

 	public static final String 	DELIMITER = "\t";
 	public static final String 	DELIMITER_COMMA = ",";
 	public static final String 	DELIMITER_UNDERLINE = "_";
 	public static final String 	DELIMITER_ARROW = "->";
 	public static final String 	DELIMITER_COLON = ":";
 	public static final String 	DELIMITER_STRING = "####";
 	public static final String 	DELIMITER_AT = "@";
 	public static final String 	SMS_URI = "content://sms";
 	
	public static final String 	TRACK_LOCATION_DIRECTORY_PATH = "TrackLocation";         
	public static final String 	TRACK_LOCATION_LOG_FILE_NAME = "TrackLocation.log";          
	public static final String 	TRACK_LOCATION_BACKUP_FILE_NAME = "TrackLocationBackUp.dat";          
	public static final String 	ENABLE_LOG_DIRECTORY = "enable_log";
	public static final String 	CONTACT_DTAT_INPUT_FILE = "contact_device_list.dat";

 	//public static final String 	JSON_STRING_CONTACT_DEVICE_DATA = "jsonStringContactDeviceData";
 	public static final String 	JSON_STRING_CONTACT_DEVICE_DATA_LIST = "jsonStringContactDeviceDataList";
 	public static final String 	JSON_STRING_CONTACT_DATA = "jsonStringContactData";
 	public static final String 	CONTACT_LIST_SELECTED_VALUE = "selectedValue";
 	public static final String 	CONTACT_REGISTRATION_ID = "registration_id";
 	
 	// APPLICATION INFO
 	public static final String	PREFERENCES_VERSION_NUMBER = "ApplicationNumber";
 	public static final String	PREFERENCES_VERSION_NAME = "ApplicationName";
 	
// 	// BROADCAST ACTIONS
// 	// deprecated: "com.dagrest.tracklocation.service.GcmIntentService.GCM_UPDATED" use:
// 	public static final String 	BROADCAST_LOCATION_UPDATED 		= "com.dagrest.tracklocation.service.GcmIntentService.LOCATION_UPDATED";
// 	public static final String 	BROADCAST_JOIN 					= "com.dagrest.tracklocation.JoinContactList.BROADCAST_JOIN";
// 	public static final String 	BROADCAST_LOCATION_KEEP_ALIVE 	= "com.dagrest.tracklocation.Map.KEEP_ALIVE";
// 	public static final String 	BROADCAST_MESSAGE 				= "com.dagrest.tracklocation.MESSAGE";
 	
 	public static final int 	REQUEST_SELECT_PHONE_NUMBER = 1;
 	
 	public static final long    KEEP_ALIVE_TIMER_REQUEST_FROM_MAP_DELAY = 40000; // 40 seconds

 	// COMMON DIALOG
 	public final static int STYLE_NORMAL = 0;
 	
 	// SEND COMMAND
// 	public static final String	START_CMD_CONTEXT = "Context";
// 	public static final String	START_CMD_SELECTED_CONTACT_DEVICE_DATA_LIST = "SelectedContactDeviceDataList";
 	public static final String	START_CMD_SENDER_MESSAGE_DATA_CONTACT_DETAILS = "SenderMessageDataContactDetails";
 	//public static final String	PREFERENCES_CONTACT_DETAILS_SENT_FROM = "contact_details_sent_from";
 	public static final String	PREFERENCES_SEND_COMMAND_TO_ACCOUNTS = "send_command_to_accounts";
 	
 	public static final int 	MAX_RINGTIME_WITH_MAX_VOLUME = 1; // [minutes]
 	public static final String	NOBODY_RESPONDED = "nobody_responded";
}
