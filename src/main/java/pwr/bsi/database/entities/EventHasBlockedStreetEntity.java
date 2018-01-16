package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "event_has_blocked_street", schema = "eventsdevdb", catalog = "")
public class EventHasBlockedStreetEntity {
    private int eventHasBlockedStreetId;
    private int eventId;
    private int blockedStreetId;

    @Id
    @Column(name = "Event_has_blocked_street_id", nullable = false)
    public int getEventHasBlockedStreetId() {
        return eventHasBlockedStreetId;
    }

    public void setEventHasBlockedStreetId(int eventHasBlockedStreetId) {
        this.eventHasBlockedStreetId = eventHasBlockedStreetId;
    }

    @Basic
    @Column(name = "Event_id", nullable = false)
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "Blocked_street_id", nullable = false)
    public int getBlockedStreetId() {
        return blockedStreetId;
    }

    public void setBlockedStreetId(int blockedStreetId) {
        this.blockedStreetId = blockedStreetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventHasBlockedStreetEntity that = (EventHasBlockedStreetEntity) o;

        if (eventHasBlockedStreetId != that.eventHasBlockedStreetId) return false;
        if (eventId != that.eventId) return false;
        if (blockedStreetId != that.blockedStreetId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventHasBlockedStreetId;
        result = 31 * result + eventId;
        result = 31 * result + blockedStreetId;
        return result;
    }
}
