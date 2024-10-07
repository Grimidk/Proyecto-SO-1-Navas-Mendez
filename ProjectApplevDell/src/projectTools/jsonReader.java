/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectTools;
import projectClasses.*;

import com.google.gson.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author juanmendezl
 */
public class JsonReader {
    public static String reader(String file, String name) {
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
                    JsonObject dataProductions = dataSimulation.getAsJsonObject("productions");
                        JsonObject dataBoards = dataProductions.getAsJsonObject("board");
                            int dataBoardsPay = dataBoards.getAsJsonPrimitive("pay").getAsInt();
                            double dataBoardsRate = dataBoards.getAsJsonPrimitive("rate").getAsDouble();
                            double dataBoardsCap = dataBoards.getAsJsonPrimitive("cap").getAsDouble();
                            int dataBoardsWorkers = dataBoards.getAsJsonPrimitive("workers").getAsInt();
                        JsonObject dataCpu = dataProductions.getAsJsonObject("cpu");
                            int dataCpuPay = dataCpu.getAsJsonPrimitive("pay").getAsInt();
                            double dataCpuRate = dataCpu.getAsJsonPrimitive("rate").getAsDouble();
                            double dataCpuCap = dataCpu.getAsJsonPrimitive("cap").getAsDouble();
                            int dataCpuWorkers = dataCpu.getAsJsonPrimitive("workers").getAsInt();
                        JsonObject dataRam = dataProductions.getAsJsonObject("ram");
                            int dataRamPay = dataRam.getAsJsonPrimitive("pay").getAsInt();
                            double dataRamRate = dataRam.getAsJsonPrimitive("rate").getAsDouble();
                            double dataRamCap = dataRam.getAsJsonPrimitive("cap").getAsDouble();
                            int dataRamWorkers = dataRam.getAsJsonPrimitive("workers").getAsInt();
                        JsonObject dataSupply = dataProductions.getAsJsonObject("supply");
                            int dataSupplyPay = dataSupply.getAsJsonPrimitive("pay").getAsInt();
                            double dataSupplyRate = dataSupply.getAsJsonPrimitive("rate").getAsDouble();
                            double dataSupplyCap = dataSupply.getAsJsonPrimitive("cap").getAsDouble();
                            int dataSupplyWorkers = dataSupply.getAsJsonPrimitive("workers").getAsInt();
                        JsonObject dataGpu = dataProductions.getAsJsonObject("gpu");
                            int dataGpuPay = dataGpu.getAsJsonPrimitive("pay").getAsInt();
                            double dataGpuRate = dataGpu.getAsJsonPrimitive("rate").getAsDouble();
                            double dataGpuCap = dataGpu.getAsJsonPrimitive("cap").getAsDouble();
                            int dataGpuWorkers = dataGpu.getAsJsonPrimitive("workers").getAsInt();
                        JsonObject dataComputer = dataProductions.getAsJsonObject("computer");  
                            int dataComputerPay = dataComputer.getAsJsonPrimitive("pay").getAsInt();
                            double dataComputerRate = dataComputer.getAsJsonPrimitive("rate").getAsDouble();
                            double dataComputerCap = dataComputer.getAsJsonPrimitive("cap").getAsDouble();
                            int dataComputerWorkers = dataComputer.getAsJsonPrimitive("workers").getAsInt();
                    JsonObject dataManager = dataSimulation.getAsJsonObject("manager");
                        int dataManagerPay = dataManager.getAsJsonPrimitive("pay").getAsInt();
                        int dataManagerCounter = dataManager.getAsJsonPrimitive("counter").getAsInt();
                        int dataManagerWork = dataManager.getAsJsonPrimitive("work").getAsInt();
                        double dataManagerInterval = dataManager.getAsJsonPrimitive("interval").getAsDouble();
                        int dataManagerPenalty = dataManager.getAsJsonPrimitive("penalty").getAsInt();
                    JsonObject dataDirector = dataSimulation.getAsJsonObject("director");
                        int dataDirectorPay = dataDirector.getAsJsonPrimitive("pay").getAsInt();
                        int dataDirectorThreshold = dataDirector.getAsJsonPrimitive("threshold").getAsInt();
                        int dataDirectorDistribute = dataDirector.getAsJsonPrimitive("distribute").getAsInt();
                        double dataDirectorInterval = dataDirector.getAsJsonPrimitive("interval").getAsDouble();
                        int dataDirectorCheck = dataDirector.getAsJsonPrimitive("check").getAsInt();
                JsonObject dataCompanies = data.getAsJsonObject("companies");
                    JsonObject dataApple = dataCompanies.getAsJsonObject("apple");
                        String dataAppleName = dataApple.getAsJsonPrimitive("name").getAsString();
                        JsonObject dataAppleStandard = dataApple.getAsJsonObject("standard");
                            JsonObject dataAppleStandardRecipe = dataAppleStandard.getAsJsonObject("recipe");
                                int dataAppleStandardRecipeBoard = dataAppleStandardRecipe.getAsJsonPrimitive("board").getAsInt();
                                int dataAppleStandardRecipeCpu = dataAppleStandardRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                int dataAppleStandardRecipeRam = dataAppleStandardRecipe.getAsJsonPrimitive("ram").getAsInt();
                                int dataAppleStandardRecipeSupply = dataAppleStandardRecipe.getAsJsonPrimitive("supply").getAsInt();
                                int dataAppleStandardRecipeGpu = dataAppleStandardRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                int dataAppleStandardRecipeBatch = dataAppleStandardRecipe.getAsJsonPrimitive("batch").getAsInt();
                            int dataAppleStandardPrice = dataAppleStandard.getAsJsonPrimitive("price").getAsInt();
                        JsonObject dataAppleSpecial = dataApple.getAsJsonObject("special");
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
                        JsonObject dataDellStandard = dataDell.getAsJsonObject("standard");
                            JsonObject dataDellStandardRecipe = dataDellStandard.getAsJsonObject("recipe");
                                int dataDellStandardRecipeBoard = dataDellStandardRecipe.getAsJsonPrimitive("board").getAsInt();
                                int dataDellStandardRecipeCpu = dataDellStandardRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                int dataDellStandardRecipeRam = dataDellStandardRecipe.getAsJsonPrimitive("ram").getAsInt();
                                int dataDellStandardRecipeSupply = dataDellStandardRecipe.getAsJsonPrimitive("supply").getAsInt();
                                int dataDellStandardRecipeGpu = dataDellStandardRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                int dataDellStandardRecipeBatch = dataDellStandardRecipe.getAsJsonPrimitive("batch").getAsInt();
                            int dataDellStandardPrice = dataDellStandard.getAsJsonPrimitive("price").getAsInt();
                        JsonObject dataDellSpecial = dataDell.getAsJsonObject("special");
                            JsonObject dataDellSpecialRecipe = dataDellSpecial.getAsJsonObject("recipe");
                                int dataDellSpecialRecipeBoard = dataDellSpecialRecipe.getAsJsonPrimitive("board").getAsInt();
                                int dataDellSpecialRecipeCpu = dataDellSpecialRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                int dataDellSpecialRecipeRam = dataDellSpecialRecipe.getAsJsonPrimitive("ram").getAsInt();
                                int dataDellSpecialRecipeSupply = dataDellSpecialRecipe.getAsJsonPrimitive("supply").getAsInt();
                                int dataDellSpecialRecipeGpu = dataDellSpecialRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                int dataDellSpecialRecipeBatch = dataDellSpecialRecipe.getAsJsonPrimitive("batch").getAsInt();
                            int dataDellSpecialPrice = dataDellSpecial.getAsJsonPrimitive("price").getAsInt();
                    JsonObject dataMsi = dataCompanies.getAsJsonObject("msi");
                        String dataMsiName = dataMsi.getAsJsonPrimitive("name").getAsString();
                        JsonObject dataMsiStandard = dataMsi.getAsJsonObject("standard");
                            JsonObject dataMsiStandardRecipe = dataMsiStandard.getAsJsonObject("recipe");
                                int dataMsiStandardRecipeBoard = dataMsiStandardRecipe.getAsJsonPrimitive("board").getAsInt();
                                int dataMsiStandardRecipeCpu = dataMsiStandardRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                int dataMsiStandardRecipeRam = dataMsiStandardRecipe.getAsJsonPrimitive("ram").getAsInt();
                                int dataMsiStandardRecipeSupply = dataMsiStandardRecipe.getAsJsonPrimitive("supply").getAsInt();
                                int dataMsiStandardRecipeGpu = dataMsiStandardRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                int dataMsiStandardRecipeBatch = dataMsiStandardRecipe.getAsJsonPrimitive("batch").getAsInt();
                            int dataMsiStandardPrice = dataMsiStandard.getAsJsonPrimitive("price").getAsInt();
                        JsonObject dataMsiSpecial = dataMsi.getAsJsonObject("special");
                            JsonObject dataMsiSpecialRecipe = dataMsiSpecial.getAsJsonObject("recipe");
                                int dataMsiSpecialRecipeBoard = dataMsiSpecialRecipe.getAsJsonPrimitive("board").getAsInt();
                                int dataMsiSpecialRecipeCpu = dataMsiSpecialRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                int dataMsiSpecialRecipeRam = dataMsiSpecialRecipe.getAsJsonPrimitive("ram").getAsInt();
                                int dataMsiSpecialRecipeSupply = dataMsiSpecialRecipe.getAsJsonPrimitive("supply").getAsInt();
                                int dataMsiSpecialRecipeGpu = dataMsiSpecialRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                int dataMsiSpecialRecipeBatch = dataMsiSpecialRecipe.getAsJsonPrimitive("batch").getAsInt();
                            int dataMsiSpecialPrice = dataMsiSpecial.getAsJsonPrimitive("price").getAsInt();
                    JsonObject dataHp = dataCompanies.getAsJsonObject("hp");
                        String dataHpName = dataHp.getAsJsonPrimitive("name").getAsString();
                        JsonObject dataHpStandard = dataHp.getAsJsonObject("standard");
                            JsonObject dataHpStandardRecipe = dataHpStandard.getAsJsonObject("recipe");
                                int dataHpStandardRecipeBoard = dataHpStandardRecipe.getAsJsonPrimitive("board").getAsInt();
                                int dataHpStandardRecipeCpu = dataHpStandardRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                int dataHpStandardRecipeRam = dataHpStandardRecipe.getAsJsonPrimitive("ram").getAsInt();
                                int dataHpStandardRecipeSupply = dataHpStandardRecipe.getAsJsonPrimitive("supply").getAsInt();
                                int dataHpStandardRecipeGpu = dataHpStandardRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                int dataHpStandardRecipeBatch = dataHpStandardRecipe.getAsJsonPrimitive("batch").getAsInt();
                            int dataHpStandardPrice = dataHpStandard.getAsJsonPrimitive("price").getAsInt();
                        JsonObject dataHpSpecial = dataHp.getAsJsonObject("special");
                            JsonObject dataHpSpecialRecipe = dataHpSpecial.getAsJsonObject("recipe");
                                int dataHpSpecialRecipeBoard = dataHpSpecialRecipe.getAsJsonPrimitive("board").getAsInt();
                                int dataHpSpecialRecipeCpu = dataHpSpecialRecipe.getAsJsonPrimitive("cpu").getAsInt();
                                int dataHpSpecialRecipeRam = dataHpSpecialRecipe.getAsJsonPrimitive("ram").getAsInt();
                                int dataHpSpecialRecipeSupply = dataHpSpecialRecipe.getAsJsonPrimitive("supply").getAsInt();
                                int dataHpSpecialRecipeGpu = dataHpSpecialRecipe.getAsJsonPrimitive("gpu").getAsInt();
                                int dataHpSpecialRecipeBatch = dataHpSpecialRecipe.getAsJsonPrimitive("batch").getAsInt();
                            int dataHpSpecialPrice = dataHpSpecial.getAsJsonPrimitive("price").getAsInt();
            
            Production boards = new Production("Boards", dataBoardsPay, dataBoardsRate, dataBoardsCap, dataBoardsWorkers);
            Production cpus = new Production("Cpus", dataCpuPay, dataCpuRate, dataCpuCap, dataCpuWorkers);
            Production rams = new Production("Rams", dataRamPay, dataRamRate, dataRamCap, dataRamWorkers);
            Production supplies = new Production("Supplies", dataSupplyPay, dataSupplyRate, dataSupplyCap, dataSupplyWorkers);
            Production gpus = new Production("Gpus", dataGpuPay, dataGpuRate, dataGpuCap, dataGpuWorkers);
            Production computers = new Production("Computers", dataComputerPay, dataComputerRate, dataComputerCap, dataComputerWorkers);
            Manager manager = new Manager(dataManagerPay, dataManagerCounter, dataManagerWork, dataManagerInterval,dataManagerPenalty);
//            Director director = new Director(dataDirectorPay,,dataDirectorThreshold,dataDirectorDistribute,,);

                    
            return gson.toJson(dataHpSpecialRecipeSupply);
        
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void writer(String path, Simulation simulation){
        Gson gson = new Gson();
    }
}
