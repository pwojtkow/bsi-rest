package pwr.bsi.database.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "EVENT", schema = "eventsDevDB", catalog = "")
public class EventEntity {
    private int eventId;
    private String eventName;
    private Date startDate;
    private Date endDate;
    private Integer contestantsNumber;
    private Integer position;
    private Integer radius;
    private String webPage;
    private byte[] description;

    @Id
    @Column(name = "Event_id", nullable = false)
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    @Basic
    @Column(name = "Event_name", nullable = false, length = 200)
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Basic
    @Column(name = "Start_date", nullable = false)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "End_date", nullable = false)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Contestants_number", nullable = true)
    public Integer getContestantsNumber() {
        return contestantsNumber;
    }

    public void setContestantsNumber(Integer contestantsNumber) {
        this.contestantsNumber = contestantsNumber;
    }

    @Basic
    @Column(name = "Position", nullable = true)
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Basic
    @Column(name = "Radius", nullable = true)
    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    @Basic
    @Column(name = "Web_page", nullable = true, length = 45)
    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    @Basic
    @Column(name = "Description", nullable = true)
    public byte[] getDescription() {
        return description;
    }

    public void setDescription(byte[] description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventEntity that = (EventEntity) o;

        if (eventId != that.eventId) return false;
        if (eventName != null ? !eventName.equals(that.eventName) : that.eventName != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (contestantsNumber != null ? !contestantsNumber.equals(that.contestantsNumber) : that.contestantsNumber != null)
            return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (radius != null ? !radius.equals(that.radius) : that.radius != null) return false;
        if (webPage != null ? !webPage.equals(that.webPage) : that.webPage != null) return false;
        if (!Arrays.equals(description, that.description)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eventId;
        result = 31 * result + (eventName != null ? eventName.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (contestantsNumber != null ? contestantsNumber.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (radius != null ? radius.hashCode() : 0);
        result = 31 * result + (webPage != null ? webPage.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(description);
        return result;
    }
}
