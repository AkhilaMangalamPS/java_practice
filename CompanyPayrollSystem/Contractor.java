public class Contractor extends Employee{
    private int daysWorked;
    private int dailywage;

    public Contractor(int empId,String name,int daysWorked,int dailywage){
        super(empId,name);
        this.daysWorked = daysWorked;
        this.dailywage = dailywage;
    }

    @Override
    int calculatePay(){
        return (daysWorked * dailywage);
    }

    @Override
    public String toString(){
        return "Contractor | Name: "+getName() + " | Salary: "+ calculatePay();
    }
}