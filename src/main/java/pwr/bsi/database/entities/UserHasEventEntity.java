package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "user_has_event", schema = "eventsdevdb", catalog = "")
public class UserHasEventEntity {
    private int userHasEventId;
    private int userUserId;
    private int eventEventId;

    @Id
    @Column(name = "User_has_event_id", nullable = false)
    public int getUserHasEventId() {
        return userHasEventId;
    }

    public void setUserHasEventId(int userHasEventId) {
        this.userHasEventId = userHasEventId;
    }

    @Basic
    @Column(name = "USER_User_id", nullable = false)
    public int getUserUserId() {
        return userUserId;
    }

    public void setUserUserId(int userUserId) {
        this.userUserId = userUserId;
    }

    @Basic
    @Column(name = "EVENT_Event_id", nullable = false)
    public int getEventEventId() {
        return eventEventId;
    }

    public void setEventEventId(int eventEventId) {
        this.eventEventId = eventEventId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserHasEventEntity that = (UserHasEventEntity) o;

        if (userHasEventId != that.userHasEventId) return false;
        if (userUserId != that.userUserId) return false;
        if (eventEventId != that.eventEventId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userHasEventId;
        result = 31 * result + userUserId;
        result = 31 * result + eventEventId;
        return result;
    }
}
