public class UserImpl implements User {
	private String userName;
	private int libraryID;

	public UserImpl(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		String result = "";
		return result;
	}

	public int getLibraryID() {
		int result = 0;
		return result;
	}

	public void setLibraryID() {
		this.libraryID = 1;
	}
}