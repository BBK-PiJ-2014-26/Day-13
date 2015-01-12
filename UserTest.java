import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {

	/**
	* Tests that userName is returned accurately.
	*/
	@Test
	public void shouldReturnUserName() {
		User testUser = new UserImpl("Leonidas");
		String actual = testUser.getUserName();
		String expected = "Leonidas";
		assertEquals(expected, actual);
	}

	/**
	* Tests that libraryID is returned accuarately.
	*/
	@Test
	public void shouldReturnLibraryID() {
		User testUser = new UserImpl("Leonidas");
		testUser.setLibraryID();
		int actual = testUser.getLibraryID();
		int expected = 1;
		assertEquals(expected, actual);
	}

	/**
	* Tests that user ID is unique.
	*/
	@Test
	public void shouldBeAUniqueLibraryID() {
		User testUser1 = new UserImpl("Leonidas");
		testUser1.setLibraryID();
		User testUser2 = new UserImpl("Pericles");
		testUser2.setLibraryID();
		User testUser3 = new UserImpl("Darius");
		testUser3.setLibraryID();
		User testUser4 = new UserImpl("Mausolos");
		testUser4.setLibraryID();
		User testUser5 = new UserImpl("Bob");
		testUser5.setLibraryID();
		boolean iDCheck = false;
		int checkID = testUser5.getLibraryID();
		if (checkID == testUser1.getLibraryID()) {
			iDCheck = true;
		} else if (checkID == testUser2.getLibraryID()) {
			iDCheck = true;
		} else if (checkID == testUser3.getLibraryID()) {
			iDCheck = true;
		} else if (checkID == testUser4.getLibraryID()) {
			iDCheck = true;
		}
		assertFalse(iDCheck);
	}
}