package com.justinhwang.vanishplugin;

import com.justinhwang.vanishplugin.commands.VanishCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class VanishPlugin extends JavaPlugin {

    public FileConfiguration config;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();

        config = this.getConfig();

        getLogger().info("VanishPlugin has been enabled");

        getCommand("vanish").setExecutor(new VanishCommand(this));

    }
}
