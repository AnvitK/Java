package com.java.generic;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {      // sets Player upper bound which sets Team can only be set from Player class or sub classes of Player class 

	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied  = 0;
//	List<FootballPlayer>
//	List<CricketPlayer>
	
	private ArrayList<T> members = new ArrayList<T>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName() + " aleady exists");
			return false;
		}
		else {
			members.add(player);
			System.out.println(player.getName() + " picked for team " + this.name);
			return true;
		}
		
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team opponent, int ourScore, int theirScore) {
		String msg;
		if(ourScore > theirScore) {
			won++;
			msg = " WON ";
		}
		else if(ourScore == theirScore) {
			tied++;
			msg = " TIED ";
		}
		else {
			lost--;
			msg = " LOST ";
		}
		played++;
		
		if(opponent !=  null) {
			System.out.println(this.name + msg + opponent.getName());
			opponent.matchResult(null, theirScore, ourScore);
		}	
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()) {
			return -1;
		}
		else if(this.ranking() < team.ranking()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
