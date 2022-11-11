package me.ethan.combatandlevels.PlayerRunnables;

import me.ethan.combatandlevels.CombatAndLevels;
import me.ethan.combatandlevels.functions;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import static me.ethan.combatandlevels.functions.Level;
import static me.ethan.combatandlevels.functions.Speed;

public class Status extends BukkitRunnable {

    CombatAndLevels plugin;
    public Status(CombatAndLevels plugin){this.plugin = plugin;}
    @Override
    public void run() {
        for (Player people : Bukkit.getOnlinePlayers()){
            if(people.getLevel() < 90){
                people.setWalkSpeed((float) (Speed(people) + Math.floor(Level(people)) / 200));
            }
        }
    }
}
