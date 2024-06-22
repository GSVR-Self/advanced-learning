package com.location.Entity;



import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dealers_info")
@Data
@NoArgsConstructor
public class DealerInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dealerId;

    private String name;
    private String createdAt;
    private String createdBy;
    private String updatedAt;
    private String updatedBy;
    private int version;
    private String type;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String pincode;
    private String city;
    private String state;
    private String country;
    private String landmark;
    private String territory;
    private String area;
    private String zone;
    private Double latitude;
    private Double longitude;
    private String googleMapsUrl;
    private String googlePlusCode;
    private String location;
    
    
    
    
    
	public DealerInfo(int dealerId, String name, String createdAt, String createdBy, String updatedAt, String updatedBy,
			int version, String type, String addressLine1, String addressLine2, String addressLine3, String pincode,
			String city, String state, String country, String landmark, String territory, String area, String zone,
			Double latitude, Double longitude, String googleMapsUrl, String googlePlusCode, String location) {
		
		this.dealerId = dealerId;
		this.name = name;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.version = version;
		this.type = type;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
		this.country = country;
		this.landmark = landmark;
		this.territory = territory;
		this.area = area;
		this.zone = zone;
		this.latitude = latitude;
		this.longitude = longitude;
		this.googleMapsUrl = googleMapsUrl;
		this.googlePlusCode = googlePlusCode;
		this.location = location;
	}
	
	
	public DealerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getDealerId() {
		return dealerId;
	}
    public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}

	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getTerritory() {
		return territory;
	}


	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getGoogleMapsUrl() {
		return googleMapsUrl;
	}

	public void setGoogleMapsUrl(String googleMapsUrl) {
		this.googleMapsUrl = googleMapsUrl;
	}

	public String getGooglePlusCode() {
		return googlePlusCode;
	}

	public void setGooglePlusCode(String googlePlusCode) {
		this.googlePlusCode = googlePlusCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(addressLine1, addressLine2, addressLine3, area, city, country, createdAt, createdBy,
				dealerId, googleMapsUrl, googlePlusCode, landmark, latitude, location, longitude, name, pincode, state,
				territory, type, updatedAt, updatedBy, version, zone);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DealerInfo other = (DealerInfo) obj;
		return Objects.equals(addressLine1, other.addressLine1) && Objects.equals(addressLine2, other.addressLine2)
				&& Objects.equals(addressLine3, other.addressLine3) && Objects.equals(area, other.area)
				&& Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(createdAt, other.createdAt) && Objects.equals(createdBy, other.createdBy)
				&& dealerId == other.dealerId && Objects.equals(googleMapsUrl, other.googleMapsUrl)
				&& Objects.equals(googlePlusCode, other.googlePlusCode) && Objects.equals(landmark, other.landmark)
				&& Objects.equals(latitude, other.latitude) && Objects.equals(location, other.location)
				&& Objects.equals(longitude, other.longitude) && Objects.equals(name, other.name)
				&& Objects.equals(pincode, other.pincode) && Objects.equals(state, other.state)
				&& Objects.equals(territory, other.territory) && Objects.equals(type, other.type)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(updatedBy, other.updatedBy)
				&& version == other.version && Objects.equals(zone, other.zone);
	}


	@Override
	public String toString() {
		return "DealerInfo [dealerId=" + dealerId + ", name=" + name + ", createdAt=" + createdAt + ", createdBy="
				+ createdBy + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy + ", version=" + version
				+ ", type=" + type + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", addressLine3=" + addressLine3 + ", pincode=" + pincode + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", landmark=" + landmark + ", territory=" + territory + ", area=" + area
				+ ", zone=" + zone + ", latitude=" + latitude + ", longitude=" + longitude + ", googleMapsUrl="
				+ googleMapsUrl + ", googlePlusCode=" + googlePlusCode + ", location=" + location + "]";
	}
    
    
    
    
}
