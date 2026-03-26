public class FullTimeEmployee extends Employee{
    private int Salary;
    

    public FullTimeEmployee(int empId,String name,int Salary){
        super(empId,name);
        this.Salary = Salary;
    }

    @Override
    int calculatePay(){
        return Salary;
    }

    @Override
    public String toString(){
        return "FullTimeEmployee | Name: "+getName() + " | Salary: "+ calculatePay();
      
    }
}