import java.util.ArrayList;


public class Bowling {
	public static void main(String[] args){
	}
	private ArrayList<Integer> rolls = new ArrayList<Integer>();
	private ArrayList<Integer> frames = new ArrayList<Integer>();

	Bowling(){
	}

	public void roll(int score){
		if (score > 10 || score < 10)
			throw new IllegalArgumentException();
		rolls.add(score);
		rolls.add(0);
		frames.add(11);
	}

	public void roll(int roll1, int roll2){
		if (roll1 + roll2 > 10 || roll1 < 0 || roll2 < 0)
			throw new IllegalArgumentException();
		if (roll1 == 10)
			roll(roll1);
		rolls.add(roll1);
		rolls.add(roll2);
		if (roll1 + roll2 == 10){

		}
		frames.add(roll1+roll2);

	}

	public int getRollScore(int roll){
		return rolls.get(roll);
	}

	public int getScoreSum() {
		return 0;
	}

	public int getFrameScore(int frame) {
		int score;
		if (frames.get(frame-1) == 11){
			score = 10 + rolls.get(frame*2) + rolls.get(frame*2 +1);
			return score;
		}

		if (frames.get(frame-1) == 10){
			score = 10 + rolls.get(frame*2);
			return score;
		}
		score = frames.get(frame-1);
		return score;
	}
}
