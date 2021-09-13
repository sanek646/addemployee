package com.example.addemployee.models;

import javax.persistence.*;

@Entity
@Table(name ="users")
public class Users {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

   @Column(name="companyId")
   private int companyId;
   @Column(name="firstName")
    private String firstName;
   @Column(name="lastName")
    private String lastName;
   @Column(name="role")
    private String role;

    public Users() {
    }

    public Users(String firstName, String lastName,int companyId, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyId = companyId;
        this.role = role;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + Id +
                ", companyId=" + companyId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
