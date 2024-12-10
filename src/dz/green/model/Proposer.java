package dz.green.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Proposer extends User{
    private Set<Planting> plantingsR= new HashSet<>();


    public Set<Planting> getPlantings() {
        return plantingsR;
    }

    public void setPlantings(Set<Planting> plantingsR) {
        this.plantingsR = plantingsR;
    }
    public Proposer(String firstname, String lastname, String email, Date birthdate, String password, int phoneNumber) {
        super(firstname, lastname, email, birthdate, password, phoneNumber);
    }

    public void addPlanting(Planting p){
        if( !getPlantings().contains(p) )
            getPlantings().add(p);
    }
    public void removePlanting(Planting p){
        if(getPlantings().contains(p)) getPlantings().remove(p);
    }


    public Planting[] getMyPlanting(){
        Planting [] p= (Planting[]) getPlantings().toArray();
        return p;
    }
}
