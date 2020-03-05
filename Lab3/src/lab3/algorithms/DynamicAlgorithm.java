/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.algorithms;

import java.util.ArrayList;
import lab3.Item;
import lab3.Knapsack;

/**
 *
 * @author calan
 */
public class DynamicAlgorithm implements Algorithm {
    private Knapsack knapsack;
    private ArrayList<Item> items;

    public DynamicAlgorithm(Knapsack knapsack, ArrayList<Item> items) {
        this.knapsack = knapsack;
        this.items = items;
    }

    public Knapsack getKnapsack() {
        return knapsack;
    }

    public void setKnapsack(Knapsack knapsack) {
        this.knapsack = knapsack;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public void knapsackProblem() {
        
    }
    
    
}
