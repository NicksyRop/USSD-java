package com.springBoot.ussdapp;


import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(
            name = "id",
            updatable = false
    )
    private Long id ;

    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "text"
    )
    private String firstName;
    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "text"
    )
    private String secondName;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "text",
            unique = true
    )
    private String email;
    @Column(
            name = "id_number"
    )
    private Integer idNumber;

    public User(Long id, String firstName, String secondName, String email, Integer idNumber) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }
}



