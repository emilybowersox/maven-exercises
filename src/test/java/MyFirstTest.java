import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {

//    Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.

@Test
    public void testIfStringIsEquals() {
    String expected = "Codeup";
    String actual = "Codeup";

    assertEquals(expected, actual);
}

//    Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:

    @Test
            public void testIfArrayListsNotEquals() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        //dealing with objects not values
        assertNotSame(languages, moreLanguages);
    }


////    Create a test method that uses assertArrayEquals to verify the following arrays are equal.

    @Test
            public void testIfArraysEquals(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }

////    Create a test method that uses both assertFalse and assertTrue to verify the following statements:

    @Test
            public void doesContain(){
        String language = "PHP";

        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }






}
