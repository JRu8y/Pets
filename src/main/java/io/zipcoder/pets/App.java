package io.zipcoder.pets;
import java.io.*;
import java.util.*;

/**
 * Created by dimitrivaughn on 5/18/16.
 */
public class App {





    public static void engine(){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        String name = "";
        String type;
        String answer;
        User user = new User("q");


        System.out.println("Hello and welcome to the pet scanner where we scan your pets and tell you a little bit about them.");
        System.out.println("Please tell us. How many pets do you have?");
        number = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<number; i++){
            System.out.println("What is the name of pet number "+(i+1)+"?");
            name = scanner.nextLine();
            System.out.println("And what type of pet is this: Cat, Dog, or Sloth");
            type = scanner.nextLine();

            switch(type.toLowerCase()){
                case "dog":
                    Dog dog = new Dog(name);
                    user.addPetKind(dog);
                    break;
                case "cat":
                    Cat cat = new Cat(name);
                    user.addPetKind(cat);
                    break;
                case "sloth":
                    Sloth sloth = new Sloth(name);
                    user.addPetKind(sloth);
                    break;
                default:
                    System.out.println("This is not a valid animal type at the moment");
            }
        }
        System.out.println("Would you like to print a list of your pets :) ?");
        answer = scanner.nextLine();
        if (answer.toLowerCase().equals("yes")){
            user.printPetList();
        }

    }

    public static void main(String[] args) {
        App.engine();

    }
}
