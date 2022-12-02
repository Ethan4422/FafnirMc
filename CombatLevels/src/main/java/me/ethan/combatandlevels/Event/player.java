package me.ethan.combatandlevels.Event;

import me.ethan.combatandlevels.CombatAndLevels;
import me.ethan.combatandlevels.Config.CustomConfig;
import me.ethan.combatandlevels.Config.MobConfig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;


public class player implements Listener {

    CustomConfig config = new CustomConfig();
    MobConfig mobConfig = new MobConfig();
    CombatAndLevels plugin;

    public player(CombatAndLevels plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void join(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (player.hasPlayedBefore()) {
            config.playerConfig(player);
        }
    }

    @EventHandler
    public void killMob(EntityDeathEvent e){
        if(e.getEntity().getKiller() != null){
            Player Killer = (Player) e.getEntity().getKiller();
            String mobName = e.getEntity().getCustomName().substring(2);
            if(mobName.equalsIgnoreCase("goblin")){
                config.setExp(Killer, config.getExp(Killer) + mobConfig.get().getInt("Rarity.Common.Goblin.EXP"));
            }
            if(mobName.equalsIgnoreCase("kobold")){
                config.setExp(Killer, config.getExp(Killer) + mobConfig.get().getInt("Rarity.Uncommon.Kobold.EXP"));
            }
            else {
                Killer.sendMessage(mobName);
            }
        }
    }
}
