package com.org.to_do.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User(String name,String email,String password){
        this.name=name;
        this.password=password;
        this.email=email;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password){this.password=password;}
    public String getPassword(){return this.password;}


}
