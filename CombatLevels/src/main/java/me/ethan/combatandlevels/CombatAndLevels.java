package me.ethan.combatandlevels;

import me.ethan.combatandlevels.Commands.C;
import me.ethan.combatandlevels.Config.MobConfig;
import me.ethan.combatandlevels.Event.Mobs;
import me.ethan.combatandlevels.Event.events;
import me.ethan.combatandlevels.Event.player;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public final class CombatAndLevels extends JavaPlugin {

    MobConfig mobConfig = new MobConfig();
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents((Listener) new events(this),this);
        getServer().getPluginManager().registerEvents((Listener) new player(this),this);
        getServer().getPluginManager().registerEvents((Listener) new Mobs(this),this);
        Bukkit.getPluginCommand("C").setExecutor((CommandExecutor) new C(this));
        mobConfig.MobDataStorage();
    }

    @Override
    public void onDisable() {
    }
}
