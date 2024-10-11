/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectInterface;
import projectTools.JsonHandler;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 *
 * @author juanmendezl
 */
public class Configurate extends javax.swing.JFrame {
    
    public static Init ini;
    /**
     * Creates new form configurate
     */
    public Configurate(Init ini) {
        initComponents();
        this.ini = ini;
        ini.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        int dataTotalWorkers = (int) jSpinner15.getValue();
        
        ChangeListener workerListener = new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e){
                int dataAppleBoardsWorkers = (int) jSpinner3.getValue();
                int dataAppleCpuWorkers = (int) jSpinner5.getValue();
                int dataAppleRamWorkers = (int) jSpinner7.getValue();
                int dataAppleGpuWorkers = (int) jSpinner9.getValue();
                int dataAppleSupplyWorkers = (int) jSpinner11.getValue();
                int dataAppleComputerWorkers = (int) jSpinner13.getValue();
                
                int dataDellBoardsWorkers = (int) jSpinner4.getValue();
                int dataDellCpuWorkers = (int) jSpinner6.getValue();
                int dataDellRamWorkers = (int) jSpinner8.getValue();
                int dataDellGpuWorkers = (int) jSpinner10.getValue();
                int dataDellSupplyWorkers = (int) jSpinner12.getValue();
                int dataDellComputerWorkers = (int) jSpinner14.getValue();
                
                int totalAppleWorkers = dataAppleBoardsWorkers +
                                        dataAppleCpuWorkers +
                                        dataAppleRamWorkers +
                                        dataAppleGpuWorkers +
                                        dataAppleSupplyWorkers +
                                        dataAppleComputerWorkers;
                
                int totalDellWorkers = dataDellBoardsWorkers + 
                                       dataDellCpuWorkers +
                                       dataDellRamWorkers +
                                       dataDellGpuWorkers +
                                       dataDellSupplyWorkers +
                                       dataDellComputerWorkers;
                
                if (totalAppleWorkers >= dataTotalWorkers) {
                    disableAppleIncreases();
                } else {
                    enableAppleIncreases();
                }
                
                if (totalDellWorkers >= dataTotalWorkers){
                    disableDellIncreases();
                } else {
                    enableDellIncreases();
                }
            }
        };
        
        jSpinner3.addChangeListener(workerListener);
        jSpinner5.addChangeListener(workerListener);
        jSpinner7.addChangeListener(workerListener);
        jSpinner9.addChangeListener(workerListener);
        jSpinner11.addChangeListener(workerListener);
        jSpinner13.addChangeListener(workerListener);
        jSpinner4.addChangeListener(workerListener);
        jSpinner6.addChangeListener(workerListener);
        jSpinner8.addChangeListener(workerListener);
        jSpinner10.addChangeListener(workerListener);
        jSpinner12.addChangeListener(workerListener);
        jSpinner14.addChangeListener(workerListener);
        
    }

    private void disableAppleIncreases() {
        for (JSpinner spinner : new JSpinner[]{jSpinner3, jSpinner5, jSpinner7, jSpinner9, jSpinner11, jSpinner13}){
            SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
            model.setMaximum((int) spinner.getValue());
        }
    }
    
    private void enableAppleIncreases() {
        int dataTotalWorkers = (int) jSpinner15.getValue();
        for (JSpinner spinner : new JSpinner[]{jSpinner3, jSpinner5, jSpinner7, jSpinner9, jSpinner11, jSpinner13}){
            SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
            model.setMaximum(dataTotalWorkers);
        }
    }
     
    private void disableDellIncreases() {
        for (JSpinner spinner : new JSpinner[]{jSpinner4, jSpinner6, jSpinner8, jSpinner10, jSpinner12, jSpinner14}){
            SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
            model.setMaximum((int) spinner.getValue());
        }
    }
    
     private void enableDellIncreases() {
        int dataTotalWorkers = (int) jSpinner15.getValue();
        for (JSpinner spinner : new JSpinner[]{jSpinner4, jSpinner6, jSpinner8, jSpinner10, jSpinner12, jSpinner14}){
            SpinnerNumberModel model = (SpinnerNumberModel) spinner.getModel();
            model.setMaximum(dataTotalWorkers);
        }
    }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinner8 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSpinner9 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jSpinner10 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        jSpinner11 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jSpinner13 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jSpinner14 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jSpinner15 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Personalización de Parámetros");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Días entre las entregas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(3, 1, null, 1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Duración de días (en seg)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(30, 1, null, 1));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectInterface/Apple_logo_grey (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectInterface/dell-logo-black-transparent (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Prod. placa base");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(2, 1, null, 1));
        jSpinner3.setToolTipText("");
        jPanel1.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Prod. CPU");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Prod. placa base");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(3, 1, null, 1));
        jPanel1.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Prod. RAM");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(2, 1, null, 1));
        jPanel1.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Prod. CPU");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Prod. Fuentes de energía");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        jSpinner8.setModel(new javax.swing.SpinnerNumberModel(2, 1, null, 1));
        jPanel1.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Prod. RAM");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jSpinner9.setModel(new javax.swing.SpinnerNumberModel(4, 1, null, 1));
        jPanel1.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Prod. GPU");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        jSpinner10.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Prod. Fuentes de energía");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jSpinner11.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ensambladores");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jSpinner12.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Prod. GPU");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jSpinner13.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        jPanel1.add(jSpinner13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel18.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ensambladores");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jSpinner14.setModel(new javax.swing.SpinnerNumberModel(6, 1, null, 1));
        jPanel1.add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Max. trabajadores");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jSpinner15.setModel(new javax.swing.SpinnerNumberModel(12, 12, null, 1));
        jPanel1.add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Dinero Inicial");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jTextField1.setText("0");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectInterface/wallpaperflare.com_wallpaper.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 380));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Init ini = new Init();
        ini.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
        String file;
        int dataDuration; 
        int dataDeadline; 
        int dataTotalWorkers;
        int dataStartingMoney = 0; 
        int dataAppleBoardsWorkers; 
        int dataAppleCpuWorkers; 
        int dataAppleRamWorkers; 
        int dataAppleGpuWorkers; 
        int dataAppleSupplyWorkers; 
        int dataAppleComputerWorkers; 
        int dataDellBoardsWorkers; 
        int dataDellCpuWorkers; 
        int dataDellRamWorkers; 
        int dataDellGpuWorkers; 
        int dataDellSupplyWorkers; 
        int dataDellComputerWorkers;
        
        file = "./../../Proyecto-SO-1-Navas-Mendez/data.json";
        dataDuration = (int) jSpinner1.getValue();
        dataDeadline = (int) jSpinner2.getValue();
        dataTotalWorkers = (int) jSpinner15.getValue();
        dataStartingMoney = Integer.parseInt((jTextField1.getText()).trim());
        dataAppleBoardsWorkers = (int) jSpinner3.getValue();
        dataAppleCpuWorkers = (int) jSpinner5.getValue();
        dataAppleRamWorkers = (int) jSpinner7.getValue();
        dataAppleGpuWorkers = (int) jSpinner9.getValue();
        dataAppleSupplyWorkers = (int) jSpinner11.getValue();
        dataAppleComputerWorkers = (int) jSpinner13.getValue();
        dataDellBoardsWorkers = (int) jSpinner4.getValue();
        dataDellCpuWorkers = (int) jSpinner6.getValue();
        dataDellRamWorkers = (int) jSpinner8.getValue();
        dataDellGpuWorkers = (int) jSpinner10.getValue();
        dataDellSupplyWorkers = (int) jSpinner12.getValue();
        dataDellComputerWorkers = (int) jSpinner14.getValue();
        
        JsonHandler.writer(file, dataDuration, dataDeadline, dataTotalWorkers, dataStartingMoney, dataAppleBoardsWorkers,  dataAppleCpuWorkers, dataAppleRamWorkers, dataAppleGpuWorkers, dataAppleSupplyWorkers, dataAppleComputerWorkers, dataDellBoardsWorkers, dataDellCpuWorkers, dataDellRamWorkers, dataDellGpuWorkers, dataDellSupplyWorkers, dataDellComputerWorkers );
    }//GEN-LAST:event_saveActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Configurate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configurate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configurate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configurate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configurate(ini).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner13;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
