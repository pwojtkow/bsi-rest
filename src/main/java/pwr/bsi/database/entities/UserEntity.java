package pwr.bsi.database.entities;

import javax.persistence.*;

@Entity
@Table(name = "USER", schema = "eventsDevDB", catalog = "")
public class UserEntity {
    private int userId;
    private String email;
    private String encPass;
    private String login;
    private String adress;
    private Integer credibilityPoints;

    @Id
    @Column(name = "User_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Enc_pass", nullable = true, length = 45)
    public String getEncPass() {
        return encPass;
    }

    public void setEncPass(String encPass) {
        this.encPass = encPass;
    }

    @Basic
    @Column(name = "Login", nullable = true, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "Adress", nullable = true, length = 45)
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Basic
    @Column(name = "Credibility_points", nullable = true)
    public Integer getCredibilityPoints() {
        return credibilityPoints;
    }

    public void setCredibilityPoints(Integer credibilityPoints) {
        this.credibilityPoints = credibilityPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (userId != that.userId) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (encPass != null ? !encPass.equals(that.encPass) : that.encPass != null) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) return false;
        if (credibilityPoints != null ? !credibilityPoints.equals(that.credibilityPoints) : that.credibilityPoints != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (encPass != null ? encPass.hashCode() : 0);
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        result = 31 * result + (credibilityPoints != null ? credibilityPoints.hashCode() : 0);
        return result;
    }
}
