package inheritance;

public class Review {
    public String body;
    public String author;
    public int numberOfStars;
    public Business business;
    public String movie;

    public Review(String body, String author, int numberOfStars){
        this.body = body;
        this.author = author;
        reviewersStarRating(numberOfStars);

    }

    public Review(String body, String author, int numberOfStars, String movie) {
        this.author = author;
        this.body = body;
        reviewersStarRating(numberOfStars);
        this.movie = movie;

    }

    public String getBody() {

        return body;
    }

    public String getAuthor() {

        return author;
    }


    public int getNumberOfStars() {

        return numberOfStars;
    }

    public void setBusiness(Business business) {

        this.business = business;
    }

    public void reviewersStarRating(int stars){
        if(stars < 0 || stars > 6){
            throw new IllegalArgumentException("Must choose between 0-5");
        }
        this.numberOfStars = stars;
    }

    public String toString(){
        return String.format("Review: " + this.body + " Reviewed by " + this.author + " Stars received: " + this.numberOfStars );
    }
    public interface Reviewer{
       public void addReview(Review review);
        String toString();
    }
}
