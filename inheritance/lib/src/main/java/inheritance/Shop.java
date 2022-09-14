package inheritance;

public class Shop {

    String description;

    public Shop(String name, String description, int price, int stars) {
        this.description = description;
    }

    public String toString(){
        return super.toString() + "\nDescription: " + this.description;
    }
}