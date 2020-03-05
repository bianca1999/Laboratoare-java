/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 *
 * @author calan
 */
public class Knapsack {
    private double capacity;
    private List<Item> items = new ArrayList<>();

    public Knapsack(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Item> getItems() {
        return (ArrayList<Item>) items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
    items.add(item);
    }
    
    @Override
    public String toString() {
        
        return "Knapsack{" + "capacity=" + capacity + ", items=" + items + '}';
    }
    
    
}
