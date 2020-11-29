package com.example.letmecheck;

public class Blood {

    private String Name;
    private String Age;
    private String Blood;
    private String Mobile;
    private String City;
    private String Country;


    public Blood() {
    }

    public Blood(String name, String age, String blood, String mobile, String city, String country) {
        Name = name;
        Age = age;
        Blood = blood;
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

    public String getBlood() {
        return Blood;
    }

    public void setBlood(String blood) {
        Blood = blood;
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
