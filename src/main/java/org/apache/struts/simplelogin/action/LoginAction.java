// package com.tutorialspoint.struts2;
package org.apache.struts.simplelogin.action;

import org.apache.struts.simplelogin.model.Person;
import org.apache.struts.simplelogin.service.PersonService;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {

    private Person personBean;
    private PersonService personService = new PersonService();

   private String user;
   private String password;

   public String execute() {
       personBean = new Person();

       // call Service class to check if user exists in database
       // if exist, retrieve user's name and set personBean.name as the user's name. returns "SUCCESS"
       // else, returns "ERROR"
       String result = personService.getName(user, password, personBean);

       if (result == "SUCCESS") {
           return SUCCESS;
       } else {
           return ERROR;
       }
   }

   public String getUser() {
      return user;
   }

   public void setUser(String user) {
      this.user = user;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public Person getPersonBean() {
       return personBean;
   }
   public void setPersonBean(Person person) {
       personBean = person;
   }
}