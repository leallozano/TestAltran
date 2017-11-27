package com.example.caleal.testaltran.model;

import java.util.List;

/**
 * Created by CALEAL on 11/27/2017.
 */

public class BrastlewarkModel {

    public static String ID_KEY = "id";

    String id;
    String name;
    String photo;
    String age;
    String weight;
    String height;
    String hairColor;
    List<String> professions;
    List<String> friendsNames;
    List<BrastlewarkModel> friends;

    /*public BrastlewarkModel(int id,String name, int age, Double weight,  Double height, String hairColor,List<String> professions,List<String> friends) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
        this.professions=professions;
        this.friends=friends;


    }*/

    public BrastlewarkModel() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public void setProfessions(List<String> professions) {
        this.professions = professions;
    }

    public List<String> getFriendsNames() {
        return friendsNames;
    }

    public void setFriendsNames(List<String> friendsNames) {
        this.friendsNames = friendsNames;
    }

    public List<BrastlewarkModel> getFriends() {
        return friends;
    }

    public void setFriends(List<BrastlewarkModel> friends) {
        this.friends = friends;
    }




    /*public BrastlewarkModel() {
    }*/

   /* public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getWeight() {return weight;}
    public String getHeight() {
        return height;
    }
    public String getHairColor() {
        return hair_color;
    }*/







}
