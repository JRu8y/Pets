package io.zipcoder.pets;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class Sloth extends Pets {

// declaring and initializing fields

    protected String name;

    public Sloth(String name){
        super(name);
        this.name = name;
    }


    public String speak(){

        return "What does the sloth say? Sloth speaks...";
    }

}
