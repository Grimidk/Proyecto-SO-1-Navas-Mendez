/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectClasses;
import auxClasses.LinkedList;

/**
 *
 * @author Svet
 */
public class Computer {
    private boolean type; // false para normal true para especial
    private int numBoard;
    private int numCpu;
    private int numRam;
    private int numPowerSupply;
    private int numGpu; // las normales tienen 0
    private int batch;
    private int price;

    // CONSTRUCTOR
    public Computer(boolean type, int numBoard, int numCpu, int numRam, int numPowerSupply, int numGpu, int batch, int price) {
        this.type = type;
        this.numBoard = numBoard;
        this.numCpu = numCpu;
        this.numRam = numRam;
        this.numPowerSupply = numPowerSupply;
        this.numGpu = numGpu;
        this.batch = batch;
        this.price = price;
    }

    // METHODS
    
    public LinkedList<Integer> getRecipe() {
        LinkedList<Integer> computers = new LinkedList<>();
        computers.insert(this.numBoard, 0);
        computers.insert(this.numCpu, 1);
        computers.insert(this.numRam, 2);
        computers.insert(this.numPowerSupply, 3);
        computers.insert(this.numGpu, 4);
        computers.insert(this.batch, 5);
        
        return computers;
    }
    
    
    // GETTERS & SETTERS
    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getNumBoard() {
        return numBoard;
    }

    public void setNumBoard(int numBoard) {
        this.numBoard = numBoard;
    }

    public int getNumCpu() {
        return numCpu;
    }

    public void setNumCpu(int numCpu) {
        this.numCpu = numCpu;
    }

    public int getNumRam() {
        return numRam;
    }

    public void setNumRam(int numRam) {
        this.numRam = numRam;
    }

    public int getNumPowerSupply() {
        return numPowerSupply;
    }

    public void setNumPowerSupply(int numPowerSupply) {
        this.numPowerSupply = numPowerSupply;
    }

    public int getNumGpu() {
        return numGpu;
    }

    public void setNumGpu(int numGpu) {
        this.numGpu = numGpu;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

