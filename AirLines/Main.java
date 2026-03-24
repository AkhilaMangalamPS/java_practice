import java.util.*;
public class Main{
    public static void main(String[] args){

        List<String> validDays = Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Saturday","Sunday");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer type:");
        String custType = sc.next();

        if(!custType.equalsIgnoreCase("Regular") && !custType.equalsIgnoreCase("Premium")){
            System.out.println("Enter valid cutsomer Type");
            return;
        }

        List<String> days = new ArrayList<>();
        System.out.println("Enter days:");
        String day = sc.next();
        String arr[] = day.split(",");
        for( String s : arr){
            String d = s.trim();
            if(!validDays.contains(d)){
                System.out.println("Enter valid day");
                return;
            }
            days.add(d);
        }

        AirlineFinder af = new AirlineFinder();
        String res = af.findCheapestAirLine(custType,days);
        System.out.println(res);



    }
}