package pwr.bsi.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EVENT_has_SERVICE", schema = "eventsDevDB", catalog = "")
public class EventHasServiceEntity {
    private int eventHasServiceId;

    @Id
    @Column(name = "Event_has_service_id", nullable = false)
    public int getEventHasServiceId() {
        return eventHasServiceId;
    }

    public void setEventHasServiceId(int eventHasServiceId) {
        this.eventHasServiceId = eventHasServiceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventHasServiceEntity that = (EventHasServiceEntity) o;

        if (eventHasServiceId != that.eventHasServiceId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return eventHasServiceId;
    }
}
