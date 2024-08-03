package org.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    ReverseString reverseString = new ReverseString();
    @Test
    void testReverseString_OneWord(){
        Assertions.assertEquals("avaJ", reverseString.reverse("Java"));
        Assertions.assertEquals("Akash", reverseString.reverse("hsakA"));
    }

    @Test
    void testReverseString_MultipleWords(){
        Assertions.assertEquals("!dlroW olleH", reverseString.reverse("Hello World!"));
    }

    @Test
    void testReverseString_MultipleWords_Message(){
        Assertions.assertNotEquals("!olleH", reverseString.reverse("Hello World!"), "Hey");
    }

    @Test
    void testReverseString_MultipleWords_Supplier(){
        Assertions.assertNotEquals("!olleH", reverseString.reverse("Hello World!"), () -> "Hey");
    }
}
