package com.ehtp.ehtpeasykool.Model;

public class User {
    private String id;
    private String username;
    private String mail;
    private String imageURL;

    public User(String id,String username ,String mail ,String imageURL){

        this.id=id;
        this.username=username;
        this.imageURL=imageURL;
        this.mail=mail;

    }

    public User() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
