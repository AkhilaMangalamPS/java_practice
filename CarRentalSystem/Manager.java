import java.util.*;
public class Manager{
    private String managerId;
    public Manager(String managerId){
        this.managerId = managerId;
    }

    public void addCar(RentalSystem rs, Car c){
        rs.addCar(c);
        System.out.println("Car added");
    }

    public void removeCar(RentalSystem rs,Car c){
        rs.removeCar(c);
        System.out.println("CAr removed");
    }
}