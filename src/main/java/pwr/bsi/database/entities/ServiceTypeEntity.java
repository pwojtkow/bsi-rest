package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "service_type", schema = "eventsdevdb", catalog = "")
public class ServiceTypeEntity {
    private int serviceTypeId;
    private String serviceName;

    @Id
    @Column(name = "Service_type_id", nullable = false)
    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    @Basic
    @Column(name = "Service_name", nullable = false, length = 45)
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceTypeEntity that = (ServiceTypeEntity) o;

        if (serviceTypeId != that.serviceTypeId) return false;
        if (serviceName != null ? !serviceName.equals(that.serviceName) : that.serviceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serviceTypeId;
        result = 31 * result + (serviceName != null ? serviceName.hashCode() : 0);
        return result;
    }
}
