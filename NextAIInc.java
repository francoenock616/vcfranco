/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coursework;

/**
 *
 * @author Enock
 */
public class NextAIInc {
    // Method to calculate and print total weekly pay
    public void calculatePay(int basePay, int hoursWorked) {
        // Define minimum base pay and maximum allowed hours
        final int MIN_BASE_PAY = 30000;
        final int MAX_HOURS = 72;

        // Check if base pay is below the minimum
        if (basePay < MIN_BASE_PAY) {
            System.out.println("Error: Base pay must not be below UGX " + MIN_BASE_PAY + "/hour.");
            return;
        }

        // Check if hours worked exceeds the maximum limit
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked must not exceed " + MAX_HOURS + " hours per week.");
            return;
        }

        // Calculate pay
        int regularHours = Math.min(hoursWorked, 48); // Regular hours are capped at 48
        int overtimeHours = Math.max(0, hoursWorked - 48); // Overtime hours are any hours above 48

        // Calculate total pay
        int totalPay = (regularHours * basePay) + (overtimeHours * basePay * 2);

        // Print total pay
        System.out.println("Total weekly pay: UGX " + totalPay);
    }

    
    
}
