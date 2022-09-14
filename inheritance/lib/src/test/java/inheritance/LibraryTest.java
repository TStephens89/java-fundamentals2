package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void testingRestaurantRating() {
        Restaurant sut = new Restaurant("Cane's", 5);
        assertEquals(5, 5);
    }

    @Test
    public void testAddingRestaurantName() {
        Restaurant sut = new Restaurant("Cane's", 5);
        assertEquals("Cane's", "Cane's");
    }

    @Test
    public void testAddReview() {
        Review sut = new Review("I am very unsure about testing", "Zork", 5);
        assertEquals("I am very unsure about testing", "I am very unsure about testing");
        System.out.println(sut);

    }
}
