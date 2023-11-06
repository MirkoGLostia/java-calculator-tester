package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    Ticket user1 = new Ticket(13.4, 12);
    Ticket user2 = new Ticket(57.4, 30);
    Ticket user3 = new Ticket(100, 84);
    @Test
    @DisplayName("test price calc")
    void getPrice() {
        assertEquals(2.2512, user1.getPrice());
        assertEquals(12.053999999999998, user2.getPrice());
        assertEquals(12.6, user3.getPrice());
    }

    @Test
    @DisplayName("test of the ticket constructor")
    void ticketConstructor() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Ticket(0, 10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Ticket(10, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Ticket(0, 0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Ticket(-6, 10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Ticket(10, -10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Ticket(-15, -10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Ticket(0, -10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Ticket(-10, 0);
        });
    }
}