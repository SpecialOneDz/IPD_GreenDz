package dz.green.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contribution {
    private String type; // Enum: planting, donation
    private Date confirmedAt;

    public Contribution(String type, Date confirmedAt, String remark) {
        this.type = type;
        this.confirmedAt = confirmedAt;
        this.remark = remark;

    }

    private String remark;
    private Set<Comment> commentsR= new HashSet<>();
    private Planting plantingr;
    private Volunteer volunteerr;
    public void addVolenteer(Volunteer volunteerr){
    if(!volunteerr.getContributions().contains(this) ){
        if(this.getVolunteer()!=null) this.removeVolunteer();
    this.setVolunteer(volunteerr);
    volunteerr.addContribution(this);
    }
    }
    public void removeVolunteer(){ getVolunteer().removeContribution(this); setVolunteer(null); }
    public Volunteer getVolunteer(){ return volunteerr; }
    public void setVolunteer(Volunteer a){ this.volunteerr = a; }
    
    public void addPlanting(Planting plantingr){
    if(!plantingr.getContributions().contains(this) ){
        if(this.getPlanting()!=null) this.removePlanting();
    this.setPlanting(plantingr);
    plantingr.addContribution(this);
    }
    }
    public void removePlanting(){
    	getPlanting().removeContribution(this);
    	setPlanting(null); 
    	}
    
    public Planting getPlanting(){
    	return plantingr;
    	}
    public void setPlanting(Planting a){
    	this.plantingr = a; 
    	}
   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(Date confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public Set<Comment> getComment() {
        return commentsR;
    }

    public void setComment(Set<Comment> commentsR) {
        this.commentsR = commentsR;
    }
    public void addComment(Comment c){
        if( !getComment().contains(c) )
            getComment().add(c);
    }
    public void removeComment(Comment p){
        if(getComment().contains(p)) getComment().remove(p);
    }
    public Comment [] getComments(){
    	Comment[] v= (Comment[]) getComment().toArray();
        return v;
    }
}
