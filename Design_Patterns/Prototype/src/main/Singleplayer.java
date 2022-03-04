package main;

public class Singleplayer extends Game {

	private String maxDifficulty;
	private int completeTime;

	public String getMaxDifficulty() {
		return maxDifficulty;
	}

	public void setMaxDifficulty(String difficulty) {
		this.maxDifficulty = difficulty;
	}

	public int getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(int completeTime) {
		this.completeTime = completeTime;
	}

	@Override
	public String toString() {
		return "Singleplayer \n[\nmaxDifficulty=" + maxDifficulty + ", \ncompleteTime=" + completeTime + "\n]";
	}

}
