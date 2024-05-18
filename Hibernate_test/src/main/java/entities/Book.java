package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Book {
	@Id
	@Column(name="bookId")
	@GeneratedValue(strategy = GenerationType.IDENTITY  )
	private Integer bookId;
	@Column(name="bookName")
	private String bookName;
	@Column(name="author")
	private String author;
	@Column(name = "yearPublish")
	private Integer yearPublish;
	@Column(name="pages")
	private Integer pages;
	@Column(name="price")
	private Double price;
	
	@ManyToOne
	@JoinColumn(name="typeId" , referencedColumnName = "typeId")
	private BookType bookType;
	
	@ManyToOne
	@JoinColumn(name="PubId" , referencedColumnName = "PubId")
	private publisher publisher;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String bookName, String author, Integer yearPublish, Integer pages, Double price,
			BookType bookType, entities.publisher publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.yearPublish = yearPublish;
		this.pages = pages;
		this.price = price;
		this.bookType = bookType;
		this.publisher = publisher;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYearPublish() {
		return yearPublish;
	}

	public void setYearPublish(Integer yearPublish) {
		this.yearPublish = yearPublish;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(publisher publisher) {
		this.publisher = publisher;
	}

	
}
