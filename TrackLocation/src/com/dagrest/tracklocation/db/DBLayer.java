package com.dagrest.tracklocation.db;

import com.dagrest.tracklocation.Controller;
import com.dagrest.tracklocation.datatype.ContactData;
import com.dagrest.tracklocation.datatype.DeviceData;
import com.dagrest.tracklocation.datatype.DeviceTypeEnum;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DBLayer {
	protected DBLayer() {
    }
	
	// Used to open database in synchronized way
    private static DBHelper dbHelper = null;
    
	// Initialize database
    public static void init(Context context) {
        if (dbHelper == null) {
            if (DBConst.IS_DEBUG_LOG_ENABLED)
                Log.i(DBConst.LOG_TAG_DB, context.toString());
            dbHelper = new DBHelper(context);
        }
    }
    
    // Open database for insert,update,delete in synchronized way 
    private static synchronized SQLiteDatabase open() throws SQLException {
        return dbHelper.getWritableDatabase();
    }	

	// Insert installing contact data
	public static ContactData addContactData(String contactName, String contactRegID, String contactEmail,
	                              String contactIMEI,String deviceGuid) 
	{
		ContactData contactData = new ContactData();
		try{
			final SQLiteDatabase db = open();
			
			contactData.setGuid(sqlEscapeString(Controller.generateUUID()));
			contactData.setUsername(sqlEscapeString(contactName));
			contactData.setRegistration_id(sqlEscapeString(contactRegID));
			contactData.setEmail(sqlEscapeString(contactEmail));
			           
			ContentValues cVal = new ContentValues();
			cVal.put(DBConst.CONTACT_GUID, contactData.getGuid());
			cVal.put(DBConst.CONTACT_NAME, contactData.getUsername());
			cVal.put(DBConst.CONTACT_REG_ID, contactData.getRegistration_id());
			cVal.put(DBConst.CONTACT_EMAIL, contactData.getEmail());
			cVal.put(DBConst.CONTACT_DEVICE_GUID, deviceGuid);
			           
			db.insert(DBConst.TABLE_CONTACTS_CREATE, null, cVal);
			db.close(); // Closing database connection
		} catch (Throwable t) {
			Log.i(DBConst.LOG_TAG_DB, "Exception caught: " + t.getMessage(), t);
		} 
		return contactData;
	}
    
    // Insert installing device data
    public static DeviceData addDeviceData(String  contactGuid, String deviceName, DeviceTypeEnum deviceTypeEnum,
    							 String deviceImei, String deviceNumber) 
     {
    	DeviceData deviceData = new DeviceData();
        try{
            final SQLiteDatabase db = open();
            
            deviceData.setGuid(sqlEscapeString(Controller.generateUUID()));
            deviceData.setDeviceName(sqlEscapeString(deviceName));
            deviceData.setDeviceTypeEnum(deviceTypeEnum);
            deviceData.setImei(sqlEscapeString(deviceImei));
            deviceData.setDeviceNumber(sqlEscapeString(deviceNumber));
             
            ContentValues cVal = new ContentValues();
            cVal.put(DBConst.DEVICE_GUID, deviceData.getGuid());
            cVal.put(DBConst.CONTACT_GUID, contactGuid);
            cVal.put(DBConst.DEVICE_NAME, deviceData.getDeviceName());
            cVal.put(DBConst.DEVICE_TYPE, sqlEscapeString(deviceTypeEnum.toString()));
            cVal.put(DBConst.DEVICE_IMEI, deviceData.getImei());
            cVal.put(DBConst.DEVICE_NUMBER, deviceData.getDeviceNumber());
            
            db.insert(DBConst.TABLE_DEVICE_CREATE, null, cVal);
            db.close(); // Closing database connection
        } catch (Throwable t) {
            Log.i("Database", "Exception caught: " + t.getMessage(), t);
        }
        return deviceData;
    }
     
     
//    // Adding new user
//    public static void addUserData(UserData uData) {
//        try{
//                final SQLiteDatabase db = open();
//                 
//                String imei  = sqlEscapeString(uData.getIMEI());
//                String name  = sqlEscapeString(uData.getName());
//                String message  = sqlEscapeString(uData.getMessage());
//                 
//                ContentValues cVal = new ContentValues();
//                cVal.put(KEY_USER_IMEI, imei);
//                cVal.put(KEY_USER_NAME, name);
//                cVal.put(KEY_USER_MESSAGE, message);
//                db.insert(USER_TABLE, null, cVal);
//                db.close(); // Closing database connection
//        } catch (Throwable t) {
//            Log.i("Database", "Exception caught: " + t.getMessage(), t);
//        }
//    }
  
//    // Getting single user data
//    public static UserData getUserData(int id) {
//        final SQLiteDatabase db = open();
//  
//        Cursor cursor = db.query(USER_TABLE, new String[] { KEY_ID,
//                KEY_USER_NAME, KEY_USER_IMEI,KEY_USER_MESSAGE}, KEY_ID + "=?",
//                new String[] { String.valueOf(id) }, null, null, null, null);
//        if (cursor != null)
//            cursor.moveToFirst();
//  
//        UserData data = new UserData(Integer.parseInt(cursor.getString(0)),
//                cursor.getString(1), cursor.getString(2), cursor.getString(3));
//        // return contact
//        return data;
//    }
  
//    // Getting All user data
//    public static List<UserData> getAllUserData() {
//        List<UserData> contactList = new ArrayList<UserData>();
//        // Select All Query
//        String selectQuery = "SELECT  * FROM " + USER_TABLE+" ORDER BY "+KEY_ID+" desc";
//  
//        final SQLiteDatabase db = open();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//  
//        // looping through all rows and adding to list
//        if (cursor.moveToFirst()) {
//            do {
//                UserData data = new UserData();
//                data.setID(Integer.parseInt(cursor.getString(0)));
//                data.setName(cursor.getString(1));
//                data.setIMEI(cursor.getString(2));
//                data.setMessage(cursor.getString(3));
//                // Adding contact to list
//                contactList.add(data);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//        // return contact list
//        return contactList;
//    }
     
//    // Getting users Count
//    public static int getUserDataCount() {
//        String countQuery = "SELECT  * FROM " + USER_TABLE;
//        final SQLiteDatabase db = open();
//        Cursor cursor = db.rawQuery(countQuery, null);
//         
//        int count = cursor.getCount();
//        cursor.close();
//         
//        // return count
//        return count;
//    }
     
//    // Getting installed device have self data or not
//    public static int validateDevice() {
//        String countQuery = "SELECT  * FROM " + DEVICE_TABLE;
//        final SQLiteDatabase db = open();
//        Cursor cursor = db.rawQuery(countQuery, null);
//         
//        int count = cursor.getCount();
//        cursor.close();
//         
//        // return count
//        return count;
//    }
     
//    // Getting distinct user data use in spinner
//    public static List<UserData> getDistinctUser() {
//        List<UserData> contactList = new ArrayList<UserData>();
//        // Select All Query
//        String selectQuery = "SELECT  distinct(user_imei),user_name 
//                             FROM " + USER_TABLE+"
//                             ORDER BY "+KEY_ID+" desc";
//         
//        final SQLiteDatabase db = open();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//  
//        // looping through all rows and adding to list
//        if (cursor.moveToFirst()) {
//            do {
//                UserData data = new UserData();
//                 
//                data.setIMEI(cursor.getString(0));
//                data.setName(cursor.getString(1));
//                // Adding contact to list
//                contactList.add(data);
//            } while (cursor.moveToNext());
//        }
//        cursor.close();
//         
//        return contactList;
//    }
     
//    // Getting imei already in user table or not 
//    public static int validateNewMessageUserData(String IMEI) {
//         int count = 0;
//        try {
//            String countQuery = "SELECT "+KEY_ID+" 
//                                 FROM " + USER_TABLE + "
//                                 WHERE user_imei='"+IMEI+"'";
//                                  
//            final SQLiteDatabase db = open();
//            Cursor cursor = db.rawQuery(countQuery, null);
//             
//            count = cursor.getCount();
//            cursor.close();
//        } catch (Throwable t) {
//            count = 10;
//            Log.i("Database", "Exception caught: " + t.getMessage(), t);
//        }
//        return count;
//    }
 
     
    // Escape string for single quotes (Insert,Update)
    private static String sqlEscapeString(String aString) {
        String aReturn = "";
         
        if (null != aString) {
            //aReturn = aString.replace("'", "''");
            aReturn = DatabaseUtils.sqlEscapeString(aString);
            // Remove the enclosing single quotes ...
            aReturn = aReturn.substring(1, aReturn.length() - 1);
        }
         
        return aReturn;
    }
    // UnEscape string for single quotes (show data)
    private static String sqlUnEscapeString(String aString) {
         
        String aReturn = "";
         
        if (null != aString) {
            aReturn = aString.replace("''", "'");
        }
         
        return aReturn;
    }
}
