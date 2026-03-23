import java.util.*;
public class HotelFinder{
    private List<Hotel> hotelList;

    public HotelFinder(){
        hotelList = new ArrayList<>();
        Hotel hotel1 = new Hotel("Lakewood",3,110,90,80,80);
        Hotel hotel2 = new Hotel("Bridgewood",4,160,60,110,50);
        Hotel hotel3 = new Hotel("Ridgewood",5,220,150,100,40);
        hotelList.add(hotel1);
        hotelList.add(hotel2);
        hotelList.add(hotel3);

    }
    

    public String findCheapestHotel(String customerType, List<String> days){
        Hotel cheapestHotel = null;
        int minPrice = Integer.MAX_VALUE;
        for(Hotel h : hotelList){
            int price = h.calculatePrice(customerType,days);
            if (price < minPrice){
                minPrice = price;
                cheapestHotel = h;
            }
            else if(price == minPrice){
                if(h.getRating() > cheapestHotel.getRating()){
                    cheapestHotel = h;
                }
            }
        }
        return cheapestHotel.getName();
    }



}