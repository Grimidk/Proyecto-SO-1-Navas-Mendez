/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectTools;
import projectClasses.*;

import com.google.gson.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author juanmendezl
 */
public class JsonHandler {
    public static Simulation reader(String file, String name) {
        Gson gson = new Gson();
        try (Reader reader = new FileReader(file)) {
            
            JsonObject data = gson.fromJson(reader, JsonObject.class);
            
                JsonObject dataSimulation = data.getAsJsonObject("simulation");
                    JsonObject dataConsts = dataSimulation.getAsJsonObject("consts");
                        int dataDuration = dataConsts.getAsJsonPrimitive("duration").getAsInt();
                        int dataDeadline = dataConsts.getAsJsonPrimitive("deadline").getAsInt();
                        int dataHours = dataConsts.getAsJsonPrimitive("hours").getAsInt();
                        int dataTotalWorkers = dataConsts.getAsJsonPrimitive("totalWorkers").getAsInt();
                        int dataWorkerCost = dataConsts.getAsJsonPrimitive("workerCost").getAsInt();
                        int dataStartingMoney = dataConsts.getAsJsonPrimitive("startingMoney").getAsInt();
                    JsonObject dataCompanies = dataSimulation.getAsJsonObject("companies");
                
                        JsonObject dataApple = dataCompanies.getAsJsonObject("apple");
                            JsonObject dataAppleProductions = dataApple.getAsJsonObject("productions");
                                JsonObject dataAppleBoards = dataAppleProductions.getAsJsonObject("board");
                                    int dataAppleBoardsPay = dataAppleBoards.getAsJsonPrimitive("pay").getAsInt();
                                    double dataAppleBoardsRate = dataAppleBoards.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataAppleBoardsCap = dataAppleBoards.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataAppleBoardsWorkers = dataAppleBoards.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataAppleCpu = dataAppleProductions.getAsJsonObject("cpu");
                                    int dataAppleCpuPay = dataAppleCpu.getAsJsonPrimitive("pay").getAsInt();
                                    double dataAppleCpuRate = dataAppleCpu.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataAppleCpuCap = dataAppleCpu.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataAppleCpuWorkers = dataAppleCpu.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataAppleRam = dataAppleProductions.getAsJsonObject("ram");
                                    int dataAppleRamPay = dataAppleRam.getAsJsonPrimitive("pay").getAsInt();
                                    double dataAppleRamRate = dataAppleRam.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataAppleRamCap = dataAppleRam.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataAppleRamWorkers = dataAppleRam.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataAppleSupply = dataAppleProductions.getAsJsonObject("supply");
                                    int dataAppleSupplyPay = dataAppleSupply.getAsJsonPrimitive("pay").getAsInt();
                                    double dataAppleSupplyRate = dataAppleSupply.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataAppleSupplyCap = dataAppleSupply.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataAppleSupplyWorkers = dataAppleSupply.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataAppleGpu = dataAppleProductions.getAsJsonObject("gpu");
                                    int dataAppleGpuPay = dataAppleGpu.getAsJsonPrimitive("pay").getAsInt();
                                    double dataAppleGpuRate = dataAppleGpu.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataAppleGpuCap = dataAppleGpu.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataAppleGpuWorkers = dataAppleGpu.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataAppleComputer = dataAppleProductions.getAsJsonObject("computer");  
                                    int dataAppleComputerPay = dataAppleComputer.getAsJsonPrimitive("pay").getAsInt();
                                    double dataAppleComputerRate = dataAppleComputer.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataAppleComputerCap = dataAppleComputer.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataAppleComputerWorkers = dataAppleComputer.getAsJsonPrimitive("workers").getAsInt();
                            JsonObject dataAppleManager = dataApple.getAsJsonObject("manager");
                                int dataAppleManagerPay = dataAppleManager.getAsJsonPrimitive("pay").getAsInt();
                                int dataAppleManagerCounter = dataAppleManager.getAsJsonPrimitive("counter").getAsInt();
                                int dataAppleManagerWork = dataAppleManager.getAsJsonPrimitive("work").getAsInt();
                                double dataAppleManagerInterval = dataAppleManager.getAsJsonPrimitive("interval").getAsDouble();
                                int dataAppleManagerPenalty = dataAppleManager.getAsJsonPrimitive("penalty").getAsInt();
                            JsonObject dataAppleDirector = dataApple.getAsJsonObject("director");
                                int dataAppleDirectorPay = dataAppleDirector.getAsJsonPrimitive("pay").getAsInt();
                                int dataAppleDirectorThreshold = dataAppleDirector.getAsJsonPrimitive("threshold").getAsInt();
                                int dataAppleDirectorDistribute = dataAppleDirector.getAsJsonPrimitive("distribute").getAsInt();
                                double dataAppleDirectorInterval = dataAppleDirector.getAsJsonPrimitive("interval").getAsDouble();
                                int dataAppleDirectorCheck = dataAppleDirector.getAsJsonPrimitive("check").getAsInt();
                            JsonObject dataAppleComputers = dataApple.getAsJsonObject("computers");
                                JsonObject dataAppleStandard = dataAppleComputers.getAsJsonObject("standard");
                                    JsonObject dataAppleStandardRecipe = dataAppleStandard.getAsJsonObject("recipe");
                                        int dataAppleStandardRecipeBoard = dataAppleStandardRecipe.getAsJsonPrimitive("board").getAsInt();
                                        int dataAppleStandardRecipeCpu = dataAppleStandardRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                        int dataAppleStandardRecipeRam = dataAppleStandardRecipe.getAsJsonPrimitive("ram").getAsInt();
                                        int dataAppleStandardRecipeSupply = dataAppleStandardRecipe.getAsJsonPrimitive("supply").getAsInt();
                                        int dataAppleStandardRecipeGpu = dataAppleStandardRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                        int dataAppleStandardRecipeBatch = dataAppleStandardRecipe.getAsJsonPrimitive("batch").getAsInt();
                                        int dataAppleStandardPrice = dataAppleStandardRecipe.getAsJsonPrimitive("price").getAsInt();
                                JsonObject dataAppleSpecial = dataAppleComputers.getAsJsonObject("special");
                                    JsonObject dataAppleSpecialRecipe = dataAppleSpecial.getAsJsonObject("recipe");
                                        int dataAppleSpecialRecipeBoard = dataAppleSpecialRecipe.getAsJsonPrimitive("board").getAsInt();
                                        int dataAppleSpecialRecipeCpu = dataAppleSpecialRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                        int dataAppleSpecialRecipeRam = dataAppleSpecialRecipe.getAsJsonPrimitive("ram").getAsInt();
                                        int dataAppleSpecialRecipeSupply = dataAppleSpecialRecipe.getAsJsonPrimitive("supply").getAsInt();
                                        int dataAppleSpecialRecipeGpu = dataAppleSpecialRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                        int dataAppleSpecialRecipeBatch = dataAppleSpecialRecipe.getAsJsonPrimitive("batch").getAsInt();
                                        int dataAppleSpecialPrice = dataAppleSpecialRecipe.getAsJsonPrimitive("price").getAsInt();

                        JsonObject dataDell = dataCompanies.getAsJsonObject("dell");
                            JsonObject dataDellProductions = dataDell.getAsJsonObject("productions");
                                JsonObject dataDellBoards = dataDellProductions.getAsJsonObject("board");
                                    int dataDellBoardsPay = dataDellBoards.getAsJsonPrimitive("pay").getAsInt();
                                    double dataDellBoardsRate = dataDellBoards.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataDellBoardsCap = dataDellBoards.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataDellBoardsWorkers = dataDellBoards.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataDellCpu = dataDellProductions.getAsJsonObject("cpu");
                                    int dataDellCpuPay = dataDellCpu.getAsJsonPrimitive("pay").getAsInt();
                                    double dataDellCpuRate = dataDellCpu.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataDellCpuCap = dataDellCpu.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataDellCpuWorkers = dataDellCpu.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataDellRam = dataDellProductions.getAsJsonObject("ram");
                                    int dataDellRamPay = dataDellRam.getAsJsonPrimitive("pay").getAsInt();
                                    double dataDellRamRate = dataDellRam.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataDellRamCap = dataDellRam.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataDellRamWorkers = dataDellRam.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataDellSupply = dataDellProductions.getAsJsonObject("supply");
                                    int dataDellSupplyPay = dataDellSupply.getAsJsonPrimitive("pay").getAsInt();
                                    double dataDellSupplyRate = dataDellSupply.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataDellSupplyCap = dataDellSupply.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataDellSupplyWorkers = dataDellSupply.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataDellGpu = dataDellProductions.getAsJsonObject("gpu");
                                    int dataDellGpuPay = dataDellGpu.getAsJsonPrimitive("pay").getAsInt();
                                    double dataDellGpuRate = dataDellGpu.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataDellGpuCap = dataDellGpu.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataDellGpuWorkers = dataDellGpu.getAsJsonPrimitive("workers").getAsInt();
                                JsonObject dataDellComputer = dataDellProductions.getAsJsonObject("computer");  
                                    int dataDellComputerPay = dataDellComputer.getAsJsonPrimitive("pay").getAsInt();
                                    double dataDellComputerRate = dataDellComputer.getAsJsonPrimitive("rate").getAsDouble();
                                    double dataDellComputerCap = dataDellComputer.getAsJsonPrimitive("cap").getAsDouble();
                                    int dataDellComputerWorkers = dataDellComputer.getAsJsonPrimitive("workers").getAsInt();
                            JsonObject dataDellManager = dataDell.getAsJsonObject("manager");
                                int dataDellManagerPay = dataDellManager.getAsJsonPrimitive("pay").getAsInt();
                                int dataDellManagerCounter = dataDellManager.getAsJsonPrimitive("counter").getAsInt();
                                int dataDellManagerWork = dataDellManager.getAsJsonPrimitive("work").getAsInt();
                                double dataDellManagerInterval = dataDellManager.getAsJsonPrimitive("interval").getAsDouble();
                                int dataDellManagerPenalty = dataDellManager.getAsJsonPrimitive("penalty").getAsInt();
                            JsonObject dataDellDirector = dataDell.getAsJsonObject("director");
                                int dataDellDirectorPay = dataDellDirector.getAsJsonPrimitive("pay").getAsInt();
                                int dataDellDirectorThreshold = dataDellDirector.getAsJsonPrimitive("threshold").getAsInt();
                                int dataDellDirectorDistribute = dataDellDirector.getAsJsonPrimitive("distribute").getAsInt();
                                double dataDellDirectorInterval = dataDellDirector.getAsJsonPrimitive("interval").getAsDouble();
                                int dataDellDirectorCheck = dataDellDirector.getAsJsonPrimitive("check").getAsInt();
                            JsonObject dataDellComputers = dataDell.getAsJsonObject("computers");
                                JsonObject dataDellStandard = dataDellComputers.getAsJsonObject("standard");
                                    JsonObject dataDellStandardRecipe = dataDellStandard.getAsJsonObject("recipe");
                                        int dataDellStandardRecipeBoard = dataDellStandardRecipe.getAsJsonPrimitive("board").getAsInt();
                                        int dataDellStandardRecipeCpu = dataDellStandardRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                        int dataDellStandardRecipeRam = dataDellStandardRecipe.getAsJsonPrimitive("ram").getAsInt();
                                        int dataDellStandardRecipeSupply = dataDellStandardRecipe.getAsJsonPrimitive("supply").getAsInt();
                                        int dataDellStandardRecipeGpu = dataDellStandardRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                        int dataDellStandardRecipeBatch = dataDellStandardRecipe.getAsJsonPrimitive("batch").getAsInt();
                                        int dataDellStandardPrice = dataDellStandardRecipe.getAsJsonPrimitive("price").getAsInt();
                                JsonObject dataDellSpecial = dataDellComputers.getAsJsonObject("special");
                                    JsonObject dataDellSpecialRecipe = dataDellSpecial.getAsJsonObject("recipe");
                                        int dataDellSpecialRecipeBoard = dataDellSpecialRecipe.getAsJsonPrimitive("board").getAsInt();
                                        int dataDellSpecialRecipeCpu = dataDellSpecialRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                        int dataDellSpecialRecipeRam = dataDellSpecialRecipe.getAsJsonPrimitive("ram").getAsInt();
                                        int dataDellSpecialRecipeSupply = dataDellSpecialRecipe.getAsJsonPrimitive("supply").getAsInt();
                                        int dataDellSpecialRecipeGpu = dataDellSpecialRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                        int dataDellSpecialRecipeBatch = dataDellSpecialRecipe.getAsJsonPrimitive("batch").getAsInt();
                                        int dataDellSpecialPrice = dataDellSpecialRecipe.getAsJsonPrimitive("price").getAsInt();

            if ("Apple".equals(name)){
                Computer standard = new Computer(false, dataAppleStandardRecipeBoard, dataAppleStandardRecipeCpu, dataAppleStandardRecipeRam, dataAppleStandardRecipeSupply, dataAppleStandardRecipeGpu, dataAppleStandardRecipeBatch, dataAppleStandardPrice);
                Computer special = new Computer(true, dataAppleSpecialRecipeBoard, dataAppleSpecialRecipeCpu, dataAppleSpecialRecipeRam, dataAppleSpecialRecipeSupply, dataAppleSpecialRecipeGpu, dataAppleSpecialRecipeBatch, dataAppleSpecialPrice);
                Production boards = new Production("Boards", dataAppleBoardsPay, dataAppleBoardsRate, dataAppleBoardsCap, dataAppleBoardsWorkers);
                Production cpus = new Production("Cpus", dataAppleCpuPay, dataAppleCpuRate, dataAppleCpuCap, dataAppleCpuWorkers);
                Production rams = new Production("Rams", dataAppleRamPay, dataAppleRamRate, dataAppleRamCap, dataAppleRamWorkers);
                Production supplies = new Production("Supplies", dataAppleSupplyPay, dataAppleSupplyRate, dataAppleSupplyCap, dataAppleSupplyWorkers);
                Production gpus = new Production("Gpus", dataAppleGpuPay, dataAppleGpuRate, dataAppleGpuCap, dataAppleGpuWorkers);
                Production computers = new Production("Computers", dataAppleComputerPay, dataAppleComputerRate, dataAppleComputerCap, dataAppleComputerWorkers);
                Manager manager = new Manager(dataAppleManagerPay, dataAppleManagerCounter, dataAppleManagerWork, dataAppleManagerInterval,dataAppleManagerPenalty);
                Director director = new Director(dataAppleDirectorPay,dataAppleDirectorThreshold,dataAppleDirectorDistribute);
                Company company = new Company("Apple", director, manager, standard, special, boards, cpus, rams, supplies, gpus, computers);
                company.setMoney(dataStartingMoney);
                Simulation simulation = new Simulation(dataDeadline, dataTotalWorkers, dataWorkerCost, dataDuration, dataHours, company);
                return simulation;
            } else if ("Dell".equals(name)) {
                Computer standard = new Computer(false, dataDellStandardRecipeBoard, dataDellStandardRecipeCpu, dataDellStandardRecipeRam, dataDellStandardRecipeSupply, dataDellStandardRecipeGpu, dataDellStandardRecipeBatch, dataDellStandardPrice);
                Computer special = new Computer(true, dataDellSpecialRecipeBoard, dataDellSpecialRecipeCpu, dataDellSpecialRecipeRam, dataDellSpecialRecipeSupply, dataDellSpecialRecipeGpu, dataDellSpecialRecipeBatch, dataDellSpecialPrice);
                Production boards = new Production("Boards", dataDellBoardsPay, dataDellBoardsRate, dataDellBoardsCap, dataDellBoardsWorkers);
                Production cpus = new Production("Cpus", dataDellCpuPay, dataDellCpuRate, dataDellCpuCap, dataDellCpuWorkers);
                Production rams = new Production("Rams", dataDellRamPay, dataDellRamRate, dataDellRamCap, dataDellRamWorkers);
                Production supplies = new Production("Supplies", dataDellSupplyPay, dataDellSupplyRate, dataDellSupplyCap, dataDellSupplyWorkers);
                Production gpus = new Production("Gpus", dataDellGpuPay, dataDellGpuRate, dataDellGpuCap, dataDellGpuWorkers);
                Production computers = new Production("Computers", dataDellComputerPay, dataDellComputerRate, dataDellComputerCap, dataDellComputerWorkers);
                Manager manager = new Manager(dataDellManagerPay, dataDellManagerCounter, dataDellManagerWork, dataDellManagerInterval,dataDellManagerPenalty);
                Director director = new Director(dataDellDirectorPay,dataDellDirectorThreshold,dataDellDirectorDistribute);
                Company company = new Company("Dell", director, manager, standard, special, boards, cpus, rams, supplies, gpus, computers);
                company.setMoney(dataStartingMoney);
                Simulation simulation = new Simulation(dataDeadline, dataTotalWorkers, dataWorkerCost, dataDuration, dataHours, company);
                return simulation;
            } else {
                return null;
            }
        
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void writer(String file, int dataDuration, int dataDeadline, int dataTotalWorkers, int dataStartingMoney, int dataAppleBoardsWorkers, int dataAppleCpuWorkers, int dataAppleRamWorkers, int dataAppleGpuWorkers, int dataAppleSupplyWorkers, int dataAppleComputerWorkers, int dataDellBoardsWorkers, int dataDellCpuWorkers, int dataDellRamWorkers, int dataDellGpuWorkers, int dataDellSupplyWorkers, int dataDellComputerWorkers){
        Gson gson = new Gson();
        
        Map<String, Integer> consts = new HashMap<>();
        consts.put("duration", dataDuration);
        consts.put("deadline", dataDeadline);
        consts.put("hours", 24);
        consts.put("totalWorkers", dataTotalWorkers);
        consts.put("workerCost", 10000);
        consts.put("startingMoney", dataStartingMoney);
        
        Map<String, Float> manager = new HashMap<>();
        manager.put("pay", (float) 40);
        manager.put("counter", (float) 8);
        manager.put("work", (float) 16);
        manager.put("interval", (float) 0.5);
        manager.put("penalty", (float) 100);
        Map<String, Float> director = new HashMap<>();
        director.put("pay", (float) 60);
        director.put("threshold", (float) 1);
        director.put("distribute", (float) 24);
        director.put("check", (float) 1);
        director.put("interval", (float) 0.5833);
        
        Map<String, Float> appleBoards = new HashMap<>();
        appleBoards.put("pay", (float) (20));
        appleBoards.put("rate", (float) (0.5));
        appleBoards.put("cap", (float) (25));
        appleBoards.put("workers", (float) (dataAppleBoardsWorkers));
        Map<String, Float> appleCpus = new HashMap<>();
        appleCpus.put("pay", (float) (26));
        appleCpus.put("rate", (float) (0.5));
        appleCpus.put("cap", (float) (20));
        appleCpus.put("workers", (float) (dataAppleCpuWorkers));
        Map<String, Float> appleRams = new HashMap<>();
        appleRams.put("pay", (float) (40));
        appleRams.put("rate", (float) (3));
        appleRams.put("cap", (float) (55));
        appleRams.put("workers", (float) (dataAppleRamWorkers));
        Map<String, Float> appleSupplies = new HashMap<>();
        appleSupplies.put("pay", (float) (16));
        appleSupplies.put("rate", (float) (3));
        appleSupplies.put("cap", (float) (35));
        appleSupplies.put("workers", (float) (dataAppleSupplyWorkers));
        Map<String, Float> appleGpus = new HashMap<>();
        appleGpus.put("pay", (float) (34));
        appleGpus.put("rate", (float) (0.3333));
        appleGpus.put("cap", (float) (10));
        appleGpus.put("workers", (float) (dataAppleGpuWorkers));
        Map<String, Float> applePComputers = new HashMap<>();
        applePComputers.put("pay", (float) (50));
        applePComputers.put("rate", (float) (0.5));
        applePComputers.put("cap", (float) (-1));
        applePComputers.put("workers", (float) (dataAppleComputerWorkers));
     
        Map<String, Map> appleProductions = new HashMap<>();
        appleProductions.put("board", appleBoards);
        appleProductions.put("cpu", appleCpus);
        appleProductions.put("ram", appleRams);
        appleProductions.put("supply", appleSupplies);
        appleProductions.put("gpu", appleGpus);
        appleProductions.put("computer", applePComputers); 
        
        Map<String, Integer> appleStandardRecipe = new HashMap<>();
        appleStandardRecipe.put("board", 2);
        appleStandardRecipe.put("cpu", 1);
        appleStandardRecipe.put("ram", 4);
        appleStandardRecipe.put("supply", 4);
        appleStandardRecipe.put("gpu", 0);
        appleStandardRecipe.put("batch", 5);
        appleStandardRecipe.put("price", 100000);
        Map<String, Map> appleStandard = new HashMap<>();
        appleStandard.put("recipe", appleStandardRecipe);
        Map<String, Integer> appleSpecialRecipe = new HashMap<>();
        appleSpecialRecipe.put("board", 2);
        appleSpecialRecipe.put("cpu", 1);
        appleSpecialRecipe.put("ram", 4);
        appleSpecialRecipe.put("supply", 4);
        appleSpecialRecipe.put("gpu", 2);
        appleSpecialRecipe.put("batch", 1);
        appleSpecialRecipe.put("price", 150000);
        Map<String, Map> appleSpecial = new HashMap<>();
        appleSpecial.put("recipe", appleSpecialRecipe);
        Map<String, Map> appleComputers = new HashMap<>();
        appleComputers.put("standard",appleStandard);
        appleComputers.put("special",appleSpecial);
        
        Map<String, Map> apple = new HashMap<>();
        apple.put("productions", appleProductions);
        apple.put("manager", manager);
        apple.put("director", director);
        apple.put("computers", appleComputers);
        
        Map<String, Float> dellBoards = new HashMap<>();
        dellBoards.put("pay", (float) (20));
        dellBoards.put("rate", (float) (0.5));
        dellBoards.put("cap", (float) (25));
        dellBoards.put("workers", (float) (dataDellBoardsWorkers));
        Map<String, Float> dellCpus = new HashMap<>();
        dellCpus.put("pay", (float) (26));
        dellCpus.put("rate", (float) (0.5));
        dellCpus.put("cap", (float) (20));
        dellCpus.put("workers", (float) (dataDellCpuWorkers));
        Map<String, Float> dellRams = new HashMap<>();
        dellRams.put("pay", (float) (40));
        dellRams.put("rate", (float) (3));
        dellRams.put("cap", (float) (55));
        dellRams.put("workers", (float) (dataDellRamWorkers));
        Map<String, Float> dellSupplies = new HashMap<>();
        dellSupplies.put("pay", (float) (16));
        dellSupplies.put("rate", (float) (3));
        dellSupplies.put("cap", (float) (35));
        dellSupplies.put("workers", (float) (dataDellSupplyWorkers));
        Map<String, Float> dellGpus = new HashMap<>();
        dellGpus.put("pay", (float) (34));
        dellGpus.put("rate", (float) (0.3333));
        dellGpus.put("cap", (float) (10));
        dellGpus.put("workers", (float) (dataDellGpuWorkers));
        Map<String, Float> dellPComputers = new HashMap<>();
        dellPComputers.put("pay", (float) (50));
        dellPComputers.put("rate", (float) (0.5));
        dellPComputers.put("cap", (float) (-1));
        dellPComputers.put("workers", (float) (dataDellComputerWorkers));
     
        Map<String, Map> dellProductions = new HashMap<>();
        dellProductions.put("board", dellBoards);
        dellProductions.put("cpu", dellCpus);
        dellProductions.put("ram", dellRams);
        dellProductions.put("supply", dellSupplies);
        dellProductions.put("gpu", dellGpus);
        dellProductions.put("computer", dellPComputers); 
        
        Map<String, Integer> dellStandardRecipe = new HashMap<>();
        dellStandardRecipe.put("board", 1);
        dellStandardRecipe.put("cpu", 5);
        dellStandardRecipe.put("ram", 6);
        dellStandardRecipe.put("supply", 5);
        dellStandardRecipe.put("gpu", 0);
        dellStandardRecipe.put("batch", 3);
        dellStandardRecipe.put("price", 80000);
        Map<String, Map> dellStandard = new HashMap<>();
        dellStandard.put("recipe", dellStandardRecipe);
        Map<String, Integer> dellSpecialRecipe = new HashMap<>();
        dellSpecialRecipe.put("board", 1);
        dellSpecialRecipe.put("cpu", 5);
        dellSpecialRecipe.put("ram", 6);
        dellSpecialRecipe.put("supply", 5);
        dellSpecialRecipe.put("gpu", 1);
        dellSpecialRecipe.put("batch", 1);
        dellSpecialRecipe.put("price", 120000);
        Map<String, Map> dellSpecial = new HashMap<>();
        dellSpecial.put("recipe", dellSpecialRecipe);
        Map<String, Map> dellComputers = new HashMap<>();
        dellComputers.put("standard",dellStandard);
        dellComputers.put("special",dellSpecial);
        
        Map<String, Map> dell = new HashMap<>();
        dell.put("productions", dellProductions);
        dell.put("manager", manager);
        dell.put("director", director);
        dell.put("computers", dellComputers);
 
        Map<String, Map> companies = new HashMap<>();
        companies.put("apple", apple); 
        companies.put("dell", dell);
        Map<String, Map> simulation = new HashMap<>();
        simulation.put("consts", consts); 
        simulation.put("companies", companies); 
        
        Map<String, Map> data = new HashMap<>();
        data.put("simulation", simulation);

        try (Writer writer = new FileWriter(file)) {
            System.out.println(gson.toJson(data));
            gson.toJson(data, writer);
        } catch (IOException e) {
        throw new RuntimeException(e);
        }
    }
}
