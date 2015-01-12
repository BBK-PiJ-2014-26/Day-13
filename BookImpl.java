public class BookImpl implements Book {
	private String authorName;
	private String title;

	public BookImpl(String authorName, String title) {
		this.authorName = authorName;
		this.title = title;
	}

	public String getAuthorName() {
		String result = this.authorName;
		return result;
	}

	public String getTitle() {
		String result = this.title;
		return result;
	}
}

