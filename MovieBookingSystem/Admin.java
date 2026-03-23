import java.util.*;
public class Admin{
    private int adminId;
    private String name;

    public Admin(int adminId,String name){
        this.adminId = adminId;
        this.name = name;
    }

    public void addMovie(Theatre t,Movie m){
        t.addMovie(m);
        System.out.println("Movie added successfully");
    }

    public void removeMovie(Theatre t,Movie m){
        t.removeMovie(m);
        System.out.println("Movie removed successfully");
    }
}