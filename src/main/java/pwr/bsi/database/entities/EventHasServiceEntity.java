package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "event_has_service", schema = "eventsdevdb", catalog = "")
public class EventHasServiceEntity {
    private int eventHasServiceId;
    private int eventId;
    private int serviceId;

    @Id
    @Column(name = "Event_has_service_id", nullable = false)
    public int getEventHasServiceId() {
        return eventHasServiceId;
    }

    public void setEventHasServiceId(int eventHasServiceId) {
        this.eventHasServiceId = eventHasServiceId;
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
    @Column(name = "Service_id", nullable = false)
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventHasServiceEntity that = (EventHasServiceEntity) o;

        if (eventHasServiceId != that.eventHasServiceId) return false;
        if (eventId != that.eventId) return false;
        if (serviceId != that.serviceId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventHasServiceId;
        result = 31 * result + eventId;
        result = 31 * result + serviceId;
        return result;
    }
}
