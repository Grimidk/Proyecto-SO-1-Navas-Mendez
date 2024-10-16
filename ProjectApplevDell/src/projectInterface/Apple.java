/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectInterface;
import auxClasses.Hilo;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import projectClasses.Simulation;
import projectTools.JsonHandler;

/**
 *
 * @author juanmendezl
 */
public class Apple extends javax.swing.JFrame {
    
    public static Init ini;
    private Hilo hilo;
    private int totalWorkers = 12;
    private int[] prevValues = new int[6];
//    private JSpinner boardWorkerSpinner, cpuWorkerSpinner, ramWorkerSpinner, supplyWorkerSpinner, gpuWorkerSpinner, computerWorkerSpinner;

    /**
     * Creates new form simulate
     */
    public Apple(Init ini) {
        initComponents();
        this.ini = ini;
        ini.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
//        if (this.daysField == null){
//            System.out.println("esta nulo");
//        } else {
//            System.out.println("esta inicializado");
//        }
        String read = "./../../Proyecto-SO-1-Navas-Mendez/data.json";
        String apple = "Apple";
        Simulation simu1 = JsonHandler.reader(read, apple);
        this.hilo = new Hilo(simu1, 1, this.daysField, this.normalPCField, this.specialPCField, this.remainingDaysField, this.totalPCField, this.manStatusField, this.penaltyField, this.penaltyAmountField, this.dirStatusField, this.prevNormalPCField, this.prevSpecialPCField, this.prevNetProfitField, this.opCostField, this.grossProfitField, this.netProfitField, this.boardAvailableField, this.cpuAvailableField, this.ramAvailableField, this.supplyAvailableField, this.gpuAvailableField, this.boardWorkerSpinner, this.cpuWorkerSpinner, this.ramWorkerSpinner, this.supplyWorkerSpinner, this.gpuWorkerSpinner, this.computerWorkerSpinner);
        hilo.start();
        
        prevValues[0] = (int) boardWorkerSpinner.getValue();
        prevValues[1] = (int) cpuWorkerSpinner.getValue();
        prevValues[2] = (int) ramWorkerSpinner.getValue();
        prevValues[3] = (int) supplyWorkerSpinner.getValue();
        prevValues[4] = (int) gpuWorkerSpinner.getValue();
        prevValues[5] = (int) computerWorkerSpinner.getValue();
        
        addChangeListener(boardWorkerSpinner, 0, (value) -> simu1.getCompany().getBoards().setWorkers(value));
        addChangeListener(cpuWorkerSpinner, 1,(value) ->  simu1.getCompany().getCpus().setWorkers(value));
        addChangeListener(ramWorkerSpinner, 2, (value) -> simu1.getCompany().getRams().setWorkers(value));
        addChangeListener(supplyWorkerSpinner, 3,(value) ->  simu1.getCompany().getSupplies().setWorkers(value));
        addChangeListener(gpuWorkerSpinner, 4, (value) -> simu1.getCompany().getGpus().setWorkers(value));
        addChangeListener(computerWorkerSpinner, 5,(value) ->  simu1.getCompany().getComputers().setWorkers(value));
        
    }
    
