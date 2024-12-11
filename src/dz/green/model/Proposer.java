package dz.green.model;

import java.time.LocalDate;
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
    public Proposer(int id, String firstname, String lastname, String email, LocalDate birthdate, String password, String phoneNumber) {
        super(id,firstname, lastname, email, birthdate, password, phoneNumber);
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
