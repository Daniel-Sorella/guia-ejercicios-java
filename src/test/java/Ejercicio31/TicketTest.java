package Ejercicio31;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Date;

import static org.testng.Assert.*;

public class TicketTest {

    private Ticket ticket;

    @BeforeTest
    public void setup() {
        ticket = new Ticket(1, new Date());
        Item item = new Item("Coca" , 1 , 70);
    }
}