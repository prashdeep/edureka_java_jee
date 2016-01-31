package com.edureka.java_j2ee.module8.manytomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;  
  
@Entity  
public class Book  
{  
  private Long bookId;  
  private String bookName;  
  private Set<Author> authors;  
    
  @Id  
  @GeneratedValue(strategy=GenerationType.AUTO)  
  @Column(name="book_id")  
  public Long getBookId()  
    {  
        return bookId;  
    }  
    public void setBookId(Long bookId)  
    {  
        this.bookId = bookId;  
    }  
      
    @Column(name="book_name")  
    public String getBookName()  
    {  
        return bookName;  
    }  
    public void setBookName(String bookName)  
    {  
        this.bookName = bookName;  
    }  
    @ManyToMany(cascade=CascadeType.ALL)  
    @JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))  
    public Set<Author> getAuthors()  
    {  
        return authors;  
    }  
    public void setAuthors(Set<Author> authors)  
    {  
        this.authors = authors;  
    }  
} 