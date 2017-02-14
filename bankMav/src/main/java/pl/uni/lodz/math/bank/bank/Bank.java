/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.uni.lodz.math.bank.bank;

import java.util.ArrayList;
import java.util.logging.Logger;
import pl.uni.lodz.math.bank.client.Client;

/**
 *
 * @author Bartek
 */
public class Bank {

    private String name;
    private ArrayList<Client> clients;
    private static final Logger logger = Logger.getLogger(Bank.class.getName());

    public Bank(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void removeClient(Client client) {
        clients.remove(client);
    }

    public void showClients() {
        for(int i=0 ; i<clients.size() ; i++)
        {
            clients.get(i).showClient();
        }
    }

}
