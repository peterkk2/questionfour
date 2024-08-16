/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package question4.mavenproject5;

/**
 *
 * @author CLIENT
 */
public class BabyFeedingSchedule {
    public static void main(String[] args) {
        double porridge = 2.0; 
// liters
        double milk = 2.0; 
// liters
        double cupSize = 0.5; 
// liters

        int porridgeFeeds = (int) (porridge / cupSize);
        int milkFeeds = (int) (milk / cupSize);

        int totalMinutes = (porridgeFeeds * 45) + (milkFeeds * 30);

        System.out.println("Total time to finish both porridge and milk: " + totalMinutes + " minutes");
    }
}

