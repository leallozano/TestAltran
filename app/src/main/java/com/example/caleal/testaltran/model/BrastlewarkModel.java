package com.example.caleal.testaltran.model;

import java.util.ArrayList;

/**
 * Created by CALEAL on 11/27/2017.
 */

public class BrastlewarkModel {

    //public static String ID_KEY = "id";

    int id;
    String name;
    String photo;
    int age;
    Double weight;
    Double height;
    String hairColor;
    ArrayList<String> professions;
    ArrayList<String> friendsNames;
    ArrayList<BrastlewarkModel> friends;

    public BrastlewarkModel() {


    }

    public BrastlewarkModel(int id, String name, String photo, int age, Double weight, Double height, String hairColor, ArrayList<String> professions, ArrayList<String> friendsNames, ArrayList<BrastlewarkModel> friends) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hairColor = hairColor;
        this.professions = professions;
        this.friendsNames = friendsNames;
        this.friends = friends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public ArrayList<String> getProfessions() {
        return professions;
    }

    public void setProfessions(ArrayList<String> professions) {
        this.professions = professions;
    }

    public ArrayList<String> getFriendsNames() {
        return friendsNames;
    }

    public void setFriendsNames(ArrayList<String> friendsNames) {
        this.friendsNames = friendsNames;
    }

    public ArrayList<BrastlewarkModel> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<BrastlewarkModel> friends) {
        this.friends = friends;
    }
}
