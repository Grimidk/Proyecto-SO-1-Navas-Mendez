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
    private int duration;
    private int hours;
    private Company company;
    private Computer currentComputer;
    private Production boards;
    private Production cpus;
    private Production rams;
    private Production supplies;
    private Production gpus;
    private Production computers;

    public Simulation(int deadline, int workers, int duration, int hours, Company company, Production boards, Production cpus, Production rams, Production supplies, Production gpus, Production computers) {
        this.dayCounter = deadline;
        this.hourCounter = 0;
        this.prodCounter = 0;
        this.accStandard = 0;
        this.accSpecial = 0;
        this.deadline = deadline;
        this.workers = workers;
        this.duration = duration;
        this.hours = hours;
        this.company = company;
        this.currentComputer = this.company.getStandard();
        this.boards = boards;
        this.cpus = cpus;
        this.rams = rams;
        this.supplies = supplies;
        this.gpus = gpus;
        this.computers = computers;
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
    
    public int getDeadline() {
        return deadline;
    }

    public int getWorkers() {
        return workers;
    }

    public int getDuration() {
        return duration;
    }

    public int getHours() {
        return hours;
    }

    public Company getCompany() {
        return company;
    }

    public Computer getCurrentComputer() {
        return currentComputer;
    }

    public Production getBoards() {
        return boards;
    }

    public Production getCpus() {
        return cpus;
    }

    public Production getRams() {
        return rams;
    }

    public Production getSupplies() {
        return supplies;
    }

    public Production getGpus() {
        return gpus;
    }

    public Production getComputers() {
        return computers;
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
    
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCurrentComputer(Computer currentComputer) {
        this.currentComputer = currentComputer;
    }
    
    public void setBoards(Production boards) {
        this.boards = boards;
    }

    public void setCpus(Production cpus) {
        this.cpus = cpus;
    }

    public void setRams(Production rams) {
        this.rams = rams;
    }

    public void setSupplies(Production supplies) {
        this.supplies = supplies;
    }

    public void setGpus(Production gpus) {
        this.gpus = gpus;
    }

    public void setComputers(Production computers) {
        this.computers = computers;
    }
    
    public void run() {
        int miliseconds = Calendar.getInstance().get(Calendar.MILLISECOND);
        while ((miliseconds%(1000*this.duration)) == 0) {
            this.runHour();
        }
    }
    
    public void runHour() {
        // Producciones
        this.boards.produce();
        this.cpus.produce();
        this.rams.produce();
        this.supplies.produce();
        this.gpus.produce();
        
        if(
            this.boards.getInventory() >= this.currentComputer.getRecipe().get(0) && 
            this.cpus.getInventory() >= this.currentComputer.getRecipe().get(1) && 
            this.rams.getInventory() >= this.currentComputer.getRecipe().get(2) && 
            this.supplies.getInventory() >= this.currentComputer.getRecipe().get(3) && 
            this.gpus.getInventory() >= this.currentComputer.getRecipe().get(4) ){
            
            this.computers.produce();
            this.boards.setInventory(this.boards.getInventory() - this.currentComputer.getRecipe().get(0));
            this.cpus.setInventory(this.cpus.getInventory() - this.currentComputer.getRecipe().get(1));
            this.rams.setInventory(this.rams.getInventory() - this.currentComputer.getRecipe().get(2));
            this.supplies.setInventory(this.supplies.getInventory() - this.currentComputer.getRecipe().get(3));
            this.gpus.setInventory(this.gpus.getInventory() - this.currentComputer.getRecipe().get(4));
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
        
        // Director
        
        // Tiempos
        if (this.hourCounter <= 22) {
            this.hourCounter += 1;
        } else {
            this.setHourCounter(0);
            this.runDay();
        }
    }
    
    public void runDay() {
        // Nominas
        this.company.payroll(this.boards.getFinalPay() + this.cpus.getFinalPay() + this.rams.getFinalPay() + this.supplies.getFinalPay() + this.gpus.getFinalPay());
        this.company.getDirector().setPenaltyAccredited(false);
        
        // Tiempos
        if (this.dayCounter >= 1) {
            this.dayCounter -= 1;  
        } else {
            this.setHourCounter(this.getDeadline());
            this.runMonth();
        }   
    }
    
    public void runMonth() {
        this.company.distribute(this.computers, accStandard, accSpecial);
        this.accStandard = 0;
        this.accSpecial = 0;
        this.setDayCounter(this.deadline);
    }
}
