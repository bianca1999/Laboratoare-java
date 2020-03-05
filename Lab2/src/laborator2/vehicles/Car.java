/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator2.vehicles;

import laborator2.vehicles.AbstractVehicle;

/**
 *
 * @author calan
 */
public class Car extends AbstractVehicle {
    
    public Car(String name) {
        super(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
