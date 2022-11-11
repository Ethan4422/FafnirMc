package me.ethan.combatandlevels.Commands;

import me.ethan.combatandlevels.CombatAndLevels;
import me.ethan.combatandlevels.functions;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class C implements CommandExecutor {

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
                    Mob = args[1];
                    switch (Mob.toLowerCase()){
                        case "shadow":
                            functions.ShadowPartner(player, Integer.parseInt(args[2]));
                            break;
                        case "ph":
                            break;
                    }

                    break;
                case "test":

                    break;
            }
        }
        return false;
    }
}
