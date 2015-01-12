public class UserImpl implements User {
	private String userName;
	private int libraryID;
	public static int nextID = 1;

	public UserImpl(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		String result = this.userName;
		return result;
	}

	public int getLibraryID() {
		int result = this.libraryID;
		return result;
	}

	public void setLibraryID() {
		this.libraryID = nextID;
		nextID = nextID + 1;
	}
}