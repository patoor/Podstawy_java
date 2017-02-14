
import java.util.Date;
import org.junit.Before;
import pl.uni.lodz.math.bank.account.Account;
import pl.uni.lodz.math.bank.client.Client;
import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;
import pl.uni.lodz.math.bank.transaction.Transaction;
import static org.junit.Assert.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bartek
 */
public class transactionsTest {
    Client testClientOne, testClientTwo;
    Account accOne , accTwo;
    double amountOne , amountTwo;
    Transaction transaction;
    public transactionsTest(){
    }
    
    @Before
    public void setUp() throws Exception{
        testClientOne = EasyMock.createMock(Client.class);
        testClientTwo = EasyMock.createMock(Client.class);
        amountOne = 500;
        amountTwo = 1000;
        accOne = new Account("111111111111111", "Test", testClientOne, amountOne);
        accTwo = new Account("222222222222222", "Test", testClientTwo, amountTwo);
        transaction = new Transaction();
    }
    @Test
    public void TheSameAccount(){
        assertNotEquals(accTwo.getNumber(), accOne.getNumber());
    }
    @Test
    public void doDeposit(){
        double amountDeposit = 100;
        double myPi = 22.0d / 7.0d;
        transaction.doDeposit(accOne, accTwo, amountDeposit, new Date(), "Test");
        assertEquals(accOne.getBalance(), amountOne - amountDeposit, myPi);   
        
    }
    
}
