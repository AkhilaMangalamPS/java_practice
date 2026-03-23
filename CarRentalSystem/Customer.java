import java.util.*;
public class Customer{
    private String customerId;
    private String name;
    private List<Car> carsRented;

    public Customer(String customerId,String name){
        this.customerId = customerId;
        this.name = name;
        this.carsRented = new ArrayList<>();
    }

    public void rentCar(Car c){
        if(carsRented.size()>=2){
            System.out.println("Maximum 2 cars can be rented.");
            return;
        }
        if(!c.getStatus()){
            System.out.println("The car is already rented.");
            return;
        }
        c.rentCar(this);
        carsRented.add(c);
        System.out.println("Car with id "+ c.getCarId()+ " rented.");
    }

    public void returnCar(Car c){
        if(!carsRented.contains(c)){
            System.out.println("Car with id "+ c.getCarId()+ "is not rented.");
            return;
        }
        carsRented.remove(c);
        c.returnCar(this);
        System.out.println("Car with id "+ c.getCarId()+ " returned.");
    }



}

