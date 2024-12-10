package dz.green.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Comment {
    private String text;
    private Date createdAt;
    private Set<Photo> photosR= new HashSet<>();

    public Comment(String text, Date createdAt) {
        this.text = text;
        this.createdAt = createdAt;
    }

    private Contribution contributionr;
    public void addContribution(Contribution contributionr){
    if(!contributionr.getComment().contains(this)){
        if(this.getContribution()!=null) this.removeContribution();
    setContribution(contributionr);
    contributionr.addComment(this);
    }
    }
    public void removeContribution(){ getContribution().removeComment(this); setContribution(null); }
    public Contribution getContribution(){ return contributionr; }
    public void setContribution(Contribution a){ this.contributionr = a; }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Set<Photo> getPhoto() {
        return photosR;
    }

    public void setPhoto(Set<Photo> photosR) {
        this.photosR = photosR;
    }
    public void addPhoto(Photo p){
        if( !getPhoto().contains(p) )
            getPhoto().add(p);
    }
    public void removePhoto(Photo p){
        if(getPhoto().contains(p)) getPhoto().remove(p);
    }
}
