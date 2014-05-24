package com.dagrest.tracklocation.datatype;

public class ContactDeviceData {
	private ContactData contactData;
	private DeviceData deviceData;
	private String phoneNumber;
	private String imei;
	private String registration_id;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public ContactData getContactData() {
		return contactData;
	}
	public void setContactData(ContactData contactData) {
		this.contactData = contactData;
	}
	public DeviceData getDeviceData() {
		return deviceData;
	}
	public void setDeviceData(DeviceData deviceData) {
		this.deviceData = deviceData;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getRegistration_id() {
		return registration_id;
	}
	public void setRegistration_id(String registration_id) {
		this.registration_id = registration_id;
	}
}
