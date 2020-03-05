/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator2.vehicles;

import java.util.Objects;

/**
 *
 * @author calan
 */
public class Vehicle {
  String name;
  VehicleType vehicleType;
  
    public enum VehicleType {
    AUTO, TRUCK, DRONE;
}

    public Vehicle(String name, VehicleType vehicleType) {
        this.name = name;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.vehicleType);
        return hash;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.vehicleType != other.vehicleType) {
            return false;
        }
        return true;
    }
    

}
