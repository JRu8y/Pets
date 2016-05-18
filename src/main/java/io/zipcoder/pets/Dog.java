package io.zipcoder.pets;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class Dog extends Pets {

// declaring and initializing fields

    protected String name;

    public Dog(String name){
        super (name);
        this.name = name;
    }

    public String speak(){

        return "Woof-woof";
    }

}
