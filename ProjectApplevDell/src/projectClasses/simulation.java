/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectClasses;

/**
 *
 * @author juanmendezl
 */
public class Simulation {
    private int dayCounter;
    private int hourCounter;
    private int totalDayCounter;
    private int monthCounter;
    private int prodCounter;
    private int accStandard;
    private int accSpecial;
    private int lastStandard;
    private int lastSpecial;
    private int deadline;
    private int workers;
    private int workerCost;
    private int duration;
    private int workHours;
    private Company company;
    private Computer currentComputer;
    private int totalLoss;
    private int totalGain;
    private int lastGain;

    public Simulation(int deadline, int workers, int workerCost, int duration, int workHours, Company company) {
        this.dayCounter = deadline;
        this.hourCounter = 0;
        this.totalDayCounter = 0;
        this.monthCounter = 0;
        this.prodCounter = 0;
        this.accStandard = 0;
        this.accSpecial = 0;
        this.lastStandard = 0;
        this.lastSpecial = 0;
        this.deadline = deadline;
        this.workers = workers;
        this.workerCost = workerCost;
        this.duration = duration;
        this.workHours = workHours;
        this.company = company;
        this.currentComputer = this.company.getStandard();
        this.totalLoss = 0;
        this.totalGain = 0;
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
    
    public int getAccTotal() {
        return accSpecial + accStandard;
    }

    public int getLastStandard() {
        return lastStandard;
    }

    public int getLastSpecial() {
        return lastSpecial;
    }
    
    public int getLastTotal() {
        return lastSpecial + lastStandard;
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

    public int getTotalLoss() {
        return totalLoss;
    }

    public int getTotalGain() {
        return totalGain;
    }
    
    public int getNetGain() {
        return totalGain - totalLoss;
    }

    public int getLastGain() {
        return lastGain;
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

    public int getTotalDayCounter() {
        return totalDayCounter;
    }

    public void setTotalDayCounter(int totalDayCounter) {
        this.totalDayCounter = totalDayCounter;
    }

    public int getMonthCounter() {
        return monthCounter;
    }

    public void setMonthCounter(int monthCounter) {
        this.monthCounter = monthCounter;
    }

    public void setLastStandard(int lastStandard) {
        this.lastStandard = lastStandard;
    }

    public void setLastSpecial(int lastSpecial) {
        this.lastSpecial = lastSpecial;
    }

    public void setTotalLoss(int totalLoss) {
        this.totalLoss = totalLoss;
    }

    public void setTotalGain(int totalGain) {
        this.totalGain = totalGain;
    }

    public void setLastGain(int lastGain) {
        this.lastGain = lastGain;
    }
    
    public void runHour() {
//        System.out.println("Hour: " + this.hourCounter);
//        System.out.println("Money: " + this.company.getMoney());
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
            
//            System.out.println("Materials ready");
            boolean completed = this.company.getComputers().produce();
            
            if(completed){
//                System.out.println("Computer done");
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
    }
    
    public void runDay() {
//        System.out.println("Day: " + this.totalDayCounter);
//        System.out.println("Boards:" + this.company.getBoards().getInventory());
//        System.out.println("Cpus:" + this.company.getCpus().getInventory());
//        System.out.println("Rams:" + this.company.getRams().getInventory());
//        System.out.println("Supplies:" + this.company.getSupplies().getInventory());
//        System.out.println("Gpus:" + this.company.getGpus().getInventory());
//        System.out.println("Computers:" + this.company.getComputers().getInventory());
        this.totalDayCounter += 1;
        // Nominas
        this.totalLoss += this.company.payroll();
        this.company.getDirector().setCountPenalty(0);
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
//         System.out.println("Month: " + this.monthCounter);
        this.monthCounter += 1;
        // Distribucion
        this.totalGain = this.company.distribute(accStandard, accSpecial);
        this.lastStandard = this.accStandard;
        this.lastSpecial = this.accSpecial;
        this.lastGain = this.getNetGain();
        this.accStandard = 0;
        this.accSpecial = 0;
        this.setDayCounter(this.deadline);
        
    }
}
