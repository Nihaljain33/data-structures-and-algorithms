package lld.creationpattern.prototype;

import java.time.OffsetDateTime;

public class Ticket implements Prototype {
    private final int id;
    private final String description;
    private final String origin;
    private final String updatedBy;
    private final OffsetDateTime updatedAt;

    public Ticket(int id, String description, String origin, String updatedBy, OffsetDateTime updatedAt) {
        this.id = id;
        this.description = description;
        this.origin = origin;
        this.updatedBy = updatedBy;
        this.updatedAt = updatedAt;
    }

    @Override
    public Ticket clone() {
        return new Ticket(id, description, origin, updatedBy, updatedAt);
    }
}
