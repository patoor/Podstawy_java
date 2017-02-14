/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.uni.lodz.math.bank.client;

import java.util.ArrayList;
import java.util.logging.Logger;
import pl.uni.lodz.math.bank.account.Account;

/**
 *
 * @author Bartek
 */
public class Client {

    private static final Logger logger = Logger.getLogger(Client.class.getName());
    private String firstName , lastName;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
  

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void showClient(){
        logger.info(firstName+" "+lastName);
    }
}
