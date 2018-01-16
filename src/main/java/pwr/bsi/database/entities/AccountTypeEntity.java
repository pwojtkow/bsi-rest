package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "account_type", schema = "eventsdevdb", catalog = "")
public class AccountTypeEntity {
    private int accountTypeId;
    private String accountName;

    @Id
    @Column(name = "Account_type_id", nullable = false)
    public int getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(int accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @Basic
    @Column(name = "Account_name", nullable = true, length = 45)
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountTypeEntity that = (AccountTypeEntity) o;

        if (accountTypeId != that.accountTypeId) return false;
        if (accountName != null ? !accountName.equals(that.accountName) : that.accountName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountTypeId;
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        return result;
    }
}
