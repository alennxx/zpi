package com.lending.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String ethereumAddress;

    @Column(nullable = false)
    private String ethereumKey;

    @Column(nullable = false)
    private String email;

    @Column
    private String lastName;

    @Column
    private String firstName;

    @Column(nullable = false)
    private Date joinDate;

    @Column
    private Date birthDate;

    @Column
    private Date recallDate;

    @ManyToOne
    @JoinColumn(name = "adres_id")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sender")
    List<Notification> sentNotifications = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "receiver")
    List<Notification> receivedNotifications = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    List<ResourceOwnership> resourcesOwnerships;

    public User() {
    }

    public User(String login, String password, String ethereumAddress, String ethereumKey, String email, String lastName, String firstName, Date joinDate, Date birthDate, Date recallDate, Address address) {
        this.login = login;
        this.password = password;
        this.ethereumAddress = ethereumAddress;
        this.ethereumKey = ethereumKey;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.joinDate = joinDate;
        this.birthDate = birthDate;
        this.recallDate = recallDate;
        this.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEthereumKey() {
        return ethereumKey;
    }

    public void setEthereumKey(String ethereumKey) {
        this.ethereumKey = ethereumKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getRecallDate() {
        return recallDate;
    }

    public void setRecallDate(Date recallDate) {
        this.recallDate = recallDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + super.getId() +
                ", email='" + email + '\'' +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEthereumAddress() {
        return ethereumAddress;
    }

    public void setEthereumAddress(String ethereumAddress) {
        this.ethereumAddress = ethereumAddress;
    }
}