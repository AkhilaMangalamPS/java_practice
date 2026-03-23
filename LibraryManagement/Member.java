import java.util.*;
public class Member{
    private String memberId;
    private List<Book> booksBorrowed;

    public Member(String memberId)
    {
        this.memberId=memberId;
        this.booksBorrowed=new ArrayList<>();
    }

    public void borrowBook(Book b){
        if(booksBorrowed.size()>=3){
            System.out.println("Cannot borrow more than 3 books");
            return;
        }
        if(!b.getStatus()){
            System.out.println("Book is not available");
            return;
        }
        b.borrowBook(this);
        booksBorrowed.add(b);
        System.out.println("Book"+ b.getTitle() +"borrowed");
    }

    public void returnBook(Book b){
        if(!booksBorrowed.contains(b)){
            System.out.println("This book was not borrowed");
            return;
        }
        booksBorrowed.remove(b);
        b.returnBook();
        System.out.println("Book"+b.getTitle()+" returned");
    }
}