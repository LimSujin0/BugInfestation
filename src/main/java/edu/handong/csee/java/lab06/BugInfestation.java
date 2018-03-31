package edu.handong.csee.java.lab06;//package name

import java.util.Scanner;//importing a class named Scanner
/**
 * This is a class named BugInfestation.
 * Finding the number of weeks to exceed the capacity of the house
 * @author imsuj
 */
public class BugInfestation {
   Scanner keyboard = new Scanner(System.in);//instantiating the Scanner
   final double GROWTH_RATE = 0.95; //it is final double variable named GROWTH-RATE
   final double ONE_BUG_VOLUME = 0.002;//it is final double variable named ONE_BUG_VOLUME
   
   public double houseVolume;//this is public double variable named houseVolume
   public int startPopulation;//this is public integer variable named startPopulation
   public double population;//this is public double variable named population
   public double totalBugVolume;//this is public double variable named totalBugVolume
   public double newBugs;//this is public double variable named newBugs
   public double newBugVolume;//this is public double variable named newBugVolume
   
   public int countWeeks = 0;//this is public int variable named counteeks
   /**
    * This is a public method named readHouseVolume
    * This method is getting the total volume of the house.
    * and setting houseVolume to getting number
    */
   public void readHouseVolume(){   
      System.out.print("Enter the total volume of your house in cubic feet: ");//print "Enter the total volume of your house in cubic feet: " this line on a monitor
      houseVolume = keyboard.nextDouble();//Putting the value from the user in houseVolume
   }

   /**
    *This is a public method named readStartPopulation
    *this method is getting the start population of roaches.
    *and Putting the value from the user in startPopulatoin
    */
   public void readStartPopulation() {
      System.out.print("Enter the estimated number of roaches in your house: ");//print out ""Enter the estimated number of roaches in your house: " on the monitor
      startPopulation = keyboard.nextInt();//getting the start population of roaches.
      population = startPopulation;//Putting the value from the user in startPopulatoin
   }
   
   /**
    * public method named computeTotalBugVolume
    * this method is putting population * one_bug_volume in the totalBugVolume 
    */
   public void computeTotalBugVolume() {
      totalBugVolume = population * ONE_BUG_VOLUME;// putting population * one_bug_volume in the totalBugVolume
   }
   
   /**
    * this is public method named computeWeeks
    * this method is computing weeks by using a while loop.
    */
   public void computeWeeks(){
      while(totalBugVolume < houseVolume) {//executing while_loop for totlaBugVolume>houseVolume
         newBugs = population*GROWTH_RATE;//putting population*GROWTH_RATE in the newBugs
         newBugVolume = newBugs*ONE_BUG_VOLUME;//putting newBugs*ONE_BUG_VOLUME in the newBugVolume
         population = population + newBugs;//putting population + newBugs in the population
         totalBugVolume = population*ONE_BUG_VOLUME;// putting population*ONE_BUG_VOLUME in the totalBugVolume
         countWeeks = countWeeks+1;//putting countWeeks+1 in the countWeeks.
      }
   }
   
   /**
    * this is public method named displayResult
    * this method is printing out the outcomes of this program
    * ex)weeks, total bug volume, total bug population
    */
   public void displayResult(){
      System.out.println("Starting with a roach population of " + (int)startPopulation);//print out roach starting population
      System.out.println("and a house with a volume of " + houseVolume + " cubic feet,");//print out house volume
      System.out.println("after " + countWeeks + " weeks,");//print out number of weeks until the house is full of roaches.
      System.out.println("the house will be filled with " + (int)population + " roaches.");//print out roaches total population
      System.out.println("They will fill a volume of " + (int)totalBugVolume + " cubic feet.");//print out total bug volume
      System.out.println("Better call Debugging Experts Inc.");//print out "Better call Debugging Experts Inc."
   }
   
   /**
    * This is main method
    * this method 
    * @param args
    */
   public static void main(String[] args) {
      BugInfestation bugInfes = new BugInfestation();//instantiating BugInfestation class.
      bugInfes.readHouseVolume();//executing readHouseVolume that Puts the value from the user in houseVolume
      bugInfes.readStartPopulation();//executing readStartPopulation that Puts the value from the user in startPopulatoin
      bugInfes.computeTotalBugVolume();//executing computeTotalBugVolume that computes total bug volume
      bugInfes.computeWeeks();//executing computeWeks that computes number of weeks until the house is full of roaches.
      bugInfes.displayResult();//executing displayResults that shows the outcomes on the monitor.
   }
}