/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectClasses;
import java.util.Calendar;

/**
 *
 * @author juanmendezl
 */
public class Simulation {
    private int dayCounter;
    private int hourCounter;
    private int prodCounter;
    private int accStandard;
    private int accSpecial;
    private int deadline;
    private int workers;
    private int workerCost;
    private int duration;
    private int workHours;
    private Company company;
    private Computer currentComputer;

    public Simulation(int deadline, int workers, int workerCost, int duration, int workHours, Company company) {
        this.dayCounter = deadline;
        this.hourCounter = 0;
        this.prodCounter = 0;
        this.accStandard = 0;
        this.accSpecial = 0;
        this.deadline = deadline;
        this.workers = workers;
        this.workerCost = workerCost;
        this.duration = duration;
        this.workHours = workHours;
        this.company = company;
        this.currentComputer = this.company.getStandard();
    }
    
    public int getDayCounter() {
        return dayCounter;
    }
    
    public int getHourCounter() {
        return hourCounter;
    }
    
    public int getProdCounter() {
        return prodCounter;
    }

    public int getAccStandard() {
        return accStandard;
    }

    public int getAccSpecial() {
        return accSpecial;
    }
    
    public int getDeadline() {
        return deadline;
    }

    public int getWorkers() {
        return workers;
    }

    public int getDuration() {
        return duration;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getWorkerCost() {
        return workerCost;
    }

    public Company getCompany() {
        return company;
    }

    public Computer getCurrentComputer() {
        return currentComputer;
    }
    
    public void setDayCounter(int dayCounter) {
        this.dayCounter = dayCounter;
    }
    
    public void setHourCounter(int hourCounter) {
        this.hourCounter = hourCounter;
    }

    public void setProdCounter(int prodCounter) {
        this.prodCounter = prodCounter;
    }

    public void setAccStandard(int accStandard) {
        this.accStandard = accStandard;
    }

    public void setAccSpecial(int accSpecial) {
        this.accSpecial = accSpecial;
    }
    
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public void setWorkerCost(int workerCost) {
        this.workerCost = workerCost;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCurrentComputer(Computer currentComputer) {
        this.currentComputer = currentComputer;
    }
    
    public void run() {
        int miliseconds = Calendar.getInstance().get(Calendar.MILLISECOND);
        while ((miliseconds%(1000*this.duration)) == 0) {
            this.runHour();
        }
    }
    
    public void runHour() {
        // Producciones
        this.company.getBoards().produce();
        this.company.getCpus().produce();
        this.company.getRams().produce();
        this.company.getSupplies().produce();
        this.company.getGpus().produce();
        
        if(
            this.company.getBoards().getInventory() >= this.currentComputer.getRecipe().get(0) && 
            this.company.getCpus().getInventory() >= this.currentComputer.getRecipe().get(1) && 
            this.company.getRams().getInventory() >= this.currentComputer.getRecipe().get(2) && 
            this.company.getSupplies().getInventory() >= this.currentComputer.getRecipe().get(3) && 
            this.company.getGpus().getInventory() >= this.currentComputer.getRecipe().get(4) ){
            
            this.company.getComputers().produce();
            this.company.getBoards().setInventory(this.company.getBoards().getInventory() - this.currentComputer.getRecipe().get(0));
            this.company.getCpus().setInventory(this.company.getCpus().getInventory() - this.currentComputer.getRecipe().get(1));
            this.company.getRams().setInventory(this.company.getRams().getInventory() - this.currentComputer.getRecipe().get(2));
            this.company.getSupplies().setInventory(this.company.getSupplies().getInventory() - this.currentComputer.getRecipe().get(3));
            this.company.getGpus().setInventory(this.company.getGpus().getInventory() - this.currentComputer.getRecipe().get(4));
            if (this.currentComputer.isType()) {
                this.accSpecial += 1;
            } else {
                this.accStandard += 1;
            }
            this.prodCounter += 1;
        }
            
        if(this.prodCounter >= this.currentComputer.getBatch()){
            this.setProdCounter(0);
            if(!this.currentComputer.isType()){
                this.setCurrentComputer(this.company.getSpecial());
            } else {
                this.setCurrentComputer(this.company.getStandard());
            }
        }
        
        // Manager
        this.company.getManager().runManager(this.hourCounter);
        
        // Director
        this.company.getDirector().runDirector(this.hourCounter, this.dayCounter, this.company.getManager());
        
        // Tiempos
        if (this.hourCounter <= 22) {
            this.hourCounter += 1;
        } else {
            this.setHourCounter(0);
            this.runDay();
        }
        System.out.println("Hour");
    }
    
    public void runDay() {
        // Nominas
        this.company.payroll();
        this.company.getDirector().setCountPenalty(0);
        this.company.getDirector().setPenaltyAccredited(false);
        
        // Tiempos
        if (this.dayCounter >= 1) {
            this.dayCounter -= 1;  
        } else {
            this.setHourCounter(this.getDeadline());
            this.runMonth();
        }   
        System.out.println("Day");
    }
    
    public void runMonth() {
        // Distribucion
        this.company.distribute(accStandard, accSpecial);
        this.accStandard = 0;
        this.accSpecial = 0;
        this.setDayCounter(this.deadline);
        System.out.println("Month");
    }
}
