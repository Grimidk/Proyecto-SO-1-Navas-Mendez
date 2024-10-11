/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectClasses;

/**
 *
 * @author Svet
 */
public class Company {
    private String name;
    private Director director;
    private Manager manager; 
    private Computer standard;
    private Computer special;
    private int money;
    private Production boards;
    private Production cpus;
    private Production rams;
    private Production supplies;
    private Production gpus;
    private Production computers;

    public Company(String name, Director director, Manager manager, Computer standard, Computer special, Production boards, Production cpus, Production rams, Production supplies, Production gpus, Production computers) {
        this.name = name;
        this.director = director;
        this.manager = manager;
        this.standard = standard;
        this.special = special;
        this.money = 0;
        this.boards = boards;
        this.cpus = cpus;
        this.rams = rams;
        this.supplies = supplies;
        this.gpus = gpus;
        this.computers = computers;
    }

    public String getName() {
        return name;
    }

    public Director getDirector() {
        return director;
    }

    public Manager getManager() {
        return manager;
    }

    public Computer getStandard() {
        return standard;
    }

    public Computer getSpecial() {
        return special;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public void setStandard(Computer standard) {
        this.standard = standard;
    }

    public void setSpecial(Computer special) {
        this.special = special;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Production getBoards() {
        return boards;
    }

    public void setBoards(Production boards) {
        this.boards = boards;
    }

    public Production getCpus() {
        return cpus;
    }

    public void setCpus(Production cpus) {
        this.cpus = cpus;
    }

    public Production getRams() {
        return rams;
    }

    public void setRams(Production rams) {
        this.rams = rams;
    }

    public Production getSupplies() {
        return supplies;
    }

    public void setSupplies(Production supplies) {
        this.supplies = supplies;
    }

    public Production getGpus() {
        return gpus;
    }

    public void setGpus(Production gpus) {
        this.gpus = gpus;
    }

    public Production getComputers() {
        return computers;
    }

    public void setComputers(Production computers) {
        this.computers = computers;
    }
    
    public int payroll(){
        int directorWage = (this.director.getWage() * 24);
        int managerWage = this.manager.getPaid(this.director.isPenaltyAccredited(),this.director.getCountPenalty());
        int workerWage = (this.boards.getFinalPay() + this.cpus.getFinalPay() + this.rams.getFinalPay() + this.supplies.getFinalPay() + this.gpus.getFinalPay() + this.computers.getFinalPay());
        this.money -= (directorWage + managerWage + workerWage);
        return directorWage + managerWage + workerWage;
    }
    
    public int distribute(int accStandard, int accSpecial) {
        computers.setInventory(0);
        int incomeStandard = accStandard * this.getStandard().getPrice();
        int incomeSpecial = accSpecial * this.getSpecial().getPrice();
        this.money += incomeSpecial + incomeStandard;
        return incomeSpecial + incomeStandard;
    }
}
