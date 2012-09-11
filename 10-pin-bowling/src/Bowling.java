import java.util.ArrayList;


public class Bowling {
	public static void main(String[] args){
	}
	private ArrayList<Integer> rolls = new ArrayList<Integer>();
	
	Bowling(){
	}
	
	public void roll(int score){
		if (score > 10 || score < 0)
			throw new IllegalArgumentException();
		rolls.add(score);
	}
	
	public int getRollScore(int i){
		return rolls.get(i);
	}

	public int getScoreSum() {
		return 0;
	}

	public int getFrameScore() {
		return 0;
	}
}
