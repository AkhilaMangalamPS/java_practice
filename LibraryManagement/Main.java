import java.util.*;
public class Main{
    public static void main(String[] args){
        Library library=new Library();
        Librarian librarian = new Librarian("L1");
        Member m1=new Member("M1");
        library.addMember(m1);
        Member m2 = new Member("M2");
        library.addMember(m2);

        Book b1 = new Book("Harry potter","Rowling",101);
        Book b2 = new Book("Dracula","Stoker",102);
        Book b3 = new Book("Animal farm","Gorge",103);
        Book b4 = new Book("The Pearl","John",104);
        Book b5 = new Book("Gullivers travel","Swift",105);

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);

        m1.borrowBook(b1);

        System.out.println("Status of Book:" + b1.getTitle()+ " is" + b1.getStatus());

        m1.borrowBook(b2);
        System.out.println("Status of Book:" + b2.getTitle()+ " is" + b2.getStatus());

        m1.borrowBook(b3);
        System.out.println("Status of Book:" + b3.getTitle()+ " is" + b3.getStatus());

        m1.borrowBook(b4);
        System.out.println("Status of Book:" + b4.getTitle()+ " is" + b4.getStatus());

        m2.borrowBook(b1);



        m1.returnBook(b1);
        System.out.println("Status of Book:" + b1.getTitle()+ " is" + b1.getStatus());

        m2.borrowBook(b1);
        System.out.println("Status of Book:" + b1.getTitle()+ " is" + b1.getStatus());

    }
}