
package com.dev.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class DeviceDetails {
	@Id
	@Column(name = "device_id")
	@GeneratedValue
	private int deviceId;
	@Column(name = "cust_name")
	private String custName;
	@Column(name = "model_name")
	private String modelName;	
	@Column(name = "pur_date")
	private String purchaseDate;
	@Column(name = "MobileNo")
	private int Mobile;
	@Column(name = "model_no")
	private int modelNo;
	@Column(name = "imei_no")
	private int imeiNo;
	@Column(name = "uidai_no")
	private int uidaiNo;
	@Column(name = "Company")
	private String company;
	@Column(name = "Email")
	private String Email;
	@Column(name = "price")
	private float price;
	private int userId;
	public DeviceDetails() {
		super();
	}

	public DeviceDetails(int deviceId) {
		super();
		this.deviceId = deviceId;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getModelName() {
		return modelName;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getMobile() {
		return Mobile;
	}

	public void setMobile(int mobile) {
		Mobile = mobile;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public int getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(int imeiNo) {
		this.imeiNo = imeiNo;
	}

	public int getUidaiNo() {
		return uidaiNo;
	}

	public void setUidaiNo(int uidaiNo) {
		this.uidaiNo = uidaiNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
		
	
	
}
