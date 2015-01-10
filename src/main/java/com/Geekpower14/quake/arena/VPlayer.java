package com.Geekpower14.quake.arena;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class VPlayer {
	
	public UUID uuid;
	
	public String name;
	
	public OfflinePlayer op;
	
	public VPlayer(String name, UUID uuid)
	{
		this.name = name;
		this.uuid = uuid;
		
		op = Bukkit.getOfflinePlayer(uuid);
	}
	
	public UUID getUUID()
	{
		return uuid;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean hasPermission(String perm)
	{
		if(perm.equalsIgnoreCase(""))
			return true;
		if(op.isOp())
			return true;
		
		/*PermissionManager pex = PermissionsEx.getPermissionManager();
		PermissionUser user = pex.getUser(uuid);
		
		if(user.has("TNTRun.admin"))
			return true;
		if(user.has(perm))
			return true;*/
		
		return false;
	}

}
