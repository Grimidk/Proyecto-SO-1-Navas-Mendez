/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectApp;
import auxClasses.Hilo;
import projectClasses.Simulation;
import projectTools.JsonReader;
import projectInterface.Init;

/**
 *
 * @author juanmendezl
 */
public class App {
    public static void start(){
        
        String path = "./../../Proyecto-SO-1-Navas-Mendez/data.json";
        String apple = "Apple";
        String dell = "Dell";
        Simulation simu1 = JsonReader.reader(path, apple);  
        Simulation simu2 = JsonReader.reader(path, dell);  
        Hilo thread1 = new Hilo(simu1, 1);
        Hilo thread2 = new Hilo(simu2, 1);
        thread1.start();
        thread2.start();
        
        Init ini = new Init();
        ini.setVisible(true);
    }
}
