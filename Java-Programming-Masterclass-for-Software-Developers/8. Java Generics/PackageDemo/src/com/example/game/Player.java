package com.example.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dev on 30/09/15.
 */
public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3, this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() >0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }

    }


    public static class Main {

        public static void main(String[] args) {
            // Create a simple interface that allows an object to be saved to some sort of storage medium.
            // The exact type of medium is not known to the interface (nor to the classes that implement it).
            // The interface will just specify 2 methods, one to return an ArrayList of values to be saved
            // and the other to populate the object's fields from an ArrayList.
            //
            // Create some sample classes that implement your saveable interface (we've used the idea of a game,
            // with Players and Monsters, but you can create any type of classes that you want).
            //
            // Override the toString() method for each of your classes so that they can be easily printed to enable
            // the program to be tested easier.
            //
            // In Main, write a method that takes an object that implements the interface as a parameter and
            // "saves" the values.
            // We haven't covered I/O yet, so your method should just print the values to the screen.
            // Also in Main, write a method that restores the values to a saveable object.
            // Again, we are not going to use Java file I/O; instead use the readValues() method below to
            // simulate getting values from a file – this allows you to type as many values as your class
            // requires, and returns an ArrayList.

            Player tim = new Player("Tim", 10, 15);
            System.out.println(tim.toString());
            saveObject(tim);

            tim.setHitPoints(8);
            System.out.println(tim);
            tim.setWeapon("Stormbringer");
            saveObject(tim);
    //        loadObject(tim);
            System.out.println(tim);

            ISaveable werewolf = new Monster("Werewolf", 20, 40);
            System.out.println("Strength = " + ((Monster) werewolf).getStrength());
            saveObject(werewolf);

        }

        public static ArrayList<String> readValues() {
            ArrayList<String> values = new ArrayList<String>();

            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            int index = 0;
            System.out.println("Choose\n" +
                    "1 to enter a string\n" +
                    "0 to quit");

            while (!quit) {
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        System.out.print("Enter a string: ");
                        String stringInput = scanner.nextLine();
                        values.add(index, stringInput);
                        index++;
                        break;
                }
            }
            return values;
        }

        public static void saveObject(ISaveable objectToSave) {
            for(int i=0; i<objectToSave.write().size(); i++) {
                System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
            }
        }

        public static void loadObject(ISaveable objectToLoad) {
            ArrayList<String> values = readValues();
            objectToLoad.read(values);
        }

























    }
}
