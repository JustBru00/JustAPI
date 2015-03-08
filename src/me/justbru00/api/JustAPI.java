/**
*This API is for usage with plugins by Justin Brubaker and for usage by non-commercial open source projects.
*Contact Justin Brubaker @ justbru00@gmail.com for a usage consent for commerical projects.
*
*   
*   Copyright (C) 2015  Justin Brubaker
*
*   This program is free software; you can redistribute it and/or modify
*   it under the terms of the GNU General Public License as published by
*    the Free Software Foundation; either version 2 of the License, or
*    (at your option) any later version.
*
*    This program is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License along
*    with this program; if not, write to the Free Software Foundation, Inc.,
*    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/
package me.justbru00.api;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class JustAPI {

	public ItemStack createSkull(String owner, String noncoloredDisplayName) {
		ItemStack is = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta sm = (SkullMeta) is.getItemMeta();		
		sm.setOwner(owner);
		sm.setDisplayName(color(noncoloredDisplayName));
		is.setItemMeta(sm);		
		return is;		
	}
	
	public ItemStack createSkullwithLore(String noncoloredDisplayName, String owner, String lore) {
		ItemStack is = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
		SkullMeta sm = (SkullMeta) is.getItemMeta();		
		sm.setOwner(owner);
		ArrayList<String> reallore = new ArrayList<String>();
		reallore.add(color(lore));
		sm.setDisplayName(color(noncoloredDisplayName));
		sm.setLore(reallore);
		is.setItemMeta(sm);		
		return is;		
	}
	
	public ItemStack renameDisplayName(ItemStack toRename, String Displayname) {
		ItemStack is = toRename;
		ItemMeta im = is.getItemMeta();	
		im.setDisplayName(color(Displayname));
		is.setItemMeta(im);		
		return is;
	}
	
	public String color(String uncolored) {
		String colored = ChatColor.translateAlternateColorCodes('&', uncolored);
	return colored;	
	}
}
