package dz.green.model;

import java.util.Date;

public class Photo {
    private Date takenAt;

    public Photo(Date takenAt ,int height,int width) {
        this.height=height;
        this.width=width;
        this.takenAt = takenAt;
    }

    private int width;
    private int height;
    private Comment commentr ;
    public void addComment(Comment a){
    if(!a.getPhoto().contains(this) ){
        if(this.getComment()!=null)this.removeComment();
    setComment(a);
    a.addPhoto(this);
    }
    }
    public void removeComment(){ getComment().removePhoto(this); setComment(null); }
    public Comment getComment(){ return commentr; }
    public void setComment(Comment a){ this.commentr = a; }
    public Date getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Date takenAt) {
        this.takenAt = takenAt;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
