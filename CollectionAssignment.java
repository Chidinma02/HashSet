/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author Chidinma
 */
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//import java .util.List;
//import java.util.Set;
import java.util.*;
public class CollectionAssignment {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
  Set<Integer>numbers=new HashSet<>();
 numbers.add(2);
 numbers.add(4);
  numbers.add(5);
     numbers.add(6);
     numbers.add(7);
     numbers.add(8); 
     numbers.add(9);
     numbers.add(10);
     System.out.println("numbers:"+numbers);
     System.out.println("Size="+numbers.size());     //System.out.println("numbers:"+numbers);
     Iterator i=numbers.iterator();
     while (i.hasNext()){
         System.out.println(i.next());
     //ListIterator i=numbers.ListIterator();
     //while(i.hasNext()){
         //System.out.println();
     }
    }
}

