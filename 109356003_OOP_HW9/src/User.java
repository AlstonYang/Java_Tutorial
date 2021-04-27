
public class User {

	private int userID;
	private String password;
	private String identity;

	public User(int userID, String password, String identity) {

		this.userID = userID;
		this.password = password;
		this.identity = identity;
	}

	public int getID() {

		return this.userID;
	}

	public String getPassword() {

		return this.password;
	}

	public String getIdentity() {

		return this.identity;
	}
}
