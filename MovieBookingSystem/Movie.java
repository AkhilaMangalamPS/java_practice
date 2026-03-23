import java.util.*;
public class  Movie{
    private String movieId;
    private String movieName;
    private int totalSeats;
    private int availableSeats;

    public Movie(String movieId,String movieName){
        this.movieId = movieId;
        this.movieName = movieName;
        this.totalSeats = 10;
        this.availableSeats = totalSeats;
    }

    public String getMovieId(){
        return movieId;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getAvailableSeats(){
        return availableSeats;
    }
    public boolean bookSeats(int count){
        if(count <= availableSeats){
            availableSeats = availableSeats - count;
            return true;
        }
        return false;
        
    }

    public void cancelSeat(int count){
        availableSeats = availableSeats + count;
    }

}