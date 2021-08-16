package nobody.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;

import nobody.main.Main;

public class Death implements Listener {

	@EventHandler
	public void morrerx(PlayerDeathEvent e) {
		new BukkitRunnable() {

			public void run() {
				if (e.getEntity() instanceof Player) {
					e.getEntity().spigot().respawn();
				}

			}
		}.runTask(Main.plugin);
	}

}
