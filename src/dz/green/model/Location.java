package dz.green.model;

public class Location {
	public Location(double latitude, double longitude, String street, String city, String zipCode, String country) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}

	private double latitude;
	    private double longitude;
	    private String street;
	    private String city;
	    private String zipCode;
	    private String country;
	    
	    private Planting rb;
	    public void addPlanting(Planting b) {
	    if(b.getLocation() != null) b.removeLocation();
	    if(getPlanting() != null) removePlanting();
	    setPlanting(b);
	    b.setLocation(this);
	    }
	    public void removePlanting() {
	    if(getPlanting() != null) getPlanting().setLocation(null);
	    setPlanting(null);
	    }
	    public Planting getPlanting() { return rb; }
	    public void setPlanting(Planting b) { this.rb = b; }
	    
	    
	    public double getLatitude() {
	        return latitude;
	    }

	    public void setLatitude(double latitude) {
	        this.latitude = latitude;
	    }

	    public double getLongitude() {
	        return longitude;
	    }

	    public void setLongitude(double longitude) {
	        this.longitude = longitude;
	    }

	    public String getStreet() {
	        return street;
	    }

	    public void setStreet(String street) {
	        this.street = street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }
	    

	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }

	    public String getCountry() {
	        return country;
	    }

	    public void setCountry(String country) {
	        this.country = country;
	    }

	    public String getWilayaCode() {
	        return zipCode.substring(0, 2);
	    }

}
