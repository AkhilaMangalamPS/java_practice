abstract class Employee{
    private int empId;
    private String name;

    public Employee(int empId,String name){
        this.empId = empId;
        this.name = name;
    }

    public int getId(){
        return empId;
    }
    public String getName(){
        return name;
    }

    abstract int calculatePay();
    
}