package me.ethan.combatandlevels.Config;

import me.ethan.combatandlevels.CombatAndLevels;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class MobConfig {

    public MobConfig(){this.plugin = plugin;}
    public String PluginName = "CNL";
    CombatAndLevels plugin;
    public void MobDataStorage() {
        File f = new File("plugins/"+PluginName+"/MobData.yml");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        //Common
        yml.set("Rarity.Common.Goblin.EXP", 5);
        yml.set("Rarity.Common.Goblin.MinLevel", 3);
        yml.set("Rarity.Common.Goblin.MaxLevel", 10);

        yml.set("Rarity.Common.Pig.EXP", 4);

        yml.set("Rarity.Common.Sheep.EXP", 4);

        yml.set("Rarity.Common.Cow.EXP", 5);

        yml.set("Rarity.Common.Wolf.EXP", 6);

        yml.set("Rarity.Common.Boar.EXP", 8);

        //Uncommon
        yml.set("Rarity.Uncommon.Kobold.EXP", 17);

        yml.set("Rarity.Uncommon.HobGoblin.EXP", 24);
        //Rare
        yml.set("Rarity.Rare.Orc.EXP", 47);

        yml.set("Rarity.Rare.Phantom.EXP", 56);
        //Epic

        //Legendary
        yml.set("Rarity.Rare.ShadowWolf.EXP", 254);


        yml.options().copyDefaults(true);
        try {
            yml.save(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public FileConfiguration get() {
        File f = new File("plugins/"+ PluginName +"/MobData.yml");
        YamlConfiguration yml = YamlConfiguration.loadConfiguration(f);
        return yml;
    }
}