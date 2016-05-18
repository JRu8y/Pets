package io.zipcoder.pets;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class Pets {

    protected String petName;

    public Pets(String name){
        this.petName = name;
    }

    public String speak(){

        return "Pets";
    }
}
