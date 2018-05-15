package InheritanceDemo;

public class ContactInfo {
	private int phoneNumber;
	private String firstName, lastName;
	private String email;
	private int ID;
	
	public void setPhone(int p) {
		phoneNumber = p;
	}
	
	public void setFirstName(String fn) {
		firstName = fn;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	
	public void setEmail(String em) {
		email = em;
	}
	public void setID(int id) {
		ID = id;
	}
	
	public int getPhone() {
		return phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public int getID() {
		return ID;
	}
	
	

}
