package me.llamositopia.plotplus;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class PlotPlus extends JavaPlugin{
  
  public void onEnable(){
    getLogger().info("PlotPlus is now enabled.");
  }
  
  public void onDisable(){
    getLogger().info("PlotPlus is now disabled.");
  }
  
  public ChunkGenerator getDefaultWorldGenerator(String worldName, String id){
    return new PlotGenerator();
  }
  
}
