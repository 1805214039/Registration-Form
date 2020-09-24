package com.example.myapplication;

public class UserHelperClass {
    String name,rollno,email,mobno,username,password;

    public UserHelperClass(String name,String rollno,String email,String mobno,String username,String password) {
        this.name = name;
        this.rollno = rollno;
        this.email = email;
        this.mobno = mobno;
        this.username = username;
        this.password = password;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getRollno()
    {
        return rollno;
    }
    public void setRollno(String rollno)
    {
        this.rollno=rollno;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobno() {
        return mobno;
    }

    public void setMobno(String mobno) {
        this.mobno = mobno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