    private void addChangeListener(JSpinner spinner, int index, AttributeSetter  setter){
        spinner.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent e){
                int currentValue = (int) spinner.getValue();
            
            // Determine if the spinner value went up or down
            if (currentValue == prevValues[index] + 1) {
                setter.set(currentValue);  // Call setter to update the value (e.g., increase workers)
            } else if (currentValue == prevValues[index] - 1) {
                setter.set(currentValue);  // Call setter to update the value (e.g., decrease workers)
            }
            
            // Update previous value
            prevValues[index] = currentValue;
            }
        });
    }
    
    @FunctionalInterface
    interface AttributeSetter {
        void set(int value);
    }
 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        boardWorkerSpinner = new javax.swing.JSpinner();
        cpuWorkerSpinner = new javax.swing.JSpinner();
        ramWorkerSpinner = new javax.swing.JSpinner();
        supplyWorkerSpinner = new javax.swing.JSpinner();
        gpuWorkerSpinner = new javax.swing.JSpinner();
        computerWorkerSpinner = new javax.swing.JSpinner();
        daysField = new javax.swing.JTextField();
        remainingDaysField = new javax.swing.JTextField();
        normalPCField = new javax.swing.JTextField();
        specialPCField = new javax.swing.JTextField();
        manStatusField = new javax.swing.JTextField();
        totalPCField = new javax.swing.JTextField();
        penaltyField = new javax.swing.JTextField();
        penaltyAmountField = new javax.swing.JTextField();
        dirStatusField = new javax.swing.JTextField();
        prevNormalPCField = new javax.swing.JTextField();
        prevSpecialPCField = new javax.swing.JTextField();
        prevNetProfitField = new javax.swing.JTextField();
        opCostField = new javax.swing.JTextField();
        grossProfitField = new javax.swing.JTextField();
        netProfitField = new javax.swing.JTextField();
        boardAvailableField = new javax.swing.JTextField();
        cpuAvailableField = new javax.swing.JTextField();
        ramAvailableField = new javax.swing.JTextField();
        supplyAvailableField = new javax.swing.JTextField();
        gpuAvailableField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setText("Regresar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectInterface/Apple_logo_grey.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Días:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Penalización ($):");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Computadoras (Total):");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Computadoras Normales:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ÚLTIMO LOTE");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Días para la entrega:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Status:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Faltas:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EN ALMACÉN");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ensambladores:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DIRECTOR");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Computadoras Normales:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Computadoras Gráficas:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ganancia Neta:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Computadoras Gráficas:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel21.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("PROJECT MANAGER");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Status:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Costos operativos:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Ganancia bruta:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel25.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("CONFIG");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, -1, -1));

        jLabel26.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Ganancia neta:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel27.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Placa Base:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("CPU:");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        jLabel29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("RAM:");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Fuente de Energía:");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel31.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("GPU:");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        jLabel32.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("COSTOS/ GANANCIAS");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Placa Base:");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("CPU:");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("RAM:");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Fuente de Energía:");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel37.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("GPU:");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        boardWorkerSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        boardWorkerSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                boardWorkerSpinnerStateChanged(evt);
            }
        });
        jPanel2.add(boardWorkerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        cpuWorkerSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel2.add(cpuWorkerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, -1));

        ramWorkerSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel2.add(ramWorkerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, -1));

        supplyWorkerSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel2.add(supplyWorkerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        gpuWorkerSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel2.add(gpuWorkerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        computerWorkerSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jPanel2.add(computerWorkerSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        daysField.setEditable(false);
        daysField.setColumns(3);
        daysField.setText("0");
        daysField.setMinimumSize(new java.awt.Dimension(80, 22));
        daysField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysFieldActionPerformed(evt);
            }
        });
        jPanel2.add(daysField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        remainingDaysField.setEditable(false);
        remainingDaysField.setColumns(3);
        remainingDaysField.setText("0");
        remainingDaysField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remainingDaysFieldActionPerformed(evt);
            }
        });
        jPanel2.add(remainingDaysField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        normalPCField.setEditable(false);
        normalPCField.setColumns(3);
        normalPCField.setText("0");
        jPanel2.add(normalPCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        specialPCField.setEditable(false);
        specialPCField.setColumns(3);
        specialPCField.setText("0");
        jPanel2.add(specialPCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        manStatusField.setEditable(false);
        manStatusField.setColumns(15);
        manStatusField.setText("Por comenzar");
        manStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manStatusFieldActionPerformed(evt);
            }
        });
        jPanel2.add(manStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        totalPCField.setEditable(false);
        totalPCField.setColumns(3);
        totalPCField.setText("0");
        jPanel2.add(totalPCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        penaltyField.setEditable(false);
        penaltyField.setColumns(3);
        penaltyField.setText("0");
        penaltyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penaltyFieldActionPerformed(evt);
            }
        });
        jPanel2.add(penaltyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        penaltyAmountField.setEditable(false);
        penaltyAmountField.setColumns(3);
        penaltyAmountField.setText("0");
        penaltyAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penaltyAmountFieldActionPerformed(evt);
            }
        });
        jPanel2.add(penaltyAmountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        dirStatusField.setEditable(false);
        dirStatusField.setColumns(15);
        dirStatusField.setText("Por comenzar");
        dirStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirStatusFieldActionPerformed(evt);
            }
        });
        jPanel2.add(dirStatusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        prevNormalPCField.setEditable(false);
        prevNormalPCField.setColumns(3);
        prevNormalPCField.setText("0");
        jPanel2.add(prevNormalPCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        prevSpecialPCField.setEditable(false);
        prevSpecialPCField.setColumns(3);
        prevSpecialPCField.setText("0");
        jPanel2.add(prevSpecialPCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        prevNetProfitField.setEditable(false);
        prevNetProfitField.setColumns(3);
        prevNetProfitField.setText("0");
        jPanel2.add(prevNetProfitField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        opCostField.setEditable(false);
        opCostField.setColumns(8);
        opCostField.setText("0");
        opCostField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCostFieldActionPerformed(evt);
            }
        });
        jPanel2.add(opCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        grossProfitField.setEditable(false);
        grossProfitField.setColumns(8);
        grossProfitField.setText("0");
        jPanel2.add(grossProfitField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        netProfitField.setEditable(false);
        netProfitField.setColumns(8);
        netProfitField.setText("0");
        jPanel2.add(netProfitField, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        boardAvailableField.setEditable(false);
        boardAvailableField.setColumns(3);
        boardAvailableField.setText("0");
        boardAvailableField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardAvailableFieldActionPerformed(evt);
            }
        });
        jPanel2.add(boardAvailableField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        cpuAvailableField.setEditable(false);
        cpuAvailableField.setColumns(3);
        cpuAvailableField.setText("0");
        jPanel2.add(cpuAvailableField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        ramAvailableField.setEditable(false);
        ramAvailableField.setColumns(3);
        ramAvailableField.setText("0");
        jPanel2.add(ramAvailableField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        supplyAvailableField.setEditable(false);
        supplyAvailableField.setColumns(3);
        supplyAvailableField.setText("0");
        jPanel2.add(supplyAvailableField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        gpuAvailableField.setEditable(false);
        gpuAvailableField.setColumns(3);
        gpuAvailableField.setText("0");
        jPanel2.add(gpuAvailableField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectInterface/fondoApple.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Init ini = new Init();
        ini.setVisible(true);
        hilo.setKillSwitch(true);
        this.dispose();

    }//GEN-LAST:event_backActionPerformed

    private void daysFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysFieldActionPerformed
        // TODO add your handling code here:
        daysField.setText("0");
    }//GEN-LAST:event_daysFieldActionPerformed

    private void manStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manStatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manStatusFieldActionPerformed

    private void penaltyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penaltyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penaltyFieldActionPerformed

    private void penaltyAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penaltyAmountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penaltyAmountFieldActionPerformed

    private void dirStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirStatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirStatusFieldActionPerformed

    private void opCostFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCostFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opCostFieldActionPerformed

    private void boardAvailableFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardAvailableFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boardAvailableFieldActionPerformed

    private void remainingDaysFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remainingDaysFieldActionPerformed
        // TODO add your handling code here:
         remainingDaysField.setText("0");
    }//GEN-LAST:event_remainingDaysFieldActionPerformed

    private void boardWorkerSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_boardWorkerSpinnerStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_boardWorkerSpinnerStateChanged

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
            java.util.logging.Logger.getLogger(Apple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apple(ini).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField boardAvailableField;
    private javax.swing.JSpinner boardWorkerSpinner;
    private javax.swing.JSpinner computerWorkerSpinner;
    private javax.swing.JTextField cpuAvailableField;
    private javax.swing.JSpinner cpuWorkerSpinner;
    private javax.swing.JTextField daysField;
    private javax.swing.JTextField dirStatusField;
    private javax.swing.JTextField gpuAvailableField;
    private javax.swing.JSpinner gpuWorkerSpinner;
    private javax.swing.JTextField grossProfitField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField manStatusField;
    private javax.swing.JTextField netProfitField;
    private javax.swing.JTextField normalPCField;
    private javax.swing.JTextField opCostField;
    private javax.swing.JTextField penaltyAmountField;
    private javax.swing.JTextField penaltyField;
    private javax.swing.JTextField prevNetProfitField;
    private javax.swing.JTextField prevNormalPCField;
    private javax.swing.JTextField prevSpecialPCField;
    private javax.swing.JTextField ramAvailableField;
    private javax.swing.JSpinner ramWorkerSpinner;
    private javax.swing.JTextField remainingDaysField;
    private javax.swing.JTextField specialPCField;
    private javax.swing.JTextField supplyAvailableField;
    private javax.swing.JSpinner supplyWorkerSpinner;
    private javax.swing.JTextField totalPCField;
    // End of variables declaration//GEN-END:variables
}
