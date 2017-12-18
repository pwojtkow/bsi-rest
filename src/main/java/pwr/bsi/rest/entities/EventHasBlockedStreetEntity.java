package pwr.bsi.rest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EVENT_has_BLOCKED_STREET", schema = "eventsDevDB", catalog = "")
public class EventHasBlockedStreetEntity {
    private int eventHasBlockedStreetId;

    @Id
    @Column(name = "Event_has_blocked_street_id", nullable = false)
    public int getEventHasBlockedStreetId() {
        return eventHasBlockedStreetId;
    }

    public void setEventHasBlockedStreetId(int eventHasBlockedStreetId) {
        this.eventHasBlockedStreetId = eventHasBlockedStreetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventHasBlockedStreetEntity that = (EventHasBlockedStreetEntity) o;

        if (eventHasBlockedStreetId != that.eventHasBlockedStreetId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return eventHasBlockedStreetId;
    }
}
