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
public class Food implements Item {
    private String name;
    private double weight;
    private double value;

    public Food(String name, double weight,double value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public String toString() {
        return "Food: " +  name + ", weight=" + weight + ", value=" + value + " ,profit factor("+Math.floor(profitFactor()*100)/100+")}\n";
    }

    
    
}
