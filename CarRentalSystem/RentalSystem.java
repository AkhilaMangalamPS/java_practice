import java.util.*;
public class RentalSystem{
    private List<Car> carList;
    private List<Customer> customerList;

    public RentalSystem(){
        this.carList = new ArrayList<>();
        this.customerList = new ArrayList<>();
    }

    public void addCar(Car c){
        carList.add(c);
    }

    public void removeCar(Car c){
        carList.remove(c);
    }

    public void addCustomer(Customer c){
        customerList.add(c);
    }
}