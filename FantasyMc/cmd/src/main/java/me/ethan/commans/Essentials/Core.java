package me.ethan.commans.Essentials;

import me.ethan.commans.Commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Core implements CommandExecutor {

    Commands plugin;
    public Core(Commands plugin){this.plugin = plugin;}

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            String cmd = args[0];
            switch(cmd.toLowerCase()){
                case "mob":

                    break;

            }
        }
        return false;
    }
}
