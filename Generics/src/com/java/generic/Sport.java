package com.java.generic;

public class Sport {

	public static void main(String[] args) {
		
		FootballPlayer anvit = new FootballPlayer("Anvit");
		CricketPlayer darshu = new CricketPlayer("Darshu");
		BadmintonPlayer mano = new BadmintonPlayer("Mano");
		
		Team<FootballPlayer> padu = new Team<>("Padu");
		padu.addPlayer(anvit);
//		padu.addPlayer(darshu);
//		padu.addPlayer(mano);
		
		System.out.println(padu.numPlayers());
		
		Team<CricketPlayer> paduC = new Team<>("PaduC");
		paduC.addPlayer(darshu);
		
		
//		Team<String> hagu = new Team<>("This won't work");
//		hagu.addPlayer("no-one");
//		
		Team<BadmintonPlayer> paduB = new Team<>("This won't work");
		paduB.addPlayer(mano);
		
		Team<FootballPlayer> hagu = new Team<>("Haguu");
		FootballPlayer gaurav = new FootballPlayer("Gaurav");
		hagu.addPlayer(gaurav);
		
		padu.matchResult(hagu, 5, 2);
		hagu.matchResult(padu, 2, 5);
		
		System.out.println("Rankings");
		System.out.println(padu.getName() + " " + padu.ranking());
		System.out.println(hagu.getName() + " " + hagu.ranking());
		
		System.out.println(padu.compareTo(hagu));
		System.out.println(hagu.compareTo(padu));
		
		
		
	}

}
