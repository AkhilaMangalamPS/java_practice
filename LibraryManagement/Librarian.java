import java.util.*;
public class Librarian{
    private String empId;
    public Librarian(String empId){
        this.empId=empId;
    }

    public void addBook(Library library,Book b){
        library.addBook(b);
        System.out.println("Book "+ b.getTitle()+ "added.");

    }

    public void removeBook(Library library,Book b){
        library.removeBook(b);
        System.out.println("Book "+b.getTitle()+ "removed.");
    }
}