package dz.green.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Planting {
    private Date beginAt,endAt;

    private Set<Contribution> contributionsR= new HashSet<>();
    private Proposer proposerR;

    public Planting(Date beginAt, Date endAt) {
        this.beginAt = beginAt;
        this.endAt = endAt;
    }
    private PlantType plantTyper;
    
    private Location locationr;
    public void addLocation(Location locationr) {
    if(locationr.getPlanting() != null) locationr.removePlanting();
    if(getLocation() != null) removeLocation();
    this.setLocation(locationr);
    locationr.setPlanting(this);
    }
    public void removeLocation() {
    if(getLocation() != null) getLocation().setPlanting(null);
    setLocation(null);
    }
    public Location getLocation() { return locationr; }
    public void setLocation(Location b) { this.locationr = b; }
    
    
    public void addProposer(Proposer p){
    if(!p.getPlantings().contains(this) ){
        if(this.getProposer()!=null) this.removeProposer();
    this.setProposer(p);
    p.addPlanting(this);
    }
    }
    public void removeProposer(){ getProposer().removePlanting(this); setProposer(null); }
    public Proposer getProposer(){ return proposerR; }
    public void setProposer(Proposer p){ this.proposerR = p; }

    public void addPlantType(PlantType plantTyper){
        if(!plantTyper.getPlantings().contains(this) ){
            if(this.getPlantType()!=null) this.removePlantType();
            this.setPlantType(plantTyper);
            plantTyper.addPlanting(this);
        }
    }
    public void removePlantType(){ getPlantType().removePlanting(this); setPlantType(null); }
    public PlantType getPlantType(){ return plantTyper; }
    public void setPlantType(PlantType a){ this.plantTyper = a; }

    public Date getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(Date beginAt) {
        this.beginAt = beginAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
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