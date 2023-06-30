package fr.cyberdelta88.skywars.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Cmdteam implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory gui = Bukkit.createInventory(p, 27, ChatColor.DARK_PURPLE + "Team selector");


            ItemStack blue = new ItemStack(Material.WOOL, 1, (byte)11);
            ItemMeta bluemeta = blue.getItemMeta();
            bluemeta.setDisplayName("Blue");
            ArrayList<String> bluelore = new ArrayList();
            bluelore.add("Join the blue team");
            bluemeta.setLore(bluelore);
            blue.setItemMeta(bluemeta);

            ItemStack red = new ItemStack(Material.WOOL, 1, (byte)14);
            ItemMeta redmeta = red.getItemMeta();
            redmeta.setDisplayName("Red");
            ArrayList<String> redlore = new ArrayList();
            redlore.add("Join the red team");
            redmeta.setLore(redlore);
            red.setItemMeta(redmeta);

            ItemStack green = new ItemStack(Material.WOOL, 1, (byte)13);
            ItemMeta greenmeta = green.getItemMeta();
            greenmeta.setDisplayName("Green");
            ArrayList<String> greenlore = new ArrayList();
            greenlore.add("Join the green team");
            greenmeta.setLore(greenlore);
            green.setItemMeta(greenmeta);

            ItemStack purple = new ItemStack(Material.WOOL, 1, (byte)10);
            ItemMeta purplemeta = purple.getItemMeta();
            purplemeta.setDisplayName("Purple");
            ArrayList<String> purplelore = new ArrayList();
            purplelore.add("Join the purple team");
            purplemeta.setLore(purplelore);
            purple.setItemMeta(purplemeta);

            ItemStack yellow = new ItemStack(Material.WOOL, 1, (byte)4);
            ItemMeta yellowmeta = yellow.getItemMeta();
            yellowmeta.setDisplayName("Yellow");
            ArrayList<String> yellowlore = new ArrayList();
            yellowlore.add("Join the yellow team");
            yellowmeta.setLore(yellowlore);
            yellow.setItemMeta(yellowmeta);

            ItemStack white = new ItemStack(Material.WOOL, 1, (byte)0);
            ItemMeta whitemeta = white.getItemMeta();
            whitemeta.setDisplayName("White");
            ArrayList<String> whitelore = new ArrayList();
            whitelore.add("Join the white team");
            whitemeta.setLore(whitelore);
            white.setItemMeta(whitemeta);




            gui.setItem(2, red);
            gui.setItem(1, blue);
            gui.setItem(3, green);
            gui.setItem(4, purple);
            gui.setItem(5, yellow);
            gui.setItem(6, white);


            p.openInventory(gui);
        }
        return false;
    }
}
