import java.util.ArrayList;


public class Bowling {

	private ArrayList<Frame> frames = new ArrayList<Frame>();

	Bowling(){
	}

	public void roll(int score){
		if (score > 10 || score < 10)
			throw new IllegalArgumentException();
		frames.add(new Frame(10));
	}

	public void roll(int roll1, int roll2){
		if (roll1 + roll2 > 10 || roll1 < 0 || roll2 < 0)
			throw new IllegalArgumentException();
		if (roll1 == 10)
			roll(roll1);
		if (roll1 + roll2 == 10){

		}
		frames.add(new Frame(roll1, roll2));

	}

	public int getScoreSum() {
		return 1;
	}

	public int getFrameScore(int frame) {
		int score;
		Frame f = frames.get(frame-1);
		score = f.getFrameScore();

		if (f.getRoll1Score() == 10) {
			Frame f2 = frames.get(frame);
			score += f2.getRoll1Score();

			if (f2.getRoll1Score() == 10){
				Frame f3 = frames.get(frame+1);
				f3.getRoll1Score();
				score += f3.getRoll1Score();
			}
			score += f2.getRoll2Score();
		} 
		if (f.getFrameScore() == 10 && f.getRoll1Score() != 10){
			Frame f2 = frames.get(frame);
			score += f2.getRoll1Score();
		}
		return score;
	}

}
