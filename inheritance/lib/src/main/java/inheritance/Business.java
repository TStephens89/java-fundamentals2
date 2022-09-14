package inheritance;


import java.util.ArrayList;

public class Business{

    ArrayList<Review> restaurantReview = new ArrayList<>();
    public String name;
    public int price;
    public int stars;

    public Business(String name, int stars, int price) {
    }

    public Business() {
    }

    public void addReview(Review review) {
        restaurantReview.add(review);
        float starCounter = 0;
        float average;


        for(Review reviews: restaurantReview){
            starCounter += review.numberOfStars;
        }
        average = starCounter / restaurantReview.size();
        this.stars= (int) average;
    }

    public String toString(){

        return String.format("Shop: %s\nPrice: %d\nStars: %d", this.name, this.price, this.stars);
    }

}
