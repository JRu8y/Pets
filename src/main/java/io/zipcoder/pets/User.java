package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class User {

// declaring fields

    private int numberofPets;
    private ArrayList<Pets> petKind = new ArrayList<>();
    private String petName;
    private String userName;


// Initializing fields with constructor

    public User(String name){
        this.userName = name;
    }

// Setters for users fields

    public void setPetNumber(int response){
        this.numberofPets = response;
    }

    public void addPetKind(Pets response){
        this.petKind.add(response);
    }

    public void setPetName(String response){
        this.petName = response;
    }

// Getters for User fields

    public int getNumberofPets() {
        return numberofPets;
    }

    public ArrayList<Pets> getPetKind() {
        return petKind;
    }

    public String getPetName() {
        return petName;
    }

    public String getUserName() {
        return userName;
    }


// Print current users list of pets

    public void printPetList() {
        int i =0;
        for (Pets pet : petKind) {
            System.out.println("You have a " + this.petKind.get(i).getClass().getName() + " named " + this.petKind.get(i).petName);
            System.out.println(this.petKind.get(i).petName+" says: "+this.petKind.get(i).speak());
            i++;
            }
        }

}
