package dz.green.model;

import java.time.LocalDate;

public class Admin extends User {
    private String permissions;
    public Admin(int id, String firstname, String lastname, String email, LocalDate birthdate, String password, String phoneNumber, String permissions) {
        super(id, firstname, lastname, email, birthdate, password, phoneNumber);
        this.permissions=permissions;
    }


    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
    public void deletePlanting(String id_planting){

    }
}
