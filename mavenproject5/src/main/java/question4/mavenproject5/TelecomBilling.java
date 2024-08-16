/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question4.mavenproject5;

/**
 *
 * @author CLIENT
 */
public class TelecomBilling {
    public static void main(String[] args) {
        double initialBalance = 10000; 
// UGX
        double chargeRate = 0.10; 
// 10%
        int callDuration = 5 * 60; 
// 5 minutes in seconds
        int callRate = 200; 
// UGX per second

        double balanceAfterCharge = initialBalance - (initialBalance * chargeRate);
        double callCost = callDuration * callRate;
        double finalBalance = balanceAfterCharge - callCost;

        System.out.println("Final balance after call: UGX " + finalBalance);
    }
}

