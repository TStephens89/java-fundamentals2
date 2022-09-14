
package inheritance;

public class Restaurant extends Business {
    public String restaurantName;
    public int starRating;
    public int price;

     public Restaurant(String restaurantName, int starRating){
         super();
         this.restaurantName = restaurantName;
        this.starRating = starRating;
        this.price = price;

    }

    public String toString(){
         return String.format("Restaurant: %s, Price: %d", this.restaurantName, this.starRating, this.price);
    }
}
