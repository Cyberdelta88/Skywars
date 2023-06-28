package fr.cyberdelta88.skywars;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "The skywars plugin was succesfully launched \n" +
                ChatColor.LIGHT_PURPLE + "Thank you for using this plugin");
    }

    @Override
    public void onDisable() {
        //on disable
    }
}
