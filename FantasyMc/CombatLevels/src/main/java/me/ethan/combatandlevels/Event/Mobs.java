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

public class Mobs implements Listener {

    CombatAndLevels plugin;
    public Mobs(CombatAndLevels plugin){this.plugin = plugin;}

    @EventHandler
    public void death(EntityDeathEvent e) {
        if(e.getEntity().getType() != EntityType.PLAYER) {
            e.setDroppedExp(functions.number(e.getEntity().getName()));
        }
    }

    @EventHandler
    public void attack(EntityDamageByEntityEvent e) {
        if (e.getDamager().getType() != EntityType.PLAYER) {
            Entity entity = e.getDamager();
            if (entity.isCustomNameVisible()) {
                int dmg = functions.number(entity.getName()) / 8;
                e.setDamage(Math.floor(e.getDamage()) + dmg);
                e.getEntity().sendMessage(String.valueOf(e.getFinalDamage()));
            }
        }
        if (e.getDamager().getType() == EntityType.PLAYER) {
            Player player = (Player) e.getDamager();
            int dmg = functions.number(String.valueOf(player.getLevel())) / 8;
            e.setDamage(Math.floor(e.getDamage() + dmg));
            player.sendMessage(String.valueOf(e.getFinalDamage()));
        }
    }


    @EventHandler
    public void spawn(CreatureSpawnEvent e){
        functions.Zombie(e.getEntity());
        functions.Pig(e.getEntity());
        functions.Cow(e.getEntity());
        functions.Sheep(e.getEntity());
        functions.Phantom(e.getEntity());
        functions.Skeleton(e.getEntity());
        functions.Wolf(e.getEntity());
    }
}
