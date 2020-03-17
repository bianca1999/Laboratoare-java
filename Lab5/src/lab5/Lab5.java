/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.IOException;

/**
 *
 * @author calan
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       Document d1=new Document("C:\\Users\\calan\\OneDrive\\Documente\\NetBeansProjects\\Lab5\\src\\lab5\\book.txt");
       Document d2=new Document("C:\\Users\\calan\\OneDrive\\Documente\\NetBeansProjects\\Lab5\\src\\lab5\\article.txt");
       Document d3=new Document("C:\\Users\\calan\\OneDrive\\Documente\\NetBeansProjects\\Lab5\\src\\lab5\\newspaper.txt");

       d1.save(d1.path);
       d2.save(d2.path);
       d3.save(d3.path);
       Catalog catalog=new Catalog();
       catalog.addDocument(d1);
       catalog.addDocument(d2);
       catalog.addDocument(d3);
       
       Operation o=new Operation("C:\\Users\\calan\\OneDrive\\Documente\\NetBeansProjects\\Lab5\\src\\lab5\\out.txt");
       o.setCatalog(catalog);
       o.save();
       o.load();
       o.view(d1.path);
    }
    
}
