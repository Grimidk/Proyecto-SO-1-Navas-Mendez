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
    private int numWorker;
    private Worker worker; //no se
    private Manager projectManager; //no se

    public Company(String name, int numWorker, Worker worker, Manager projectManager) {
        this.name = name;
        this.numWorker = numWorker;
        this.worker = worker;
        this.projectManager = projectManager;
    } 
}
