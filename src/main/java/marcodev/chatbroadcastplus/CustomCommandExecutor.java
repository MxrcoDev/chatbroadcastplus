package marcodev.chatbroadcastplus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CustomCommandExecutor implements CommandExecutor {

    public String message;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Non puoi inviare un broadcast vuoto!");
            return true;
        } else {
            message = args[0];
            for(Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
            }
            return true;
        }
    }

}
