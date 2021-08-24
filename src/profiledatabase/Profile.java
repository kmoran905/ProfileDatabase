/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profiledatabase;

import java.io.Serializable;

/**
 *
 * @author KHYLE
 */
public class Profile implements Serializable {

    private String name;
    private int age;
    private String location;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    public String getAge() {
    /*Converts the int value into a string so that the 
    program can write string values into the text file */
        return Integer.toString(age);
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {   
        if (age < 18) {
            System.out.println("This person is not of age");
            //System will automatically shutdown if the user inserts an age that's under 18.
            System.exit(0);
        } else {
            this.age = age;
        }
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {

        return String.format("Name: %-5s  Age: %-5sLocation: %-5s", getName(), getAge(), getLocation());
    }
}
