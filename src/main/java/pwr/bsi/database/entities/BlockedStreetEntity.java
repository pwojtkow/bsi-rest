package pwr.bsi.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blocked_street", schema = "eventsdevdb", catalog = "")
public class BlockedStreetEntity {
    private int blockedStreetId;

    @Id
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

        BlockedStreetEntity that = (BlockedStreetEntity) o;

        if (blockedStreetId != that.blockedStreetId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return blockedStreetId;
    }
}
