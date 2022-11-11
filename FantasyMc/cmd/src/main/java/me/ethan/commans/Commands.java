package me.ethan.commans;

import me.ethan.commans.Essentials.Core;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commands extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginCommand("f").setExecutor((CommandExecutor) new Core(this));

    }

    @Override
    public void onDisable() {
    }
}
