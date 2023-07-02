package fr.cyberdelta88.skywars.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.scoreboard.Team;

public class GuiClickEvent implements Listener {
    @EventHandler
    public void clickguievent(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();

        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard sb = manager.getMainScoreboard();

        Team blue = sb.getTeam("blue");
        Team red = sb.getTeam("red");
        Team green = sb.getTeam("green");
        Team purple = sb.getTeam("purple");
        Team yellow = sb.getTeam("yellow");
        Team white = sb.getTeam("white");


        if (e.getClickedInventory().getName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Team selector")) {
            switch (e.getCurrentItem().getItemMeta().getDisplayName()) {


                case "Red" :
                    p.sendMessage("You joined red team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.RED + " red " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "Blue" :
                    p.sendMessage("You joined red team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BLUE + " blue " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "Green" :
                    p.sendMessage("You joined green team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.GREEN + " green " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "Purple" :
                    p.sendMessage("You joined purple team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.LIGHT_PURPLE + " purple " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "Yellow" :
                    p.sendMessage("You joined yellow team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.YELLOW + " yellow " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "White" :
                    p.sendMessage("You joined white team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BOLD + " white " + ChatColor.RESET + "team");
                    p.closeInventory();
                    break;
            }

            e.setCancelled(true);
        }
    }

}
