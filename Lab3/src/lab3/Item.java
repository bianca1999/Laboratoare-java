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
public interface Item {
    String getName();
    double getValue();
    double getWeight();

 default double profitFactor() {
 return getValue() / getWeight();
 }

}
