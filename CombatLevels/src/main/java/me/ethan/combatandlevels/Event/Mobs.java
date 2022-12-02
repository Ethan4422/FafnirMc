package me.ethan.combatandlevels.Event;

import me.ethan.combatandlevels.CombatAndLevels;
import me.ethan.combatandlevels.functions;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntitySpawnEvent;

import java.util.Random;

public class Mobs implements Listener {

    CombatAndLevels plugin;

    public Mobs(CombatAndLevels plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void spawn(CreatureSpawnEvent e){
        Entity entity= e.getEntity();
        Random random = new Random();
        if(entity.getType().equals(EntityType.ZOMBIE)) {
            if (1 + random.nextInt(50) <= 20) {
                entity.setCustomName("§7Goblin");
            } else if (1 + random.nextInt(50) <= 30) {
                entity.setCustomName("§aKobold");
            }
            else if (1 + random.nextInt(50) <= 40) {
                entity.setCustomName("§aHobgoblin");
            }
            else if (1 + random.nextInt(45) <= 44) {
                entity.setCustomName("§5Orc");
            }
        }
    }
}
