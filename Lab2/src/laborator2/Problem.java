/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator2;

import laborator2.vehicles.Vehicle;
import java.util.ArrayList;

/**
 *
 * @author calan
 */
public class Problem {
    ArrayList<Depot> depots;
    ArrayList<Vehicle> vehicles;
    ArrayList<Client> clients;
    
    /*
    *setter pentru clients cu specificarea ca nu se 
    *va adauga acelasi client de doua ori
    */
    public void setClients(Client ... clients){//nr variabil de parametri
        this.clients=new ArrayList<Client>();
        for(Client i:clients){
            int j;
            boolean isNotEqual=true;
            for(j=0;j<this.clients.size() && isNotEqual;j++){
                if(i.equals(this.clients.get(j))){
                    isNotEqual=false;
                }
            }
            if(isNotEqual==true && j==this.clients.size()){  
                this.clients.add(i);
            }
        }
    }
    
    /*
    *setter pentru depots cu specificarea ca nu se 
    *va adauga acelasi client de doua ori
    */
    public void setDepot(Depot ... depots){
        this.depots=new ArrayList<Depot>();
        for(Depot i:depots){
            int j;
            boolean isNotEqual=true;
            for(j=0;j<this.depots.size() && isNotEqual;j++){
                if(i.equals(this.depots.get(j))){
                    isNotEqual=false;
                }
            }
            if(isNotEqual==true && j==this.depots.size()){  
                this.depots.add(i);
            }
        }
    }
    
    /*
    *getter pentru vehicles
    *Iau vehicles din toate depots si le pun intr-un ArrayList
    */
    public ArrayList<Vehicle> getVehicles(){
        this.vehicles=new ArrayList<Vehicle>();
        for( Depot i: this.depots){
            for( Vehicle j: i.getListOfVehicles()){
                vehicles.add(j);
            }  
        }
        return vehicles;
    }
    
    public ArrayList<Depot> getDepots() {
        return depots;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
    
    @Override
    public String toString() {
        return "Problem:\n" + "depots=" + depots + ",\nclients=" + clients + "\nvehicles="+getVehicles()+'}';
    }
    
    

    
}
    
    


