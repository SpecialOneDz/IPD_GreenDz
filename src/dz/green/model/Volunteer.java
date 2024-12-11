package dz.green.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Volunteer extends User {
    Availabilities availability;
    private Set<Contribution> contributionsR= new HashSet<>();

    public Volunteer(int id, String firstname, String lastname, String email, LocalDate birthdate, String password, String phoneNumber , Availabilities availability) {
        super(id,firstname, lastname, email, birthdate, password, String.valueOf(phoneNumber));
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
