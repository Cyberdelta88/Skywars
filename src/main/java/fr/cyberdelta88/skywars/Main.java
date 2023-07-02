package fr.cyberdelta88.skywars;

import fr.cyberdelta88.skywars.command.Cmdteam;
import fr.cyberdelta88.skywars.listeners.GuiClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "The skywars plugin was succesfully launched \n" +
                ChatColor.LIGHT_PURPLE + "Thank you for using this plugin");


        this.getCommand("team").setExecutor(new Cmdteam());


        getServer().getPluginManager().registerEvents(new GuiClickEvent(), this);


        getServer().getScoreboardManager().getNewScoreboard();
    }

    @Override
    public void onDisable() {
        //on disable
    }
}
