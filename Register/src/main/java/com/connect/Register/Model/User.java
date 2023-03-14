package com.connect.Register.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_REG_TBL", schema = "Angboot")
public class User {

    @Column(name="NAME")
    private String name;
    @Id
    @Column(name="EMAIL")
    private String email;

    @Column(name="QUERY")
    private String query;

    @Column(name="MOBILE_NUMBER")
    private int mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", query='" + query + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }
}
