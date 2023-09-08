	package com.library.model;

	import javax.persistence.*;

	@Entity
	@Table(name = "book")
	public class Book {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String title;
	    private String author;
	    private int publicationYear;
	    private String isbn;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPublicationYear() {
			return publicationYear;
		}
		public void setPublicationYear(int publicationYear) {
			this.publicationYear = publicationYear;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publicationYear=" + publicationYear
					+ ", isbn=" + isbn + "]";
		}

	    
	}


