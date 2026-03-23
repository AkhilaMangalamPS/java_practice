import java.util.*;
public class Theatre{
    private List<Movie> movieList;
    private List<Customer> customerList;

    public Theatre(){
        movieList = new ArrayList<>();
        customerList = new ArrayList<>();
    }

    public void addMovie(Movie m){
        movieList.add(m);
    }
    public void removeMovie(Movie m){
        movieList.remove(m);

    }
    public void addCustomer(Customer cust){
        customerList.add(cust);
    }
}