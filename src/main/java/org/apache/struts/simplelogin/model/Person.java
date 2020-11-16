package org.apache.struts.simplelogin.model;

/**
 * Models a user that exist in the local MySql database
 * @author Group 66
 */
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // public String toString() {
    //     return "Name: " + getName();
    // }
}