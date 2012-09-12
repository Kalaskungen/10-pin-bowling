import java.util.ArrayList;


public class Bowling {

	private ArrayList<Frame> frames = new ArrayList<Frame>();

	Bowling(){
	}

	public void roll(int score){
		if (frames.size() > 11){
			throw new IllegalArgumentException();
		}
		if (score > 10 || score < 10)
			throw new IllegalArgumentException();
		frames.add(new Frame(10));
	}

	public void roll(int roll1, int roll2){

		if (frames.size() > 9){
			Frame f = frames.get(9);
			if (f.getFrameScore() != 10)
				throw new IllegalArgumentException();
			if (f.getRoll1Score() == 10)
				if (frames.size() > 11)
					throw new IllegalArgumentException();
			if (f.getFrameScore() == 10)
				if (frames.size() > 10)
					throw new IllegalArgumentException();
		}

		if (roll1 + roll2 > 10 || roll1 < 0 || roll2 < 0)
			throw new IllegalArgumentException();
		if (roll1 == 10)
			roll(roll1);
		frames.add(new Frame(roll1, roll2));

	}

	public int getScoreSum(int frame){
		int scoreSum = 0;
		int i = 0;
		while (i < 10 && i < frame){
			Frame f = frames.get(i);
			scoreSum += f.getFrameScore();
			if (f.getFrameScore() == 10){
				Frame f2 = frames.get(i+1);
				if (f.getRoll1Score() == 10){
					Frame f3 = frames.get(i+2);
					scoreSum += f2.getFrameScore() + f3.getFrameScore();
				}
				if (f.getRoll1Score() != 10){
					scoreSum += f2.getRoll1Score();
				}
			}
			i++;
		}
		return scoreSum;
	}
	
	public int getScoreSum() {
		int scoreSum = getScoreSum(frames.size());
		return scoreSum;
	}

	public int getFrameScore(int frame) {
		int score;
		Frame f = frames.get(frame-1);
		score = f.getFrameScore();

		if (f.getRoll1Score() == 10) {
			Frame f2 = frames.get(frame);
			score += f2.getFrameScore();

			if (f2.getRoll1Score() == 10){
				Frame f3 = frames.get(frame+1);
				f3.getRoll1Score();
				score += f3.getRoll1Score();
			}
		} 
		if (f.getFrameScore() == 10 && f.getRoll1Score() != 10 && frames.size() < 10){
			Frame f2 = frames.get(frame);
			score += f2.getRoll1Score();
		}
		return score;
	}

}
