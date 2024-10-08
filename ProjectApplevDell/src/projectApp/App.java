/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectApp;
import auxClasses.Hilo;
import projectClasses.Simulation;
import projectTools.JsonHandler;
import projectInterface.Init;

/**
 *
 * @author juanmendezl
 */
public class App {
    public static void start(){
        
        String read = "./../../Proyecto-SO-1-Navas-Mendez/data.json";
        String apple = "Apple";
        String dell = "Dell";
        
        Simulation simu1 = JsonHandler.reader(read, apple);  
        Simulation simu2 = JsonHandler.reader(read, dell); 
        
//        String write = "./../../Proyecto-SO-1-Navas-Mendez/test.json";
//        JsonHandler.writer(write, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        
        Hilo thread1 = new Hilo(simu1, 1);
//        Hilo thread2 = new Hilo(simu2, 1);
        thread1.start();
//        thread2.start();
        
        Init ini = new Init();
        ini.setVisible(true);
    }
}
