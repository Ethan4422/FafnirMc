package me.ethan.combatandlevels.PlayerRunnables;

import me.ethan.combatandlevels.CombatAndLevels;
import me.ethan.combatandlevels.functions;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Health extends BukkitRunnable {

    CombatAndLevels plugin;
    public Health(CombatAndLevels plugin){this.plugin = plugin;}


    @Override
    public void run() {
        for(World w : Bukkit.getWorlds()){
            for(Entity e : w.getEntities()) {
                if(e.getType().equals(EntityType.PLAYER)) {
                    Player people = (Player) e;
                    if (people.getLevel() <= 200) {
                        people.setMaxHealth(functions.PHealth(people));
                    }
                }
                else{
                    if (e instanceof LivingEntity) {
                        if(!e.getName().equals("")) {
                            if (functions.number(e.getName()) <= 200) {
                                ((LivingEntity) e).setMaxHealth(functions.EHealth(e));
                            }
                        }
                    }
                }
            }
        }
    }
}
