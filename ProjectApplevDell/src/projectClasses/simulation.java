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
    private Integer counter;
    private Integer workers;
    private Integer duration;
    private Integer hours;
    private Company company;
    private Production boards;
    private Production cpus;
    private Production rams;
    private Production supplies;
    private Production gpus;
    private Production computers;

    public Simulation(Integer workers, Integer duration, Integer hours, Company company, Production boards, Production cpus, Production rams, Production supplies, Production gpus, Production computers) {
        this.counter = 0;
        this.workers = workers;
        this.duration = duration;
        this.hours = hours;
        this.company = company;
        this.boards = boards;
        this.cpus = cpus;
        this.rams = rams;
        this.supplies = supplies;
        this.gpus = gpus;
        this.computers = computers;
    }
    
    public Integer getCounter() {
        return counter;
    }

    public Integer getWorkers() {
        return workers;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getHours() {
        return hours;
    }

    public Company getCompany() {
        return company;
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
    
    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public void setWorkers(Integer workers) {
        this.workers = workers;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public void setCompany(Company company) {
        this.company = company;
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
}
