/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class TestPastByValue {
     public static void main(String[] args) { 
 
 int i = 10; 
 
 System.out.println(i); 
 
 test(i); 
 
 System.out.println(i); 
 
 } 
 
 public static void test(int j){ 
 
 j = 33; 
 }
}
