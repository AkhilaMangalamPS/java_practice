import java.util.*;
public class Book{
    private String title;
    private String author;
    private int isbn;
    private boolean status;
    private Member borrowedBy;
    
    public Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.status=true;
        this.borrowedBy=null;

    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getISBN(){
        return isbn;
    }
    public boolean getStatus(){
        return status;
    }

    public void borrowBook(Member member){
        this.status=false;
        this.borrowedBy=member;

    }
    public void returnBook(){
        this.status=true;
    }
}