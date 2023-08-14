import org.junit.Test;

import static org.junit.Assert.*;

public class SimplestAssertionExample {
    @Test
    public void assertionEquality(){
        String expected = "3.1415";
        String actual = "3.1415";

        assertEquals(expected,actual);
    }

    @Test
    public void assertionArrayEquality(){
        char[] f1 = {'J', 'u', 'n', 'i', 't'};
        char[] f2 = "Junit".toCharArray();

        assertArrayEquals(f1,f2);
    }

    @Test
    public void assertionAllEquality(){
        Address address = new Address("Washington", "Avenue", "500");

        assertEquals("Washington", address.getCity());
        assertEquals("Avenue", address.getStreet());
        assertEquals("500", address.getNumber());
    }

    @Test
    public void assertionThrows(){
        Throwable exception = assertThrows(IllegalArgumentException.class,() ->{
            throw  new IllegalArgumentException("Exc Message");
        });
        assertEquals("Exc Message", exception.getMessage());
    }
}
