import java.util.*;
public class AirlineFinder{
    private List<Airline> airLineList;

    public AirlineFinder(){
        airLineList = new ArrayList<>();
        Airline a1 = new Airline("AirFast",3,90,100,60,70);
        Airline a2 = new Airline("SkyHigh",4,80,150,70,100);
        Airline a3 = new Airline("JetSpeed",5,150,200,90,120);
        airLineList.add(a1);
        airLineList.add(a2);
        airLineList.add(a3);
    }

    public String findCheapestAirLine(String customerType, List<String> days){
        Airline cheapestAirline = null;
        int cheapestPrice = Integer.MAX_VALUE;
        for(Airline s : airLineList){
            int price = s.calculateRate(customerType,days);
            if (price < cheapestPrice){
                cheapestPrice = price;
                cheapestAirline = s;
            }
            else if(price == cheapestPrice){
                if(s.getRating() > cheapestAirline.getRating()){
                    cheapestAirline = s;
                }
            }

        }
        return cheapestAirline.getName();

    }

    

    
}