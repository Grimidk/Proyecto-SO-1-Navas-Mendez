/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectClasses;

/**
 *
 * @author juanmendezl
 */
public class Production {
    private String name;
    private Integer pay;
    private Float rate;
    private Integer capacity;
    private Integer inventory;
    private Integer workers;
    private String requirements;

    public Production(String name, Integer pay, Float rate, Integer capacity, Integer workers) {
        this.name = name;
        this.pay = pay;
        this.rate = rate;
        this.capacity = capacity;
        this.workers = workers;
        this.requirements = null;
    }

    public Production(String name, Integer pay, Float rate, Integer capacity, Integer workers, String requirements) {
        this.name = name;
        this.pay = pay;
        this.rate = rate;
        this.capacity = capacity;
        this.workers = workers;
        this.requirements = requirements;
    }

    public String getName() {
        return name;
    }
    
    public Integer getPay() {
        return pay;
    }

    public Float getRate() {
        return rate;
    }

    public Integer getCapacity() {
        return capacity;
    }
    
    public Integer getInventory() {
        return inventory;
    }
    
    public Integer getRemainingInventory() {
        if (this.capacity < 0) {
            return 1000000;
        } else {
            return this.capacity - this.inventory;
        }
    }

    public Integer getWorkers() {
        return workers;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setWorkers(Integer workers) {
        this.workers = workers;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
    
    public Float getFinalRate () {
        return this.rate * this.workers;
    }
    
    public Integer getFinalPay () {
        return this.pay * this.workers;
    }
}
