package fr.cyberdelta88.skywars.listeners;

import fr.cyberdelta88.skywars.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.*;

public class Scoreboard implements Listener {

    Plugin pl = Main.getPlugin(Main.class);

    public void createscorenoard(Player p) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        org.bukkit.scoreboard.Scoreboard sb = manager.getMainScoreboard();


        if (sb.getTeams().contains("blue")) {
            Team blue = sb.getTeam("blue");
        } else {
            Team blue = sb.registerNewTeam("blue");
            blue.setPrefix(ChatColor.BLUE + " ");
        }

        if (sb.getTeams().contains("red")) {
            Team red = sb.getTeam("red");
        } else {
            Team red = sb.registerNewTeam("red");
            red.setPrefix(ChatColor.RED + " ");
        }

        if (sb.getTeams().contains("green")) {
            Team green = sb.getTeam("green");
        } else  {
            Team green = sb.registerNewTeam("green");
            green.setPrefix(ChatColor.GREEN + " ");
        }

        if (sb.getTeams().contains("purple")) {
            Team purple = sb.getTeam("purple");
        } else {
            Team purple = sb.registerNewTeam("purple");
            purple.setPrefix(ChatColor.LIGHT_PURPLE + " ");
        }

        if (sb.getTeams().contains("yellow")) {
            Team yellow = sb.getTeam("yellow");
        } else {
            Team yellow = sb.registerNewTeam("yellow");
            yellow.setPrefix(ChatColor.YELLOW + " ");
        }

        if (sb.getTeams().contains("white")) {
            Team white = sb.getTeam("white");
        } else {
            Team white = sb.registerNewTeam("white");
            white.setPrefix(ChatColor.WHITE + " ");
        }

        Objective obj = sb.registerNewObjective("Stats", "Dummy");
        obj.setDisplayName(ChatColor.DARK_AQUA + "Skywars");

        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        Score emptyscore = obj.getScore(" ");
        Score s2 = obj.getScore("Number of Player : " + pl.getConfig().getInt("playersremaining"));

        emptyscore.setScore(2);
        s2.setScore(1);

        p.setScoreboard(sb);
    }
}
