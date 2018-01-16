package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "COMMENT", schema = "eventsdevdb", catalog = "")
public class CommentEntity {
    private int commentId;
    private String value;
    private int eventId;
    private int userId;

    @Id
    @Column(name = "Comment_id", nullable = false)
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Basic
    @Column(name = "Value", nullable = false, length = 255)
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
    @Column(name = "User_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (commentId != that.commentId) return false;
        if (eventId != that.eventId) return false;
        if (userId != that.userId) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = commentId;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + eventId;
        result = 31 * result + userId;
        return result;
    }
}
