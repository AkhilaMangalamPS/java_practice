public class Main{
    public static void main(String[] args){
        Employee ft = new FullTimeEmployee(101,"Jerry",25000);
        ft.calculatePay();
        System.out.println(ft);

        Employee pt = new PartTimeEmployee(102,"Bob",160,100);
        pt.calculatePay();
        System.out.println(pt);

        Employee ct = new Contractor(103,"Henry",25,400);
        ct.calculatePay();
        System.out.println(ct);

    
    }
}