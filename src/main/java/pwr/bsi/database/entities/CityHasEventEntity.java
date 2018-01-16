package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "city_has_event", schema = "eventsdevdb", catalog = "")
public class CityHasEventEntity {
    private int cityHasEventId;
    private int cityId;
    private int eventId;

    @Id
    @Column(name = "City_has_event_id", nullable = false)
    public int getCityHasEventId() {
        return cityHasEventId;
    }

    public void setCityHasEventId(int cityHasEventId) {
        this.cityHasEventId = cityHasEventId;
    }

    @Basic
    @Column(name = "City_id", nullable = false)
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "Event_id", nullable = false)
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityHasEventEntity that = (CityHasEventEntity) o;

        if (cityHasEventId != that.cityHasEventId) return false;
        if (cityId != that.cityId) return false;
        if (eventId != that.eventId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityHasEventId;
        result = 31 * result + cityId;
        result = 31 * result + eventId;
        return result;
    }
}
