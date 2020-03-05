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
import lab3.Weapon.WeaponType;

/**
 *
 * @author calan
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item book1=new Book("Dragon Rising",3,5);
        Item book2=new Book("A Bladle in the Dark",3,5);
        Item food1=new Food("Cabbage",2,4);
        Item food2=new Food("Rabbit",2,4);
        Item weapon=new Weapon(WeaponType.sword,5,10);
        Knapsack knapsack=new Knapsack(10);//setez capacitatea ghiozdanului cu 10

        List<Item> items = new ArrayList<>();
        items.add(book1);
        items.add(book2);
        items.add(food1);
        items.add(food2);
        items.add(weapon);
        
        Collections.sort(items,new Comparator<Item>(){//sortez lista de itemi cu ajutorul unui Comparator
            public int compare(Item item1,Item item2){
                return item1.getName().compareTo(item2.getName());//sortez alfabetic
            }
        });
        System.out.println("The capacity of knapsack "+knapsack.getCapacity()+"\n");
        System.out.println("Available items:\n");
        System.out.println(items);
    }
    
}
