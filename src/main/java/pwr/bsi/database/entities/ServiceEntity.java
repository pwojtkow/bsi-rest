package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "service", schema = "eventsdevdb", catalog = "")
public class ServiceEntity {
    private int serviceId;
    private String serviceName;
    private String webPage;
    private int serviceTypeId;

    @Id
    @Column(name = "Service_id", nullable = false)
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    @Basic
    @Column(name = "Service_name", nullable = true, length = 45)
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
    @Column(name = "Service_type_id", nullable = false)
    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceEntity that = (ServiceEntity) o;

        if (serviceId != that.serviceId) return false;
        if (serviceTypeId != that.serviceTypeId) return false;
        if (serviceName != null ? !serviceName.equals(that.serviceName) : that.serviceName != null) return false;
        if (webPage != null ? !webPage.equals(that.webPage) : that.webPage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = serviceId;
        result = 31 * result + (serviceName != null ? serviceName.hashCode() : 0);
        result = 31 * result + (webPage != null ? webPage.hashCode() : 0);
        result = 31 * result + serviceTypeId;
        return result;
    }
}
