package me.IgnoreList.ClearEnchant;

import org.bukkit.plugin.java.JavaPlugin;

public class ClearEnchant extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("ce").setExecutor(new ClearEnchantCommand());
    }

    @Override
    public void onDisable() {
    }

}
