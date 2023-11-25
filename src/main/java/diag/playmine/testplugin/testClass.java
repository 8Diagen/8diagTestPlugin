package diag.playmine.testplugin;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class testClass implements Listener {

    Map<String, Double> player2Balance = new Object2ObjectOpenHashMap<>();

    double a = 0;

    public testClass(){
        player2Balance.put("9Diagen", 100.0);
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        player2Balance.put("9Diagen", a++);
        Bukkit.getPlayer("9Diagen").sendMessage(player2Balance.get("9Diagen") + "");
    }

    public double getBalance(@NotNull String player) {
        return player2Balance.getOrDefault(player, 20.0);
    }
}
