package main;

public class Multiplayer extends Game {

	private int numPlayers;
	private boolean onlineCapable;

	public int getNumPlayers() {
		return numPlayers;
	}

	public void setNumPlayers(int numPlayers) {
		this.numPlayers = numPlayers;
	}

	public boolean isOnlineCapable() {
		return onlineCapable;
	}

	public void setOnlineCapable(boolean onlineCapable) {
		this.onlineCapable = onlineCapable;
	}

	@Override
	public String toString() {
		return "Multiplayer \n[\nnumPlayers=" + numPlayers + ", \nonlineCapable=" + onlineCapable + "\n]";
	}


	
}
