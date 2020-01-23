package com.termometrohipico.THSpringBackend.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private String currentPlan;
    private Date birthday;
    private Date lastPaymentDate;
    private Date lastLoginDate;
    private Date accountCreationDate;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String userName, String email, String password, String currentPlan, Date birthday, Date lastPaymentDate, Date lastLoginDate, Date accountCreationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.currentPlan = currentPlan;
        this.birthday = birthday;
        this.lastPaymentDate = lastPaymentDate;
        this.lastLoginDate = lastLoginDate;
        this.accountCreationDate = accountCreationDate;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCurrentPlan() {
        return currentPlan;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Date getLastPaymentDate() {
        return lastPaymentDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public Date getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCurrentPlan(String currentPlan) {
        this.currentPlan = currentPlan;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setLastPaymentDate(Date lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void setAccountCreationDate(Date accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", currentPlan='" + currentPlan + '\'' +
                ", birthday=" + birthday +
                ", lastPaymentDate=" + lastPaymentDate +
                ", lastLoginDate=" + lastLoginDate +
                ", accountCreationDate=" + accountCreationDate +
                '}';
    }
}
