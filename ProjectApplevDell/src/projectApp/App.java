/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectApp;
import auxClasses.Hilo;
import javax.swing.SwingUtilities;
import projectClasses.Simulation;
import projectTools.JsonHandler;
import projectInterface.Init;

/**
 *
 * @author juanmendezl
 */
public class App {
    public static void start(){
        SwingUtilities.invokeLater(() -> {
           Init ini = new Init();
            ini.setVisible(true); 
        });
    }
}
