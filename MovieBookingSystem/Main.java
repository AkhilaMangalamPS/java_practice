import java.util.*;
public class Main{
    public static void main(String[] args){
        Theatre t = new Theatre();
        Admin ad1 = new Admin(101,"Alice");
    

        Movie m1 = new Movie("M1","Premam");
        Movie m2 = new Movie("M2","Lucifer");
        t.addMovie(m1);
        t.addMovie(m2);

        Customer cust1 = new Customer("C1","John");
        Customer cust2 = new Customer("c2","Tom");

        t.addCustomer(cust1);
        t.addCustomer(cust2);

        cust1.bookTicket(m1,5);
        cust2.bookTicket(m1,3);
        cust1.bookTicket(m1,4);
        cust2.cancelTicket(m1);







        
    }
}