package me.ethan.combatandlevels;

import me.ethan.combatandlevels.Commands.C;
import me.ethan.combatandlevels.Event.Mobs;
import me.ethan.combatandlevels.Event.events;
import me.ethan.combatandlevels.Event.player;
import me.ethan.combatandlevels.PlayerRunnables.Health;
import me.ethan.combatandlevels.PlayerRunnables.Status;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class CombatAndLevels extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents((Listener) new events(this),this);
        getServer().getPluginManager().registerEvents((Listener) new player(this),this);
        getServer().getPluginManager().registerEvents((Listener) new Mobs(this),this);
        Bukkit.getPluginCommand("C").setExecutor((CommandExecutor) new C(this));
        BukkitTask updS = new Status(this).runTaskTimer(this, 0, 20*1);
        BukkitTask updH = new Health(this).runTaskTimer(this, 0, 20*1);
    }

    @Override
    public void onDisable() {
    }
}
