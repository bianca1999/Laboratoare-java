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
public class Solution {
    ArrayList<Tour> tours;
    
    public void generateTours(ArrayList<Depot> depots,ArrayList<Vehicle> vehicles,ArrayList<Client> clients){
        tours=new ArrayList<Tour>();
        int numberOfTours=vehicles.size();//am luat numarul de tours egal cu numarul de vehicule
        int pas=clients.size()/numberOfTours;//impart numarul de clienti ca sa stiu cati clienti sa pun in fiecare vehicul
        int start=0;
        for( Depot i: depots){//incepand cu forul asta imi construiesc fiecare tour
            for(Vehicle j: i.getListOfVehicles()){
                Tour tour = new Tour();
                tour.setDepot(i);//setez Depot 
                tour.setVehicle(j);//setez Vehicle
                ArrayList<Client> clientsChoose=new ArrayList<>();
                for(int l=start;l<=pas;l++)//aici imi adaug cate pas clienti in tour
                {
                    clientsChoose.add(clients.get(l));
                }
                start=start+pas;//avansez in vectorul de clienti
                pas=pas+clientsChoose.size()-1;
                tour.setClients(clientsChoose);//setez clientii din tour-ul curent 
                tours.add(tour);//adaug tour-ul la solutie
            }
            
        }
  
    }

    @Override
    public String toString() {
        return "Solution:\n" + tours;
    }
    
    
    
}