import java.util.*;
public class Main{
    public static void main(String[] args){
        RentalSystem rs = new RentalSystem();
        Manager m = new Manager("man1");

        Customer cus1 = new Customer("C1","John");
        rs.addCustomer(cus1);
        Customer cus2 = new Customer("C2","Tom");
        rs.addCustomer(cus2);

        Car c1 = new Car("C101","wagonr","suzuki");
        Car c2 = new Car("C102","nano","Tata");
        Car c3 = new Car("C103","tiago","Tata");

        rs.addCar(c1);
        rs.addCar(c2);
        rs.addCar(c3);

        cus1.rentCar(c1);
        cus1.rentCar(c2);
        cus1.rentCar(c3);
        cus1.returnCar(c3);
        
        
        

    }
}