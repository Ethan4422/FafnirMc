package me.ethan.combatandlevels.Config;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class CustomConfig {
    public String PluginName = "CNL";

    public void playerConfig(Player player) {
        File f = new File("plugins/CNL/PlayerData/" + player.getName()+ "-" + player.getUniqueId() + ".yml");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        yml.addDefault("Name", player.getName());
        yml.addDefault("Rank", 0);
        yml.addDefault("Level", 0);
        yml.addDefault("Exp", 0);
        yml.options().copyDefaults(true);
        try {
            yml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void savePlayerData(Player player){
        File f = new File("plugins/"+PluginName+"/PlayerData/"+ player.getName()+ "-" + player.getUniqueId() + ".yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        try {
            yml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reloadPlayerData(Player player){
        File f = new File("plugins/"+PluginName+"/PlayerData/" + player.getName()+ "-" + player.getUniqueId() + ".yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
    }
    public int getRank(Player player){
        File f = new File("plugins/"+PluginName+"/PlayerData/" + player.getName()+ "-" + player.getUniqueId() + ".yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        return yml.getInt("Rank");
    }

    public int getLevel(Player player){
        File f = new File("plugins/"+PluginName+"/PlayerData/" + player.getName()+ "-" + player.getUniqueId() + ".yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        return yml.getInt("Level");
    }

    public void setLevel(Player player,int rank) {
        File f = new File("plugins/"+PluginName+"/PlayerData/" + player.getName() + "-" + player.getUniqueId() + ".yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        yml.set("Level", rank);
        try {
            yml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setRank(Player player,int rank) {
        File f = new File("plugins/"+PluginName+"/PlayerData/" + player.getName() + "-" + player.getUniqueId() + ".yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        yml.set("Rank", rank);
        try {
            yml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public int getExp(Player player){
        File f = new File("plugins/"+PluginName+"/PlayerData/" + player.getName()+ "-" + player.getUniqueId() + ".yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        return yml.getInt("Exp");
    }

    public void setExp(Player player,int Exp) {
        File f = new File("plugins/"+PluginName+"/PlayerData/" + player.getName() + "-" + player.getUniqueId() + ".yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        yml.set("Exp", Exp);
        try {
            yml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
