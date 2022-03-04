package main;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<GameType, Game> games = new HashMap<>();

	public Registry() {
		this.initialize();
	}

	private void initialize() {
		Singleplayer singleplayer = new Singleplayer();
		singleplayer.setGamePlatform("Console");
		singleplayer.setGameRating("R");
		singleplayer.setMaxDifficulty("Hard");
		singleplayer.setCompleteTime(100);

		Multiplayer multiplayer = new Multiplayer();
		multiplayer.setGamePlatform("Cross Platform");
		multiplayer.setGameRating("PG");
		multiplayer.setNumPlayers(100);
		multiplayer.setOnlineCapable(true);

		games.put(GameType.SINGLEPLAYER, singleplayer);
		games.put(GameType.MULTIPLAYER, multiplayer);

	}

	public Game getGame(GameType gameType) {
		Game game = null;
		try {
			game = (Game) games.get(gameType).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return game;
	}
}
