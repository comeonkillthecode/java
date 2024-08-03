package org.akash.java.library.management;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testAddBook() {
        library.addBook("Java Programming", 5);
        assertEquals(5, library.getBookQuantity("Java Programming"));
    }

    @Test
    void testAddBookInvalidQuantity() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            library.addBook("Java Programming", 0);
        });
        assertEquals("Quantity must be greater than zero.", exception.getMessage());
    }

    @Test
    void testCheckoutBook() {
        library.addBook("Java Programming", 5);
        library.checkoutBook("Java Programming");
        assertEquals(4, library.getBookQuantity("Java Programming"));
    }

    @Test
    void testCheckoutBookNotAvailable() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            library.checkoutBook("Nonexistent Book");
        });
        assertEquals("Book with given name is not available.", exception.getMessage());
    }

    @Test
    void testCheckoutBookOutOfStock() {
        library.addBook("Java Programming", 1);
        library.checkoutBook("Java Programming");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            library.checkoutBook("Java Programming");
        });
        assertEquals("Book is out of stock.", exception.getMessage());
    }

    @Test
    void testReturnBook() {
        library.addBook("Java Programming", 5);
        library.checkoutBook("Java Programming");
        library.returnBook("Java Programming");
        assertEquals(5, library.getBookQuantity("Java Programming"));
    }

    @Test
    void testReturnBookNotAvailable() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            library.returnBook("Nonexistent Book");
        });
        assertEquals("Book with given name is not available.", exception.getMessage());
    }

    @Test
    void testShowBooks() {
        library.addBook("Java Programming", 5);
        library.addBook("Python Programming", 3);
        library.showBooks(); // Manually verify the output
    }

    @Test
    void testRemoveBook() {
        library.addBook("Java Programming", 5);
        library.removeBook("Java Programming");
        assertEquals(0, library.getBookQuantity("Java Programming"));
    }

    @Test
    void testRemoveBookNotAvailable() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            library.removeBook("Nonexistent Book");
        });
        assertEquals("Book with given name is not available.", exception.getMessage());
    }
}

