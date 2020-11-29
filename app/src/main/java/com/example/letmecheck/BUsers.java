package com.example.letmecheck;

public class BUsers {
    private String Name;
    private String Age;
    private String Email;
    private String Mobile;
    private String City;
    private String Country;


    public BUsers() {
    }

    public BUsers(String name, String age, String email, String mobile, String city, String country) {
        Name = name;
        Age = age;
        Email = email;
        Mobile = mobile;
        City = city;
        Country = country;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
