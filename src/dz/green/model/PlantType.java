package dz.green.model;

import java.util.HashSet;
import java.util.Set;

public class PlantType {
    private String species;
    private Float growthRate;
    private Set<Planting> plantingsR= new HashSet<>();


    public Set<Planting> getPlantings() {
        return plantingsR;
    }

    public void setPlantings(Set<Planting> plantingsR) {
        this.plantingsR = plantingsR;
    }

    public PlantType(String species, Float growthRate) {
        this.species = species;
        this.growthRate = growthRate;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Float getGrowthRate() {
        return growthRate;
    }
    public void setGrowthRate(Float growthRate) {
        this.growthRate = growthRate;
    }
    public void addPlanting(Planting p){
        if( !getPlantings().contains(p) )
            getPlantings().add(p);
    }
    public void removePlanting(Planting p){
        if(getPlantings().contains(p)) getPlantings().remove(p);
    }

    public int getPlantingCount(){
        return getPlantings().size();
    }
}
