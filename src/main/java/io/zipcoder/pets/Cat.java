package io.zipcoder.pets;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class Cat extends Pets{

// declaring and initializing fields

    protected String name;

    public Cat(String name){
        super(name);
        this.name = name;
    }

    public String speak(){

        return "Raiiiiooowwww";
    }


}
