import java.util.*;
public class Airline{
    private String name;
    private int rating;

    private int weekendRegularRate;
    private int weekdayRegularRate;
    private int weekendPremiumRate;
    private int weekdayPremiumRate;

    public Airline(String name, int rating, int weekendRegularRate, int weekdayRegularRate, int weekendPremiumRate, int weekdayPremiumRate){
        this.name = name;
        this.rating = rating;
        this.weekendRegularRate = weekendRegularRate;
        this.weekdayRegularRate = weekdayRegularRate;
        this.weekendPremiumRate = weekendPremiumRate;
        this.weekdayPremiumRate = weekdayPremiumRate;
    }

    public boolean isWeekend(String week){
        return week.equalsIgnoreCase("Saturday") || week.equalsIgnoreCase("Sunday");
    }

    public String getName(){
        return name;
    }

    public int getRating(){
        return rating;
    }

    public int calculateRate(String customerType, List<String> days){
        int total=0;
        for(String day : days){
            if(customerType.equalsIgnoreCase("Regular")){
                if(isWeekend(day)){
                    total = total + weekendRegularRate;
                }
                else{
                    total = total + weekdayRegularRate;
                }
            }
            if(customerType.equalsIgnoreCase("Premium")){
                if(isWeekend(day)){
                    total = total + weekendPremiumRate;
                }
                else{
                    total = total + weekdayPremiumRate;
                }
            }
        }
        return total;

    }
}