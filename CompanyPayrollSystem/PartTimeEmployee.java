public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private int hourlyWage;

    public PartTimeEmployee(int empId,String name,int hoursWorked,int hourlyWage){
        super(empId,name);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    @Override
    int calculatePay(){
        return (hoursWorked * hourlyWage);
    }

    @Override
    public String toString(){
        return "PartTimeEmployee | Name: "+getName() + " | Salary: "+ calculatePay();
        
    }



}