import java.util.*;
public class Hotel{
    private String name;
    private int rating;

    private int weekdayRegularRate;
    private int weekendRegularRate;
    private int weekdayRewardRate;
    private int weekendRewardRate;

    public Hotel(String name,int rating, int weekdayRegularRate,int weekendRegularRate, int weekdayRewardRate,int weekendRewardRate){
        this.name = name;
        this.rating = rating;
        this.weekdayRegularRate = weekdayRegularRate;
        this.weekendRegularRate = weekendRegularRate;
        this.weekdayRewardRate = weekdayRewardRate;
        this.weekendRewardRate = weekendRewardRate;
    }

    public int getRating(){
        return rating;
    }
    public String getName(){
        return name;
    }

    public boolean isWeekend(String week){
        return week.equalsIgnoreCase("Saturday") || week.equalsIgnoreCase("Sunday");
    }

    public int calculatePrice(String customerType,List<String> days){
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
            else{
                if(isWeekend(day)){
                    total = total + weekendRewardRate;
                }
                else{
                    total = total + weekdayRewardRate;
                }
            }
        }
        return total;
    }

}