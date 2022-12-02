package me.ethan.combatandlevels.Commands;

import me.ethan.combatandlevels.CombatAndLevels;
import me.ethan.combatandlevels.Config.MobConfig;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class C implements CommandExecutor {

    MobConfig mobConfig;
    CombatAndLevels plugin;
    public C(CombatAndLevels plugin){this.plugin = plugin;}
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            String cmd = args[0];
            String Mob;
            switch (cmd.toLowerCase()){
                case "summon":

                    break;
            }
        }
        return false;
    }
}
