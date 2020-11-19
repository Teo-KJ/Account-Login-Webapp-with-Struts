package org.apache.struts.simplelogin.service;

import org.apache.struts.simplelogin.model.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;


public class PersonService {
    String ret = "ERROR";
    Connection conn = null;
    String name;
    String USERNAME = "root";
    String PASSWORD = "Ase123456";
    String mainURL = "jdbc:mysql://localhost/?useSSL=false&allowPublicKeyRetrieval=true";

    public String getName(String user, String password, Person personBean) {
        try {
        createTable();

        String URL = "jdbc:mysql://localhost/ase_assignment2?useSSL=false";
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String sql = "SELECT name FROM useraccounts WHERE";
        sql+=" user = ? AND password = ?";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            name = rs.getString(1);
            personBean.setName(name);
            ret = "SUCCESS";
        }
        } catch (Exception e) {
        ret = "ERROR";
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

            String insert = "CREATE TABLE if not exists `ase_assignment2`.`useraccounts`(`user` VARCHAR(10) NOT NULL," + 
                            "`password` VARCHAR( 10 ) NOT NULL, `name` VARCHAR( 20 ) NOT NULL ," +
                            "PRIMARY KEY (`user`)) ENGINE = InnoDB;";
            stmt.executeUpdate(insert);

            try{
                String defaultUser = "INSERT INTO `ase_assignment2`.`useraccounts` (`user`, `password`, `name`)" +
                                    "VALUES ('admin', 'password', 'Group 66');";
                stmt.executeUpdate(defaultUser);
            }
            catch(Exception e){

            }

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
}
