/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 797494
 */

public class AccountService {
    
    public static User Login(String username, String password){
        if (username.equalsIgnoreCase("adam")
                && password.equalsIgnoreCase("password")) {
            User admin = new User(username, password);
            return admin;
        }
        if (username.equalsIgnoreCase("betty")
                && password.equalsIgnoreCase("password")) {
            User admin = new User(username, password);
            return admin;
        } else {
            return null;
        }
    } 

}
