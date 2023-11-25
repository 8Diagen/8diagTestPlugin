package diag.playmine.testplugin;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;


public final class TestPlugin extends JavaPlugin  {
    @Getter
    static TestPlugin instance;
    @Getter
    testClass tClass;

    @Override
    public void onEnable() {
        instance = this;
        tClass = new testClass();
        getServer().getPluginManager().registerEvents(tClass, this);
    }

    @Override
    public void onDisable() {

    }
}