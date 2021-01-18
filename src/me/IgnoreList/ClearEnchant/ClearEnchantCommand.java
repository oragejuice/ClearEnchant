package me.IgnoreList.ClearEnchant;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class ClearEnchantCommand implements CommandExecutor{

    public boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
        Player p = (Player) sender;
        int counter = 0;
        for(Enchantment enchantment : p.getItemInHand().getEnchantments().keySet()){
            counter++;
            p.getItemInHand().removeEnchantment(enchantment);
        }
        p.sendMessage( ChatColor.DARK_RED + "Removed " + ChatColor.WHITE + counter + ChatColor.DARK_RED + " Enchantments from your item" );
        return false;
    }

}
