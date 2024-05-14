package entites;


public class Information {

	private String email;
	private String password;
	private String comfirmedPassword;
	
	
	public Information(String email, String password, String comfirmedPassword) {
		this.email = email;
		this.password = password;
		this.comfirmedPassword = comfirmedPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getComfirmedPassword() {
		return comfirmedPassword;
	}

	public void setComfirmedPassword(String comfirmedPassword) {
		this.comfirmedPassword = comfirmedPassword;
	}
	
}
