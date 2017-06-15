package com.mobizio.datamodel;

public class BranchModel {
	
	private String name;
	private String tenantBranchID;	
	private String primaryTelePhone;
	private String scondaryTelePhone;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String county;
	private String country;
	private String postcode;
	private String fax;
	private String alertNotificationEmail;
	private String alertNotificationPhoneNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTenantBranchID() {
		return tenantBranchID;
	}
	public void setTenantBranchID(String tenantBranchID) {
		this.tenantBranchID = tenantBranchID;
		
	}
	
	public String getPrimaryTelePhone() {
		return primaryTelePhone;
	}
	public void setPrimaryTelePhone(String primaryTelePhone) {
		this.primaryTelePhone = primaryTelePhone;
	}
	public String getSecondaryTelePhone() {
		return scondaryTelePhone;
	}
	public void setScondaryTelePhone(String scondaryTelePhone) {
		this.scondaryTelePhone = scondaryTelePhone;		
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	public String getAlertNotificationEmail() {
		return alertNotificationEmail;
	}
	public void setAlertNotificationEmail(String alertNotificationEmail) {
		this.alertNotificationEmail = alertNotificationEmail;
	}
	
	public String getAlertNotificationPhoneNumber() {
		return alertNotificationPhoneNumber;
	}
	public void setAlertNotificationPhoneNumber(String alertNotificationPhoneNumber) {
		this.alertNotificationPhoneNumber = alertNotificationPhoneNumber;
	}
	
	@Override
	public String toString() {
		return "BranchModel [name=" + name + ", tenantBranchID=" + tenantBranchID + ", primaryTelePhone=" + primaryTelePhone
				+ ", scondaryTelePhone=" + scondaryTelePhone + ", addressLine1=" + addressLine1 + ", city=" + city
				+ ", county=" + county + ", country=" + country +", postcode=" + postcode + ", fax=" + fax +", alertNotificationEmail=" + alertNotificationEmail +", alertNotificationPhoneNumber=" + alertNotificationPhoneNumber +", getName()=" + getName() + ", getTenantBranchID()=" + getTenantBranchID()
				+ ", getPrimaryTelePhone()=" + getPrimaryTelePhone() + ", getSecondaryTelePhone()=" + getSecondaryTelePhone() + ", getAddressLine1()=" + getAddressLine1() + ", getAddressLine2()=" + getAddressLine2() +", getCounty()=" + getCounty() +", getCountry()=" + getCountry() +", getPostcode()=" + getPostcode() +", getFax()=" + getFax() +", getFax()=" + getFax() +", getAlertNotificationEmail()=" + getAlertNotificationEmail() +", getAlertNotificationPhoneNumber()=" + getAlertNotificationPhoneNumber() +", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tenantBranchID == null) ? 0 : tenantBranchID.hashCode());
		result = prime * result + ((primaryTelePhone == null) ? 0 : primaryTelePhone.hashCode());
		result = prime * result + ((scondaryTelePhone == null) ? 0 : scondaryTelePhone.hashCode());
		result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result + ((addressLine2 == null) ? 0 : addressLine2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((county == null) ? 0 : county.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((postcode == null) ? 0 : postcode.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((alertNotificationEmail == null) ? 0 : alertNotificationEmail.hashCode());
		result = prime * result + ((alertNotificationPhoneNumber == null) ? 0 : alertNotificationPhoneNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BranchModel other = (BranchModel) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tenantBranchID == null) {
			if (other.tenantBranchID != null)
				return false;
		} else if (!tenantBranchID.equals(other.tenantBranchID))
			return false;
		if (primaryTelePhone == null) {
			if (other.primaryTelePhone != null)
				return false;
		} else if (!primaryTelePhone.equals(other.primaryTelePhone))
			return false;
		if (scondaryTelePhone == null) {
			if (other.scondaryTelePhone != null)
				return false;
		} else if (!scondaryTelePhone.equals(other.scondaryTelePhone))
			return false;
		if (addressLine1 == null) {
			if (other.addressLine1 != null)
				return false;
		} else if (!addressLine1.equals(other.addressLine1))
			return false;
		if (addressLine2 == null) {
			if (other.addressLine2 != null)
				return false;
		} else if (!addressLine2.equals(other.addressLine2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (county == null) {
			if (other.county != null)
				return false;
		} else if (!county.equals(other.county))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (postcode == null) {
			if (other.postcode != null)
				return false;
		} else if (!postcode.equals(other.postcode))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (alertNotificationEmail == null) {
			if (other.alertNotificationEmail != null)
				return false;
		} else if (!alertNotificationEmail.equals(other.alertNotificationEmail))
			return false;
		if (alertNotificationPhoneNumber == null) {
			if (other.alertNotificationPhoneNumber != null)
				return false;
		} else if (!alertNotificationPhoneNumber.equals(other.alertNotificationPhoneNumber))
			return false;
		return true;
	}

	

}
