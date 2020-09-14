package com.company;
import java.lang.*;
public class author {
    private String name;
    private String email;
    private char gender;
    author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public char getGender()
    {
        return gender;
    }
    public String toString()
    {
        return ("Name = "+name+", Email = "+email+", Gender = "+gender);
    }

}
