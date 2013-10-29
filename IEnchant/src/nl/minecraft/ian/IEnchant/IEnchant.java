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

		if (!(sender instanceof Player)) {
			sender.sendMessage("Console no acces to commands!");
			return true;
		}

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
		String errore = error
				+ "Enchantment not found, Please use the specific name of the enchantment, like the one that is shown at a item!";

		/* IEnchantingsssssss */
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
					p.sendMessage(db + "[ ] = required, { } = Not required");
					p.sendMessage(b + "/GApple - " + a
							+ "Give's you ian's apple, use with caution...");
					p.sendMessage(b + "/GArmor - " + a
							+ "Give's you ian's god armor, very dangerous...");
					p.sendMessage(b + "/Enchant [Enchant name] {level} - " + a
							+ "Enchant your item");
					p.sendMessage(b + "/allenchant {level} - " + a
							+ "Add all enchant to an item");
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

		/*
		 * - Helmet - Chestplate - Leggings - Boots
		 */

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
			} else {
				p.sendMessage(errorp);
			}
		}

		if (cmd.getName().equalsIgnoreCase("Enchant")) {

			ItemStack i = p.getItemInHand();

			if (p.hasPermission("IEnchant.enchant")) {
				if (args.length == 0) {
					p.sendMessage(errora);
				} else if (args.length == 1) {

					String en = args[0];

					if (en.equalsIgnoreCase("power")) {
						i.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("flame")) {
						i.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("infinity")) {
						i.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("punch")) {
						i.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("sharpness")) {
						i.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("arhtropods")) {
						i.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("smite")) {
						i.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("efficiency")) {
						i.addUnsafeEnchantment(Enchantment.DIG_SPEED, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("unbreaking")) {
						i.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("fire")) {
						i.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("fortune")) {
						i.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("knockback")) {
						i.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("looting")) {
						i.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("respiration")) {
						i.addUnsafeEnchantment(Enchantment.OXYGEN, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("protection")) {
						i.addUnsafeEnchantment(
								Enchantment.PROTECTION_ENVIRONMENTAL, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("blastprot")) {
						i.addUnsafeEnchantment(
								Enchantment.PROTECTION_EXPLOSIONS, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("feather")) {
						i.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("fireprot")) {
						i.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("projectileprot")) {
						i.addUnsafeEnchantment(
								Enchantment.PROTECTION_PROJECTILE, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("silk")) {
						i.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("thorns")) {
						i.addUnsafeEnchantment(Enchantment.THORNS, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else if (en.equalsIgnoreCase("aqua")) {
						i.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
						p.sendMessage(a + "Item enchanted with " + args[0]);
					} else {
						p.sendMessage(errore);
					}

				} else if (args.length == 2) {

					String en = args[0];
					int lvl = Integer.parseInt(args[1]);

					if (en.equalsIgnoreCase("power")) {
						i.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("flame")) {
						i.addUnsafeEnchantment(Enchantment.ARROW_FIRE, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("infinity")) {
						i.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("punch")) {
						i.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("sharpness")) {
						i.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("arhtropods")) {
						i.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS,
								lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("smite")) {
						i.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("efficiency")) {
						i.addUnsafeEnchantment(Enchantment.DIG_SPEED, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("unbreaking")) {
						i.addUnsafeEnchantment(Enchantment.DURABILITY, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("fire")) {
						i.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("fortune")) {
						i.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS,
								lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("knockback")) {
						i.addUnsafeEnchantment(Enchantment.KNOCKBACK, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("looting")) {
						i.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("respiration")) {
						i.addUnsafeEnchantment(Enchantment.OXYGEN, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("protection")) {
						i.addUnsafeEnchantment(
								Enchantment.PROTECTION_ENVIRONMENTAL, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("blastprot")) {
						i.addUnsafeEnchantment(
								Enchantment.PROTECTION_EXPLOSIONS, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("feather")) {
						i.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("fireprot")) {
						i.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("projectileprot")) {
						i.addUnsafeEnchantment(
								Enchantment.PROTECTION_PROJECTILE, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("silk")) {
						i.addUnsafeEnchantment(Enchantment.SILK_TOUCH, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("thorns")) {
						i.addUnsafeEnchantment(Enchantment.THORNS, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else if (en.equalsIgnoreCase("aqua")) {
						i.addUnsafeEnchantment(Enchantment.WATER_WORKER, lvl);
						p.sendMessage(a + "Item enchanted with " + args[0] + " With level " + lvl);
					} else {
						p.sendMessage(errore + " , You typed:" + args[0]
								+ " with level " + lvl);
					}

				} else {
					p.sendMessage(errora);
				}

			} else {
				p.sendMessage(errorp);
			}
		}

		/* 98303 */

		if (cmd.getName().equalsIgnoreCase("allenchant")) {
			if (p.hasPermission("ienchant.allenchant")) {

				ItemStack ih = p.getItemInHand();

				if (args.length == 0) {
					ih.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 98303);
					ih.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 98303);
					ih.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 98303);
					ih.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, 98303);
					ih.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 98303);
					ih.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS,
							98303);
					ih.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, 98303);
					ih.addUnsafeEnchantment(Enchantment.DIG_SPEED, 98303);
					ih.addUnsafeEnchantment(Enchantment.DURABILITY, 98303);
					ih.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 98303);
					ih.addUnsafeEnchantment(Enchantment.KNOCKBACK, 98303);
					ih.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS,
							98303);
					ih.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 98303);
					ih.addUnsafeEnchantment(Enchantment.OXYGEN, 98303);
					ih.addUnsafeEnchantment(
							Enchantment.PROTECTION_ENVIRONMENTAL, 98303);
					ih.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS,
							98303);
					ih.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 98303);
					ih.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 98303);
					ih.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE,
							98303);
					ih.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 98303);
					ih.addUnsafeEnchantment(Enchantment.THORNS, 98303);
					ih.addUnsafeEnchantment(Enchantment.WATER_WORKER, 98303);

					p.sendMessage(a
							+ "Enchanted with all enchants with ultimate max level.");

				} else if (args.length == 1) {

					int lvl = Integer.parseInt(args[0]);
					

					ih.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, lvl);
					ih.addUnsafeEnchantment(Enchantment.ARROW_FIRE, lvl);
					ih.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, lvl);
					ih.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK, lvl);
					ih.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, lvl);
					ih.addUnsafeEnchantment(Enchantment.DAMAGE_ARTHROPODS, lvl);
					ih.addUnsafeEnchantment(Enchantment.DAMAGE_UNDEAD, lvl);
					ih.addUnsafeEnchantment(Enchantment.DIG_SPEED, lvl);
					ih.addUnsafeEnchantment(Enchantment.DURABILITY, lvl);
					ih.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, lvl);
					ih.addUnsafeEnchantment(Enchantment.KNOCKBACK, lvl);
					ih.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, lvl);
					ih.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, lvl);
					ih.addUnsafeEnchantment(Enchantment.OXYGEN, lvl);
					ih.addUnsafeEnchantment(
							Enchantment.PROTECTION_ENVIRONMENTAL, lvl);
					ih.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS,
							lvl);
					ih.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, lvl);
					ih.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, lvl);
					ih.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE,
							lvl);
					ih.addUnsafeEnchantment(Enchantment.SILK_TOUCH, lvl);
					ih.addUnsafeEnchantment(Enchantment.THORNS, lvl);
					ih.addUnsafeEnchantment(Enchantment.WATER_WORKER, lvl);

					p.sendMessage(a + "Enchanted with all enchant with level "
							+ lvl + " (Costum level");

				} else {
					p.sendMessage(errora);
				}

			} else {
				p.sendMessage(errorp);
			}
		}

		return false;

	}
}
