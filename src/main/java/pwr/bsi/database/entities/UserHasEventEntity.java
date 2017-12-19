package pwr.bsi.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_has_EVENT", schema = "eventsDevDB", catalog = "")
public class UserHasEventEntity {
    private int userHasEventId;

    @Id
    @Column(name = "User_has_event_id", nullable = false)
    public int getUserHasEventId() {
        return userHasEventId;
    }

    public void setUserHasEventId(int userHasEventId) {
        this.userHasEventId = userHasEventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasEventEntity that = (UserHasEventEntity) o;

        if (userHasEventId != that.userHasEventId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return userHasEventId;
    }
}
