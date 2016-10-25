/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciooones;

import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Company {
    private HashMap<String, Client> clients;
    
    public Company(){
        this.clients = new HashMap<>();
    }
    
    public boolean addClient(Client client){
        if(this.clients.containsKey(client.getCC())){
            this.clients.put(client.getCC(), client);
            return true;
        }
        return false;
    }
    
    public double calAmountAllMarket(){
        double marketValue = 0;
        for ( Client client : this.clients.values()) {
            marketValue+=client.sumMarket();
        }
        return marketValue;
    }
    
    public double  calAllProfit(){
        double profitValue = 0;
        for ( Client client : this.clients.values()) {
            profitValue+=client.sumProfit();
        }
        return profitValue;
    }
    
    public Client calClientMaxProfit(){
        Client maxProfit = null;
        for ( Client client : this.clients.values()){
            if(maxProfit == null)
                maxProfit = client;
            else{
                if(client.sumProfit() > maxProfit.sumProfit()){
                maxProfit = client;
                }     
            }  
        }
        return maxProfit;
    }
    //Cliente ordenados descendentemente por
    //valor en el mercado
    public ArrayList listClient(){
        return null;
    }
}
