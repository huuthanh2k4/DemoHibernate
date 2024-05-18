package entities;

import java.util.Set; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Publishers")
public class publisher {
	@Id
	@Column(name="PubId")
	private String pubId;
	@Column(name="pubName")
	private String pubName;
	@Column(name="active")
	private Integer active;
	
	@OneToMany(mappedBy = "publisher")
	private Set<Book> books;
	
	public publisher() {
		// TODO Auto-generated constructor stub
	}

	public publisher(String pubId, String pubName, Integer active, Set<Book> books) {
		super();
		this.pubId = pubId;
		this.pubName = pubName;
		this.active = active;
		this.books = books;
	}

	public String getPubId() {
		return pubId;
	}

	public void setPubId(String pubId) {
		this.pubId = pubId;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
}
