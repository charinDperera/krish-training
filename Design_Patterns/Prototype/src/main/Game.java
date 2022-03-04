package main;

public abstract class Game implements Cloneable {

	private String gameRating;
	private String gamePlatform;

	public String getGameRating() {
		return gameRating;
	}

	public void setGameRating(String gameRating) {
		this.gameRating = gameRating;
	}

	public String getGamePlatform() {
		return gamePlatform;
	}

	public void setGamePlatform(String gamePlatform) {
		this.gamePlatform = gamePlatform;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


