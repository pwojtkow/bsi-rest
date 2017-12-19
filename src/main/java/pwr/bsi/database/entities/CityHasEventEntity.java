package pwr.bsi.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY_has_EVENT", schema = "eventsDevDB", catalog = "")
public class CityHasEventEntity {
    private int cityHasEventId;

    @Id
    @Column(name = "City_has_event_id", nullable = false)
    public int getCityHasEventId() {
        return cityHasEventId;
    }

    public void setCityHasEventId(int cityHasEventId) {
        this.cityHasEventId = cityHasEventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityHasEventEntity that = (CityHasEventEntity) o;

        if (cityHasEventId != that.cityHasEventId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return cityHasEventId;
    }
}
