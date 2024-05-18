package entities;

import java.util.Set; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BookType")
public class BookType {
@Id
@Column(name="typeId")
private String typeId; 
@Column(name="typeName")
private String typeName;
@Column(name="active")
private Integer active;

@OneToMany(mappedBy = "bookType")
private Set<Book> books;
  
public BookType() {
	// TODO Auto-generated constructor stub
}

public BookType(String typeId, String typeName, Integer active, Set<Book> books) {
	super();
	this.typeId = typeId;
	this.typeName = typeName;
	this.active = active;
	this.books = books;
}

public String getTypeId() {
	return typeId;
}

public void setTypeId(String typeId) {
	this.typeId = typeId;
}

public String getTypeName() {
	return typeName;
}

public void setTypeName(String typeName) {
	this.typeName = typeName;
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
