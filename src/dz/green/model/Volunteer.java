package dz.green.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Volunteer extends User {
    Availabilities availability;
    private Set<Contribution> contributionsR= new HashSet<>();

    public Volunteer(String firstname, String lastname, String email, Date birthdate, String password, int phoneNumber ,Availabilities availability) {
        super(firstname, lastname, email, birthdate, password, phoneNumber);
        this.availability=availability;
    }

    public Availabilities getAvailability() {
        return availability;
    }

    public void setAvailability(Availabilities availability) {
        this.availability = availability;
    }
    public Set<Contribution> getContributions() {
        return contributionsR;
    }

    public void setContributions(Set<Contribution> contributionsR) {
        this.contributionsR = contributionsR;
    }
    public void addContribution(Contribution c){
        if( !getContributions().contains(c) )
            getContributions().add(c);
    }
    public void removeContribution(Contribution c){
        if(getContributions().contains(c)) getContributions().remove(c);
    }
    public Contribution[] getMyContribution(){
        Contribution[] c = (Contribution[]) getContributions().toArray();
        return c;
    }


}
