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
    ScoreboardManager manager = Bukkit.getScoreboardManager();
    Scoreboard sb = manager.getMainScoreboard();


    Team blue = sb.getTeam("blue");
    Team red = sb.getTeam("red");
    Team green = sb.getTeam("green");
    Team purple = sb.getTeam("purple");
    Team yellow = sb.getTeam("yellow");
    Team white = sb.getTeam("white");


    public boolean checkblueteam(Player z) {

        if (blue.getEntries().contains(z)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkredteam(Player z) {

        if (red.getEntries().contains(z)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkgreenteam(Player z) {

        if (green.getEntries().contains(z)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkpurpleteam(Player z) {

        if (purple.getEntries().contains(z)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkyellowteam(Player z) {

        if (yellow.getEntries().contains(z)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkwhiteteam(Player z) {

        if (white.getEntries().contains(z)) {
            return true;
        } else {
            return false;
        }
    }



    @EventHandler
    public void clickguievent(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();


        if (e.getClickedInventory().getName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Team selector")) {
            switch (e.getCurrentItem().getItemMeta().getDisplayName()) {


                case "Red" :
                    p.sendMessage("You joined red team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.RED + " RED " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "Blue" :
                    p.sendMessage("You joined red team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BLUE + " BLUE " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "Green" :
                    p.sendMessage("You joined green team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.GREEN + " GREEN " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "Purple" :
                    p.sendMessage("You joined purple team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.LIGHT_PURPLE + " PURPLE " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "Yellow" :
                    p.sendMessage("You joined yellow team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.YELLOW + " YELLOW " + ChatColor.WHITE + "team");
                    p.closeInventory();
                    break;

                case "White" :
                    p.sendMessage("You joined white team");
                    Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BOLD + " WHITE " + ChatColor.RESET + "team");
                    p.closeInventory();
                    break;
            }

            e.setCancelled(true);
        }
    }

}
