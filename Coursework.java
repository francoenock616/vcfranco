/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coursework;

/**
 *
 * @author Enock
 */
public class Coursework {

    public static void main(String[] args) {
        // Create an instance of NextAIInc
        NextAIInc comp = new NextAIInc();

        // Test cases
        System.out.println("Contractor A:");
        comp.calculatePay(30000, 51); // Expected: Total pay includes 48 regular hours and 3 overtime hours

        System.out.println("\nContractor B:");
        comp.calculatePay(20000, 40); // Expected: Error due to base pay below minimum

        System.out.println("\nContractor C:");
        comp.calculatePay(35000, 96); // Expected: Error due to hours worked exceeding the limit
    
    }
}
