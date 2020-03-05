/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import static java.lang.Math.round;

/**
 *
 * @author calan
 */
public class Book implements Item{
    private String name;
    private int pageNumber;
    private double value;

    public Book(String name, int pageNumber, double value) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double getWeight() {
        return pageNumber;
    }

    @Override
    public String toString() {
        return "Book: " +  name + ", weight=" + pageNumber + ", value=" + value + " ,profit factor("+Math.floor(profitFactor()*100)/100+")\n";
    }
     
    
}
