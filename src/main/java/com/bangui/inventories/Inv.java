package com.bangui.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import com.bangui.utils.Utils;

public class Inv {
	private Inventory inv;
	
	public Inv(InventoryHolder owner, int size, String title) {
		inv = Bukkit.createInventory(owner, size, title);
		
		for (int n = 0; n < size; n++) {
			inv.setItem(n, Utils.item("&8---", "&8---", Material.BLACK_STAINED_GLASS_PANE));
		}
	}
	
	public void setItem(int n, ItemStack item) {
		inv.setItem(n, item);
	}
	
	public InventoryHolder getHolder() {
		return inv.getHolder();
	}
	
	public Inventory getInv() {
		return inv;
	}
}
