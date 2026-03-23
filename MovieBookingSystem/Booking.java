import java.util.*;
public class Booking{
    private Movie movie;
    private int ticketCount;

    public Booking(Movie movie,int ticketCount){
        this.movie = movie;
        this.ticketCount = ticketCount;
    }
    public Movie getmovie(){
        return movie;
    }
    public int getCount(){
        return ticketCount;
    }
}