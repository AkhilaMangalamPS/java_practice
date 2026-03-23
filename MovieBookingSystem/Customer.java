import java.util.*;

public class Customer {
    private String customerId;
    private String customerName;
    private List<Booking> bookings;

    public Customer(String customerId, String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
        this.bookings = new ArrayList<>();
    }

    public void bookTicket(Movie movie, int count){
        if(count > 5){
            System.out.println("More than 5 tickets not allowed.");
            return;
        }

        if(movie.bookSeats(count)){
            bookings.add(new Booking(movie,count));
            System.out.println("Booked " + count + " tickets for Movie: " + movie.getMovieName());
        }
        else{
            System.out.println("Not enough seats available");
        }
    }
    
    public void cancelTicket(Movie m){
        Booking found = null;

        for(Booking b : bookings){
            if(b.getmovie() == m){
                found = b;
                break;
            }
        }

        if(found != null){
            m.cancelSeat(found.getCount());
            bookings.remove(found);
            System.out.println("Cancelled " + m.getMovieName());
        }
        else{
            System.out.println("No booking found");
        }
    }

    public void printBookings(){
        if(bookings.isEmpty()){
            System.out.println("No bookings found.");
            return;
        }

        for (Booking b : bookings){
            System.out.println(
                b.getmovie().getMovieName() + " - " + b.getCount()
            );
        }
    }
}