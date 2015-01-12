import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {

	/**
	* Instantiates a Book object.
	*/
	@Before
	public void buildBook() {
		Book testBook = new BookImpl("Herodotus", "Histories");
	}

	/**
	* Tests whether getAuthorName() return the correct value.
	*/
	@Test
	public void shouldReturnAuthorName() {
		String actual = testBook.getAuthorName();
		String expected = "Herodotus";
		assertEquals(expected, actual);
	}

	/**
	* Tests whether getTitle() returns the correct value.
	*/
	@Test
	public void shouldReturnTitle() {
		String actual = testBook.getTitle();
		String expected = "Histories";
		assertEquals(expected, actual);
	}
}