/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.uni.lodz.math.bank.account;

import java.util.List;
import java.util.logging.Logger;
import pl.uni.lodz.math.bank.client.Client;

/**
 *
 * @author Bartek
 */
public class Account {

    private static final Logger logger = Logger.getLogger(Account.class.getName());
    private String number , description;
    private Client client;
    private double balance;

    
    public Account(String number, String description, Client client, double balance) throws Exception {
        try{
            Long.valueOf(number);
            if(number.length()!=15){
                throw new Exception("Bład, podaj poprawny numer banku");
            }
        }
        catch (Exception ex){
            throw new Exception("Bład, numer musi zawierać same cyfry");
        }
        this.number = number;
        this.description = description;
        this.client = client;
        this.balance = balance;
    }

    
    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public double getBalance() {
        return balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "number=" + number + ", client=" + client.getFirstName() + " " +client.getLastName() +  "  , balance=" + balance + '}';
    }
    

}
