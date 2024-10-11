/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package auxClasses;

import java.util.concurrent.Semaphore;
import projectClasses.Simulation;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



/**
 *
 * @author juanmendezl
 */
public class Hilo extends Thread{
    
    private Simulation simu;
    private float delay;
    private Semaphore sema;
    private boolean killSwitch;
    private JTextField daysField;
    private JTextField normalPCField;
    private JTextField specialPCField;
    private JTextField remainingDaysField;
    
    public Hilo (Simulation simu, int permits, JTextField daysField, JTextField normalPCField, JTextField specialPCField, JTextField remainingDaysField){
        this.simu = simu;
        this.delay = (simu.getDuration()*1000)/48;
        this.sema = new Semaphore(permits);
        this.killSwitch = false;
        this.daysField = daysField;
        this.normalPCField = normalPCField;
        this.specialPCField = specialPCField;
        this.remainingDaysField = remainingDaysField;
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

    public Semaphore getSema() {
        return sema;
    }

    public void setSema(Semaphore sema) {
        this.sema = sema;
    }

    public boolean isKillSwitch() {
        return killSwitch;
    }

    public void setKillSwitch(boolean killSwitch) {
        this.killSwitch = killSwitch;
    }
    
    @Override
    public void run(){
        while (!this.killSwitch){
            int daysOut = simu.getTotalDayCounter();
            SwingUtilities.invokeLater(() -> {
                daysField.setText(String.valueOf(daysOut));
//                System.out.println(daysOut);
            });
            
            int normalPcOut = simu.getAccStandard();
            SwingUtilities.invokeLater(() -> {
                normalPCField.setText(String.valueOf(normalPcOut));
//                System.out.println(normalPcOut);
            });
            
            int specialPcOut = simu.getAccSpecial();
            SwingUtilities.invokeLater(() -> {
                specialPCField.setText(String.valueOf(specialPcOut));
//                System.out.println(specialPcOut);
            });
            
            int daysRemainingOut = simu.getDeadline();
            SwingUtilities.invokeLater(() -> {
                remainingDaysField.setText(String.valueOf(daysRemainingOut));
//                System.out.println(daysRemainingOut);
            });
            
            try{
                this.sema.acquire();
                
                this.simu.runHour();
                sleep((long) (delay));
                
                this.sema.release();
                sleep((long) (delay));
                
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
