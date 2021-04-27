import java.util.ArrayList;

public class UserManagement {

	private ArrayList<User> users;

	public UserManagement() {

		users = new ArrayList<User>();
	}

	public void addNewUser(int userID, String password, String identity) {
		User user = new User(userID, password, identity);
		users.add(user);
	}

	public ArrayList<User> getUsers() {

		return this.users;
	}

	public User findUser(int userID) {

		for (User user : users) {
			if (user.getID() == userID) {
				return user;
			}
		}
		return null;
	}
}
