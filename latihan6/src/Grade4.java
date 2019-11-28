/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cahyana_a21900029
 */
public class Grade4 {  
    public static void main( String[] args ) 
     {  
         String names[] = {"Cahya", "Gilang", "Arip", "Izal"}; 
       int count = 0; 
       for( int i=0; i<names.length; i++ ){ 
           if( !names[i].equals("Cahya") ){ 
               continue; //skip next statement
           }
        count++; 
       }
       System.out.println("5"  + " found!");
            }  
 } 
   