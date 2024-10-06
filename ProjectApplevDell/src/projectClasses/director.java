/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectClasses;

/**
 *
 * @author Svet
 */
public class Director {
    private int wage;
    private boolean penaltyAccredited;
    private int threshold;
    private int timeShipping;
    private int countPenalty;
    private int checkHour;

    // CONSTRUCTOR
    public Director(int wage, boolean penaltyAccredited, int threshold, int timeShipping, int countPenalty, int checkHour) {
        this.wage = wage;
        this.penaltyAccredited = penaltyAccredited;
        this.threshold = threshold;
        this.timeShipping = timeShipping;
        this.countPenalty = countPenalty;
        this.checkHour = 0;
    }
    
    // FUNCTIONS
    
    public boolean distributing(){
        return true;
    }
    
    public int runDirector(int hours, int remainingDays, Manager manager) {
        if (remainingDays <= 0) {
            this.distributing();
    }   else if (hours < 0) {
            this.checkHour = (int) (Math.random() * 24);
            if (hours == this.checkHour) {
                boolean isWorking = manager.runManager(hours);
                this.penaltyAccredited = !isWorking;
                if (!isWorking){
                    this.countPenalty += 1;
                }
        }
    }
        return this.countPenalty;
}


    // GETTERS & SETTERS
    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public boolean isPenaltyAccredited() {
        return penaltyAccredited;
    }

    public void setPenaltyAccredited(boolean penaltyAccredited) {
        this.penaltyAccredited = penaltyAccredited;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public int getTimeShipping() {
        return timeShipping;
    }

    public void setTimeShipping(int timeShipping) {
        this.timeShipping = timeShipping;
    }

    public int getCountPenalty() {
        return countPenalty;
    }

    public void setCountPenalty(int countPenalty) {
        this.countPenalty = countPenalty;
    }

    public int getCheckHour() {
        return checkHour;
    }

    public void setCheckHour(int checkHour) {
        this.checkHour = checkHour;
    }
}
