package customermodule;

public class Customer {
	private static int customerID = 0;
	private String customerName;
	private String phoneNumber;
	private String address;
	private String city;
	private String state;
	private int zipCode;
	
	public Customer(String customerName, String phoneNumber, String address,
			String city, String state, int zipCode) {
		++customerID;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public static int getCustomerID() {
		return customerID;
	}


	public String getCustomerName() {
		return customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZipCode() {
		return zipCode;
	}
	
	  public boolean validPhoneNumber(String phoneNumber){
			//check that phoneNumber is valid number
			  if (phoneNumber != null){
			        if (phoneNumber.length()!= 10 )  return false;
			       for (int i = 0; i< phoneNumber.length();i++){
				       if (!Character.isDigit(phoneNumber.charAt(i)))
				    	   return false;
			       }
			       return true;
			  }
			  return false;
			  }
	

}
