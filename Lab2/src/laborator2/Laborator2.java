/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator2;

import laborator2.vehicles.AbstractVehicle;
import laborator2.vehicles.Vehicle;
import laborator2.vehicles.Vehicle.VehicleType;

/**
 *
 * @author calan
 */
public class Laborator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Depot d1=new Depot("D1");
       Depot d2=new Depot("D2");
        
       Vehicle v1=new Vehicle("V1",VehicleType.AUTO); 
       Vehicle v2=new Vehicle("V2",VehicleType.TRUCK); 
       Vehicle v3=new Vehicle("V3",VehicleType.DRONE); 
       Vehicle v4=new Vehicle("V3",VehicleType.DRONE); 
       
       Client c1=new Client("C1",1);
       Client c2=new Client("C2",1);
       Client c6=new Client("C2",1);
       Client c3=new Client("C3",2);
       Client c4=new Client("C4",2);
       Client c5=new Client("C5",3);
       
       d1.setListOfVehicles(v1,v2);
       d2.setListOfVehicles(v3);
       Problem p1=new Problem();
       p1.setClients(c1,c2,c3,c4,c5,c6);
       p1.setDepot(d1,d2);
       
       Solution s=new Solution();
       System.out.println("Clients:"+p1.getClients());
       System.out.println("Depots:"+p1.getDepots());
       System.out.println("Vehicles:"+p1.getVehicles());
       s.generateTours(p1.getDepots(),p1.getVehicles(),p1.getClients());
       System.out.println(s);
       
    }
    
}
