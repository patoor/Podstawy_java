/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.uni.lodz.math.bank;

import java.util.Date;
import java.util.logging.Logger;
import pl.uni.lodz.math.bank.account.Account;
import pl.uni.lodz.math.bank.bank.Bank;
import pl.uni.lodz.math.bank.client.Client;
import pl.uni.lodz.math.bank.transaction.Transaction;

/**
 *
 * @author Bartek
 */
public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws Exception {
    Bank bankWBK = new Bank("WBK");
    
    Client clientJan = new Client("Jan", "Kowalski");
    Client clientAdam = new Client("Adam", "Nowak");
    
    Account aJan = new Account("111122223333444", "Konto jana", clientJan, 500);
    Account aAdam = new Account("112213445566778", "Konto studenckie Adama", clientJan, 1500);
   
    
    bankWBK.addClient(clientJan);
    bankWBK.addClient(clientAdam);
    
    bankWBK.showClients();            
    Transaction transaction = new Transaction();
    
    logger.info(aJan.toString());
    logger.info(aAdam.toString());
    
    transaction.doDeposit(aJan, aAdam, 200, new Date(), "Przelew za mieszkanie");
    
    logger.info(aJan.toString());
    logger.info(aAdam.toString());
    
    transaction.doCheck(aAdam, aJan, 50, new Date(), "Zwrot");
    logger.info(aJan.toString());
    logger.info(aAdam.toString());
    
    transaction.showTransactionHostory();
    }
    
}
