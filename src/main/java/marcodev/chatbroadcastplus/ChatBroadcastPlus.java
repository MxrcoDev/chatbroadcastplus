package marcodev.chatbroadcastplus;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatBroadcastPlus extends JavaPlugin {

    @Override
    public void onEnable() {

        getLogger().info("\u001B[33m-----------------------------------------------");
        getLogger().info(" ");
        getLogger().info("\u001B[33m                 ChatBroadcast v1.0");
        getLogger().info("\u001B[33m              Developed by MxrcoDev_!");
        getLogger().info(" ");
        getLogger().info("\u001B[32m                  Plugin abilitato! ");
        getLogger().info(" ");
        getLogger().info("\u001B[33m------------------------------------------------");

        getCommand("broadcast").setExecutor(new CustomCommandExecutor());
    }
}
