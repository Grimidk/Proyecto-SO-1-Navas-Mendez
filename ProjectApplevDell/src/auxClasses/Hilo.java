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
    private final JTextField daysField;
    private final JTextField normalPCField;
    private final JTextField specialPCField;
    private final JTextField remainingDaysField;
    private final JTextField totalPCField;
    private final JTextField manStatusField;
    private final JTextField penaltyField;
    private final JTextField penaltyAmountField;
    private final JTextField dirStatusField;
    private final JTextField prevNormalPCField;
    private final JTextField prevSpecialPCField;
    private final JTextField prevNetProfitField;
    private final JTextField opCostField;
    private final JTextField grossProfitField;
    private final JTextField netProfitField;
    private final JTextField boardAvailableField;
    private final JTextField cpuAvailableField;
    private final JTextField ramAvailableField;
    private final JTextField supplyAvailableField;
    private final JTextField gpuAvailableField;
    
    public Hilo (Simulation simu, int permits, JTextField daysField, JTextField normalPCField, JTextField specialPCField, JTextField remainingDaysField, JTextField totalPCField, javax.swing.JTextField manStatusField, javax.swing.JTextField penaltyField, javax.swing.JTextField penaltyAmountField, javax.swing.JTextField dirStatusField, javax.swing.JTextField prevNormalPCField, javax.swing.JTextField prevSpecialPCField, javax.swing.JTextField prevNetProfitField, javax.swing.JTextField opCostField, javax.swing.JTextField grossProfitField, javax.swing.JTextField netProfitField, javax.swing.JTextField boardAvailableField, javax.swing.JTextField cpuAvailableField, javax.swing.JTextField ramAvailableField, javax.swing.JTextField supplyAvailableField, javax.swing.JTextField gpuAvailableField){
        this.simu = simu;
        this.delay = (simu.getDuration()*1000)/48;
        this.sema = new Semaphore(permits);
        this.killSwitch = false;
        this.daysField = daysField;
        this.normalPCField = normalPCField;
        this.specialPCField = specialPCField;
        this.remainingDaysField = remainingDaysField;
        this.totalPCField = totalPCField;
        this.manStatusField = manStatusField;
        this.penaltyField = penaltyField;
        this.penaltyAmountField = penaltyAmountField;
        this.dirStatusField = dirStatusField;
        this.prevNormalPCField = prevNormalPCField;
        this.prevSpecialPCField = prevSpecialPCField;
        this.prevNetProfitField = prevNetProfitField;
        this.opCostField = opCostField;
        this.grossProfitField = grossProfitField;
        this.netProfitField = netProfitField;
        this.boardAvailableField = boardAvailableField;
        this.cpuAvailableField = cpuAvailableField;
        this.ramAvailableField = ramAvailableField;
        this.supplyAvailableField = supplyAvailableField;
        this.gpuAvailableField = gpuAvailableField;
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
            
            try{
                this.sema.acquire();
                
                this.simu.runHour();
                sleep((long) (delay));
                
                this.sema.release();
                sleep((long) (delay));
                
                int daysOut = simu.getTotalDayCounter();
                SwingUtilities.invokeLater(() -> {
                daysField.setText(String.valueOf(daysOut));
                });
                
                int daysRemainingOut = simu.getDayCounter();
                SwingUtilities.invokeLater(() -> {
                remainingDaysField.setText(String.valueOf(daysRemainingOut));
                });

                int normalPcOut = simu.getAccStandard();
                SwingUtilities.invokeLater(() -> {
                normalPCField.setText(String.valueOf(normalPcOut));
                });

                int specialPcOut = simu.getAccSpecial();
                SwingUtilities.invokeLater(() -> {
                specialPCField.setText(String.valueOf(specialPcOut));
                });
                
                int totalPcOut = simu.getAccSpecial() + simu.getAccStandard();
                SwingUtilities.invokeLater(() -> {
                totalPCField.setText(String.valueOf(totalPcOut));
                });
                
                String manStatusOut = simu.getCompany().getManager().getStatus();
                SwingUtilities.invokeLater(() -> {
                manStatusField.setText(manStatusOut);
                });
                
                int penaltyOut = simu.getCompany().getDirector().getCountPenalty();
                SwingUtilities.invokeLater(() -> {
                penaltyField.setText(String.valueOf(penaltyOut));
                });
                
                int penaltyAmountOut = simu.getCompany().getManager().getPenaltyAmount();
                SwingUtilities.invokeLater(() -> {
                penaltyAmountField.setText(String.valueOf(penaltyAmountOut));
                });
                
                String dirStatusOut = simu.getCompany().getDirector().getStatus();
                SwingUtilities.invokeLater(() -> {
                dirStatusField.setText(dirStatusOut);
                });
                
                int prevNormalPcOut = simu.getLastStandard();
                SwingUtilities.invokeLater(() -> {
                prevNormalPCField.setText(String.valueOf(prevNormalPcOut));
                });
                
                int prevSpecialOut = simu.getLastSpecial();
                SwingUtilities.invokeLater(() -> {
                prevSpecialPCField.setText(String.valueOf(prevSpecialOut));
                });
                
                int prevNetOut = simu.getLastGain();
                SwingUtilities.invokeLater(() -> {
                prevNetProfitField.setText(String.valueOf(prevNetOut));
                });
                
                int opCostOut = simu.getTotalLoss();
                SwingUtilities.invokeLater(() -> {
                opCostField.setText(String.valueOf(opCostOut));
                });
                
                int grossOut = simu.getTotalGain();
                SwingUtilities.invokeLater(() -> {
                grossProfitField.setText(String.valueOf(grossOut));
                });
                
                int netOut = simu.getNetGain();
                SwingUtilities.invokeLater(() -> {
                netProfitField.setText(String.valueOf(netOut));
                });
                
                double boardAvailableOut = simu.getCompany().getBoards().getInventory();
                SwingUtilities.invokeLater(() -> {
                boardAvailableField.setText(String.valueOf(Math.floor(boardAvailableOut)));
                });
                
                double cpuAvailableOut = simu.getCompany().getCpus().getInventory();
                SwingUtilities.invokeLater(() -> {
                cpuAvailableField.setText(String.valueOf(Math.floor(cpuAvailableOut)));
                });
                
                double ramAvailableOut = simu.getCompany().getRams().getInventory();
                SwingUtilities.invokeLater(() -> {
                ramAvailableField.setText(String.valueOf(Math.floor(ramAvailableOut)));
                });
                
                double supplyAvailableOut = simu.getCompany().getSupplies().getInventory();
                SwingUtilities.invokeLater(() -> {
                supplyAvailableField.setText(String.valueOf((int) Math.floor(supplyAvailableOut)));
                });
                
                double gpuAvailableOut = simu.getCompany().getGpus().getInventory();
                SwingUtilities.invokeLater(() -> {
                gpuAvailableField.setText(String.valueOf((int) Math.floor(gpuAvailableOut)));
                });
                
                
                
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
