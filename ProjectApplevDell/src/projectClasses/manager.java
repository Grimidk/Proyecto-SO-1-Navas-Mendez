/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectClasses;

/**
 *
 * @author Svet
 */
public class Manager {
    private int pay;
    private int countedHours;
    private int workedHours;
    private int timeInterval;
    private int penaltyAmount;

    // CONSTRUCTOR
    public Manager(int pay, int countedHours, int workedHours, int timeInterval, int penaltyAmount) {
        this.pay = pay;
        this.countedHours = countedHours;
        this.workedHours = workedHours;
        this.timeInterval = timeInterval;
        this.penaltyAmount = penaltyAmount;
    }

    // FUNCTIONS
    public int getPaid(boolean penaltyAccredited, int countPenalty){
        int totalAmount = this.pay*(this.countedHours);
        if (penaltyAccredited){
            totalAmount -= (countPenalty*this.penaltyAmount);
        }
        return totalAmount;
    }
    
    public boolean changeCounter() {
        return true;
    }
    
    public boolean animeView(){
        double ranNumber  = Math.random();
        return ranNumber < 0.5;
    }
            
    public boolean runManager(int hour){
        if (hour < 15) {
            return  this.animeView();
        } else {
            return this.changeCounter();
        }
    }
    
    // GETTERS & SETTERS
    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getCountedHours() {
        return countedHours;
    }

    public void setCountedHours(int countedHours) {
        this.countedHours = countedHours;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public int getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(int timeInterval) {
        this.timeInterval = timeInterval;
    }

    public int getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenalty(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }
    
    
}
