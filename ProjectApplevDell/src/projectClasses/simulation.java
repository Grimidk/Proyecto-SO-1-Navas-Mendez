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
    private int deadline;
    private int workers;
    private int duration;
    private int hours;
    private Company company;
    private Production boards;
    private Production cpus;
    private Production rams;
    private Production supplies;
    private Production gpus;
    private Production computers;

    public Simulation(int deadline, int workers, int duration, int hours, Company company, Production boards, Production cpus, Production rams, Production supplies, Production gpus, Production computers) {
        this.dayCounter = deadline;
        this.hourCounter = 0;
        this.deadline = deadline;
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
    
    public int getDayCounter() {
        return dayCounter;
    }
    
    public int getHourCounter() {
        return hourCounter;
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
        this.boards.produce();
        this.cpus.produce();
        this.rams.produce();
        this.supplies.produce();
        this.gpus.produce();
        this.computers.produce();
        
        if (this.hourCounter <= 22) {
            this.hourCounter += 1;
        } else {
            this.setHourCounter(0);
            this.runDay();
        }
    }
    
    public void runDay() {
        if (this.dayCounter >= 1) {
            this.dayCounter -= 1;  
        } else {
            this.setHourCounter(this.getDeadline());
            this.runMonth();
        }
        
    }
    
    public void runMonth() {
        
    }
}
