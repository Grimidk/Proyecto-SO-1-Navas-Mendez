/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectClasses;
import auxClasses.LinkedList;

/**
 *
 * @author juanmendezl
 */
public class Production {
    private String name;
    private int pay;
    private double rate;
    private double capacity;
    private double inventory;
    private int workers;
    private LinkedList<Integer> requirements;
    private double counter;

    public Production(String name, int pay, double rate, double capacity, int workers) {
        this.name = name;
        this.pay = pay;
        this.rate = rate/24;
        this.capacity = capacity;
        this.workers = workers;
        this.requirements = null;
        this.counter = 0;
    }

    public Production(String name, int pay, double rate, double capacity, int workers, LinkedList requirements) {
        this.name = name;
        this.pay = pay;
        this.rate = rate/24;
        this.capacity = capacity;
        this.workers = workers;
        this.requirements = requirements;
        this.counter = 0;
    }

    public String getName() {
        return name;
    }
    
    public int getPay() {
        return pay;
    }

    public double getRate() {
        return rate;
    }

    public double getCapacity() {
        return capacity;
    }
    
    public double getInventory() {
        return inventory;
    }
    
    public double getRemainingInventory() {
        if (this.capacity < 0) {
            return 1000000;
        } else {
            return this.capacity - this.inventory;
        }
    }

    public int getWorkers() {
        return workers;
    }

    public LinkedList getRequirements() {
        return requirements;
    }
    
    public double getCounter() {
        return counter;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setPay(int pay) {
        this.pay = pay;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void setInventory(double inventory) {
        this.inventory = inventory;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public void setRequirements(LinkedList requirements) {
        this.requirements = requirements;
    }
    
    public void setCounter(double counter) {
        this.counter = counter;
    }
    
    public double getFinalRate () {
        return this.rate * this.workers;
    }
    
    public int getFinalPay () {
        return this.pay * this.workers;
    }
    
    public boolean isRequirementsMet (){
        return this.requirements == null;
    }
    
    public boolean produce () {
        if (this.getRemainingInventory() > 0) {
            if(this.getRemainingInventory() >= this.getFinalRate()) {
                this.inventory += this.getFinalRate();
                this.counter += this.getFinalRate();
            } else {
                this.inventory += this.getRemainingInventory();   
                this.counter += this.getRemainingInventory();
            }
            if (this.counter >= 1){
                this.counter -= 1;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
