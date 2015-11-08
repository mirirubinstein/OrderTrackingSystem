package customermodule;

public class CompanyContacts {
	private int companyID;
	private String name;
	private String phoneNum;
	private String email;
	
	public CompanyContacts(int companyID, String name, String phoneNum,
			String email) {
		super();
		this.companyID = companyID;
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
