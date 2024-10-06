/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectApp;
import projectClasses.*;
import projectTools.JsonReader;
import projectInterface.Init;

/**
 *
 * @author juanmendezl
 */
public class App {
    public static void start(){
        String path = "./Proyecto-SO-1-Navas-Mendez/data.json";
        JsonReader.reader(path);
        // creater computer
        // creater manager
        // creater director
        // creater company
        // creater productions
        // creater simulation
        Init ini = new Init();
        ini.setVisible(true);
    }
}
