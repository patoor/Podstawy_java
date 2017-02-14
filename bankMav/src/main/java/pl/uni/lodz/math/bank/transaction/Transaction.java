/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.uni.lodz.math.bank.transaction;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import pl.uni.lodz.math.bank.account.Account;

/**
 *
 * @author Bartek
 */
public class Transaction {
    private Account myAccount;
    private Account otherAccount;
    private double amount;
    private Date date;
    private String description;
    private static final Logger logger = Logger.getLogger(Transaction.class.getName());
    
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    String dateString = dateFormat.format(currentDate);
    List<String> transactionHistory = new ArrayList<String>();
   

    public void doDeposit(Account myAccount , Account otherAccount, double amount, Date date , String description){
        
        myAccount.setBalance(myAccount.getBalance()-amount);
        otherAccount.setBalance(otherAccount.getBalance()+amount);
        transactionHistory.add(dateString+" "+myAccount.getNumber()+" "+otherAccount.getNumber()+" "+amount);        
    }
    
    public void doCheck(Account myAccount , Account otherAccount, double amount, Date date , String description){
        
        myAccount.setBalance(myAccount.getBalance()+amount);
        otherAccount.setBalance(otherAccount.getBalance()-amount);
        transactionHistory.add(dateString+" "+myAccount.getNumber()+" "+otherAccount.getNumber()+" "+amount); 
    }
    public void showTransactionHostory(){
        for(int i=0 ; i< transactionHistory.size() ; i++){
            logger.info(transactionHistory.get(i));
        }
    }
}
