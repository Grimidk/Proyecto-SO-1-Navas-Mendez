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

    public Company(String name, Director director, Manager manager, Computer standard, Computer special, int money) {
        this.name = name;
        this.director = director;
        this.manager = manager;
        this.standard = standard;
        this.special = special;
        this.money = money;
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
}
