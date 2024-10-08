/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectApp;
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
        String name = "Dell";
        Simulation simu = JsonReader.reader(path, name);
        System.out.println(simu.getCompany().getDirector().getWage());
        Init ini = new Init();
        ini.setVisible(true);
    }
}
