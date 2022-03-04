package main;

public class Application {

	public static void main(String[] args) {
		Registry registry = new Registry();
		
		Singleplayer singleplayer = (Singleplayer) registry.getGame(GameType.SINGLEPLAYER);
		System.out.println(singleplayer);
		
		singleplayer.setCompleteTime(8111);
		System.out.println(singleplayer);
		
		Multiplayer multiplayer = (Multiplayer) registry.getGame(GameType.MULTIPLAYER);
		System.out.println(multiplayer);
		
		multiplayer.setNumPlayers(25);
		System.out.println(multiplayer);
		
	}

}
