package com.darmod.mud;

import com.darmod.mud.ui.Command;
import com.darmod.mud.ui.Player;

import java.util.Scanner;

public class darmud {
	public static World default_world;
	private static Scanner i = new Scanner(System.in);;
	
	public static void main(String args[]) {
		default_world = new World("DEFAULT");
		System.out.println("[World] Loaded default world.");
		default_world.fillWorld(1,10,10);
		Player p = new Player("Darius", default_world);
		System.out.println("[Server] Game initialized with default player, Darius");
		System.out.println("\nWelcome to Darmud!");
		String temp;
		
		Room randRoom = default_world.getRandomRoom();
		
		p.attr("room", randRoom);
		randRoom.add(p);
		
		for(;;) {
			System.out.print("[" + p.getAttr("name") + " @"  + default_world.getName() + "] > ");
			temp = i.nextLine();
			if(temp != null && temp.length() > 0)
				p.exec(temp);
		}
	}
}
