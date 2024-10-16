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
    private double timeInterval;
    private int penaltyAmount;
    private String status;

    // CONSTRUCTOR
    public Manager(int pay, int countedHours, int workedHours, double timeInterval, int penaltyAmount) {
        this.pay = pay;
        this.countedHours = countedHours;
        this.workedHours = workedHours;
        this.timeInterval = timeInterval;
        this.penaltyAmount = penaltyAmount;
        this.status = "Trabajando";
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
        this.status = "Cambiando Contador";
        return true;
    }
    
    public boolean animeView(){
        double ranNumber  = Math.random();
        if (ranNumber < 0.5) {
            this.status = "Trabajando";
            return true;
        } else {
            this.status = "Viendo One Piece";
            return false;
        }

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

    public double getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(double timeInterval) {
        this.timeInterval = timeInterval;
    }

    public int getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenalty(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
