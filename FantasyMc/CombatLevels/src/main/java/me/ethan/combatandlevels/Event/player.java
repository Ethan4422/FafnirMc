package me.ethan.combatandlevels.Event;

import me.ethan.combatandlevels.CombatAndLevels;
import me.ethan.combatandlevels.functions;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import static me.ethan.combatandlevels.functions.Level;


public class player implements Listener {

    CombatAndLevels plugin;

    public player(CombatAndLevels plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void join(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (player.getLevel() < 1) {
            player.setLevel(1);
        }
    }

    @EventHandler
    public void respawn(PlayerRespawnEvent e) {
        Player player = e.getPlayer();
        if (player.getLevel() < 1) {
            player.setLevel(1);
        }
    }

    @EventHandler
    public void pvp(PlayerDeathEvent e) {
        Player player = e.getPlayer();
        if (Level(player) / 3 >= 1) {
            player.setLevel(Level(player) / 3);
        }
    }
}
