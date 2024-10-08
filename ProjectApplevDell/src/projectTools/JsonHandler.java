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
                            String dataAppleName = dataApple.getAsJsonPrimitive("name").getAsString();
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
                                    int dataAppleStandardPrice = dataAppleStandard.getAsJsonPrimitive("price").getAsInt();
                                JsonObject dataAppleSpecial = dataAppleComputers.getAsJsonObject("special");
                                    JsonObject dataAppleSpecialRecipe = dataAppleSpecial.getAsJsonObject("recipe");
                                        int dataAppleSpecialRecipeBoard = dataAppleSpecialRecipe.getAsJsonPrimitive("board").getAsInt();
                                        int dataAppleSpecialRecipeCpu = dataAppleSpecialRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                        int dataAppleSpecialRecipeRam = dataAppleSpecialRecipe.getAsJsonPrimitive("ram").getAsInt();
                                        int dataAppleSpecialRecipeSupply = dataAppleSpecialRecipe.getAsJsonPrimitive("supply").getAsInt();
                                        int dataAppleSpecialRecipeGpu = dataAppleSpecialRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                        int dataAppleSpecialRecipeBatch = dataAppleSpecialRecipe.getAsJsonPrimitive("batch").getAsInt();
                                    int dataAppleSpecialPrice = dataAppleSpecial.getAsJsonPrimitive("price").getAsInt();

                        JsonObject dataDell = dataCompanies.getAsJsonObject("dell");
                            String dataDellName = dataDell.getAsJsonPrimitive("name").getAsString();
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
                                    int dataDellStandardPrice = dataDellStandard.getAsJsonPrimitive("price").getAsInt();
                                JsonObject dataDellSpecial = dataDellComputers.getAsJsonObject("special");
                                    JsonObject dataDellSpecialRecipe = dataDellSpecial.getAsJsonObject("recipe");
                                        int dataDellSpecialRecipeBoard = dataDellSpecialRecipe.getAsJsonPrimitive("board").getAsInt();
                                        int dataDellSpecialRecipeCpu = dataDellSpecialRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                        int dataDellSpecialRecipeRam = dataDellSpecialRecipe.getAsJsonPrimitive("ram").getAsInt();
                                        int dataDellSpecialRecipeSupply = dataDellSpecialRecipe.getAsJsonPrimitive("supply").getAsInt();
                                        int dataDellSpecialRecipeGpu = dataDellSpecialRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                        int dataDellSpecialRecipeBatch = dataDellSpecialRecipe.getAsJsonPrimitive("batch").getAsInt();
                                    int dataDellSpecialPrice = dataDellSpecial.getAsJsonPrimitive("price").getAsInt();

            if ("Apple".equals(name)){
                Computer standard = new Computer(false, dataAppleStandardRecipeBoard, dataAppleStandardRecipeCpu, dataAppleStandardRecipeRam, dataAppleStandardRecipeSupply, dataAppleStandardRecipeGpu, dataAppleStandardRecipeBatch, dataAppleStandardPrice);
                Computer special = new Computer(false, dataAppleSpecialRecipeBoard, dataAppleSpecialRecipeCpu, dataAppleSpecialRecipeRam, dataAppleSpecialRecipeSupply, dataAppleSpecialRecipeGpu, dataAppleSpecialRecipeBatch, dataAppleSpecialPrice);
                Production boards = new Production("Boards", dataAppleBoardsPay, dataAppleBoardsRate, dataAppleBoardsCap, dataAppleBoardsWorkers);
                Production cpus = new Production("Cpus", dataAppleCpuPay, dataAppleCpuRate, dataAppleCpuCap, dataAppleCpuWorkers);
                Production rams = new Production("Rams", dataAppleRamPay, dataAppleRamRate, dataAppleRamCap, dataAppleRamWorkers);
                Production supplies = new Production("Supplies", dataAppleSupplyPay, dataAppleSupplyRate, dataAppleSupplyCap, dataAppleSupplyWorkers);
                Production gpus = new Production("Gpus", dataAppleGpuPay, dataAppleGpuRate, dataAppleGpuCap, dataAppleGpuWorkers);
                Production computers = new Production("Computers", dataAppleComputerPay, dataAppleComputerRate, dataAppleComputerCap, dataAppleComputerWorkers);
                Manager manager = new Manager(dataAppleManagerPay, dataAppleManagerCounter, dataAppleManagerWork, dataAppleManagerInterval,dataAppleManagerPenalty);
                Director director = new Director(dataAppleDirectorPay,dataAppleDirectorThreshold,dataAppleDirectorDistribute);
                Company company = new Company(dataAppleName, director, manager, standard, special, boards, cpus, rams, supplies, gpus, computers);
                company.setMoney(dataStartingMoney);
                Simulation simulation = new Simulation(dataDeadline, dataTotalWorkers, dataWorkerCost, dataDuration, dataHours, company);
                return simulation;
            } else if ("Dell".equals(name)) {
                Computer standard = new Computer(false, dataDellStandardRecipeBoard, dataDellStandardRecipeCpu, dataDellStandardRecipeRam, dataDellStandardRecipeSupply, dataDellStandardRecipeGpu, dataDellStandardRecipeBatch, dataDellStandardPrice);
                Computer special = new Computer(false, dataDellSpecialRecipeBoard, dataDellSpecialRecipeCpu, dataDellSpecialRecipeRam, dataDellSpecialRecipeSupply, dataDellSpecialRecipeGpu, dataDellSpecialRecipeBatch, dataDellSpecialPrice);
                Production boards = new Production("Boards", dataDellBoardsPay, dataDellBoardsRate, dataDellBoardsCap, dataDellBoardsWorkers);
                Production cpus = new Production("Cpus", dataDellCpuPay, dataDellCpuRate, dataDellCpuCap, dataDellCpuWorkers);
                Production rams = new Production("Rams", dataDellRamPay, dataDellRamRate, dataDellRamCap, dataDellRamWorkers);
                Production supplies = new Production("Supplies", dataDellSupplyPay, dataDellSupplyRate, dataDellSupplyCap, dataDellSupplyWorkers);
                Production gpus = new Production("Gpus", dataDellGpuPay, dataDellGpuRate, dataDellGpuCap, dataDellGpuWorkers);
                Production computers = new Production("Computers", dataDellComputerPay, dataDellComputerRate, dataDellComputerCap, dataDellComputerWorkers);
                Manager manager = new Manager(dataDellManagerPay, dataDellManagerCounter, dataDellManagerWork, dataDellManagerInterval,dataDellManagerPenalty);
                Director director = new Director(dataDellDirectorPay,dataDellDirectorThreshold,dataDellDirectorDistribute);
                Company company = new Company(dataDellName, director, manager, standard, special, boards, cpus, rams, supplies, gpus, computers);
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
    
    public static void writer(String file, int dataDuration, int dataDeadline, int dataHours, int dataTotalWorkers, int dataWorkerCost, int dataStartingMoney, int dataAppleBoardsWorkers, int dataAppleCpuWorkers, int dataAppleRamWorkers, int dataAppleGpuWorkers, int dataAppleSupplyWorkers, int dataAppleComputerWorkers, int dataDellBoardsWorkers, int dataDellCpuWorkers, int dataDellRamWorkers, int dataDellGpuWorkers, int dataDellSupplyWorkers, int dataDellComputerWorkers){
        Gson gson = new Gson();

        AuxJson obj = new AuxJson(dataDuration, dataDeadline, dataHours, dataTotalWorkers, dataWorkerCost, dataStartingMoney, dataAppleBoardsWorkers, dataAppleCpuWorkers, dataAppleRamWorkers, dataAppleGpuWorkers, dataAppleSupplyWorkers, dataAppleComputerWorkers, dataDellBoardsWorkers, dataDellCpuWorkers, dataDellRamWorkers, dataDellGpuWorkers, dataDellSupplyWorkers, dataDellComputerWorkers);

        String json = gson.toJson(obj);
        
        try (Writer writer = new FileWriter(file)) {
            gson.toJson(json, writer);
        } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }
}
