package com.justinhwang.vanishplugin.commands;

import com.justinhwang.vanishplugin.VanishPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class VanishCommand implements CommandExecutor {
    private VanishPlugin plugin;

    public VanishCommand(VanishPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("you've called the vanish command!");
        return true;
    }
}
