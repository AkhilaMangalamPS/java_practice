import java.util.*;
public class Car{
    private String carId;
    private String model;
    private String brand;
    private boolean isAvailable;
    private Customer borrowedBy;

    public Car(String carId,String model,String brand){
        this.carId = carId;
        this.model = model;
        this.brand = brand;
        this.isAvailable = true;
        this.borrowedBy = null;
    }

    public String getCarId(){
        return carId;
    }
    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public boolean getStatus(){
        return isAvailable;
    }
    public void rentCar(Customer customer){
        this.isAvailable = false;
        this.borrowedBy = customer;
    }

    public void returnCar(Customer customer){
        this.isAvailable = true;
    }

}