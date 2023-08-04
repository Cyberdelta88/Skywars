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
                    
                    if (checkredteam(p) == true) {
                        red.getEntries().remove(p);
                        p.sendMessage("You leaved red team");
                    } else if (checkblueteam(p) == true) {
                        blue.getEntries().remove(p);
                        red.addPlayer(p);
                        p.sendMessage("You joined red team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.RED + " RED " + ChatColor.WHITE + "team");
                    } else if (checkgreenteam(p) == true) {
                        green.getEntries().remove(p);
                        red.addPlayer(p);
                        p.sendMessage("You joined red team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.RED + " RED " + ChatColor.WHITE + "team");
                    } else if (checkpurpleteam(p) == true) {
                        purple.getEntries().remove(p);
                        red.addPlayer(p);
                        p.sendMessage("You joined red team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.RED + " RED " + ChatColor.WHITE + "team");
                    } else if (checkyellowteam(p) == true) {
                        yellow.getEntries().remove(p);
                        red.addPlayer(p);
                        p.sendMessage("You joined red team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.RED + " RED " + ChatColor.WHITE + "team");
                    } else if (checkwhiteteam(p) == true) {
                        white.getEntries().remove(p);
                        red.addPlayer(p);
                        p.sendMessage("You joined red team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.RED + " RED " + ChatColor.WHITE + "team");
                    } else {
                        red.addPlayer(p);
                        p.sendMessage("You joined red team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.RED + " RED " + ChatColor.WHITE + "team");
                    }


                    p.closeInventory();
                    break;

                case "Blue" :

                    if (checkblueteam(p) == true) {
                        red.getEntries().remove(p);
                        p.sendMessage("You leaved blue team");
                    } else if (checkredteam(p) == true) {
                        red.getEntries().remove(p);
                        blue.addPlayer(p);
                        p.sendMessage("You joined blue team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BLUE + " BLUE " + ChatColor.WHITE + "team");
                    } else if (checkgreenteam(p) == true) {
                        green.getEntries().remove(p);
                        blue.addPlayer(p);
                        p.sendMessage("You joined blue team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BLUE + " BLUE " + ChatColor.WHITE + "team");
                    } else if (checkpurpleteam(p) == true) {
                        purple.getEntries().remove(p);
                        blue.addPlayer(p);
                        p.sendMessage("You joined blue team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BLUE + " BLUE " + ChatColor.WHITE + "team");
                    } else if (checkyellowteam(p) == true) {
                        yellow.getEntries().remove(p);
                        blue.addPlayer(p);
                        p.sendMessage("You joined blue team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BLUE + " BLUE " + ChatColor.WHITE + "team");
                    } else if (checkwhiteteam(p) == true) {
                        white.getEntries().remove(p);
                        blue.addPlayer(p);
                        p.sendMessage("You joined blue team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BLUE + " BLUE " + ChatColor.WHITE + "team");
                    } else {
                        blue.addPlayer(p);
                        p.sendMessage("You joined blue team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BLUE + " BLUE " + ChatColor.WHITE + "team");
                    }


                    p.closeInventory();
                    break;

                case "Green" :

                    if (checkgreenteam(p) == true) {
                        green.getEntries().remove(p);
                        p.sendMessage("You leaved green team");
                    } else if (checkblueteam(p) == true) {
                        blue.getEntries().remove(p);
                        green.addPlayer(p);
                        p.sendMessage("You joined green team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.GREEN + " GREEN " + ChatColor.WHITE + "team");;
                    } else if (checkredteam(p) == true) {
                        red.getEntries().remove(p);
                        green.addPlayer(p);
                        p.sendMessage("You joined green team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.GREEN + " GREEN " + ChatColor.WHITE + "team");
                    } else if (checkpurpleteam(p) == true) {
                        purple.getEntries().remove(p);
                        green.addPlayer(p);
                        p.sendMessage("You joined green team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.GREEN + " GREEN " + ChatColor.WHITE + "team");
                    } else if (checkyellowteam(p) == true) {
                        yellow.getEntries().remove(p);
                        green.addPlayer(p);
                        p.sendMessage("You joined green team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.GREEN + " GREEN " + ChatColor.WHITE + "team");
                    } else if (checkwhiteteam(p) == true) {
                        white.getEntries().remove(p);
                        green.addPlayer(p);
                        p.sendMessage("You joined green team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.GREEN + " GREEN " + ChatColor.WHITE + "team");;
                    } else {
                        green.addPlayer(p);
                        p.sendMessage("You joined green team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.GREEN + " GREEN " + ChatColor.WHITE + "team");;
                    }


                    p.closeInventory();
                    break;

                case "Purple" :

                    if (checkpurpleteam(p) == true) {
                        purple.getEntries().remove(p);
                        p.sendMessage("You leaved purple team");
                    } else if (checkblueteam(p) == true) {
                        blue.getEntries().remove(p);
                        purple.addPlayer(p);
                        p.sendMessage("You joined purple team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.LIGHT_PURPLE + " PURPLE " + ChatColor.WHITE + "team");
                    } else if (checkgreenteam(p) == true) {
                        green.getEntries().remove(p);
                        purple.addPlayer(p);
                        p.sendMessage("You joined purple team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.LIGHT_PURPLE + " PURPLE " + ChatColor.WHITE + "team");
                    } else if (checkredteam(p) == true) {
                        red.getEntries().remove(p);
                        purple.addPlayer(p);
                        p.sendMessage("You joined purple team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.LIGHT_PURPLE + " PURPLE " + ChatColor.WHITE + "team");
                    } else if (checkyellowteam(p) == true) {
                        yellow.getEntries().remove(p);
                        purple.addPlayer(p);
                        p.sendMessage("You joined purple team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.LIGHT_PURPLE + " PURPLE " + ChatColor.WHITE + "team");
                    } else if (checkwhiteteam(p) == true) {
                        white.getEntries().remove(p);
                        purple.addPlayer(p);
                        p.sendMessage("You joined purple team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.LIGHT_PURPLE + " PURPLE " + ChatColor.WHITE + "team");
                    } else {
                        purple.addPlayer(p);
                        p.sendMessage("You joined purple team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.LIGHT_PURPLE + " PURPLE " + ChatColor.WHITE + "team");
                    }


                    p.closeInventory();
                    break;

                case "Yellow" :

                    if (checkyellowteam(p) == true) {
                        yellow.getEntries().remove(p);
                        p.sendMessage("You leaved yellow team");
                    } else if (checkblueteam(p) == true) {
                        blue.getEntries().remove(p);
                        yellow.addPlayer(p);
                        p.sendMessage("You joined yellow team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.YELLOW + " YELLOW " + ChatColor.WHITE + "team");
                    } else if (checkgreenteam(p) == true) {
                        green.getEntries().remove(p);
                        yellow.addPlayer(p);
                        p.sendMessage("You joined yellow team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.YELLOW + " YELLOW " + ChatColor.WHITE + "team");
                    } else if (checkpurpleteam(p) == true) {
                        purple.getEntries().remove(p);
                        yellow.addPlayer(p);
                        p.sendMessage("You joined yellow team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.YELLOW + " YELLOW " + ChatColor.WHITE + "team");
                    } else if (checkredteam(p) == true) {
                        red.getEntries().remove(p);
                        yellow.addPlayer(p);
                        p.sendMessage("You joined yellow team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.YELLOW + " YELLOW " + ChatColor.WHITE + "team");
                    } else if (checkwhiteteam(p) == true) {
                        white.getEntries().remove(p);
                        yellow.addPlayer(p);
                        p.sendMessage("You joined yellow team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.YELLOW + " YELLOW " + ChatColor.WHITE + "team");
                    } else {
                        yellow.addPlayer(p);
                        p.sendMessage("You joined yellow team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.YELLOW + " YELLOW " + ChatColor.WHITE + "team");;
                    }


                    p.closeInventory();
                    break;

                case "White" :

                    if (checkwhiteteam(p) == true) {
                        white.getEntries().remove(p);
                        p.sendMessage("You leaved white team");
                    } else if (checkblueteam(p) == true) {
                        blue.getEntries().remove(p);
                        white.addPlayer(p);
                        p.sendMessage("You joined white team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BOLD + " WHITE " + ChatColor.RESET + "team");
                    } else if (checkgreenteam(p) == true) {
                        green.getEntries().remove(p);
                        white.addPlayer(p);
                        p.sendMessage("You joined white team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BOLD + " WHITE " + ChatColor.RESET + "team");
                    } else if (checkpurpleteam(p) == true) {
                        purple.getEntries().remove(p);
                        white.addPlayer(p);
                        p.sendMessage("You joined white team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BOLD + " WHITE " + ChatColor.RESET + "team");
                    } else if (checkyellowteam(p) == true) {
                        yellow.getEntries().remove(p);
                        white.addPlayer(p);
                        p.sendMessage("You joined white team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BOLD + " WHITE " + ChatColor.RESET + "team");
                    } else if (checkredteam(p) == true) {
                        red.getEntries().remove(p);
                        white.addPlayer(p);
                        p.sendMessage("You joined white team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BOLD + " WHITE " + ChatColor.RESET + "team");
                    } else {
                        white.addPlayer(p);
                        p.sendMessage("You joined white team");
                        Bukkit.broadcastMessage(p.getName() + " joined" + ChatColor.BOLD + " WHITE " + ChatColor.RESET + "team");
                    }


                    p.closeInventory();
                    break;
            }

            e.setCancelled(true);
        }
    }

}
