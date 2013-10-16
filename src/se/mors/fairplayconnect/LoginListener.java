package se.mors.fairplayconnect;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerLoginEvent;

public class LoginListener implements Listener {
    public LoginListener(FairPlayConnect plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

	@EventHandler(priority = EventPriority.HIGH)
    public void highLogin(PlayerLoginEvent event) {
		Player player = event.getPlayer( );
		String country = geo.getCountry(player.getAddress().getAddress()).getName();
    }
}
