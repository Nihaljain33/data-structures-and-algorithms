package lld.creationpattern;

import lld.creationpattern.prototype.Ticket;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class CreationPatternsRunner {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(1, "NO DESC", "Local", "nihal", OffsetDateTime.now(ZoneOffset.UTC));
        Ticket clonedTicket = ticket.clone();
    }
}
