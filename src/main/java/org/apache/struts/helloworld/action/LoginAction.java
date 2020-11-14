// package com.tutorialspoint.struts2;
package org.apache.struts.helloworld.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

   private String user;
   private String password;
   private String name;

   private String USERNAME = "root";
   private String PASSWORD = "toor";
   private String mainURL = "jdbc:mysql://localhost/?useSSL=false";

   public String execute() {
      String ret = ERROR;
      Connection conn = null;

      try {
         createTable();

         String URL = "jdbc:mysql://localhost/ase_assignment2?useSSL=false";
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(URL, "root", "toor");
         String sql = "SELECT name FROM useraccounts WHERE";
         sql+=" user = ? AND password = ?";
         PreparedStatement ps = conn.prepareStatement(sql);
         ps.setString(1, user);
         ps.setString(2, password);
         ResultSet rs = ps.executeQuery();

         while (rs.next()) {
            name = rs.getString(1);
            ret = SUCCESS;
         }
      } catch (Exception e) {
         ret = ERROR;
      } finally {
         if (conn != null) {
            try {
               conn.close();
            } catch (Exception e) {
            }
         }
      }
      return ret;
   }

   public void createTable () {
      Connection conn = null;
      Statement stmt = null;

      try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            conn = DriverManager.getConnection(mainURL, USERNAME, PASSWORD);

            //STEP 4: Execute a query
            stmt = conn.createStatement();

            String sql = "create schema if not exists `ase_assignment2`";
            stmt.executeUpdate(sql);
      }catch(Exception e){
            e.printStackTrace();
      }finally{
            try{
               if(stmt!=null)
                  stmt.close();
               }
            catch(Exception e){
               e.printStackTrace();
               }
            try{
               if(conn!=null)
                  conn.close();
               }catch(Exception e){
                  e.printStackTrace();
               }
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

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}