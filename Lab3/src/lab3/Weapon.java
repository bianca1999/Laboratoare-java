/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author calan
 */
public class Weapon implements Item {
    private WeaponType type;
    private double weight;
    private double value;

    public Weapon(WeaponType type, double weight, double value) {
        this.type = type;
        this.weight = weight;
        this.value = value;
    }

    public enum WeaponType{
        sword, knife,rifle
    }

    public WeaponType getType() {
        return type;
    }
    

    public void setType(WeaponType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    
    @Override
    public String getName() {
        return type.name();
    }

    @Override
    public String toString() {
        return "Weapon: " + type + ", weight = " + weight + ", value = " + value + " ,profit factor("+Math.floor(profitFactor()*100)/100+")}\n";
    }

}
