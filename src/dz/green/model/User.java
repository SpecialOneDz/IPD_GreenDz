package dz.green.model;

import java.time.LocalDate;

public abstract class User {

    private String firstname,lastname,email,password,phoneNumber;
    private LocalDate birthdate;
    private int id;

    public User(int id, String firstname, String lastname, String email, LocalDate birthdate, String password, String phoneNumber) {
        this.id=id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.birthdate = birthdate;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPassword() {
        return password;
    }

    public boolean updatePassword(String oldPassword,String newPassword) {
        if(this.password.equals(oldPassword)){
        this.password = newPassword;
        return true;
        }
        return false;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
