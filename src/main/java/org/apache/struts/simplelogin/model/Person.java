package org.apache.struts.simplelogin.model;

/**
 * Models a user that exist in the local MySql database
 * @author Group 66
 */
public class Person {
    private String name;
    private String user;
    private String password;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getUser() {
        return user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }

    public String toString() {
        return "Name: " + getName() + "User: " + getUser();
    }
}