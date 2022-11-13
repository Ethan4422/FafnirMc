package me.ethan.combatandlevels.Event;

import me.ethan.combatandlevels.CombatAndLevels;
import org.bukkit.event.Listener;


public class player implements Listener {

    CombatAndLevels plugin;

    public player(CombatAndLevels plugin) {
        this.plugin = plugin;
    }
}
