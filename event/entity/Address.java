package com.problem.event.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private Long AddressId;
private String city;
private String pincode;
public Long getAddressId() {
	return AddressId;
}
public void setAddressId(Long addressId) {
	AddressId = addressId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public Address(Long addressId, String city, String pincode) {
	super();
	 this.AddressId = addressId;
	this.city = city;
	this.pincode = pincode;
}
public Address() {
	super();
}

}
