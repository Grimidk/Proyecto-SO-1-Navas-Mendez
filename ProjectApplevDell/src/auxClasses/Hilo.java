/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auxClasses;

import java.util.concurrent.Semaphore;
import projectClasses.Simulation;



/**
 *
 * @author juanmendezl
 */
public class Hilo extends Thread{
    
    private Simulation simu;
    private float delay;
    private Semaphore sema;
    
    public Hilo (Simulation simu, int permits){
        this.simu = simu;
        this.delay = (simu.getDuration()*1000)/24;
        this.sema = new Semaphore(permits);
    }

    public Simulation getSimu() {
        return simu;
    }

    public void setSimu(Simulation simu) {
        this.simu = simu;
    }

    public float getDelay() {
        return delay;
    }

    public void setDelay(float delay) {
        this.delay = delay;
    }

    public Semaphore getMutex() {
        return sema;
    }

    public void setMutex(Semaphore sema) {
        this.sema = sema;
    }
    
    @Override
    public void run(){
        while (true){
            
            try{
                this.sema.acquire(); //wait
                
                this.simu.runHour(); //crit
                sleep((long) (delay));
                
                this.sema.release();
                sleep((long) (delay));
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
