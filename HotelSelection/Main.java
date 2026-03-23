import java.util.*;
public class Main{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Type: ");
        String customerType = sc.next();

        List<String> days = new ArrayList<>();
        System.out.println("Enter days:");
        String inputDays = sc.next();
        String[] arr = inputDays.split(",");
        for(String s: arr){
            days.add(s.trim());
        }
        
        HotelFinder hf = new HotelFinder();
        String res = hf.findCheapestHotel(customerType, days);
        System.out.println(res);


    }
}