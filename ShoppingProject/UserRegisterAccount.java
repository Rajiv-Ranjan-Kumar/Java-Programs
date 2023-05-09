import java.io.Serializable;
public class UserRegisterAccount implements Serializable {
	private static String name , mobileNo , email , password , city , postOffice , policeStation , district , state;
	private static int pinCode ;


	public UserRegisterAccount() {
		
	}
	
	
	
	public void setName(String name) {
		UserRegisterAccount.name = name ;
	}
	
	public void setPassword(String password) {
		UserRegisterAccount.password = password ;
	}

	public void setEmail(String email) {
		UserRegisterAccount.email = email ;
	}
	
	public void setMobileNo(String mobileNo) {
		UserRegisterAccount.mobileNo = mobileNo ;
	}
	
	public void setCity(String city) {
		UserRegisterAccount.city = city ;
	}
	
	public void setPostOffice(String postOffice) {
		UserRegisterAccount.postOffice = postOffice ;
	}

	public void setPoliceStation(String policeStation) {
		UserRegisterAccount.policeStation = policeStation ;
	}
	
	public void setDistrict(String district) {
		UserRegisterAccount.district = district ;
	}
	
	public void setState(String state) {
		UserRegisterAccount.state = state ;
	}
	
	public void setPinCode(int pinCode) {
		UserRegisterAccount.pinCode = pinCode ;
	}
	
	
	public String getName() {
		return UserRegisterAccount.name;
	}
	
	public String getEmail() {
		return UserRegisterAccount.email;
	}
	
	public String getPassword() {
		return UserRegisterAccount.password;
	}
	
	public String getMobileNo() {
		return UserRegisterAccount.mobileNo;
	}
	
	public String getCity() {
		return UserRegisterAccount.city;
	}
	
	public String getPostOffice() {
		return UserRegisterAccount.postOffice;
	}
	
	public String getPoliceStation() {
		return UserRegisterAccount.policeStation;
	}
	
	public String getDistrict() {
		return UserRegisterAccount.district;
	}
	
	public String getState() {
		return UserRegisterAccount.state;
	}
	
	public int getPinCode() {
		return UserRegisterAccount.pinCode;
	}
}