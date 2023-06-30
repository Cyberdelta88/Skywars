package fr.cyberdelta88.skywars.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiClickEvent implements Listener {
    @EventHandler
    public clickguievent(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();

    }

}
