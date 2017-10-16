package Models;

public class User {

	
	private String username;
	private String email;
	private String pass;
	private boolean isAdmin;
	
	
	public User() {}
	
	public User(String username, String email, String pass, boolean isAdmin) {
		this.username = username;
		this.email = email;
		this.pass = pass;
		this.isAdmin = isAdmin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}
