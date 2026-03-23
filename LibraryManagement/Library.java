import java.util.*;
public class Library{
    private List<Book> books;
    private List<Member> membersList;

    public Library(){
        this.books=new ArrayList<>();
        this.membersList=new ArrayList<>();
    }

    public void addBook(Book b){
        books.add(b);
    }
    public void removeBook(Book b){
        books.remove(b);
    }
    public void addMember(Member m){
        membersList.add(m);
    }
}