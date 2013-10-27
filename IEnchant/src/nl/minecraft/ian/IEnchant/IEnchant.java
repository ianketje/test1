package nl.minecraft.ian.IEnchant;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class IEnchant extends JavaPlugin {

	String n = "IEnchant";

	public void onEnable() {
		Bukkit.getServer().getLogger()
				.info("[<" + n + ">] " + n + " is enabled!");
	}

	public void onDisable() {
		Bukkit.getServer().getLogger()
				.info("[<" + n + ">] " + n + " is disabled!");
	}

	@SuppressWarnings("unused")
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {

		Player p = (Player) sender;
		PlayerInventory pi = p.getInventory();

		ChatColor db = ChatColor.DARK_BLUE;
		ChatColor b = ChatColor.BLUE;
		ChatColor a = ChatColor.AQUA;
		ChatColor g = ChatColor.GREEN;

		String error = ChatColor.DARK_RED + "ERROR: " + ChatColor.RED;
		String errorp = error
				+ "You don't have permissions, If you think this isn't supposed to happen ask the staff on the server!";
		String errora = error
				+ "You have too many / not enough arguments, do /ienchant [command] for more info about the command!";

		/* IEnchant */
		if (cmd.getName().equalsIgnoreCase("ienchant")) {

			if (args.length == 0) {
				p.sendMessage(db + "-| IEnchant helping page. |-");
				p.sendMessage(b + "/IEnchant about - " + a
						+ "Information about the plugin");
				p.sendMessage(b + "/IEnchant commands - " + a
						+ "List of commands");
			} else if (args.length == 1) {
				if (args[0].equalsIgnoreCase("about")) {
					p.sendMessage(g
							+ "This plugin is developed by ian, I made this plugin because i wanted to try stuff with enchanting and stuffs :P Don't know what to say here :S... Lol... How are you doing? I'm doing great!");

				} else if (args[0].equalsIgnoreCase("commands")) {
					p.sendMessage(db + "-| IEnchant commands |-");
					p.sendMessage(b + "/GApple - " + a
							+ "Give's you ian's apple, use with caution...");
					p.sendMessage(b + "/GArmor - " + a
							+ "Give's you ian's god armor, very dangerous...");
				}
			}
		}

		/* Apple */

		if (cmd.getName().equalsIgnoreCase("gapple")) {
			if (p.hasPermission("ienchant.gapple")) {

				ItemStack apple = new ItemStack(Material.APPLE, 1);
				ItemMeta applem = apple.getItemMeta();

				applem.setDisplayName("" + ChatColor.RED + ChatColor.BOLD
						+ "Mr. Ian's apple");
				/*
				 * List<String> lore = applem.getLore();
				 * lore.add(ChatColor.DARK_RED + "Be carefull with this....");
				 * applem.setLore(lore);
				 */
				apple.setItemMeta(applem);

				apple.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 6969);
				apple.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 6969);
				apple.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 6969);
				apple.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 6969);
				apple.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6969);
				apple.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 6969);
				apple.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 6969);
				apple.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6969);
				apple.addUnsafeEnchantment(Enchantment.DURABILITY, 6969);
				apple.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 6969);
				apple.addUnsafeEnchantment(Enchantment.KNOCKBACK, 6969);
				apple.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 6969);
				apple.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6969);
				apple.addUnsafeEnchantment(Enchantment.OXYGEN, 6969);
				apple.addUnsafeEnchantment(
						Enchantment.PROTECTION_ENVIRONMENTAL, 6969);
				apple.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS,
						6969);
				apple.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 6969);
				apple.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6969);
				apple.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE,
						6969);
				apple.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 6969);
				apple.addUnsafeEnchantment(Enchantment.THORNS, 6969);
				apple.addUnsafeEnchantment(Enchantment.WATER_WORKER, 6969);

				pi.addItem(apple);
				p.sendMessage(b + "You've got the apple :O!");
			} else {
				p.sendMessage(errorp);
			}
		}

		/* Helmet till DAT SHOEEEEES! (Said the cow) */

		if (cmd.getName().equalsIgnoreCase("garmor")) {
			if (p.hasPermission("ienchant.garmor")) {

				ItemStack hh = new ItemStack(Material.DIAMOND_HELMET, 1);
				ItemStack cc = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
				ItemStack ll = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
				ItemStack bb = new ItemStack(Material.DIAMOND_BOOTS, 1);

				ItemMeta hhm = hh.getItemMeta();
				ItemMeta ccm = cc.getItemMeta();
				ItemMeta llm = ll.getItemMeta();
				ItemMeta bbm = bb.getItemMeta();

				hh.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 6969);
				hh.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 6969);
				hh.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 6969);
				hh.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 6969);
				hh.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6969);
				hh.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 6969);
				hh.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 6969);
				hh.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6969);
				hh.addUnsafeEnchantment(Enchantment.DURABILITY, 6969);
				hh.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 6969);
				hh.addUnsafeEnchantment(Enchantment.KNOCKBACK, 6969);
				hh.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 6969);
				hh.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6969);
				hh.addUnsafeEnchantment(Enchantment.OXYGEN, 6969);
				hh.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,
						6969);
				hh.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6969);
				hh.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 6969);
				hh.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6969);
				hh.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 6969);
				hh.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 6969);
				hh.addUnsafeEnchantment(Enchantment.THORNS, 6969);
				hh.addUnsafeEnchantment(Enchantment.WATER_WORKER, 6969);

				cc.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 6969);
				cc.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 6969);
				cc.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 6969);
				cc.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 6969);
				cc.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6969);
				cc.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 6969);
				cc.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 6969);
				cc.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6969);
				cc.addUnsafeEnchantment(Enchantment.DURABILITY, 6969);
				cc.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 6969);
				cc.addUnsafeEnchantment(Enchantment.KNOCKBACK, 6969);
				cc.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 6969);
				cc.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6969);
				cc.addUnsafeEnchantment(Enchantment.OXYGEN, 6969);
				cc.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,
						6969);
				cc.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6969);
				cc.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 6969);
				cc.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6969);
				cc.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 6969);
				cc.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 6969);
				cc.addUnsafeEnchantment(Enchantment.THORNS, 6969);
				cc.addUnsafeEnchantment(Enchantment.WATER_WORKER, 6969);

				ll.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 6969);
				ll.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 6969);
				ll.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 6969);
				ll.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 6969);
				ll.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6969);
				ll.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 6969);
				ll.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 6969);
				ll.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6969);
				ll.addUnsafeEnchantment(Enchantment.DURABILITY, 6969);
				ll.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 6969);
				ll.addUnsafeEnchantment(Enchantment.KNOCKBACK, 6969);
				ll.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 6969);
				ll.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6969);
				ll.addUnsafeEnchantment(Enchantment.OXYGEN, 6969);
				ll.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,
						6969);
				ll.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6969);
				ll.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 6969);
				ll.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6969);
				ll.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 6969);
				ll.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 6969);
				ll.addUnsafeEnchantment(Enchantment.THORNS, 6969);
				ll.addUnsafeEnchantment(Enchantment.WATER_WORKER, 6969);

				bb.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 6969);
				bb.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 6969);
				bb.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 6969);
				bb.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 6969);
				bb.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6969);
				bb.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 6969);
				bb.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 6969);
				bb.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6969);
				bb.addUnsafeEnchantment(Enchantment.DURABILITY, 6969);
				bb.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 6969);
				bb.addUnsafeEnchantment(Enchantment.KNOCKBACK, 6969);
				bb.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 6969);
				bb.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 6969);
				bb.addUnsafeEnchantment(Enchantment.OXYGEN, 6969);
				bb.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,
						6969);
				bb.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 6969);
				bb.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 6969);
				bb.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 6969);
				bb.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 6969);
				bb.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 6969);
				bb.addUnsafeEnchantment(Enchantment.THORNS, 6969);
				bb.addUnsafeEnchantment(Enchantment.WATER_WORKER, 6969);

				pi.addItem(hh);
				pi.addItem(cc);
				pi.addItem(ll);
				pi.addItem(bb);
			}
		}

		return false;

	}

}
